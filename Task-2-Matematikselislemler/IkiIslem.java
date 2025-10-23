import java.util.Scanner;

public class IkiIslemliProje {
    public static void main(String[] args) {
        // Kullanıcıdan iki sayı alıyoruz
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Birinci sayıyı girin: ");
        double sayi1 = scanner.nextDouble();
        
        System.out.print("İkinci sayıyı girin: ");
        double sayi2 = scanner.nextDouble();
        
        // Toplama işlemi
        double toplamaSonuc = sayi1 + sayi2;
        System.out.println("Toplama işlemi sonucu: " + toplamaSonuc);
        
        // Çarpma işlemi
        double carpmaSonuc = sayi1 * sayi2;
        System.out.println("Çarpma işlemi sonucu: " + carpmaSonuc);
        
        // Scanner'ı kapatıyoruz
        scanner.close();
    }
}
