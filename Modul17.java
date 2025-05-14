public class Modul17 {
    public static void main(String[] args) {
        Hewan hewan1 = new Kucing();  // polimorfik
        Hewan hewan2 = new Anjing();  // polimorfik

        hewan1.bersuara(); // akan panggil bersuara() milik Kucing
        hewan2.bersuara(); // akan panggil bersuara() milik Anjing

        // Tapi karena tipe referensinya Hewan, tidak bisa akses method khusus Kucing/Anjing
        // hewan1.menjilat(); // ❌ Tidak bisa, kecuali di-casting
    }
}

// Superclass
class Hewan {
    void bersuara() {
        System.out.println("Hewan bersuara...");
    }
}

// Subclass 1
class Kucing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Kucing: Meong!");
    }

    void menjilat() {
        System.out.println("Kucing sedang menjilat bulu.");
    }
}

// Subclass 2
class Anjing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Anjing: Guk Guk!");
    }

    void menggonggong() {
        System.out.println("Anjing menggonggong dengan keras.");
    }
}
