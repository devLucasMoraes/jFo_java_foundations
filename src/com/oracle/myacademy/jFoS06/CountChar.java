package com.oracle.myacademy.jFoS06;

public class CountChar {

    public static void main(String[] args) {

        String str = "www.oracle.com";

        int max = str.length();
        int count = 0;
        int i = 0;

        while (i < max){
            if (str.charAt(i) != 'w'){
                i++;
                continue;
            } else {
                count++;
                i++;
            }


        }



        System.out.println("Counting w : " + count );
    }
}
    

