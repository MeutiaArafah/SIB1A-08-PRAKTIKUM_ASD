public class Kendaraan08 {
    String platNomor;
    String tipe;
    String merk;
    
    public Kendaraan08 (String plat, String tipe, String merk) {
        this.platNomor = plat;
        this.tipe = tipe;
        this.merk = merk;
    }
    
    void tampilInformasi() {
        System.out.println("Plat Nomor  : " + platNomor);
        System.out.println("Tipe        : " + tipe);
        System.out.println("Merk        : " + merk);
    }
}

