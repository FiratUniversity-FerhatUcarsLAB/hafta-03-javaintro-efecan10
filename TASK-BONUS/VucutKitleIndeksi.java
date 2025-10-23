public class BMIHesaplama {
    public static void main(String[] args) {
        double kilo = 65.0;
        double boy = 1.9;

        double bmi = kilo / (boy * boy);

        System.out.printf("Kilo: %.2f kg%n", kilo);
        System.out.printf("Boy: %.2f m%n", boy);
        System.out.printf("Vücut Kitle İndeksi (BMI): %.2f%n", bmi);
    }
}
