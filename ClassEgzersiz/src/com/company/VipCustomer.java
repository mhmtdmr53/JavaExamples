package com.company;

public class VipCustomer {
    private String customerName;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(){
        this("Mehmet",50,"mali@hotmail.com");

    }



    public VipCustomer(String customerName, String emailAddress){

        this(customerName,100,emailAddress);

    }
    public VipCustomer(String customerName,double creditLimit,String emailAddress){
        this.customerName=customerName;
        this.creditLimit=creditLimit;
        this.emailAddress=emailAddress;

    }
    public String getCustomerName() {
        return this.customerName;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }
}
