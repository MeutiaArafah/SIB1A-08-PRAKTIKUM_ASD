import java.util.Scanner;
public class MainPangkat08 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input08.nextInt();

        // pengisian nilai
        Pangkat08[] png = new Pangkat08[elemen];
        for(int i = 0; i < elemen; i++){
            System.out.print("Masukkan nilai basis elemen ke-" + (i+1) + ": ");
            int basis = input08.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-" + (i + 1) + ": ");
            int pangkat = input08.nextInt();
            png[i] = new Pangkat08(basis, pangkat);

        }

        // memanggil hasil 
        System.out.println("HASIL PANGKAT BRUTEFORCE: ");
        for(Pangkat08 p : png){
            System.out.println(p.nilai + "^" + p.pangkat+ ": " + p.pangkatBF());
        }
        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER: ");
        for(Pangkat08 p : png){
            System.out.println(p.nilai + "^" + p.pangkat+ ": " + p.pangkatDC(p.nilai, p.pangkat));
        }
    }
}
