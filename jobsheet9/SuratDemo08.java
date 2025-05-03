import java.util.Scanner;

public class SuratDemo08 {
    public static void main(String[] args) {
        StackSurat08 stack = new StackSurat08(3);
        Scanner scan08 = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Menerima Surat Izin"); // memasukkan data surat
            System.out.println("2. Memproses Surat Izin"); // memproses/memverifikasi surat
            System.out.println("3. Melihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Berdasarkan Nama");
            System.out.print("Pilih: ");
            pilih = scan08.nextInt();
            scan08.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Id Surat: ");
                    String id = scan08.nextLine();
                    System.out.print("Nama: ");
                    String nama = scan08.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan08.nextLine();
                    System.out.print("Jenis Izin: ");
                    char jenis = scan08.next().charAt(0);
                    System.out.print("Durasi: ");
                    int durasi = scan08.nextInt();
                    Surat08 srt = new Surat08(id, nama, kelas, jenis, durasi);
                    stack.push(srt);
                    System.out.printf("Surat %s berhasil dimasukkan", srt.namaMahasiswa);
                    System.out.println();
                    break;
                case 2:
                    Surat08 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Memverifikasi surat milik " + dinilai.namaMahasiswa);
                        System.out.println("Jenis Izin: " + dinilai.jenisIzin);
                        System.out.println("Durasi Izin: " + dinilai.durasi + " hari");
                        System.out.println("--------------------------------------------");
                        System.out.print("Apakah izin diterima? (Y/T): ");
                        char status = scan08.next().charAt(0);
                        if (status == 'Y' || status == 'y') {
                            System.out.println("Izin diterima.");
                        } else {
                            System.out.println("Izin ditolak.");
                        }
                    }
                    break;
                case 3:
                    Surat08 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.namaMahasiswa);
                    }
                    break;
                case 4:
                    System.out.print("Masukkan Nama Mahasiswa yang dicari: ");
                    String cari = scan08.nextLine();
                    int hasil = stack.sequentialSearching(cari);
                    if (hasil != -1) {
                        Surat08 ditemukan = stack.stack[hasil]; // stack pertama = objek class surat, stack kedua array
                        System.out.println("\nSurat izin ditemukan:");
                        System.out.println("ID: " + ditemukan.idSurat);
                        System.out.println("Nama: " + ditemukan.namaMahasiswa);
                        System.out.println("Kelas: " + ditemukan.kelas);
                        System.out.println("Jenis Izin: " + ditemukan.jenisIzin);
                        System.out.println("Durasi: " + ditemukan.durasi + " hari");
                    } else {
                        System.out.println("Surat izin tidak ditemukan.");
                    }
                    break;
                default:
                    break;
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}
