package Lec_2;

import java.util.Scanner;

public class pattern_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int row = 1;
        int space = 0;
        int star = n;
        
        while(row <= n) {
        	int i = 1;
        	while(i <= space) {
        		System.out.print("  ");
        		i++;
        	}
        	int j = 1;
        	while(j <= star) {
        		System.out.print("* ");
        		j++;
        	}
        	row++;
        	System.out.println();
        	space = space + 2;
        	star--;
        }
	}

}
