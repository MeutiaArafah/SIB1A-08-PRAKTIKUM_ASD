import java.util.Scanner;

public class Praktikum4 {
    static void pendapatanCabang(int[][] stokBunga, int[] hargaBunga) {
        for (int i = 0; i < stokBunga.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < stokBunga[i].length; j++) {
                pendapatan += stokBunga[i][j] * hargaBunga[j];
            }
            System.out.println("RoyalGarden" + (i + 1) + " sebanyak : " + pendapatan);
        }
    }

    static void jumlahStokRG4(int[][] stokBunga, int[] bungaMati, int[] jumlahStok) {

        for (int i = 0; i < stokBunga[3].length; i++) {
            System.out.println("Jenis bunga " + (i + 1) + " : " + stokBunga[3][i]);
        }
    }

    static void updateStokRG4(int[][] stokBunga, int[] bungaMati, int[] jumlahStok) {

        for (int i = 0; i < stokBunga[3].length; i++) {
            stokBunga[3][i] -= bungaMati[i];
            jumlahStok[i] += stokBunga[3][i];

            System.out.println("Jenis bunga " + (i + 1) + " : " + stokBunga[3][i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // cabang 1 // cabang 2 // cabang 3 // cabang 4
        int[][] stokBunga = { { 10, 5, 15, 7 }, { 6, 11, 9, 12 }, { 2, 10, 10, 5 }, { 5, 7, 12, 9 } };
        int[] hargaBunga = { 75000, 50000, 60000, 10000 }; // aglonema, keladi, alocasio, mawar
        int[] bungaMati = { 1, 2, 0, 5 }; // aglonema, keladi, alocasio, mawar

        System.out.println("\nPendapatan setiap cabang :");
        pendapatanCabang(stokBunga, hargaBunga);
        System.out.println("=================================");

        System.out.println("\nStok bunga di RoyalGarden 4 :");
        jumlahStokRG4(stokBunga, bungaMati, bungaMati);
        System.out.println("=================================");

        System.out.println("\nJumlah stok di RoyalGarden4 setelah update :");
        updateStokRG4(stokBunga, bungaMati, bungaMati);
        System.out.println("=================================");
    }
}
