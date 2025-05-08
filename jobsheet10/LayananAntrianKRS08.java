import java.util.Scanner;

public class LayananAntrianKRS08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS08 antrian = new AntrianKRS08(10);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Memanggil 2 Mahasiswa untuk Proses KRS");
            System.out.println("3. Lihat Semua Antrian");
            System.out.println("4. Lihat 2 Mahasiswa Terdepan");
            System.out.println("5. Lihat Mahasiswa Paling Akhir");
            System.out.println("6. Jumlah Mahasiswa dalam Antrian");
            System.out.println("7. Cek Jumlah Mahasiswa Sudah KRS");
            System.out.println("8. Cek Jumlah Mahasiswa Belum KRS");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("NIM     : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama    : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi   : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas   : ");
                    String kelas = sc.nextLine();
                    Mahasiswa08 mhs = new Mahasiswa08(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    antrian.layaniPasanganMahasiswa();
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.lihatDuaTerdepan();
                    break;
                case 5:
                    antrian.lihatAkhir();
                    break;
                case 6:
                    System.out.println("Jumlah dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                case 7:
                    System.out.println("Total mahasiswa yang sudah melakukan proses KRS: " + antrian.getTotalDilayani());
                    break;
                case 8:
                    System.out.println("Mahasiswa yang belum melakukan proses KRS: " + antrian.getBelumDilayani());
                    break;
                case 0:
                    System.out.println("Terima Kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 0);
        sc.close();
    }
}
