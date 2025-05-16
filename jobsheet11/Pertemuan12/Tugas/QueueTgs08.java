package Pertemuan12.Tugas;

public class QueueTgs08 {
    NodeMahasiswaTgs08 front, rear;
    int size = 0;
    int max = 100;

    public boolean isEmpty() { // mengecek apakah queue kosong
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() { // mengecek apakah queue sudah penuh
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

public void Enqueue (MahasiswaTgs08 mhs){ // menambahkan isi queue 
        if (isFull()) {
            System.out.println("Queue sudah penuh");
            
        } else{
            NodeMahasiswaTgs08 newNode = new NodeMahasiswaTgs08(mhs);
            if (isEmpty()) {
                front = rear = newNode;
            } else{
                rear.next = newNode;
                rear = newNode;
            }
            size++;
            System.out.println("Berhasil menambahkan data ke antrian");
        }
    }

    public void Dequeue(){
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
            return;
        } 
        System.out.println("Memanggil: " + front.data.nama + " (" + front.data.nim + ") ");
        front = front.next;
        size--;

        if (front == null){
            rear = null;
        }
    }

     public void clear() { // menhapus semua elemen pada queue
        if (!isEmpty()) {
            front = rear = null;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

     public void antrianTerdepan() { // menampilkan elemen queue paling depan
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.print("Antrian terdepan: " + front.data.nama + " (" + front.data.nim + ")");
        }
    }

    public void antrianTerakhir() { // menampilkan elemen queue paling belakang
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
           System.out.print("Antrian terakhir: " + rear.data.nama + " (" + rear.data.nim + ")");
        }
    }

    void jumlahAntrian(){
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
    }

}
