import java.util.ArrayList;

public class Modul23 {
    public static void main(String[] args) {
        // Membuat ArrayList
        ArrayList<String> daftarNama = new ArrayList<>();

        // Menambahkan elemen
        daftarNama.add("John");
        daftarNama.add("Sarah");
        daftarNama.add("Alex");
        daftarNama.add("Jessica");

        // Menampilkan ArrayList
        System.out.println("Daftar Nama: " + daftarNama);

        // Mengambil elemen
        System.out.println("Nama pertama: " + daftarNama.get(0));

        // Menghapus elemen berdasarkan index
        daftarNama.remove(2); // Menghapus "Alex"
        System.out.println("Setelah menghapus Alex: " + daftarNama);

        // Mengecek jumlah elemen
        System.out.println("Jumlah nama: " + daftarNama.size());

        // Mengecek apakah nama ada di dalam list
        System.out.println("Apakah Sarah ada? " + daftarNama.contains("Sarah"));

        // Menghapus semua elemen
        daftarNama.clear();
        System.out.println("Setelah clear: " + daftarNama);
    }
}
