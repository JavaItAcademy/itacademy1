package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите полное имя ");

        String st = sc.nextLine();

        String[] array = st.split(" ");
        for(String s : array){
            System.out.println(s);
        }

        System.out.println(array[1].charAt(0)+". "+ array[2].charAt(0)+". "+ array[0]);
        // Added
		// Added 2
		// Added 3
    }
}