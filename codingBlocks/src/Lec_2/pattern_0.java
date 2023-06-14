package Lec_2;

import java.util.Scanner;

public class pattern_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int i = 1;
        while(i <= n) {
        	System.out.print("*" + " ");
        	i++;
        }
	}

}
