public class Modul18 {
    public static void main(String[] args) {
        Hewan h1 = new Kucing();
        Hewan h2 = new Anjing();

        h1.bersuara(); // Meong!
        h2.bersuara(); // Guk Guk!
    }
}

// Abstract class
abstract class Hewan {
    abstract void bersuara(); // method abstract

    void info() {
        System.out.println("Ini adalah hewan.");
    }
}

// Subclass 1
class Kucing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Kucing: Meong!");
    }
}

// Subclass 2
class Anjing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Anjing: Guk Guk!");
    }
}
