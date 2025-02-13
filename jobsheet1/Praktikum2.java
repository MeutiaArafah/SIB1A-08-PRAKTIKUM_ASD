import java.util.Scanner;
public class Praktikum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka = 1;
        long nim;

        System.out.print("Masukkan Nim : ");
        nim = sc.nextLong();
        System.out.println("======================");
        long nimAkhir = nim % 100;
        System.out.println("n : " + nimAkhir);

        for(int i = 0; i < nimAkhir; i++){
            if (angka % 2 == 1 ) {
                System.out.print(" * ");
            } else{
                if (angka == 6 || angka == 10) {
                    System.out.print(" * ");
                } else{

                    System.out.print(angka);
                }
            }
            angka++;

        }
    }
}
