public class ParaBozma {
    public static void main(String[] args) {
        int tutar = 278;

        int yuzluk = tutar / 100;
        tutar = tutar % 100;

        int ellilik = tutar / 50;
        tutar = tutar % 50;

        int yirmilik = tutar / 20;
        tutar = tutar % 20;

        int beslik = tutar / 5;
        tutar = tutar % 5;

        int ikilik = tutar / 2;
        tutar = tutar % 2;

        int birlik = tutar;

        System.out.println("Para Bozma Sonucu:");
        System.out.println(yuzluk + " x 100 TL");
        System.out.println(ellilik + " x 50 TL");
        System.out.println(yirmilik + " x 20 TL");
        System.out.println(beslik + " x 5 TL");
        System.out.println(ikilik + " x 2 TL");
        System.out.println(birlik + " x 1 TL");
    }
}
