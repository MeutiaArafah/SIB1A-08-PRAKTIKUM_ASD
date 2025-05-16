package Pertemuan12.Tugas;

import java.util.Scanner;

public class AntrianMhsMain08 {
    public static void main(String[] args) {
        Scanner scan08 = new Scanner(System.in);
        QueueTgs08 antrian = new QueueTgs08();
        int pilihan;

        do {
            System.out.println("\n=== MENU ANTRIAN UNIT MAHASISWA ===");
            System.out.println("1. Cek Antrian Kosong");
            System.out.println("2. Cek Antrian Penuh");
            System.out.println("3. Kosongkan Antrian");
            System.out.println("4. Tambah Antrian");
            System.out.println("5. Panggil Antrian");
            System.out.println("6. Tampilkan Antrian Terdepan dan Terakhir");
            System.out.println("7. Tampilkan Jumlah Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan08.nextInt();
            scan08.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println(antrian.isEmpty() ? "Antrian kosong" : "Antrian tidak kosong");
                    break;
                case 2:
                    System.out.println(antrian.isFull() ? "Antrian penuh" : "Antrian tidak penuh");
                    break;
                case 3:
                    antrian.clear();

                    break;
                case 4:
                    System.out.print("NIM        : ");
                    String nim = scan08.nextLine();
                    System.out.print("Nama       : ");
                    String nama = scan08.nextLine();
                    System.out.print("Kelas      : ");
                    String kelas = scan08.nextLine();
                    System.out.print("Keperluan  : ");
                    String keperluan = scan08.nextLine();
                    antrian.Enqueue(new MahasiswaTgs08(nim, nama, kelas, keperluan));
                    break;
                case 5:
                    antrian.Dequeue();
                    break;
                case 6:
                    antrian.antrianTerdepan();
                    antrian.antrianTerakhir();
                    System.out.println();
                    break;
                case 7:
                    antrian.jumlahAntrian();
                    break;
                case 0:
                    System.out.println("Terima Kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 0);
    }
}
