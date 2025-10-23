public class UcgenHesap {
    public static void main(String[] args) {
        double a = 3, b = 4, c = 5;

        double cevre = a + b + c;
        double s = cevre / 2; // yarı çevre
        double alan = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Kenarlar: " + a + ", " + b + ", " + c);
        System.out.println("Çevre: " + cevre);
        System.out.println("Alan: " + alan);
    }
}
