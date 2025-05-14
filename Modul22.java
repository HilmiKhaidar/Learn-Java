import java.io.*;

public class Modul22 {
    public static void main(String[] args) {
        String namaFile = "data.txt";

        // MENULIS KE FILE
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(namaFile))) {
            writer.write("Halo tuan muda!\n");
            writer.write("Selamat belajar Java file handling.\n");
            System.out.println("Berhasil menulis ke file.");
        } catch (IOException e) {
            System.out.println("Terjadi error saat menulis: " + e.getMessage());
        }

        // MEMBACA DARI FILE
        try (BufferedReader reader = new BufferedReader(new FileReader(namaFile))) {
            String baris;
            System.out.println("\nIsi file:");
            while ((baris = reader.readLine()) != null) {
                System.out.println(baris);
            }
        } catch (IOException e) {
            System.out.println("Terjadi error saat membaca: " + e.getMessage());
        }
    }
}
