package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        //Hello
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите полное имя ");

        String st = sc.nextLine();
        int count = 0;
        String[] array = st.split(" ");
        for(String s : array){
            System.out.println(s);
        }
        //Comment
        System.out.println(array[1].charAt(0)+". "+ array[2].charAt(0)+". "+ array[0]);
        // Added
    }
}