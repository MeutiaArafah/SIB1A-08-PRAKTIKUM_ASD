package Pertemuan12;

import java.util.Scanner;

public class SLLMain08 {

    // public static Mahasiswa08 inputMahasiswa08(Scanner sc08) {
    //     System.out.print("NIM     : ");
    //     String nim = sc08.nextLine();
    //     System.out.print("Nama    : ");
    //     String nama = sc08.nextLine();
    //     System.out.print("Kelas   : ");
    //     String kelas = sc08.nextLine();
    //     System.out.print("IPK     : ");
    //     double ipk = sc08.nextDouble();
    //     sc08.nextLine();
    //     return new Mahasiswa08(nim, nama, kelas, ipk);
    // }

    public static void main(String[] args) {
        
        SingleLinkedList08 list = new SingleLinkedList08();
        Mahasiswa08 mhs1 = new Mahasiswa08("211", "Alvaro", "1A", 4.0);
        Mahasiswa08 mhs2 = new Mahasiswa08("212", "Bimon", "2B", 3.7);
        Mahasiswa08 mhs3 = new Mahasiswa08("213", "Cintia", "3C", 3.9);
        Mahasiswa08 mhs4 = new Mahasiswa08("214", "Dirga", "4D", 3.5);

        list.print();
        list.addFirst(mhs4);
        list.print();
        list.addLast(mhs1);
        list.print();
        list.insertAfter("Dirga", mhs3);
        list.insertAt(2, mhs2);
        list.print();

        System.out.println("data index 1 : ");
        list.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : " + list.indexOf("Bimon"));
        System.out.println();

        list.removeFirst();
        list.removeLast();
        list.print();
        list.removeAt(0);
        list.print();


        // Scanner sc08 = new Scanner(System.in);
        // int pilihan;

        // do {
        //     System.out.println("\n=== Menu Linked List Mahasiswa ===");
        //     System.out.println("1. Tambah Mahasiswa di Awal");
        //     System.out.println("2. Tambah Mahasiswa di Akhir");
        //     System.out.println("3. Memasukkan Data Setelah Nama Tertentu");
        //     System.out.println("4. Memasukkan Data di Index Tertentu");
        //     System.out.println("5. Tampilkan Semua Mahaiswa");
        //     System.out.println("0. Keluar");
        //     System.out.print("Pilih menu: ");
        //     pilihan = sc08.nextInt();
        //     sc08.nextLine();

        //     switch (pilihan) {
        //         case 1:
        //             list.addFirst(inputMahasiswa08(sc08));
        //             break;
        //         case 2:
        //             list.addLast(inputMahasiswa08(sc08));
        //             break;
        //         case 3:
        //             System.out.print("Masukkan nama mahasiswa sebagai key: ");
        //             String key = sc08.nextLine();
        //             list.insertAfter(key,inputMahasiswa08(sc08));
        //             break;
        //         case 4:
        //             System.out.print("Masukkan index: ");
        //             int index = sc08.nextInt();
        //             sc08.nextLine();
        //             list.insertAt(index, inputMahasiswa08(sc08));
        //             break;
        //         case 5:
        //             list.print();
        //             break;
        //         case 0:
        //             System.out.println("Terima Kasih.");
        //             break;
        //         default:
        //             System.out.println("Pilihan tidak valid.");
        //             break;
        //     }
        // } while (pilihan != 0);

    }
}
