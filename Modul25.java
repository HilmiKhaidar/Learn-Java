import java.util.*;

public class Modul25 {
    public static void main(String[] args) {
        // Class Generik
        Kotak<String> kotak = new Kotak<>();
        kotak.simpan("Belajar Generics");
        System.out.println(kotak.ambil());

        // Method Generik
        Integer[] angka = {1, 2, 3};
        tukar(angka, 0, 2);
        System.out.println(Arrays.toString(angka));

        // Bounded Type Parameters
        tampilkan(123);

        // Wildcards
        List<? extends Number> listAngka = new ArrayList<Integer>();
        // listAngka.add(10); // Error: Tidak bisa menambah elemen

        // Generics pada Koleksi
        ArrayList<String> daftarNama = new ArrayList<>();
        daftarNama.add("Andi");
        daftarNama.add("Budi");

        HashMap<String, Integer> nilaiMahasiswa = new HashMap<>();
        nilaiMahasiswa.put("Andi", 90);
        nilaiMahasiswa.put("Budi", 85);
    }

    public static <T> void tukar(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static <T extends Number> void tampilkan(T angka) {
        System.out.println(angka);
    }
}

class Kotak<T> {
    private T isi;

    public void simpan(T isi) {
        this.isi = isi;
    }

    public T ambil() {
        return isi;
    }
}
