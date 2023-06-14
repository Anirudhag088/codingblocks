package Lec_2;

import java.util.Scanner;

public class pattern_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int row = 1;
        int star = 1;
        int space = n-1;
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
        space--;
        star++;
        }
	}

}
