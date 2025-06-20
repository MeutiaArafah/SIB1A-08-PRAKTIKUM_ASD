public class AllMethod_08 {
    NodeKendaraan_08 head; 
    NodeKendaraan_08 tail;

    boolean isEmpty() {
        return (head == null);
    }

    public void addLast(Kendaraan_08 input) {
        NodeKendaraan_08 ndInput = new NodeKendaraan_08(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public int size() {
        int count = 0;
        NodeKendaraan_08 temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    
    public void displayAll() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        
        System.out.println("\n-- Antrian Kendaraan --");
        NodeKendaraan_08 temp = head;
        int nomor = 1;
        System.out.println("Antrian kendaraan:");
        while (temp != null) {
            temp.data.tampilInformasi();
            temp = temp.next;
            nomor++;
        }
    }
    
    public Kendaraan_08 removeFirst() {
        if (isEmpty()) {
            return null;
        }
        
        Kendaraan_08 removedData = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return removedData;
    }
}