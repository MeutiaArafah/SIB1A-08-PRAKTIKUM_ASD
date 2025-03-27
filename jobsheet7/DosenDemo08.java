import java.util.Scanner;

public class DosenDemo08 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);

        DataDosen08 list = new DataDosen08();
        System.out.print("Masukkan jumlah dosen: ");
        int jmlDosen = input08.nextInt();
        input08.nextLine();
        for (int i = 0; i < jmlDosen; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Masukkan Kode     : ");
            String kode = input08.nextLine();

            String nama;
            while (true) {
                System.out.print("Masukkan Nama   : ");
                nama = input08.nextLine();
                if (list.cekDuplikatNama(nama)) {
                    System.out.println("⚠️ Nama " + nama + " sudah ada. Masukkan nama lain!");
                } else {
                    break;
                }
            }

            System.out.print("Masukkan Jenis Kelamin (L/P): ");
            String jenisKelamin = input08.nextLine();
            boolean isLakiLaki = jenisKelamin.equalsIgnoreCase("L");
            System.out.print("Masukkan Usia   : ");
            int usia = input08.nextInt();
            input08.nextLine();
            System.out.println("-------------------------------");
            list.tambah(new Dosen08(kode, nama, isLakiLaki, usia));
        }

        list.tampil();

        System.out.println("-------------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("-------------------------------------------------");
        System.out.println("masukkan usia dosen yang dicari: ");
        System.out.print("usia: ");
        int cari = input08.nextInt();

        System.out.println("-------------------------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("-------------------------------------------------");

        list.cariSemuaDenganUsia(cari);
    }
}
