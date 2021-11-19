package btu;

public class B implements InterfaceForB {
    int a = 33;
    double b = 9.7;
    char s = '#';

    @Override
    public void PrintS() {
        System.out.println(s);
    }

    @Override
    public void PrintA() {
        System.out.println(a);

    }

    @Override
    public void PrintB() {
        System.out.println(b);

    }

    @Override
    public void PrintABSxvaoba() {
        System.out.println("ა და ბ-ეს სხაობაა " + (a-b));

    }

    @Override
    public double GetABGanayofi() {
        return a/b;
    }

    @Override
    public void SetDifferentValue() {
        this.a = 30;
        this.b = 2.2;
        this.s = '#';

    }

    @Override
    public void SetA(int seta) {
        a = seta;

    }

    @Override
    public void BPlus10() {
        System.out.println(b + 10);

    }
}
