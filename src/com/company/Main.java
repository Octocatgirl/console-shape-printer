package com.company;

public class Main {
    static void printRightTriangle(int height){
        for(int i=0; i<height; i++){
            printSpaces(1);
            printLine(i);
        }
    }

    static void printIsocelesTriangle(int height){
        for(int i=0; i<height; i++){
            printSpaces(height-i);
            printLine(i + (i-1));
        }
    }

    static void printCircle(int radius){
//        int diameter = radius*2;
        for(int i=0; i<radius; i++){
            System.out.print(i+":");
            printSpaces(radius-i);
            printLine(radius+(i*2));
        }
    }

    static int powerOf(int num, int power){
        int product = num;
        for(int i=0; i<power; i++){
            product = product*num;
        }
        return product;
    }

    static void printSpaces(int spaces){
        for(int i=0; i<spaces; i++){
            if(i==0){
                System.out.println("-");
            }
            System.out.print("-");
        }
    }

    static void printLine(int length){
        for(int i=0; i<length; i++){
            System.out.print("@");
        }
    }

    public static void main(String[] args) {
//      printRightTriangle(9);
//      printIsocelesTriangle(9);
//        circle does not work
//      printCircle(9);
    }
}

