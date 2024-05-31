class Tomat extends Tanaman implements Perawatan {
    public Tomat(int masaHidup) {
        super(masaHidup);
    }

    @Override
    public void berkembang() {
        this.lamaHidup += 30;
        this.prosesBerbuah += 25;
        this.perkembangan += 0.25;
        this.buah += 0;
        if (this.lamaHidup > this.masaHidup) {
            this.masaHidup = 0;
        }
    }

    @Override
    public void treatment() {
        this.lamaHidup += 10;
    }
}