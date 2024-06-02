package com.zaheer;

public class DebitCardPayment implements PaymentInterface{

    public DebitCardPayment(){
        System.out.println("zero para contructor");
    }

    @Override
    public boolean processPayment(double amount){
        System.out.println("Debit Card payment is processed ...");
        return true;
    }
}
