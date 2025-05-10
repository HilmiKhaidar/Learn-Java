public class PenjumlahanMatriks {
    public static void main(String[] args) {
        int[][] matriksA = {
            {1, 2},
            {3, 4}
        };

        int[][] matriksB = {
            {5, 6},
            {7, 8}
        };

        int[][] hasil = new int[2][2];

        // Proses penjumlahan
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }

        // Tampilkan hasil
        System.out.println("Hasil Penjumlahan Matriks:");
        for (int i = 0; i < 2; i++) {   
            for (int j = 0; j < 2; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }
}
