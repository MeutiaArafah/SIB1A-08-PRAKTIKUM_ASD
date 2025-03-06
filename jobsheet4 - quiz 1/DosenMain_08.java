
public class DosenMain_08 {
    public static void main(String[] args) {
        Dosen_08 dosen1 = new Dosen_08("244", "Budi", 2011, "S1", "Elektro");
        dosen1.tampilkanInfo();
        System.out.println();

        System.out.println("=== Update Data ===");
        dosen1.ubahProdi("kimia");
        dosen1.ubahPendidikan("S2");
        dosen1.tampilkanInfo();

        Dosen_08 dosen2 = new Dosen_08("254", "Ica", 2021, "S3", "Administrasi Niaga");
        System.out.println();
        dosen2.tampilkanInfo();
        System.out.println();

        System.out.println("=== Update Data ===");
        dosen2.ubahProdi("sipil");
        dosen2.tampilkanInfo();

    }
}
