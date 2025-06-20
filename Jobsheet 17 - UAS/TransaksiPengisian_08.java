public class TransaksiPengisian_08 {
    Kendaraan_08 kendaraan;
    BBM_08 bbm;
    double liter;
    double totalBayar;

    public TransaksiPengisian_08 (Kendaraan_08 kendaraan, BBM_08 bbm, double liter){
        this.kendaraan = kendaraan;
        this.bbm = bbm;
        this.liter = liter;

        double total = liter * bbm.hargaPerLiter;
        if(liter >= 20){
            double diskon = total * 0.05;
            totalBayar = total - diskon;
        }
        else{
            totalBayar = total;
        }
    }

}
