package org.test;

public class GreenBank extends AxisBank{
public void deposite() {
	System.out.println("10%");
<<<<<<< HEAD
	System.out.println("Deposite is 12%");
=======
	System.out.println("12%");
>>>>>>> 6c40732414bb9d50cd217806b46fc8f2bf6a811d
}
public static void main(String[] args) {
	GreenBank g =new GreenBank();
	g.deposite();
	g.savings();
}
}
