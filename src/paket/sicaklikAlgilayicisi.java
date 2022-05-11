package paket;

public class sicaklikAlgilayicisi implements ISicaklik {
    agArayuzu arayuz=new agArayuzu();
    Observer observer=new Observer();
    public void sicaklikOku(){
        System.out.println("Anlık sicaklik: "+arayuz.sicaklikGonder());

        if(arayuz.sicaklikGonder()>40){
            observer.sicaklikUyari();
        }

    }
}
