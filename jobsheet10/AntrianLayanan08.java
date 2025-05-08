public class AntrianLayanan08 {
    Mahasiswa08[] data;
    int front;
    int rear;
    int size;
    int max;

    public AntrianLayanan08(int max) {
        this.max = max;
        this.data = new Mahasiswa08[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

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

    public void lihatTerdepan() { // menampilkan elemen queue paling depan
        if (isEmpty()) {
            System.out.println("Antiran kosong");
        } else {
            System.out.print("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }

    public void lihatAkhir() { // menampilkan elemen queue paling belakang
        if (isEmpty()) {
            System.out.println("Antiran kosong");
        } else {
            System.out.print("Mahasiswa terakhir: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }

    public void tampilkanSemua() { // menampilkan seluruh elemen pada queue
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.println((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public int getJumlahAntrian(){
        return size;
    }

    public void clear() { // menhapus semua elemen pada queue
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void tambahAntrian(Mahasiswa08 mhs) { // menambahkan isi queue
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian");
    }

    public Mahasiswa08 layaniMahasiswa() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }
        Mahasiswa08 mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }

}