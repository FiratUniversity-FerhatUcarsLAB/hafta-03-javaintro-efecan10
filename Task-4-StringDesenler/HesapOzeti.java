public class HesapOzeti {
    public static void main(String[] args) {
        // Örnek alışveriş listesi
        String[] urunler = {"Elma", "Ekmek", "Süt", "Peynir"};
        int[] miktarlar = {5, 2, 3, 1};
        double[] fiyatlar = {2.5, 3.0, 4.2, 15.0};

        // Başlık
        System.out.printf("%-10s %-10s %-10s %-10s%n", "Ürün", "Miktar", "Birim Fiyat", "Toplam Fiyat");
        System.out.println("-----------------------------------------------------");

        double toplamTutar = 0;

        // Satırları yazdır
        for (int i = 0; i < urunler.length; i++) {
            double toplamUrun = miktarlar[i] * fiyatlar[i];
            toplamTutar += toplamUrun;

            System.out.printf("%-10s %-10d %-10.2f %-10.2f%n", urunler[i], miktarlar[i], fiyatlar[i], toplamUrun);
        }

        System.out.println("-----------------------------------------------------");
        System.out.printf("%-32s %-10.2f%n", "Genel Toplam:", toplamTutar);
    }
}
