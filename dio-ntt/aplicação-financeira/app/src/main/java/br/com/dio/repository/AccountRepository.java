package br.com.dio.repository;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.stream.Collectors;
import br.com.dio.model.MoneyAudit;

import br.com.dio.exception.AccountNotFoundException;
import br.com.dio.exception.PixInUseException;
import br.com.dio.model.AccountWallet;
import br.com.dio.model.Money;

public class AccountRepository {
    private final List<AccountWallet> accounts = new ArrayList<>();

    public AccountWallet create(final List<String> pix, final long initialFunds) {
        if (!accounts.isEmpty()) {
            var pixInUse = accounts.stream()
                    .flatMap(a -> a.getPix().stream())
                    .toList();
            for (var p : pix) {
                if (pixInUse.contains(p)) {
                    throw new PixInUseException("A chave " + p + " já está em uso.");

                }
            }
        }
        var newAccount = new AccountWallet(initialFunds, pix);
        accounts.add(newAccount);
        return newAccount;
    }

    public void deposit(final String pix, final long fundsAmount) {
        var target = findByPix(pix);
        target.addMoney(fundsAmount, "depósito na conta ");
    }

    public long withdraw(final String pix, final long amount) {
        var source = findByPix(pix);
        CommonsRepository.checkFundsForTransaction(source, amount);
        source.reduceMoney(amount);
        return amount;
    }

    public void transfer(final String sourcePix, final String targetPix, final long amount) {
        var source = findByPix(sourcePix);
        CommonsRepository.checkFundsForTransaction(source, amount);
        var target = findByPix(targetPix);

        source.reduceMoney(amount);

        List<Money> moneyToAdd = new ArrayList<>();
        var audit = new MoneyAudit(UUID.randomUUID(), source.getService(),
                "Transferência de " + amount + " de " + sourcePix + " para " + targetPix,
                OffsetDateTime.now());

        for (int i = 0; i < amount; i++) {
            var money = new Money(audit);
            moneyToAdd.add(money);
        }

        target.addMoney(amount, "Recebido via transferência de " + sourcePix);

        System.out.println("Transferência de R$" + amount + " realizada com sucesso!");
        System.out.println("Saldo atual da conta de origem (" + sourcePix + "): R$" + source.getFunds());
    }

    public AccountWallet findByPix(final String pix) {
        return accounts.stream().filter(a -> a.getPix().contains(pix))
                .findFirst()
                .orElseThrow(() -> new AccountNotFoundException("Conta com a chave " + pix + " não encontrada."));
    }

    public List<AccountWallet> list() {
        return this.accounts;
    }

    public Map<OffsetDateTime, List<MoneyAudit>> getHistory(String pix) {
        var account = findByPix(pix);
        return account.getFinancialTransactions().stream()
                .collect(Collectors.groupingBy(MoneyAudit::createdAt, TreeMap::new, Collectors.toList()));
    }

}
