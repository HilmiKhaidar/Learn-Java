import java.util.Scanner;

public class KalkulatorFungsi {

    // Method penjumlahan
    public static int tambah(int a, int b) {
        return a + b;
    }

    // Method pengurangan
    public static int kurang(int a, int b) {
        return a - b;
    }

    // Method perkalian
    public static int kali(int a, int b) {
        return a * b;
    }

    // Method pembagian (gunakan double untuk hasil presisi)
    public static double bagi(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Pembagian dengan nol!");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input dua angka
        System.out.print("Masukkan angka pertama: ");
        int x = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int y = input.nextInt();

        // Tampilkan hasil operasi
        System.out.println("\n=== Hasil Kalkulasi ===");
        System.out.println("Penjumlahan: " + tambah(x, y));
        System.out.println("Pengurangan: " + kurang(x, y));
        System.out.println("Perkalian: " + kali(x, y));
        System.out.println("Pembagian: " + bagi(x, y));

        input.close();
    }
}
