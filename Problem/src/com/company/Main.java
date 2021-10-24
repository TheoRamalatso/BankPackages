package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        BluePackage bluePackage = new BluePackage(1,3000,
                "Williams","Tom",0,1);
        System.out.println( bluePackage.withdraw(200,3000));
        System.out.println(bluePackage.getNumberOfDeposits());
            System.out.println( bluePackage.withdraw(200,59000));
        System.out.println(bluePackage.getNumberOfDeposits());
        bluePackage.calculateUBux();

        System.out.println("________________________________________________");

        SilverPackage silverPackage = new SilverPackage(2,
                200,"James","Bob",0,0,0);
        System.out.println("SliverPackage : "+silverPackage.getNumberOfDeposits());
        System.out.println("sliver balance "+silverPackage.balance);
        System.out.println(silverPackage.save(16));

        System.out.println(silverPackage.cashOut(15));
        silverPackage.calculateUBux();
    }
}
