import java.util.Scanner;

public class RataRataNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilai = new int[5];
        int total = 0;

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai ke-" + (i+1) + ": ");
            nilai[i] = input.nextInt();
            total += nilai[i];
        }

        double rataRata = (double) total / nilai.length;

        System.out.println("\nTotal Nilai: " + total);
        System.out.println("Rata-rata Nilai: " + rataRata);

        input.close();
    }
}
