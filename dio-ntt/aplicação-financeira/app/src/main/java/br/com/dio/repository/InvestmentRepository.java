package br.com.dio.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.dio.exception.AccountWithInvestmentException;
import br.com.dio.exception.InvestmentNotFoundException;
import br.com.dio.exception.WalletNotFoundException;
import br.com.dio.model.AccountWallet;
import br.com.dio.model.Investment;
import br.com.dio.model.InvestmentWallet;
import static br.com.dio.repository.CommonsRepository.checkFundsForTransaction;

public class InvestmentRepository {
    private long nextId = 0;
    private final List<Investment> investments = new ArrayList<>();
    private final List<InvestmentWallet> wallets = new ArrayList<>();

    public List<Investment> list() {
        return this.investments;
    }

    public List<InvestmentWallet> listWallets() {
        return this.wallets;
    }

    public InvestmentWallet findWalletByAccountId(final String pix) {
        return wallets.stream()
                .filter(wallet -> wallet.getAccount().getPix().contains(pix))
                .findFirst()
                .orElseThrow(() -> new WalletNotFoundException(
                        "A carteira de investimentos com a chave " + pix + " não foi encontrada."));
    }

    public Investment findById(final long id) {
        return investments.stream()
                .filter(investment -> investment.id() == id)
                .findFirst()
                .orElseThrow(() -> new InvestmentNotFoundException("Investimento com ID " + id + " não encontrado."));

    }

    public void updateAmount() { // final long percent
        wallets.forEach(w -> w.updateAmount(w.getInvestment().tax()));
    }

    public InvestmentWallet withdraw(final String pix, final long funds) {
        var wallet = findWalletByAccountId(pix);
        checkFundsForTransaction(wallet, funds);
        wallet.getAccount().addMoney(wallet.reduceMoney(funds), wallet.getService(), "resgate de investimento");
        if (wallet.getFunds() == 0) {
            wallets.remove(wallet);
        }
        return wallet;
    }

    public InvestmentWallet deposit(final String pix, final long funds) {
        var wallet = findWalletByAccountId(pix);
        wallet.addMoney(wallet.getAccount().reduceMoney(funds), wallet.getService(), "depósito em investimento");
        return wallet;
    }

    public Investment create(final long tax, final long initialFunds) {
        this.nextId++;
        var investment = new Investment(this.nextId, tax, initialFunds);
        investments.add(investment);
        return investment;
    }

    public InvestmentWallet initInvestment(final AccountWallet account, final long id) {
        if (!wallets.isEmpty()) {

            var accountsInUse = wallets.stream().map(InvestmentWallet::getAccount).toList();
            if (accountsInUse.contains(account)) {
                throw new AccountWithInvestmentException("A conta " + account + " já possui um investimento.");
            }
        }
        var investment = findById(id);
        checkFundsForTransaction(account, investment.initialFunds());
        var wallet = new InvestmentWallet(investment, account, investment.initialFunds());
        wallets.add(wallet);
        return wallet;
    }

}
