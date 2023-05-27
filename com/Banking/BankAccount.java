package com.Banking;

public abstract class BankAccount {
    private long accountNumber;
    private String accountOpeningDate;
    private String modeOfOperations;
    private boolean InternetBankingIsEnabled;
    private double totalBalance;
    private double availableBalance;
    private float rateofInterest;
    public BankAccount(long accountNumber,String accountOpeningDate,String modeOfOperations,boolean InternetBankingIsEnabled,double totalBalance,double availableBalance,float rateofInterest){
        this.accountNumber=accountNumber;
        this.accountOpeningDate=accountOpeningDate;
        this.modeOfOperations=modeOfOperations;
        this.InternetBankingIsEnabled=InternetBankingIsEnabled;
        this.totalBalance=totalBalance;
        this.availableBalance=availableBalance;
        this.rateofInterest=rateofInterest;
    }
    public long getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountOpeningDate(){
        return accountOpeningDate;
    }

    public void setAccountOpeningDate(String accountOpeningDate) {
        this.accountOpeningDate = accountOpeningDate;
    }

    public String getModeOfOperations() {
        return modeOfOperations;
    }

    public void setModeOfOperations(String modeOfOperations) {
        this.modeOfOperations = modeOfOperations;
    }

    public boolean isInternetBankingIsEnabled() {
        return InternetBankingIsEnabled;
    }

    public void setInternetBankingIsEnabled(boolean internetBankingIsEnabled) {
        InternetBankingIsEnabled = internetBankingIsEnabled;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }
    public float getrateofInterest(){
        return rateofInterest;
    }

    public void setRateofInterest(float rateofInterest) {
        this.rateofInterest = rateofInterest;
    }
    public abstract double ShowAccountBalance();
}
