import java.util.Scanner;
public class MataKuliah_08 {

    String kodeMK;
    String namaMK;
    int sks;
    Dosen_08[] dosenPengampu;
    int jumlahDosen;

    public MataKuliah_08(String kodeMK, String namaMk, int sks, Dosen_08[] dosenPengampu) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMk;
        this.sks = sks;
        this.dosenPengampu = dosenPengampu;
    }

    void tampilkanInfo() {
        System.out.println("KodeMK  : " + kodeMK);
        System.out.println("NamaMK  : " + namaMK);
        System.out.println("SKS     : " + sks);
        System.out.println("Dosen Pengampu : ");
        for (Dosen_08 dosen08 : dosenPengampu) {
            if (dosen08 != null) {
                dosen08.tampilkanInfo();
            }
        }
    }

    void ubahNamaMK(String namaMKBaru) {
        namaMK = namaMKBaru;
    }

    void ubahSKS(int SKS) {
        if (SKS >= 2) {
            sks = SKS;
        } else{
            System.out.println("SKS tidak boleh kurang dari 2");
        }
    }
    Scanner meutia08 = new Scanner(System.in);
    public void tambahDosen(Dosen_08 dosen) {
        if (jumlahDosen >= dosenPengampu.length) {
            System.out.println("Tidak dapat menambahkan dosen baru.");
            return;
        }
    
        System.out.println("\n=== Tambah Data Dosen Baru ===");
    
        System.out.print("NIDN               : ");
        String nidnBaru = meutia08.nextLine();
    
        System.out.print("Nama Dosen         : ");
        String namaBaru = meutia08.nextLine();
    
        System.out.print("Tahun Masuk        : ");
        int tahunMasukBaru = meutia08.nextInt();
        meutia08.nextLine();
    
        System.out.print("Jenjang Pendidikan : ");
        String pendidikanBaru = meutia08.nextLine();
    
        System.out.print("Program Studi      : ");
        String prodiBaru = meutia08.nextLine();
    
        dosenPengampu[jumlahDosen++] = new Dosen_08(nidnBaru, namaBaru, tahunMasukBaru, pendidikanBaru, prodiBaru);
        
        System.out.println("\nDosen berhasil ditambahkan!");
    }
    }

