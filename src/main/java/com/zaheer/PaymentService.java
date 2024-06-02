package com.zaheer;

public class PaymentService {

    private PaymentInterface payment;

    public PaymentService(){
        System.out.println("Hello It is here on zero para constructor");
    }

    // setter dependancy injection.
    public void setPayment(PaymentInterface payment){
        this.payment = payment;
    }
    // constructor dependancy injection
    public PaymentService(PaymentInterface payment){
        this.payment = payment;
    }

    void pay(double amount){
        boolean status = payment.processPayment(amount);

        if(status){
            System.out.println("payment in on the way / process ...");
        }
        else {
            System.out.println("payment failed please try again later ...");
        }
    }

}
