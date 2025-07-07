package br.com.dio.model;

import java.util.List;

import lombok.Getter;

@Getter
public class AccountWallet extends Wallet {

    private final List<String> pix;

    public AccountWallet(final List<String> pix) {
        super(BankService.ACCOUNT);
        this.pix = pix;
    }

    public AccountWallet(final long amount, final List<String> pix) {
        super(BankService.ACCOUNT);
        this.pix = pix;
        System.out.println("Criando AccountWallet com saldo inicial: " + amount);
        addMoney(amount, "valor de criação da conta");
        System.out.println("Saldo após criação: " + getFunds());
    }

    // public void addMoney(final long amount, final String description) {
    // var audit = new MoneyAudit(
    // UUID.randomUUID(),
    // getService(),
    // description + ": R$" + amount,
    // OffsetDateTime.now());
    // this.money.add(new Money(audit));
    // }
    public void addMoney(final long amount, final String description) {
        System.out.println("Adicionando valor = " + amount + ", descrição = " + description);
        var moneyToAdd = generateMoney(amount, description + ": R$" + amount);
        this.money.addAll(moneyToAdd);
        System.out.println("Saldo atual: R$ " + this.money.size());
    }

}
