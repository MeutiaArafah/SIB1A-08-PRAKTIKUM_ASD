import java.util.Scanner;

public class MatakuliahDemo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah08[] arrayOfMatakuliah = new Matakuliah08[4];
        String kode, nama, dummy;
        int sks, jumlahJam;

        // for (int i = 0; i < 3; i++) {
        //     System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
        //     System.out.print("Kode        : ");
        //     kode = sc.nextLine();
        //     System.out.print("Nama        : ");
        //     nama = sc.nextLine();
        //     System.out.print("SKS         : ");
        //     dummy = sc.nextLine();
        //     sks = Integer.parseInt(dummy);
        //     System.out.print("Jumlah Jam  : ");
        //     dummy = sc.nextLine();
        //     jumlahJam = Integer.parseInt(dummy);
        //     System.out.println("--------------------------------");

        //     arrayOfMatakuliah[i] = new Matakuliah08(kode, nama, sks, jumlahJam);
        // }

        System.out.print("Masukkan jumlah matakuliah : ");
        int jumlahMatkul = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < jumlahMatkul; i++){
            System.out.println("\nMasukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i] = new Matakuliah08();
            arrayOfMatakuliah[i].tambahData(sc);
        }

        System.out.println("\nData Matakuliah yang telah dimasukkan :");
        for(int i = 0; i < jumlahMatkul; i++){
            System.out.println("\nDetail Informasi Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
        }
        // menampilkan hasil input
        // arrayOfMatakuliah[3] = new Matakuliah08("abcd", "rara", 12, 22);


        // for (int i = 0; i < 4; i++) {
        //     System.out.println("Data Matakuliah ke-" + (i + 1));
        //     System.out.println("Kode        : " + arrayOfMatakuliah[i].kode);
        //     System.out.println("Nama        : " + arrayOfMatakuliah[i].nama);
        //     System.out.println("SKS         : " + arrayOfMatakuliah[i].sks);
        //     System.out.println("Jumlah Jam  : " + arrayOfMatakuliah[i].jumlahJam);
        //     System.out.println("--------------------------------");
        // }

        
    }
    

}
