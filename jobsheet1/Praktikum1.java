import java.util.Scanner;

public class Praktikum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String grade = " ", keterangan = "";
        int nilaiAkhir = 0;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("======================");

        System.out.print("Masukkan nilai tugas: ");
        int tugas = sc.nextInt();
        System.out.print("Masukkan nilai kuis: ");
        int kuis = sc.nextInt();
        System.out.print("Masukkan nilai UTS: ");
        int uts = sc.nextInt();
        System.out.print("Masukkan nilai UAS: ");
        int uas = sc.nextInt();

        if (tugas > 100 || kuis > 100 || uts > 100 || uas > 100) {
            System.out.println("======================");
            System.out.println("nilai tidak valid");
            System.out.println("======================");
        } else {
            int nilaiTugas = tugas * 20 / 100;
            int nilaiKuis = kuis * 20 / 100;
            int nilaiUTS = uts * 30 / 100;
            int nilaiUAS = uas * 30 / 100;

            nilaiAkhir = (nilaiTugas + nilaiKuis + nilaiUTS + nilaiUAS);
            // menentukan nilai huruf
            if (80 < nilaiAkhir && nilaiAkhir <= 100) {
                grade = "A";
                keterangan = "SELAMAT ANDA LULUS";
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                grade = "B+";
                keterangan = "SELAMAT ANDA LULUS";
            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                grade = "B";
                keterangan = "SELAMAT ANDA LULUS";
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                grade = "C+";
                keterangan = "SELAMAT ANDA LULUS";
            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                grade = "C";
                keterangan = "SELAMAT ANDA LULUS";
            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                grade = "D";
                keterangan = "MAAF ANDA TIDAK LULUS";
            } else if (nilaiAkhir <= 39) {
                grade = "E";
                keterangan = "MAAF ANDA TIDAK LULUS";

            } else {
                System.out.println("Nilai tidak valid");
            }
            System.out.println("======================");
            System.out.println("======================");
            System.out.println("Nilai akhir : " + nilaiAkhir);
            System.out.println("Nilai huruf : " + grade);
            System.out.println("======================");
            System.out.println("======================");
            System.out.println(keterangan);
        }

    }
}