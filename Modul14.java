public class Modul14 {
    public static void main(String[] args) {
        Motor motor1 = new Motor();
        motor1.merk = "Honda";
        motor1.tahun = 1990;
        motor1.tipe = "GL100 Scrambler";

        motor1.tampilInfo();
        motor1.nyalakanMesin();
    }
}

// Superclass
class Kendaraan {
    String merk;
    int tahun;

    void nyalakanMesin() {
        System.out.println("Mesin " + merk + " tahun " + tahun + " dinyalakan.");
    }
}

// Subclass
class Motor extends Kendaraan {
    String tipe;

    void tampilInfo() {
        System.out.println("Merk  : " + merk);
        System.out.println("Tahun : " + tahun);
        System.out.println("Tipe  : " + tipe);
    }
}
