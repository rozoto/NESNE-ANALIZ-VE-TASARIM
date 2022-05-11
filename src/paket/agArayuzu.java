package paket;

import java.util.Random;

public class agArayuzu implements IAgArayuzu {
    //ArrayList<Integer> myList=new ArrayList<>();
    Random rnd = new Random();
    private int sicaklik;

    public int sicaklikGonder() {
         sicaklik = rnd.nextInt(51);
        return sicaklik;
    }

    eyleyici eyleyici = new eyleyici();

    public void sogutucuAc() {
        eyleyici.sogutucuAc();
    }

    public void sogutucuKapat() {
        eyleyici.sogutucuKapat();
    }


}
