package com.hackerrank.challenges.end_of_file;


import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        int cont = 1;
        
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String n = in.nextLine();    
            System.out.println(cont++ + " " + n);
        }
        in.close();
    }
}
