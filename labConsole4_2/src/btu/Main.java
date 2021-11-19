package btu;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count = 0;
        ArrayList<Integer> numebers = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            int n = scanner.nextInt();
            System.out.println(n);
            numebers.add(n);


        }
        for (int i :numebers){
            if(numebers.get(0)== i)
                count = count + 1;

        }
        if(count == 3)
            System.out.println("yes");
        else System.out.println("no");
    }
}
