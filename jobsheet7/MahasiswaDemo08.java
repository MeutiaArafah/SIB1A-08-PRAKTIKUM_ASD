import java.util.Scanner;

public class MahasiswaDemo08 {
    public static void main(String[] args) {

        MahasiswaBerprestasi08 list = new MahasiswaBerprestasi08();

        Scanner input08 = new Scanner(System.in);
        // System.out.print("Masukkan jumlah mahasiswa: ");
        // int jmlMhs = input08.nextInt(); // inputan jumlah mhs
        // input08.nextLine();
        int jmlMhs =5;

        Mahasiswa08[] arrMhs = new Mahasiswa08[jmlMhs];

        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan NIM    : ");
            String nim = input08.nextLine();
            System.out.print("Masukkan Nama   : ");
            String nama = input08.nextLine();
            System.out.print("Masukkan Kelas  : ");
            String kelas = input08.nextLine();
            System.out.print("Masukkan IPK    : ");
            String ip = input08.nextLine();
            Double ipk = Double.parseDouble(ip);
            System.out.println("-------------------------------");
            list.tambah(new Mahasiswa08(nim, nama, kelas, ipk));
        }

        list.tampil();
        // melakukan pencarian data sequential
        System.out.println("-------------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("-------------------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = input08.nextDouble();

        System.out.println("menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss); // nampilin detail nama, nim dll

        // for(Mahasiswa08 mhs : arrMhs){
        // System.out.println("\n======== Data Mahasiswa =========");
        // mhs.tampilInformasi();
        // System.out.println("-------------------------------");
        // }

        // System.out.println("\nData mahasiswa sebelum sorting: ");
        // list.tampil();

        // // bubble sort
        // System.out.println("\nData mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        // list.bubbleSort();
        // list.tampil();

        // Mahasiswa08 m1 = new Mahasiswa08("123", "Zidan", "2A", 3.2);
        // Mahasiswa08 m2 = new Mahasiswa08("124", "Ayu", "2A", 3.5);
        // Mahasiswa08 m3 = new Mahasiswa08("125", "Sofi" , "2A", 3.1);
        // Mahasiswa08 m4 = new Mahasiswa08("126", "Sita", "2A", 3.9);
        // Mahasiswa08 m5 = new Mahasiswa08("127", "Miki", "2A", 3.7);

        // list.tambah(m1);
        // list.tambah(m2);
        // list.tambah(m3);
        // list.tambah(m4);
        // list.tambah(m5);

        // // selection sort
        // System.out.println("Data yang sudah terurut menggunakan SELECTION SORT
        // (ASC)");
        // list.selectionSort();
        // list.tampil();

        // // insertion sort
        // System.out.println("Data yang sudah terurut menggunakan INSERTION SORT
        // (ASC)");
        // list.insertionSort();
        // list.tampil();
    }

}
