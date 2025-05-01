public class Mahasiswa08 {
    String nim;
    String nama;
    String kelas;
    int nilai;

    Mahasiswa08(){

    }

    Mahasiswa08(String nim, String nama, String kelas){
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1; // nilai awal ketika tugas belum dinilai
    }

    void tugasDinilai(int nilai){   
        this.nilai = nilai;
    }

    
}