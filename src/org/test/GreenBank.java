package org.test;

public class GreenBank extends AxisBank{
public void deposite() {
	System.out.println("10%");
}
public static void main(String[] args) {
	GreenBank g =new GreenBank();
	g.deposite();
	g.savings();
}
}
