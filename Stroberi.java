class Stroberi extends Tanaman implements Perawatan {
    public Stroberi(int masaHidup) {
        super(masaHidup);
    }

    @Override
    public void berkembang() {
        this.lamaHidup += 20;
        this.prosesBerbuah += 105;
        this.perkembangan += 0.35;
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