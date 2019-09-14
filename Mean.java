import java.util.Scanner;

class Mean {
    
    public static void main(String[] args) {  

        Scanner delta = new Scanner(System.in);

        System.out.println("Berapa banyak angka ?");
        int n = delta.nextInt();
        /* Deklarasi array yang jumlahnya
         * bergantung dari inputan user
         */
        double[] alpha = new double[n];
        for (int i=0; i<alpha.length; i++) {
            System.out.println("Masukkan angka "+(i+1)+" : ");
            alpha[i] = delta.nextDouble();
        } 
        /* User menginput angka sebanyak n
         * n adalah inputan user
         * alpha.length adalah berapa banyak nilai yang di simpan dalam array alpha
         * atau panjang array-nya
         */
        delta.close();
        // Menutup scanner
        double total = 0;
        for (int i=0; i<alpha.length; i++) {
            total = total + alpha[i];
        }
        // Menghitung berapa total angka yang dimasukkan user
        double average = total/alpha.length;
        System.out.printf("~~~~~~~~~~~~~\nRata ratanya : %.2f ", average);
    }
}
