//Write a program that prompts the user to input five integers and then calculates and displays their sum.

import java.util.Scanner;

public class Day2_java{
    public static void main(String[] args) {
        
        int i, no=0, sum=0;

        System.out.println("Enter the 5 intergers : ");

        for(i=1;i<=5;i++)
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter Number "+i+" :");

            no = in.nextInt();

            sum = sum + no;
        }

        System.out.println("The Sum of 5 interger : "+sum);
    }
}