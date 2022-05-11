package paket;

import java.sql.*;
import java.util.concurrent.Callable;

public class veritabaniBaglantisi implements IKullaniciDogrulama {
    private Connection Baglan() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/nesneOdev",
                    "postgres", "12345");
            if (conn != null)
                System.out.println("Veritabanına bağlandı!");
            else
                System.out.println("Bağlantı girişimi başarısız!");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return conn;
    }

    @Override
    public boolean kullaniciDogrula(String kullaniciAdi, int sifre) {
        boolean gorevid;
        Connection conn = Baglan();
        //KullaniciHesabi kullaniciHesabi = null;
        boolean dogrulama = true;

        String sql = "SELECT *  FROM \"Kullanici\" WHERE \"ad\"='" + kullaniciAdi + "' AND sifre=" + sifre;

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            //***** Bağlantı sonlandırma *****
            conn.close();
            boolean sonuc = rs.next();

            if (sonuc) {
                do {
                    kullaniciAdi = rs.getString("ad");
                    sifre = rs.getInt("sifre");
                } while (rs.next());

            } else {
                System.out.println("\nKullanici Dogrulamasi Basarisiz!");
                dogrulama = false;
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return dogrulama;
    }


}
