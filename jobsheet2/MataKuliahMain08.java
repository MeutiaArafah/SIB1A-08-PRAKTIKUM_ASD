public class MataKuliahMain08 {

    public static void main(String[] args) {
        MataKuliah08 mk1 = new MataKuliah08();
        mk1.kodeMK = "abc123";
        mk1.nama = "tiara";
        mk1.sks = 19;
        mk1.jumlahJam = 38;
        mk1.tampilInformasi();

        mk1.ubahSKS(20);
        mk1.tambahJam(1);
        mk1.kurangiJam(3);
        mk1.tampilInformasi();

        MataKuliah08 mk2 = new MataKuliah08("def321", "arafah", 12, 20);
        MataKuliah08 mk3 = new MataKuliah08("ghi567", "hidayat", 18, 21);
        mk3.tambahJam(3);
        mk2.tampilInformasi();
        mk3.tampilInformasi();
    }

}