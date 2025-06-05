public class BinaryTreeArray08 {
    Mahasiswa08[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray08(){
        this.dataMahasiswa = new Mahasiswa08[10];
    }

    void populateData (Mahasiswa08 dataMhs[], int idxLast){
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart){
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2*idxStart+1);  
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2*idxStart+2);              
            }
        }
    }
    
    void add(Mahasiswa08 data){
        if (idxLast == dataMahasiswa.length - 1) {
            System.out.println("Tree penuh");
            return;
        }
        idxLast++;
        dataMahasiswa[idxLast] = data;
    }

    void traversePreOrder(int idxStart){
        if (idxStart < dataMahasiswa.length && dataMahasiswa[idxStart] != null) {
            dataMahasiswa[idxStart].tampilInformasi();
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }


}
