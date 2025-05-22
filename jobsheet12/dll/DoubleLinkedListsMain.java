package dll;

import java.util.Scanner;

public class DoubleLinkedListsMain {
    public static void main(String[] args) {
        DoubleLinkedLists01 list = new DoubleLinkedLists01();
        Scanner scan08 = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus dari awal");
            System.out.println("4. Hapus dari akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Cari Mahasiswa berdasarkan NIM");
            System.out.println("7. Tambah data pada indeks tertentu");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan08.nextInt();
            scan08.nextLine();

            switch (pilihan) {
                case 1:
                    Mahasiswa01 mhs = inputMahasiswa(scan08);
                    list.addFirst(mhs);
                    break;
                case 2:
                    Mahasiswa01 mhs1 = inputMahasiswa(scan08);
                    list.addLast(mhs1);
                    break;
                case 3:
                    // list.removeFirst();
                    break;
                case 4:
                    // list.removeLast();
                    break;
                case 5:
                    list.print();
                    break;
                case 6:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = scan08.nextLine();
                    Node01 found = list.search(nim);
                    if (found != null) {
                        System.out.println("Data ditemukan:");
                        found.data.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan.");
                    }
                    break;
                case 7:
                    System.out.print("Masukkan NIM yang dijadikan sebagai keyNim: ");
                    String keyNim = scan08.nextLine();
                    System.out.println("Masukkan data mahasiswa baru yang akan disisipkan: ");
                    Mahasiswa01 mhs2 = inputMahasiswa(scan08);
                    list.insertAfter(keyNim, mhs2);
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (pilihan != 0);

    }

    public static Mahasiswa01 inputMahasiswa(Scanner scan08) {
        System.out.print("NIM     : ");
        String nim = scan08.nextLine();
        System.out.print("Nama    : ");
        String nama = scan08.nextLine();
        System.out.print("Kelas   : ");
        String kelas = scan08.nextLine();
        System.out.print("IPK     : ");
        double ipk = scan08.nextDouble();
        scan08.nextLine();
        return new Mahasiswa01(nim, nama, kelas, ipk);
    }
}
