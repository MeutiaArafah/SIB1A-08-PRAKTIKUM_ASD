import java.util.Scanner;
public class MainFaktorial08 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);

        // memasukkan nilai n
        System.out.print("Masukkan nilai: ");
        int nilai = input08.nextInt();

        // menampilkan hasil pemanggilan
        Faktorial08 fk = new Faktorial08();
        System.out.println("Nilai faktorial "+ nilai + " menggunakan BF: " + fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial " + nilai + " menggunakan DC: " + fk.faktorialDC(nilai));
    }
}
