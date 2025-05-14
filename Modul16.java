public class Modul16 {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Mikhaii", "TI-2021", 3.85);

        mhs.displayInfo();

        // mhs.gpa = 5.0; ❌ ERROR karena gpa bersifat private
        mhs.setGpa(4.0); // ✅ ganti nilai melalui setter
        System.out.println("GPA setelah diubah: " + mhs.getGpa());
    }
}

class Mahasiswa {
    private String nama;
    private String jurusan;
    private double gpa;

    // Constructor
    Mahasiswa(String nama, String jurusan, double gpa) {
        this.nama = nama;
        this.jurusan = jurusan;
        this.gpa = gpa;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("Nilai GPA tidak valid!");
        }
    }

    // Method untuk tampilkan info
    public void displayInfo() {
        System.out.println("Nama     : " + nama);
        System.out.println("Jurusan  : " + jurusan);
        System.out.println("GPA      : " + gpa);
    }
}
