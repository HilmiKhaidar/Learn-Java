public class Main {
    public static void main(String[] args) {
        // Membuat objek dari class Mahasiswa
        Mahasiswa m1 = new Mahasiswa();
        m1.nama = "Mikhaii";
        m1.umur = 20;
        m1.tampilInfo();

        System.out.println();

        Mahasiswa m2 = new Mahasiswa();
        m2.nama = "Hilmi";
        m2.umur = 21;
        m2.tampilInfo();
    }
}
