package com.company;

public class SilverPackage extends BluePackage {

    private double savings;

    public SilverPackage(int packageID, double balance, String surname, String name, int numberOfDeposits, int withdrawals, double savings) {
        super(packageID, balance, surname, name, numberOfDeposits, withdrawals);
        this.savings = 0;
    }

    public Boolean save (double amount){
        if(this.balance > amount) {
             this.balance -=amount;
            savings = amount;
            System.out.println("transfered "+ amount + " to savings");
            System.out.println("balance is now " + this.balance);
            return Boolean.TRUE;

        }

        else {
            System.out.println("insufficient funds.");
            return Boolean.FALSE;}


        }
    public Boolean cashOut (double amount){
    if(savings > amount){
        savings -= amount;
        this.balance += amount;
        System.out.println("cashout " + amount + " available from savings :" + savings);
        return true;

    }
    else{

        System.out.println("cannot cashout "+ amount + " from "+
              this.balance  );
        return false;
    }



    }
   public void PayInterest(){

       double annualInterest = 0.045;
       double yearlyInterest = savings + (savings * annualInterest);
       double monthlyInterest = (yearlyInterest / 365 ) * 30;

       savings += monthlyInterest;
   }
    }
