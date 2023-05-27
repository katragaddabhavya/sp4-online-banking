package com.Banking;

public class SavingAccount extends BankAccount {
    public SavingAccount(long accountNumber, String accountOpeningDate, String modeOfOperations, boolean InternetBankingIsEnabled, double totalBalance, double availableBalance, float rateofInterest) {
        super(accountNumber, accountOpeningDate, modeOfOperations, InternetBankingIsEnabled, totalBalance, availableBalance, rateofInterest);
    }

    public double ShowAccountBalance() {
        return super.getAvailableBalance();
    }

    public double DebitAmount(double debitcash) {
        super.setAvailableBalance(super.getAvailableBalance() - debitcash);
        System.out.println("amount debited from account" + debitcash);
        return super.getAvailableBalance();
    }

    public double creditAmount(double creditCash) {
        super.setAvailableBalance(super.getAvailableBalance() + creditCash);
        System.out.println("amount debited from account" + creditCash);
        return super.getAvailableBalance();
    }
}

