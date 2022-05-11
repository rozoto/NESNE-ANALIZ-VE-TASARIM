package paket;

public class Bekle {
    private static final int sure = 500;

    public static void bekle() {
        try {
            Thread.sleep(sure);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
