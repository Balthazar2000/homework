package btu;

public class A implements InterfaceForA{
    int a = 1;
    int b = 30;

    @Override
    public void printNumbers() {

        for(int i = 1; a<b; i++){
            a += i;
            System.out.println(a);


        }
    }

    @Override
    public void printAgamyofi() {
        for(int i = 1; i<=a;i++){
            if(a % i == 0){
                System.out.println(i);
            }
        }



    }

    @Override
    public void printBMartiviGamyofebi() {

    }

    @Override
    public int getYvelazeXshiri() {
        return 0;
    }
}
