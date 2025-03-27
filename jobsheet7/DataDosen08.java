class DataDosen08 {
    Dosen08[] dataDosen = new Dosen08[3];
    int idx;

    void tambah(Dosen08 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Dosen08 dsn : dataDosen) {
            dsn.tampil();
        }
    }

    boolean cekDuplikatNama(String nama) {
        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(nama)) {
                return true;
            }
        }
        return false;
    }

    void cariSemuaDenganUsia(int usia) {
        int pos = PencarianDataBinary(usia, 0, idx - 1);
        if (pos == -1) {
            System.out.println("Data dosen dengan usia " + usia + " tidak ditemukan");
            return;
        }

        // Cari ke kiri dan kanan untuk menemukan semua usia yang sama
        int kiri = pos - 1;
        int kanan = pos + 1;

        // Menampilkan hasil pencarian utama
        dataDosen[pos].tampil();
        boolean adaDuplikat = false;

        while (kiri >= 0 && dataDosen[kiri].usia == usia) {
            dataDosen[kiri].tampil();
            adaDuplikat = true;
            kiri--;
        }

        while (kanan < idx && dataDosen[kanan].usia == usia) {
            dataDosen[kanan].tampil();
            adaDuplikat = true;
            kanan++;
        }

        if (adaDuplikat) {
            System.out.println("⚠️ Peringatan: Ada lebih dari satu dosen dengan usia " + usia);
        } else {
            System.out.println("✅ Tidak ada duplikat usia yang ditemukan.");
        }
    }

    int PencarianDataBinary(int cari, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;
            if (dataDosen[mid].usia == cari) {
                return mid;
            } else if (dataDosen[mid].usia > cari) {
                return PencarianDataBinary(cari, left, mid - 1);
            } else {
                return PencarianDataBinary(cari, mid + 1, right);
            }
        }
        return -1;
    }
}