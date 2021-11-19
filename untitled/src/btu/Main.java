package btu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// meeqvse javaze
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String temp = Integer.toString(n);
        int oddNumberSum = 0;
        int[] nArray = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            nArray[i] = temp.charAt(i) - '0';
        }
        for(int i : nArray){
            if(i%2==1){
                oddNumberSum += i;
            }

        }
        System.out.println(oddNumberSum);


    }
}
