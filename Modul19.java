public class Modul19 {
    public static void main(String[] args) {
        Kendaraan m = new Motor();
        Kendaraan mbl = new Mobil();

        m.berjalan();
        mbl.berjalan();
    }
}

// Interface
interface Kendaraan {
    void berjalan();
}

// Implementasi 1
class Motor implements Kendaraan {
    public void berjalan() {
        System.out.println("Motor berjalan di atas dua roda.");
    }
}

// Implementasi 2
class Mobil implements Kendaraan {
    public void berjalan() {
        System.out.println("Mobil berjalan di atas empat roda.");
    }
}
