public class DosenMain08 {
    public static void main(String[] args) {
        Dosen08 dosen1 = new Dosen08();
        dosen1.idDosen = "1";
        dosen1.nama = "Agus";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 1990;
        dosen1.bidangKeahlian = "Matematika";
        dosen1.tampilInformasi();

        dosen1.setStatusAktif(false);
        dosen1.hitungMasaKerja(2025);
        dosen1.ubahKeahlian("bisnis");
        dosen1.tampilInformasi();

        Dosen08 dosen2 = new Dosen08("2", "Sugeng", true, 2000, "Matematika");
        dosen2.tampilInformasi();

        dosen1.setStatusAktif(true);
        dosen1.hitungMasaKerja(2025);
        dosen1.tampilInformasi();
    }
}
