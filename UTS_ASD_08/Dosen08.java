public class Dosen08 {
    String nidn;
    String nama;
    String email;
    int thnMasuk;
    String prodi;
    int masaKerja;

    Dosen08(String nidn, String nama, String email, int thnMasuk, String prodi) {
        this.nidn = nidn;
        this.nama = nama;
        this.thnMasuk = thnMasuk;
        this.prodi = prodi;
        hitungMasaKerjaDosen();
    }

    void hitungMasaKerjaDosen() {
        masaKerja = 2025 - thnMasuk;
    }

    void tampilDosen() {
        System.out.println("NIDN: " + nidn + " | Nama: " + nama + " | Masa Kerja: " + masaKerja + " | Prodi: " + prodi);
    }

    static void sortByNIDNIS(Dosen08[] dsn) { // sorting = Bubble Sort ASC
        for (int i = 0; i < dsn.length - 1; i++) {
            for (int j = 0; j < dsn.length - i - 1; j++) {
                if (dsn[j].nidn.compareTo(dsn[j + 1].nidn) > 0) {
         
                    Dosen08 temp = dsn[j];
                    dsn[j] = dsn[j + 1];
                    dsn[j + 1] = temp;
                }
            }
        }

    }

    static void searchingNama(Dosen08[] dsn, String cari) { // searching = sequential
        int posisi = -1;
        for (int i = 0; i < dsn.length; i++) {
            if (dsn[i].nama.equalsIgnoreCase(cari)) {
                posisi = i;
                break;
            }
        }
        if (posisi != -1) {
            System.out.println("Dosen Ditemukan: " + dsn[posisi].nidn + " | " + dsn[posisi].nama + " | "
                    + dsn[posisi].masaKerja + " | " + dsn[posisi].prodi);
        } else {
            System.out.println("Masukkan Nama yang valid!");
        }
    }

    static void sortByMasaKerjaSS(Dosen08[] dsn) { // sorting = selection sort 
        for (int i = 0; i < dsn.length - 1; i++) {
            for (int j = i + 1; j < dsn.length; j++) {
                if (dsn[i].masaKerja < dsn[j].masaKerja) {
                    Dosen08 temp = dsn[i];
                    dsn[i] = dsn[j];
                    dsn[j] = temp;
                }
            }
        }
    }
}