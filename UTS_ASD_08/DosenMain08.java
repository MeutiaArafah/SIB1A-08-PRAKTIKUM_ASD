import java.util.Scanner;

public class DosenMain08 {
    public static void main(String[] args) {
        Scanner meutia = new Scanner(System.in);
        int pilihMenu;

        Dosen08[] dsn = {
                new Dosen08("0113", "Rina Marlina", "rina@kampus.ac.id", 2015, "Informatika"),
                new Dosen08("0121", "Budi Santoso", "budi@kampus.ac.id", 2017, "Sistem Informasi"),
                new Dosen08("0112", "Siti Nurhaliza", "siti@kampus.ac.id", 2022, "Teknik Komputer"),
                new Dosen08("0124", "Andi Wijaya", " andi@kampus.ac.id", 2020, "Informatika"),
                new Dosen08("0128", "Dewi Lestari", "dewi@kampus.ac.id", 2016, "Sistem Informasi"),
        };

        do {
            System.out.println("\n=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Data Dosen");
            System.out.println("2. Urutkan Dosen Berdasarkan NIDN (ASC)");
            System.out.println("3. Cari Dosen Berdasarkan Nama");
            System.out.println("4. Urutkan Dosen Berdasarkan Masa Kerja (DESC)");
            System.out.println("0. Keluar");
            System.out.print("Silakan Pilih menu: ");
            pilihMenu = meutia.nextInt();
            meutia.nextLine();

            switch (pilihMenu) {
                case 0:
                    break;
                case 1:
                    System.out.println("\n======= DATA DOSEN =======");
                    for (Dosen08 d : dsn) {
                        d.tampilDosen();
                    }
                    break;
                case 2:
                    System.out.println("\n======= URUTAN NIDN DOSEN ASCENDING =======");
                    Dosen08.sortByNIDNIS(dsn);
                    for (Dosen08 d : dsn) {
                        d.tampilDosen();
                    }
                    break;
                case 3:
                    System.out.print("Masukkan Nama Dosen yang dicari: ");
                    String cari = meutia.nextLine();
                    Dosen08.searchingNama(dsn, cari);
                    break;
                case 4:
                    Dosen08.sortByMasaKerjaSS(dsn);
                    System.out.println("\nMasa Kerja Dosen Setelah Sorting (DESC): ");
                    for (Dosen08 p : dsn) {
                        p.tampilDosen();;
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihMenu != 0);

    }
}
