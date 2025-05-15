package Pertemuan12;

public class SLLMain08 {
    public static void main(String[] args) {
        SingleLinkedList08 list = new SingleLinkedList08();

        Mahasiswa08 mhs1 = new Mahasiswa08("211", "Alvaro", "1A", 4.0);
        Mahasiswa08 mhs2 = new Mahasiswa08("212", "Bimon", "2B", 3.7);
        Mahasiswa08 mhs3 = new Mahasiswa08("213", "Cintia", "3C", 3.9);
        Mahasiswa08 mhs4 = new Mahasiswa08("214", "Dirga", "4D", 3.5);

        list.print();
        list.addFirst(mhs4);
        list.print();
        list.addLast(mhs1);
        list.print();
        list.insertAfter("Dirga", mhs3);
        list.insertAt(2, mhs2);
        list.print();
    }

}
