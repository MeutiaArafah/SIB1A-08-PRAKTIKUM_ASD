public class MahasiswaDemo08 {
    public static void main(String[] args) {
        MahasiswaBerprestasi08 list = new MahasiswaBerprestasi08();
    Mahasiswa08 m1 = new Mahasiswa08("123", "Zidan", "2A", 3.2);
    Mahasiswa08 m2 = new Mahasiswa08("124", "Ayu", "2A", 3.5);
    Mahasiswa08 m3 = new Mahasiswa08("125", "Sofi" , "2A", 3.1);
    Mahasiswa08 m4 = new Mahasiswa08("126", "Sita", "2A", 3.9);
    Mahasiswa08 m5 = new Mahasiswa08("127", "Miki", "2A", 3.7);

    list.tambah(m1);
    list.tambah(m2);
    list.tambah(m3);
    list.tambah(m4);
    list.tambah(m5);

    System.out.println("Data mahasiswa sebelum sorting: ");
    list.tampil();

    // System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
    // list.bubbleSort();
    // list.tampil();

    // selection sort 
    System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
    list.selectionSort();
    list.tampil();
    }

}
