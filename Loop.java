import java.util.Scanner;

class Loop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan banyak bilangan : ");
        int n = input.nextInt();
        int nilaiInput, total = 0, ganjil = 0, sama = 0, max = 0;
        System.out.println("masukkan bilangan khusus : ");
        int khusus = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan nilai ke " + (i + 1));
            nilaiInput = input.nextInt();
            if (nilaiInput % 2 != 0 && n > 0) {
                ganjil++;
            } else if (nilaiInput % 2 != 0 && n < 0) {
                ganjil++;
            } else if (nilaiInput == khusus) {
                sama++;
            } else if (nilaiInput > max) {
                max = nilaiInput;
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~");
        System.out.printf("Banyak bilangan ganjil : %d", ganjil);
        System.out.printf("\nJumlah semua bilangan : %d", total);
        System.out.printf("\nJumlah bilangan khusus : %d", khusus);
    }
}