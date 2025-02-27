import java.util.Scanner;

public class DosenDemo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahDosen, usia;
        String kode, nama, jenisKelamin;

        System.out.print("Masukkan jumlah dosen: ");
        jumlahDosen = sc.nextInt();
        sc.nextLine(); 

        Dosen08[] arrayOfDosen = new Dosen08[jumlahDosen];

        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("\nMasukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode Dosen    : ");
            kode = sc.nextLine();
            System.out.print("Nama Dosen    : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin (Pria/Wanita): ");
            jenisKelamin = sc.nextLine();
            System.out.print("Usia Dosen    : ");
            usia = sc.nextInt();
            sc.nextLine(); 

            arrayOfDosen[i] = new Dosen08(kode, nama, jenisKelamin, usia);
        }

        System.out.println("\n=== Data Dosen yang telah dimasukkan ===");
        for (Dosen08 dosen08 : arrayOfDosen) {
            dosen08.cetakDosen(); 
            System.out.println("--------------------------------");
        }

        DataDosen08.tampilkanSemuaDosen(arrayOfDosen);
        DataDosen08.jumlahDosenPerJenisKelamin(arrayOfDosen);
        DataDosen08.rerataUsiaDosenTiapJenisKelamin(arrayOfDosen);
        DataDosen08.infoDosenPalingTua(arrayOfDosen);
        DataDosen08.infoDosenPalingMuda(arrayOfDosen);

}
}
