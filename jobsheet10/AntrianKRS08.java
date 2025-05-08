public class AntrianKRS08 {
    Mahasiswa08[] data;
    int front;
    int rear;
    int size;
    int max;
    int totalDilayani = 0;
    int jumlahSudahKRS = 0;

    public AntrianKRS08(int max) {
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
        if(totalDilayani >= 30){
            System.out.println("Batas maksimal 30 mahasiswa sudah dilayani");
            return null;
        }
        Mahasiswa08 mhs = data[front];
        front = (front + 1) % max;
        size--;
        totalDilayani++;
        return mhs;
    }

    public void layaniPasanganMahasiswa(){
        if (size < 2) {
            System.out.println("Tidak cukup mahasiswa di antrian untuk di proses");
        } else {
            // mhs 1
            Mahasiswa08 mhs1 = layaniMahasiswa();
            System.out.println("Melayani mahasiswa pertama: ");
            mhs1.tampilkanData();

            // mhs 2
            Mahasiswa08 mhs2 = layaniMahasiswa();
            System.out.println("Melayani mahasiswa kedua: ");
            mhs2.tampilkanData();

            jumlahSudahKRS += 2;
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

    public void lihatDuaTerdepan() { // menampilkan elemen queue paling depan
        if (size < 2) {
            System.out.println("Tidak cukup mahasiswa di antrian untuk ditampilkan (minimal 2)");
        } else {
            System.out.println("Dua Mahasiswa terdepan: ");
            data[front].tampilkanData();
            data[(front + 1) % max].tampilkanData();
        }
    }

    public void lihatAkhir() { // menampilkan elemen queue paling belakang
        if (isEmpty()) {
            System.out.println("Antiran kosong");
        } else {
            System.out.println("Mahasiswa terakhir: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }

    public int getJumlahAntrian(){
        return size;
    }

    public int getTotalDilayani(){
        return totalDilayani;
    }

    public int getBelumDilayani(){
        return 30 - totalDilayani;
    }

    public int getJumlahSudahKRS(){
        return jumlahSudahKRS;
    }
}
