package com.zaheer;

public class CreaditCardPayment implements PaymentInterface{

    public CreaditCardPayment(){
        System.out.println("zero para contructor");
    }

    @Override
    public boolean processPayment(double amount){
        System.out.println("Credit Card is processing the payment...");
        return true;
    }

}
