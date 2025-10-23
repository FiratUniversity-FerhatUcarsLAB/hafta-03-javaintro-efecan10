public class SaatDonusturmeUzun {
    public static void main(String[] args) {
        // Toplam saniye sayısı
        int toplamSaniye = 3665;

        // Saat hesaplama: toplam saniyeyi 3600'e bölerek saat bulunur
        int saat = toplamSaniye / 3600;

        // Kalan saniye bulunur (saat hesaplandıktan sonra)
        int kalanSaniye = toplamSaniye % 3600;

        // Dakika hesaplama: kalan saniyeyi 60'a bölerek dakika bulunur
        int dakika = kalanSaniye / 60;

        // Kalan saniye: dakikalar çıkarıldıktan sonra kalan saniye
        int saniye = kalanSaniye % 60;

        // Dakika ve saniye sayısını 2 haneli olarak yazdırmak için format kullanılır
        String dakikaStr;
        String saniyeStr;

        if (dakika < 10) {
            dakikaStr = "0" + dakika;
        } else {
            dakikaStr = String.valueOf(dakika);
        }

        if (saniye < 10) {
            saniyeStr = "0" + saniye;
        } else {
            saniyeStr = String.valueOf(saniye);
        }

        // Sonuç ekrana yazdırılır
        System.out.println("Toplam saniye: " + toplamSaniye);
        System.out.println("Saat: " + saat);
        System.out.println("Dakika: " + dakikaStr);
        System.out.println("Saniye: " + saniyeStr);

        System.out.println("Formatlı zaman: " + saat + ":" + dakikaStr + ":" + saniyeStr);
    }
}
