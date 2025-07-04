package br.com.dio.model;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

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
        addMoney(amount, "valor de criação da conta");
    }

    public void addMoney(final long amount, final String description) {
        var audit = new MoneyAudit(
                UUID.randomUUID(),
                getService(),
                description + ": R$" + amount,
                OffsetDateTime.now());
        this.money.add(new Money(audit));
    }
    

}
