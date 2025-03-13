public class tgsPraktikum08 {
    int utsTertinggiDC(int arrUTS[], int l, int r) {
        if (l == r) {
            return arrUTS[l];
        }

        int mid = (l + r) / 2;
        int lMax = utsTertinggiDC(arrUTS, l, mid);
        int rMax = utsTertinggiDC(arrUTS, mid + 1, r);

        if (lMax > rMax) {
            return lMax;
        } else {
            return rMax;
        }
    }

    int utsTerendahDC(int arrUTS[], int l, int r){
        if (l == r) {
            return arrUTS[l];
        }

        int mid = (l + r) /2;
        int lMin = utsTerendahDC(arrUTS, l, mid);
        int rMin = utsTerendahDC(arrUTS, mid + 1, r);   

        if (lMin < rMin) {
            return lMin;
        } else{
            return rMin;
        }

    }

    double rataRataUasBF(int arrUAS[]){
        int total = 0; 
        for(int nilai : arrUAS){
            total += nilai;
        }
        return (double) total / arrUAS.length;
    }
}
