package paket;

public class eyleyici implements ISogutucu{
    public void sogutucuAc(){
        System.out.println("Sogutucu aciliyor...");
        Bekle.bekle();
        System.out.println("Sogutucu acildi.");
        Bekle.bekle();
    }
    public void sogutucuKapat(){
        System.out.println("Sogutucu kapatiliyor...");
        Bekle.bekle();
        System.out.println("Sogutucu kapatildi.");
        Bekle.bekle();
    }
}
