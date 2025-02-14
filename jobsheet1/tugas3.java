import java.util.Scanner;

public class tugas3 {
    static void pilihan() {
        System.out.println("\nMenu tampilan jadwal kuliah : ");
        System.out.println("1. Tampilkan seluruh jadwal kuliah");
        System.out.println("2. Tampilkan jadwal kuliah berdasarkan hari");
        System.out.println("3. Tampilkan jadwal kuliah berdasarkan semester");
        System.out.println("4. Cari mata kuliah berdasarkan nama mata kuliah");
        System.out.println("===========================================");
    }

    static void tampilSeluruhJadwal(int banyakMatkul, String[] namaMatkul, int[] sks, int[] semester,
            String[] hariKuliah) {
        System.out.println("\nJadwal Kuliah Keseluruhan :");
        System.out.printf("%-30s %-15s %-15s %-15s\n", "Mata Kuliah", "SKS", "Semester", "Hari Kuliah");

        for (int i = 0; i < banyakMatkul; i++) {
            System.out.printf("%-30s %-15s %-15s %-15s\n", namaMatkul[i], sks[i], semester[i], hariKuliah[i]);
        }
    }

    static void tampilBerdasarkanHari(int banyakMatkul, String[] hariKuliah, String[] namaMatkul, Scanner sc) {
        sc.nextLine();
        System.out.print("Cari mata kuliah berdasarkan hari : ");
        String cariHari = sc.next();
        System.out.println("\nJadwal Kuliah Berdasarkan Hari :");
        System.out.printf("%-30s %-15s\n", "Hari Kuliah", "Mata Kuliah");

        for (int i = 0; i < banyakMatkul; i++) {
            if (cariHari.equalsIgnoreCase(hariKuliah[i])) {
                System.out.printf("%-30s %-15s\n", hariKuliah[i], namaMatkul[i]);

            }
        }
    }

    static void tampilBerdasarkanSemester(int banyakMatkul, int[] semester, String[] namaMatkul, Scanner sc) {
        sc.nextLine();
        System.out.print("Cari mata kuliah berdasarkan semester : ");
        int cariSemester = sc.nextInt();
        System.out.println("\nJadwal Kuliah Berdasarkan Semester :");
        System.out.printf("%-30s %-15s\n", "Semester", "Mata Kuliah");

        for (int i = 0; i < banyakMatkul; i++) {
            if (cariSemester == semester[i]) {
                System.out.printf("%-30s %-15s\n", semester[i], namaMatkul[i]);

            }
        }
    }

    static void cariNamaMatkul(Scanner sc, String[] namaMatkul, int banyakMatkul, String[] hariKuliah, int[] sks, int[] semester ) {
        sc.nextLine();
        System.out.print("Cari mata kuliah berdasarkan nama mata kuliah : ");
        String cariMatkul = sc.nextLine();
        System.out.printf("%-30s %-15s %-15s %-15s\n", "Mata Kuliah", "SKS", "Semester", "Hari Kuliah");

        for (int i = 0; i < banyakMatkul; i++) {
            if (cariMatkul.equalsIgnoreCase(namaMatkul[i])) {
                System.out.printf("%-30s %-15s %-15s %-15s\n", namaMatkul[i], sks[i], semester[i], hariKuliah[i]);
                

            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nSilakan input banyaknya mata kuliah : ");
        int banyakMatkul = sc.nextInt();
        sc.nextLine();

        String[] namaMatkul = new String[banyakMatkul];
        int[] sks = new int[banyakMatkul];
        int[] semester = new int[banyakMatkul];
        String[] hariKuliah = new String[banyakMatkul];

        for (int i = 0; i < banyakMatkul; i++) {
            System.out.println("===========================================");
            System.out.print("Silakan input nama mata kuliah : ");
            namaMatkul[i] = sc.nextLine();
            System.out.print("Silakan input jumlah sks : ");
            sks[i] = sc.nextInt();
            System.out.print("Silakan input semester : ");
            semester[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Silakan input hari kuliah : ");
            hariKuliah[i] = sc.nextLine();
        }

        pilihan();
        System.out.print("Silakan pilih menu : ");
        int pilihMenu = sc.nextInt();

        switch (pilihMenu) {
            case 1:
                tampilSeluruhJadwal(banyakMatkul, namaMatkul, sks, semester, hariKuliah);

                break;
            case 2:
                tampilBerdasarkanHari(banyakMatkul, hariKuliah, namaMatkul, sc);
                break;
            case 3:
                tampilBerdasarkanSemester(banyakMatkul, semester, namaMatkul, sc);
                break;
                case 4:
                cariNamaMatkul(sc, namaMatkul, banyakMatkul, hariKuliah, sks, semester);
                break;
            default:
                System.out.println("Silakan input ulang menu!");
                break;
        }
    }

}
