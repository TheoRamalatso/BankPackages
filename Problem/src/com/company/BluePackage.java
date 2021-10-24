package com.company;

public class BluePackage {
    protected final int  packageID ;
    protected double balance;
    protected String surname;
    protected String name;
    protected int numberOfDeposits;
    protected int numberOfWithdrawals;

    public BluePackage(int packageID, double balance, String surname, String name, int numberOfDeposits, int withdrawals) {
        this.packageID = packageID;
        this.balance = balance;
        this.surname = surname;
        this.name = name;
        this.numberOfDeposits = 0;
        this.numberOfWithdrawals = 0;
    }
    public double deposit(double depositVal ){

        this.balance += depositVal;
        numberOfDeposits++;
        return depositVal;
    }
    public Boolean withdraw(double withdrawVal ,double balance){
        boolean granted =false;
        if (withdrawVal > balance){
            do{ this.balance -=withdrawVal;granted= true;
            }while (!granted);
            numberOfDeposits++;
            return true;
        }

        else
            System.out.println("your withdrawal amount is higher than your current balance.");
            return false;
        }
    public void calculateUBux(){
        double UBux =0;
        if(numberOfDeposits > numberOfWithdrawals){
            balance *=0.1;
            UBux=balance;
        }
        else if(numberOfWithdrawals > numberOfDeposits){
            balance *=0.05;
            UBux=balance;
        }
        else if(numberOfDeposits == numberOfWithdrawals){
            balance*=0.075;
            UBux=balance;
        }
        System.out.println("Current Ubux " + UBux);

    }
    public int getNumberOfDeposits() {
        return numberOfDeposits;
    }
}

