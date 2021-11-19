package btu;

public class A implements InterfaceForA{
    int a = 10;
    int b = 29;
    @Override
    public void hello() {
        System.out.println("hello OPP");
    }

    @Override
    public void printA() {
        System.out.println(a);
    }

    @Override
    public void printB() {
        System.out.println(b);
    }

    @Override
    public void printSumAB() {
        System.out.println("sum of a and b " + (a + b));

    }

    @Override
    public int GetSumAB() {
        return a + b;
    }

    @Override
    public int GetABProduct() {
        return a * b;
    }

    @Override
    public void SetAAndB() {
        this.a = 5;
        this.b = 6;



    }
}
