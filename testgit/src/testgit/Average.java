package testgit;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
         
         float a,b,c,avg;
         
         System.out.println("\n Enter 3 nums: ");
         
         a=sc.nextFloat();
         b=sc.nextFloat();
         c=sc.nextFloat();

         avg=(a+b+c)/3;
         
         System.out.println("\n Average= "+avg);

	}

}
