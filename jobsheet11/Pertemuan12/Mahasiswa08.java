package Pertemuan12;

public class Mahasiswa08 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa08() {

    }

    Mahasiswa08(String nm, String name, String kls, double ipk) {
        nim = nm;
        nama = name;
        kelas = kls;
        this.ipk = ipk;
    }

    void tampilInformasi() {
        System.out.println("NIM     : " + nim);
        System.out.println("Nama    : " + nama);
        System.out.println("Kelas   : " + kelas);
        System.out.println("IPK     : " + ipk);
        System.out.println("---------------------------");
    }

}