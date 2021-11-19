package btu;

import java.util.Arrays;
import java.util.Random;

public class A implements InterfaceForA {
    Random rand = new Random();
    int a;
    int b;
    Integer[] numbers = new Integer[12];
    int numbersSum = 0;
    @Override
    public void SetRandomIntToVariable() {
        this.a = rand.nextInt(15) + 10;
        this.b = rand.nextInt(15) + 10;

    }

    @Override
    public String getAandB() {
        return "a:" + a + "b:" + b;

    }

    @Override
    public void SetRandomMArray() {
        for(int i = 0; i<12; i++) {
            numbers[i] = rand.nextInt(70) + (-10);

        }

    }

    @Override
    public void PrintEvenElements() {
        for (int num:numbers){
            if (num % 2 == 0)
                System.out.println(num);
        }

    }

    @Override
    public void PrintPositiveSum() {
        for (int num:numbers){
            if(num > 0){
                numbersSum += num;
            }
        }
        System.out.println(numbersSum);

    }

    @Override
    public void PrintPositiveMinimum() {
        Arrays.sort(numbers);
        for (int num:numbers){
            if(num >=0){
                System.out.println(num);
                break;
            }
        }

    }
}
