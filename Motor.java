public class Motor {
    String merk;
    String tipe;
    int tahun;

    // Constructor
    Motor(String merk, String tipe, int tahun) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
    }

    void tampilInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Tipe: " + tipe);
        System.out.println("Tahun: " + tahun);
    }
}
