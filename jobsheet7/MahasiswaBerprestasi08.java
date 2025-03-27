public class MahasiswaBerprestasi08 {
    Mahasiswa08 [] listMhs = new Mahasiswa08[3];
    int idx;

    // untuk menambahkan objek dari class mahasiswa ke listMhs
    void tambah(Mahasiswa08 m){
        if(idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        } else{
            System.out.println("data sudah penuh ");
        }
    }

    void tampil(){
        for(Mahasiswa08 m : listMhs){
            m.tampilInformasi();
            System.out.println("---------------------------");
        }
    }

    void bubbleSort(){
        for(int i = 0; i < listMhs.length-1; i++){
            for(int j = 1; j < listMhs.length-i; j++){
                if(listMhs[j].ipk > listMhs[j-1].ipk){
                    Mahasiswa08 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }

    void selectionSort(){
        for(int i = 0; i < listMhs.length-1; i++){
            int idxMin = i;
             for(int j = i+1; j < listMhs.length; j++){
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
             }
             Mahasiswa08  tmp = listMhs[idxMin];
             listMhs[idxMin] = listMhs[i];
             listMhs[i] = tmp;
        }
    }

    // insertion 
    void insertionSort(){
        // asc
        // for(int i = 1; i < listMhs.length; i++){
        //     Mahasiswa08 temp = listMhs[i];
        //     int j = i; 
        //     while (j > 0 && listMhs[j-1].ipk > temp.ipk ) {
        //         listMhs[j] = listMhs[j-1];
        //         j--;
        //     }
        //     listMhs[j] = temp;
        // }

        // desc
         for(int i = 1; i < listMhs.length; i++){
            Mahasiswa08 temp = listMhs[i];
            int j = i; 
            while (j > 0 && listMhs[j-1].ipk < temp.ipk ) {
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j] = temp;
        }
    }

    // searching
    int sequentialSearching(double cari){
        int posisi = -1; // tanda awal data belum ketemu
        for(int j = 0; j<listMhs.length; j++){
            if(listMhs[j].ipk == cari){
                posisi = j;
                break;
            }
        } return posisi;
    }

    void tampilPosisi(double x, int pos){
        if(pos != -1){
            System.out.println("data mahasiswa dengan IPK : " + x + " ditemukan pada indeks " + pos);
        } 
        else{
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos){
        if(pos != 1){
            System.out.println("nim\t : " + listMhs[pos].nim);
            System.out.println("nama\t : " + listMhs[pos].nama);
            System.out.println("kelas\t : " + listMhs[pos].kelas);
            System.out.println("ipk\t : " + x);
        }
        else{
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }

    // searching 
    int findBinarySearch(double cari, int left, int right){
        int mid; // nilai tengah
        if(right >= left){
            mid = (left + right) / 2;
            if(cari == listMhs[mid].ipk){
                return (mid);
            }
             else if(listMhs[mid].ipk < cari){
                return findBinarySearch(cari, left, mid-1);
             } 
             else{
                return findBinarySearch(cari, mid+1, right);
             }
        }
         return -1;
    }
}
