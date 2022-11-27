package com.oracle.myacademy.jFoS04;

import java.util.ArrayList;

public class CalculatorTest2 {
    public static void main(String[] args) { 
        //Instantiate a Calculator2 object
        
        
        //Access the Calculator2 object's fields and methods
        //to find the total for each member of the birthday party

        
        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15 (Alex)
        Person 7: $11
        Person 8: $30
        */
        Person person1 = new Person();
        person1.setTotalConsumido(10);
        Person person2 = new Person();
        person2.setTotalConsumido(12);
        Person person3 = new Person();
        person3.setTotalConsumido(9);
        Person person4 = new Person();
        person4.setTotalConsumido(8);
        Person person5 = new Person();
        person5.setTotalConsumido(7);
        Person person6 = new Person();
        person6.setTotalConsumido(15);
        Person person7 = new Person();
        person7.setTotalConsumido(11);
        Person person8 = new Person();
        person8.setTotalConsumido(30);

        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(person1);
        personArrayList.add(person2);
        personArrayList.add(person3);
        personArrayList.add(person4);
        personArrayList.add(person5);
        personArrayList.add(person6);
        personArrayList.add(person7);
        personArrayList.add(person8);


        Calculator2 calculator2 = new Calculator2();
        calculator2.findTotal(person1);
        
    }
}
