package Pertemuan12.Tugas;

public class MahasiswaTgs08 {
     String nim;
    String nama;
    String kelas;
    String keperluan;

    MahasiswaTgs08() {

    }

    MahasiswaTgs08(String nm, String name, String kls, String keperluan) {
        nim = nm;
        nama = name;
        kelas = kls;
        this.keperluan = keperluan;
    }

    void tampilInformasi() {
        System.out.println("NIM        : " + nim);
        System.out.println("Nama       : " + nama);
        System.out.println("Kelas      : " + kelas);
        System.out.println("Keperluan  : " + keperluan);
        System.out.println("---------------------------");
    }
}
