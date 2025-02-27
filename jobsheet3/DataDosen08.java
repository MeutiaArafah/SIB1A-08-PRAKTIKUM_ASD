public class DataDosen08 {
    public static void tampilkanSemuaDosen(Dosen08[] arrayOfDosen) {
        System.out.println("\n=== Data Semua Dosen ===");
        for (Dosen08 dosen08 : arrayOfDosen) {
            dosen08.cetakDosen();
            System.out.println("-----------------------------");
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen08[] arrayOfDosen) { 
        int p = 0, w = 0;
        for (Dosen08 dosen08 : arrayOfDosen) {
            if (dosen08.jenisKelamin.equalsIgnoreCase("Pria"))
                p++;
            else if (dosen08.jenisKelamin.equalsIgnoreCase("Wanita"))
                w++;
        }
        System.out.println("\n--- Jumlah Dosen Per Jenis Kelamin ---");
        System.out.println("Pria  : " + p);
        System.out.println("Wanita: " + w);
    }

    public static void rerataUsiaDosenTiapJenisKelamin(Dosen08[] arrayOfDosen) { 
        int totUsiaPria = 0, totUsiaWanita = 0, jumlahPria = 0, jumlahWanita = 0;
        for (Dosen08 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin.equalsIgnoreCase("Pria")) {
                totUsiaPria += dosen.usia;
                jumlahPria++;
            } else if (dosen.jenisKelamin.equalsIgnoreCase("Wanita")) {
                totUsiaWanita += dosen.usia;
                jumlahWanita++;
            }
        }
        System.out.println("\n=== Rata-rata Usia Dosen Per Jenis Kelamin ===");
        System.out.println("Pria  : " + (jumlahPria == 0 ? "Tidak ada data" : (totUsiaPria / (double) jumlahPria)));
        System.out.println("Wanita: " + (jumlahWanita == 0 ? "Tidak ada data" : (totUsiaWanita / (double) jumlahWanita)));
    }

    public static void infoDosenPalingTua(Dosen08[] arrayOfDosen) { 
        if (arrayOfDosen.length == 0) {
            System.out.println("\nTidak ada data dosen.");
            return;
        }
        Dosen08 tertua = arrayOfDosen[0];
        for (Dosen08 dosen : arrayOfDosen) {
            if (dosen.usia > tertua.usia)
                tertua = dosen;
        }
        System.out.println("\n=== Dosen Paling Tua ===");
        tertua.cetakDosen();
    }

    public static void infoDosenPalingMuda(Dosen08[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) {
            System.out.println("\nTidak ada data dosen.");
            return;
        }
        Dosen08 termuda = arrayOfDosen[0];
        for (Dosen08 dosen : arrayOfDosen) {
            if (dosen.usia < termuda.usia)
                termuda = dosen;
        }
        System.out.println("\n=== Dosen Paling Muda ===");
        termuda.cetakDosen();
    }
}
