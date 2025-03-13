import java.util.Scanner;
public class MainSum08 {

    public static void main(String[] args) {
        Scanner input08 = new Scanner (System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input08.nextInt();

        Sum08 sm = new Sum08(elemen);
        for(int i = 0; i < elemen; i++){
            System.out.print("Masukkan keuntungan ke-" + (i + 1) + ": ");
            sm.keuntungan[i] = input08.nextDouble();
        }

        System.out.println("Total keuntungan menggunakan Bruteforce: " + sm.totalBF());
        System.out.println("Total keuntungan menggunakan Divide and Conquer: " + sm.totalDC(sm.keuntungan, 0, elemen-1));
    }
}