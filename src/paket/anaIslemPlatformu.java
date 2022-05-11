package paket;
import java.util.Scanner;
public class anaIslemPlatformu {
    private final ISogutucu eyleyici;
    private final IAgArayuzu agArayuzu;
    private final ISicaklik sicaklikAlgilayicisi;
    private final ISecim secme;
    private final IObserver observer;
    private final IKullaniciDogrulama kullaniciDogrulama;

    public anaIslemPlatformu() {
        eyleyici = new eyleyici();
        observer=new Observer();
        agArayuzu=new agArayuzu();
        sicaklikAlgilayicisi=new sicaklikAlgilayicisi();
        secme=new secim();
        kullaniciDogrulama=new veritabaniBaglantisi();
    }

    public void basla(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Kullanici adi giriniz: ");
        String isim=scanner.next();
        System.out.println("Sifre giriniz: ");
        int sifre=scanner.nextInt();

        if(kullaniciDogrulama.kullaniciDogrula(isim,sifre)) {
            int secim;
            do {
                secme.secim();
                System.out.println("Secim yapınız:");
                secim = scanner.nextInt();

                switch (secim) {
                    case 1:
                        agArayuzu.sogutucuAc();
                        break;
                    case 2:
                        agArayuzu.sogutucuKapat();
                        break;
                    case 3:
                        sicaklikAlgilayicisi.sicaklikOku();
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Yanlış seçim");
                }
            } while (secim == 0 || secim != 4);
        }

    }

}
