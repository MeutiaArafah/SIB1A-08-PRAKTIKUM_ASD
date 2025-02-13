import java.util.Scanner;

public class Praktikum3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("======================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("======================");
        

        String matkul[] = { "Pancasila", "Konsep Teknologi Informasi", "Critical Thingking dan Problem Solving",
                "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja" };
        int sks[] = { 2, 2, 2, 3, 4, 2, 2, 2 };
        double nilaiMatkul[] = new double[8]; // 8 baris
        double setara[] = new double[8];
        String huruf[] = new String[8];

        for(int i = 0; i < matkul.length; i++) {
            System.out.print("Masukkan nilai angka untuk MK " + matkul[i] + " : ");
            nilaiMatkul[i] = sc.nextDouble();

            if(nilaiMatkul[i] > 80 && nilaiMatkul[i] <= 100) {
                huruf[i] = "A";
                setara[i] = 4;
            } else if (nilaiMatkul[i] > 73 && nilaiMatkul[i] <= 80) {
                huruf[i] = "B+";
                setara[i] = 3.5;
            }else if (nilaiMatkul[i] > 65 && nilaiMatkul[i] <= 73) {
                huruf[i] = "B";
                setara[i] = 3;
            } else if (nilaiMatkul[i] > 60 && nilaiMatkul[i] <= 65) {
                huruf[i] = "C+";
                setara[i] = 2.5;
            } else if (nilaiMatkul[i] > 50 && nilaiMatkul[i] <= 60) {
                huruf[i] = "C";
                setara[i] = 2;
            } else if (nilaiMatkul[i] > 39 && nilaiMatkul[i] <= 50) {
                huruf[i] = "D";
                setara[i] = 1;
            } else{
                huruf[i] = "E";
                setara[i] = 0;
            }
        }

        System.out.println("======================");
        System.out.println("Hasil Konversi Nilai ");
        System.out.println("======================");
        System.out.printf("%-40s %-20s %-20s %-20s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

      int totalNilai = 0, totalSKS = 0;
        for(int j = 0; j < 8; j++) {
         totalNilai += setara[j] * sks[j];
         totalSKS += sks[j];
            System.out.printf("%-40s %-20s %-20s %-20s\n", matkul[j], nilaiMatkul[j], huruf[j], setara[j]);
        }
        System.out.println("======================");

        double IP = totalNilai / totalSKS;

        System.out.println("IP : " + IP);
    }
}
