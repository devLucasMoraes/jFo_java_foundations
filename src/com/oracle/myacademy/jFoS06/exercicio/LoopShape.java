package com.oracle.myacademy.jFoS06.exercicio;

public class LoopShape {
    
    static void createRectangle(int width, int height){
        if (height < 1 || width < 1){
            System.out.println("Dimensao nao pode ser menor que 1");

        } else {
            for (int i = 0;i < height;i++){
                for (int j = 0; j < width; j++){
                    if(i > 0 && i < (height - 1)){
                        if(j > 0 && j < (width-1)){
                            System.out.print(" ");
                        }else {
                            System.out.print("#");
                        }
                    }else {
                        System.out.print("#");
                    }
                }
                System.out.println();
            }
        }
    }
    
    static void createTriangle(int leg){
        if (leg < 1){
            System.out.println("Dimensao nao pode ser menor que 1");
        } else {
            for (int i = leg; i > 0;i--){
                for (int j = i; j <= leg;j++){
                    if(i < (leg - 1) && i > 1){
                        if(j == leg || i == j){
                            System.out.print("#");
                        }else {
                            System.out.print(" ");
                        }
                    }else {
                        System.out.print("#");
                    }
                }
                System.out.println();
            }
        }

        
    }
}
