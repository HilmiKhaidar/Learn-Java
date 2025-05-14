import java.util.Scanner;

public class Modul21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hasil = 0;

        try {
            System.out.print("Masukkan angka pertama: ");
            int a = input.nextInt();

            System.out.print("Masukkan angka kedua: ");
            int b = input.nextInt();

            hasil = a / b;
            System.out.println("Hasil: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Error: Tidak bisa membagi dengan nol!");
        } catch (Exception e) {
            System.out.println("Error lainnya: " + e.getMessage());
        } finally {
            System.out.println("Proses selesai.");
        }

        input.close();
    }
}
