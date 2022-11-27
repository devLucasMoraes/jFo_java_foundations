package com.oracle.myacademy.jFoS04;

public class Calculator2 {
    public double tax = .05;
    public double tip = .15;  //Change tax and tip if you prefer different values
    public double originalPrice = 0;
    
    public void findTotal(Person person){
        originalPrice = person.getTotalConsumido();
        double total = originalPrice * tax + originalPrice * tip +originalPrice;
        System.out.println(total);
    }
}
