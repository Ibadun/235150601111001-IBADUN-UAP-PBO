class Persik extends Tanaman implements Perawatan {
    public Persik(int masaHidup) {
        super(masaHidup);
    }

    @Override
    public void berkembang() {
        this.lamaHidup += 40;
        this.prosesBerbuah += 75;
        this.perkembangan += 0.15;
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