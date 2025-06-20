public class QueueTransaksi_08 {
    TransaksiPengisian_08[] queue;
    int front;
    int rear;
    int maxSize;
    int count;
    
    public QueueTransaksi_08 (int size) {
        maxSize = size;
        queue = new TransaksiPengisian_08[maxSize];
        front = 0;
        rear = -1;
        count = 0;
    }
    
    public boolean isEmpty() {
        return count == 0;
    }
    
    public boolean isFull() {
        return count == maxSize;
    }
    
    public void enqueue(TransaksiPengisian_08 transaksi) {
        if (!isFull()) {
            rear = (rear + 1) % maxSize;
            queue[rear] = transaksi;
            count++;
        } else {
            System.out.println("Queue penuh! Tidak dapat menambah transaksi.");
        }
    }
    
    public void displayAll() {
        if (isEmpty()) {
            System.out.println("Belum ada riwayat transaksi.");
            return;
        }
        
        System.out.println("\n-- Riwayat Transaksi --");
        int temp = front;
        System.out.println("Daftar transaksi:");
        for (int i = 0; i < count; i++) {
        TransaksiPengisian_08 t = queue[temp];
        double hargaSblmDiskon = t.liter * t.bbm.hargaPerLiter;
        double diskon = (t.liter >= 20) ? hargaSblmDiskon * 0.05 : 0;

        System.out.println("Plat Nomor      : " + t.kendaraan.platNomor);
        System.out.println("Jenis BBM       : " + t.bbm.namaBBM);
        System.out.println("Liter           : " + t.liter);
        System.out.println("Harga /perLiter : Rp " + t.bbm.hargaPerLiter);
        System.out.println("Total           : Rp " + hargaSblmDiskon);
        if (diskon > 0) {
            System.out.println("Diskon 5%       : Rp " + diskon);
        }
         System.out.println("----------------------------------");
        System.out.println("Total Bayar     : Rp " + t.totalBayar);
        System.out.println("----------------------------------");
        // System.out.println(t.kendaraan.platNomor + ": " + t.totalBayar);
        temp = (temp + 1) % maxSize;
        }
    }
}
