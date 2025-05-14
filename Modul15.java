public class Modul15 {
    public static void main(String[] args) {
        Anjing doggy = new Anjing("Doggy", "Coklat");
        doggy.tampilInfo();
        doggy.bersuara();
    }
}

// Superclass
class Hewan {
    String nama;

    Hewan(String nama) {
        this.nama = nama;
    }

    void bersuara() {
        System.out.println(nama + " mengeluarkan suara hewan.");
    }
}

// Subclass
class Anjing extends Hewan {
    String warna;

    Anjing(String nama, String warna) {
        super(nama); // panggil constructor class induk
        this.warna = warna;
    }

    @Override
    void bersuara() {
        super.bersuara(); // panggil method bersuara dari induk (opsional)
        System.out.println(nama + " menggonggong: Guk Guk!");
    }

    void tampilInfo() {
        System.out.println("Nama Anjing: " + nama);
        System.out.println("Warna Bulu: " + warna);
    }
}
