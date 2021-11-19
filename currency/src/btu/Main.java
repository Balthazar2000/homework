package btu;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
        int r,sum=0,temp;
//        int n=454;//It is the number variable to be checked for palindrome
        temp=n;
        while(n>0){
            r=n%10;  //getting remainder4
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");

    }
}
