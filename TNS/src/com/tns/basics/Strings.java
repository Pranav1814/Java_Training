package com.tns.basics;

class Strings {
    public static void main(String[] args) {
        int[] intarr = {10,20,30,40,50};
        System.out.println("Array of Integers");
        for(int i : intarr){
            System.out.println(i);
        }
        String[] strarr = {"Aniket","Ansh","Chaitanya","Mayuresh","Piyush","Pranav","Shardul","Shubham"};
        System.out.println("Array of String");
        for(String i : strarr){
            System.out.println(i);
        }
    }
}