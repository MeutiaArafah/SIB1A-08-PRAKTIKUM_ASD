public class tgsPraktikumMain08 {
    public static void main(String[] args) {
        int arrUTS[] = {78, 85, 90, 76, 92, 88, 80, 82};
        int arrUAS[] = {82, 88, 87, 79, 95, 85, 83, 84};

        tgsPraktikum08 obj = new tgsPraktikum08();

        int UtsTertinggi = obj.utsTertinggiDC(arrUTS, 0, arrUTS.length - 1);
        int UtsMinimal = obj.utsTerendahDC(arrUTS, 0, arrUTS.length - 1);
        double RataUTS = obj.rataRataUasBF(arrUAS);

        System.out.println("Nilai UTS Tertinggi: " + UtsTertinggi);
        System.out.println("Nilai UTS Terendah: " + UtsMinimal);
        System.out.println("Rata rata mahasiswa: " + RataUTS);
    }
}
