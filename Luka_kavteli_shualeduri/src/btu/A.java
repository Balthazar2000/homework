package btu;
import java.util.Random;


public class A implements InterfaceForA {
    int a;
    int b;

    @Override
    public void SetAAndB() {
        Random rand = new Random();
        this.a = rand.nextInt(15);
        this.b = rand.nextInt(15)-15;

    }

    @Override
    public void PrintMiddleOfAB() {
        while(b > a){
            System.out.println(b);
            b++;
        }

    }

    @Override
    public int GetBgamyofi() {
        int count = 0;
        for(int i = 0; i<=b; i++){
            if(i != 0){
                if(b%i == 0)
                    count++;
            }


        }
        return count;
    }


    public int SumPositiveAB() {
        int sum = 0;
        while(a > b){
            if(a > 0) {
                sum += a;
            }
            a++;
        }
        return sum;
    }

    public int ArithmeticAvarege() {
        return (a+b)/2;

    }
}
