public class StackSurat08 {
    Surat08[] stack;
    int top;
    int size;

    public StackSurat08(int size){
        this.size = size;
        stack = new Surat08[size];
        top = -1;
    }

    public boolean isFull(){
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty(){
        if(top == -1){
            return true;
        } else{
            return false; 
        }
    }

    public void push(Surat08 srt){
        if (!isFull()) {
            top++;
            stack[top] = srt;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Surat08 pop(){
        if (!isEmpty()) {
            Surat08 s = stack[top];
            top--;
            return s;
        } else{
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Surat08 peek(){
        if (!isEmpty()) {
            return stack[top];
        } else{
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public void print(){
        for(int i = 0; i <= top; i++){
            System.out.println(stack[i].idSurat + "\t" + stack[i].namaMahasiswa + "\t" + stack[i].kelas + "\t" + stack[i].jenisIzin + "\t" + stack[i].durasi);
        } 
        System.out.println("");
    }

    int sequentialSearching(String nama){
        int posisi = -1;
        for(int j = 0; j <= top; j++){
            if (stack[j].namaMahasiswa.equalsIgnoreCase(nama)) {
                posisi = j;
                break;
            }
        } return posisi;
    }
}
