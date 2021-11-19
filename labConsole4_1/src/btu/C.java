package btu;

public class C implements InterfaceForC{
    int a = 10;
    int b = 9;
    char s = '#';
    char h = '@';
    @Override
    public void PrintIntegers() {
        System.out.println(a + " " + b);
    }

    @Override
    public void printCharacters() {
        System.out.println(s + " " + h);

    }

    @Override
    public void PrintABMath() {
        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a - b);
        System.out.println(((float)a) / ((float)b));

    }

    @Override
    public void SetA(int a) {
        this.a = a;

    }

    @Override
    public void SetB(int b) {
        this.b = b;

    }

    @Override
    public void SetCharacters(char s, char h) {
        this.s = s;
        this.h = h;

    }
}
