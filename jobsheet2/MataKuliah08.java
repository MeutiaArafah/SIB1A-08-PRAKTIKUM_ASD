public class MataKuliah08 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam; // punya matkul
    
    public MataKuliah08(){

    }

    public MataKuliah08(String kodeMK, String nama, int sks, int jumlahJam ){
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    void tampilInformasi(){
        System.out.println("KodeMK: " + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah jam: " + jumlahJam);
    }

    void ubahSKS(int sksBaru){
        sks = sksBaru;
    }

    void tambahJam(int jam){
        jumlahJam += jam;
    }

    void kurangiJam(int jam){
        if (jam < jumlahJam){
            jumlahJam -= jam;
            System.out.println("Jumlah jam berhasil dikurangi menjadi: " + jumlahJam);
        } else {
            System.out.println("Maaf pengurangan jam tidak dapat dilakukan");
        }
            
        
    }
}