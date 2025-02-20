public class MahasiswaMain08 {

    public static void main(String[] args) {
        Mahasiswa08 mhs1 = new Mahasiswa08("Muhammad Ali Farhan", "22417220171", 3.55, "SI 2J "); 
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "22417220171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;
        
        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(-1);
        mhs1.tampilkanInformasi();

        Mahasiswa08 mhs2 = new Mahasiswa08("Annisa Nabila", "2141720160", 3.25, "TI 2L"); //
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa08 mhs3 = new Mahasiswa08("Meutia Arafah", "244107060078", 4.0, "SIB 1A");
        mhs3.tampilkanInformasi();
    }
}
