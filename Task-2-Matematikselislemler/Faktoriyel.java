public class Faktoriyel {
    public static void main(String[] args) {
        int sayi = 5;  // Faktöriyelini alacağımız sayı
        long faktoriyel = 1;
        
        // Faktöriyel hesaplama
        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;
        }
        
        // Sonucu ekrana yazdırma
        System.out.println(sayi + " sayısının faktöriyel değeri: " + faktoriyel);
    }
}
