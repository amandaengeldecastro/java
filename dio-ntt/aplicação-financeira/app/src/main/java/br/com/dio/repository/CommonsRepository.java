package br.com.dio.repository;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

import br.com.dio.exception.NoFundsEnoughtException;
import br.com.dio.model.BankService;
import br.com.dio.model.Money;
import br.com.dio.model.MoneyAudit;
import br.com.dio.model.Wallet;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public final class CommonsRepository {
    
    public static void checkFundsForTransaction(final Wallet source, final long amount){
        if (source.getFunds() < amount) {
            throw new NoFundsEnoughtException("Saldo insuficiente para realizar a transação.");
        }
    }

    public static List<Money> generateMoney(final UUID transactionId, final long funds, final String description){
        var history = new MoneyAudit(transactionId, BankService.ACCOUNT, description, OffsetDateTime.now());
        return Stream.generate(() -> new Money(history)).limit(funds).toList();
    }
}
