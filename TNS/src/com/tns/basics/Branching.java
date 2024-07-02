package com.tns.basics;
import java.util.Scanner; 

class Branching {
    public static void main(String[] args) {
        Scanner myObj1 = new Scanner(System.in);
        System.out.println("Enter age");
        String age1 = myObj1.next();
        int age=Integer.parseInt(age1); 
        
        Scanner myObj2 = new Scanner(System.in);
        System.out.println("Enter nationality");
        String nationality = myObj2.next();
        
        if (age>18) {
            if (nationality.equals("Indian")){
                System.out.println("Person is eligible");
            }
        }else{
            System.out.println("Person is not eligible");
        }
    }
}