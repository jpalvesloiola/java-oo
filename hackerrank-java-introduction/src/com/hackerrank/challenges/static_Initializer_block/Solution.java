package com.hackerrank.challenges.static_Initializer_block;

import java.util.*;

public class Solution {
static boolean flag = false;

static Scanner sc = new Scanner(System.in);
  
static int B = sc.nextInt();
static int H = sc.nextInt();

static {  
    try{
        if (B >= 0 && H >= 0) {
            flag = true;
        }else{
            throw new Exception("Breadth and height must be positive");
        }
    }catch(Exception exception){
        System.out.println(exception);
    } 
      
}    
    
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

