import java.util.*;

public class KoleksiGenerikDemo {

    // Kelas generik Kotak
    static class Kotak<T> {
        private T isi;

        public void simpan(T isi) {
            this.isi = isi;
        }

        public T ambil() {
            return isi;
        }
    }

    // Metode generik untuk menukar elemen dalam array
    public static <T> void tukar(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Metode generik dengan batasan tipe
    public static <T extends Number> void tampilkan(T angka) {
        System.out.println("Angka: " + angka);
    }

    // Metode dengan wildcard untuk mencetak elemen dari daftar
    public static void cetakDaftar(List<?> daftar) {
        for (Object elemen : daftar) {
            System.out.println(elemen);
        }
    }

    public static void main(String[] args) {
        // Penggunaan kelas generik Kotak
        Kotak<String> kotakString = new Kotak<>();
        kotakString.simpan("Belajar Generik");
        System.out.println("Isi kotak: " + kotakString.ambil());

        // Penggunaan metode generik tukar
        Integer[] angka = {1, 2, 3};
        System.out.println("Sebelum tukar: " + Arrays.toString(angka));
        tukar(angka, 0, 2);
        System.out.println("Setelah tukar: " + Arrays.toString(angka));

        // Penggunaan metode generik dengan batasan tipe
        tampilkan(123);
        tampilkan(45.67);

        // Penggunaan List dengan Generics
        List<String> daftarNama = new ArrayList<>();
        daftarNama.add("Andi");
        daftarNama.add("Budi");
        daftarNama.add("Citra");
        System.out.println("Daftar Nama:");
        cetakDaftar(daftarNama);

        // Penggunaan Set dengan Generics
        Set<Integer> setAngka = new HashSet<>();
        setAngka.add(10);
        setAngka.add(20);
        setAngka.add(10); // Duplikat, tidak akan ditambahkan
        System.out.println("Set Angka:");
        cetakDaftar(new ArrayList<>(setAngka));

        // Penggunaan Queue dengan Generics
        Queue<String> antrean = new LinkedList<>();
        antrean.add("Andi");
        antrean.add("Budi");
        antrean.add("Citra");
        System.out.println("Antrean:");
        while (!antrean.isEmpty()) {
            System.out.println(antrean.poll());
        }

        // Penggunaan Map dengan Generics
        Map<String, Integer> nilaiMahasiswa = new HashMap<>();
        nilaiMahasiswa.put("Andi", 90);
        nilaiMahasiswa.put("Budi", 85);
        nilaiMahasiswa.put("Citra", 95);
        System.out.println("Nilai Mahasiswa:");
        for (Map.Entry<String, Integer> entry : nilaiMahasiswa.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
