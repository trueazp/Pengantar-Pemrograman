import java.util.Scanner;

class LatihanPraktikum3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a, b;
        boolean kebenaran;

        System.out.print("Masukkan nilai a : ");
        a = in.nextInt();
        System.out.print("Masukkan nilai b : ");
        b = in.nextInt();
        System.out.print("Apakah a kelipatan b? ");
        kebenaran = in.nextBoolean();

        System.out.print("Apakah " + a + " kelipatan dari " + b +" ? " + kebenaran);
    }
}