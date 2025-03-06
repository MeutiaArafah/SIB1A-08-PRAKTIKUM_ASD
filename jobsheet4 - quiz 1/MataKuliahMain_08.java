public class MataKuliahMain_08 {
    public static void main(String[] args) {
        Dosen_08[] dosenPengampu = new Dosen_08[3];
        dosenPengampu[0] = new Dosen_08("244", "Budi", 2011, "S1", "Elektro");
        dosenPengampu[1] = new Dosen_08("254", "Ica", 2021, "S3", "Administrasi Niaga");

        MataKuliah_08 matkul1 = new MataKuliah_08("MK01", "ASD", 3, dosenPengampu);

        matkul1.tampilkanInfo();

        matkul1.ubahNamaMK("Basdat");
        matkul1.ubahSKS(1);
        
        System.out.println();

        dosenPengampu[2] = new Dosen_08("333", "Meti", 2025, "S2", "TI");

        matkul1.tambahDosen(dosenPengampu[2]);

        matkul1.tampilkanInfo();
    }
}
