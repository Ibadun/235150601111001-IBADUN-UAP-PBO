import java.util.ArrayList;
import java.util.Scanner;

abstract class Tanaman {
    protected int masaHidup;
    protected int lamaHidup;
    protected int prosesBerbuah;
    protected int perkembangan;
    protected int buah;

    public Tanaman(int masaHidup) {
        this.masaHidup = masaHidup;
        this.lamaHidup = 0;
        this.prosesBerbuah = 0;
        this.perkembangan = 0;
        this.buah = 0;
    }

    public int getMasaHidup() {
        return masaHidup;
    }

    public int getLamaHidup() {
        return lamaHidup;
    }

    public int getBuah() {
        return buah;
    }

    public abstract void berkembang();
}

