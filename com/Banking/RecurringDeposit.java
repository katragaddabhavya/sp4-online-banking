package com.Banking;

public class RecurringDeposit extends BankAccount {
    public RecurringDeposit(long accountNumber, String accountOpeningDate, String modeOfOperations, boolean InternetBankingIsEnabled, double totalBalance, double availableBalance, float rateofInterest) {
        super(accountNumber, accountOpeningDate, modeOfOperations, InternetBankingIsEnabled, totalBalance, availableBalance, rateofInterest);
    }

    public double ShowAccountBalance() {
        return super.getAvailableBalance();
    }

    public double DebitAmount(double debitcash, int date) {
        if (date == 15) {
            super.setAvailableBalance(super.getAvailableBalance() - debitcash);
            System.out.println("amount debited from account" + debitcash);
            return super.getAvailableBalance();
        }
        return super.getAvailableBalance();
    }

    public double creditAmount(double creditCash, int date) {
        if (date == 10) {
            super.setAvailableBalance(super.getAvailableBalance() + creditCash);
            System.out.println("amount credit from account" + creditCash);
            return super.getAvailableBalance();
        }
        return super.getAvailableBalance();

    }
}
