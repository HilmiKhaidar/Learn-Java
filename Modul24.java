import java.util.HashMap;
import java.util.Map;

public class Modul24 {
    public static void main(String[] args) {
        // Membuat HashMap
        Map<String, Integer> hargaBarang = new HashMap<>();

        // Menambahkan pasangan key-value
        hargaBarang.put("Apel", 5000);
        hargaBarang.put("Jeruk", 7000);
        hargaBarang.put("Mangga", 10000);
        hargaBarang.put("Pisang", 3000);

        // Menampilkan HashMap
        System.out.println("Harga Barang: " + hargaBarang);

        // Mengambil nilai berdasarkan key
        System.out.println("Harga Jeruk: " + hargaBarang.get("Jeruk"));

        // Menghapus elemen berdasarkan key
        hargaBarang.remove("Pisang");
        System.out.println("Setelah menghapus Pisang: " + hargaBarang);

        // Mengecek apakah key ada di dalam HashMap
        System.out.println("Apakah ada harga untuk Apel? " + hargaBarang.containsKey("Apel"));

        // Mengambil jumlah elemen
        System.out.println("Jumlah barang: " + hargaBarang.size());

        // Menampilkan semua keys
        System.out.println("Keys: " + hargaBarang.keySet());

        // Menampilkan semua values
        System.out.println("Values: " + hargaBarang.values());
    }
}
