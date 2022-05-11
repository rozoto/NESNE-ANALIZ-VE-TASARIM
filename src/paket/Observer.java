package paket;

public class Observer implements IObserver{
    agArayuzu arayuz=new agArayuzu();
    public void sicaklikUyari() {
        System.out.println("Sicaklik kritik seviyede. Sogutucuyu açınız.");
    }
}
