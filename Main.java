public class Main {
    public static void main(String[] args) {
        Kalkulator k = new Kalkulator();

        System.out.println("Tambah int: " + k.tambah(2, 3));          // 5
        System.out.println("Tambah double: " + k.tambah(2.5, 3.5));    // 6.0
        System.out.println("Tambah 3 angka: " + k.tambah(1, 2, 3));    // 6
    }
}
