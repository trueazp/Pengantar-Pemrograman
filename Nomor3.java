import java.util.Scanner;

class Nomor3 {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        int ganjil = 0, genap = 0, positif = 0, negatif = 0;
        System.out.println("Input number : ");

        for (int i = 0; i < 5; i++) {
            double n = obj.nextDouble();
            if (n % 2 == 0 && n > 0) {
                genap++;
                positif++;
            } else if (n % 2 == 0 && n < 0) {
                genap++;
                negatif++;
            } else if (n % 2 != 0 && n > 0) {
                ganjil++;
                positif++;
            } else if (n % 2 != 0 && n < 0) {
                ganjil++;
                negatif++;
            } else {
                System.out.println("Inputan tidak valid..");
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~");
        System.out.printf("%d bilangan genap%n", genap);
        System.out.printf("%d bilangan ganjil%n", ganjil);
        System.out.printf("%d bilangan positif%n", positif);
        System.out.printf("%d bilangan negatif%n", negatif);
    }
}