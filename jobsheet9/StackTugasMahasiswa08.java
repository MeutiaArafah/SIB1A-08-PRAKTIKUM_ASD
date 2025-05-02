public class StackTugasMahasiswa08 {
    Mahasiswa08[] stack; // ambil data dari kelas Mahasiswa terus di array namanya stack
    int top;
    int size;

    public StackTugasMahasiswa08(int size) { // cek apakah tumpukan tugas sudah penuh
        this.size = size;
        stack = new Mahasiswa08[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() { // cek apakah tumpukan masih kosong
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa08 mhs) { // masukkan elemen

        top++;
        stack[top] = mhs;

        // System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");

    }

    public Mahasiswa08 pop() { // mengambil data paling atas
        if (!isEmpty()) {
            Mahasiswa08 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa08 peek() { // akses elemen yang ditunjuk top
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }

    public Mahasiswa08 terbawah() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null; // berarti datanya gaada
        }
    }

    public int jumlahTugas() {
        return top + 1;
    }

    // PRAKTIKUM NOMER 2
    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi08 stack = new StackKonversi08();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}
