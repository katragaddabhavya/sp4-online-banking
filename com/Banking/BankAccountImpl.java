package com.Banking;

public class BankAccountImpl {
    public static void main(String [] args){
        SavingAccount savingaccount =new SavingAccount(198778882,"12/05/1992","self",true,50000,25000,0.6f);
        RecurringDeposit recurringDepositAccount=new RecurringDeposit(123467,"25/10/1993","self",true,400000,75000,7.5f);
        System.out.println("Saving account details ");
        System.out.println("Account number "+savingaccount.getAccountNumber());
        System.out.println("account opening date "+savingaccount.getAccountOpeningDate());
        System.out.println("account mode of operation "+savingaccount.getModeOfOperations());
        System.out.println("account balance "+savingaccount.ShowAccountBalance());
        System.out.println("balance after debited amount "+savingaccount.DebitAmount(15000));
        System.out.println("balance after credited amount "+savingaccount.creditAmount(30000));
        System.out.println("---------------------------------------------------------------------");

        System.out.println("Recurring  account details ");
        System.out.println("Account number "+recurringDepositAccount.getAccountNumber());
        System.out.println("account opening date "+recurringDepositAccount.getAccountOpeningDate());
        System.out.println("account mode of operation "+recurringDepositAccount.getModeOfOperations());
        System.out.println("available balance "+recurringDepositAccount.ShowAccountBalance());
        System.out.println("balance after debited amount "+recurringDepositAccount.DebitAmount(15000,5));
        System.out.println("balance after credited amount "+recurringDepositAccount.creditAmount(30000,5));




    }
}
