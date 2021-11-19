package btu;

public class CurrencyCalaculator implements ForCurrency{
    double USD = 1.7710;
    double BGP = 2.2700;
    double EUR = 2.8950;

    @Override
    public void SellingLari(double HowMuch) {
        System.out.println(HowMuch + " lari is :\n" + HowMuch * USD + " USD\n" + HowMuch * BGP + " BGP\n" + HowMuch * EUR + " EUR");
    }

    @Override
    public void SetDollarRate(double NewUSD) {
        USD = NewUSD;
        System.out.println("USD value successfully changed to " + NewUSD);
    }

    @Override
    public void SetGBPRate(double NewBGP) {
        BGP = NewBGP;
        System.out.println("BGP value successfully changed to " + NewBGP);
    }

    @Override
    public void SetEURRate(double NewEUR) {
        EUR = NewEUR;
        System.out.println("EUR value successfully changed to " + NewEUR);
    }
}

