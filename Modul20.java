public class Modul20 {
    public static void main(String[] args) {
        // Overloading
        Cetak cetak = new Cetak();
        cetak.tampilkan("Halo");
        cetak.tampilkan("Halo", 3);

        System.out.println("------------------");

        // Overriding
        Hewan h1 = new Kucing();
        Hewan h2 = new Anjing();

        h1.suara(); // override
        h2.suara(); // override
    }
}

// --- Method Overloading ---
class Cetak {
    void tampilkan(String teks) {
        System.out.println("Teks: " + teks);
    }

    void tampilkan(String teks, int jumlah) {
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Teks ke-" + (i + 1) + ": " + teks);
        }
    }
}

// --- Method Overriding ---
class Hewan {
    void suara() {
        System.out.println("Hewan bersuara.");
    }
}

class Kucing extends Hewan {
    @Override
    void suara() {
        System.out.println("Kucing: Meong!");
    }
}

class Anjing extends Hewan {
    @Override
    void suara() {
        System.out.println("Anjing: Guk Guk!");
    }
}
