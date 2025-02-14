import java.util.Scanner;

public class tugas2 {
    static void tampilMenu() {
        System.out.println("--------------------------");
        System.out.println("Menu perhitungan kubus : ");
        System.out.println("1. Volume");
        System.out.println("2. Luas Permukaan");
        System.out.println("3. Keliling");
        System.out.println("--------------------------");
    }

    static int hitungVolume(int sisi) {
        int volume = sisi * sisi * sisi;
        return volume;
    }

    static int hitungLuas(int sisi) {
        int luas = sisi * sisi;
        return luas;
    }

    static int hitungKeliling(int sisi) {
        int keliling = 4 * sisi;
        return keliling;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        tampilMenu();
        System.out.print("Menu yang dipilih : ");
        int pilihMenu = sc.nextInt();
        System.out.print("Silakan masukkan besar sisi kubus : ");
        int sisi = sc.nextInt();
        System.out.println("--------------------------");

        switch (pilihMenu) {
            case 1:
                hitungVolume(sisi);
                System.out.println("Volume kubus : " + hitungVolume(sisi));
                break;
            case 2:
                hitungLuas(sisi);
                System.out.println("Luas permukaan kubus : " + hitungLuas(sisi));
                break;
            case 3:
                hitungKeliling(sisi);
                System.out.println("Keliling kubus : " + hitungKeliling(sisi));
                break;
            default:
                System.out.println("Silakan input ulang menu!");
                break;
        }
    }
}
