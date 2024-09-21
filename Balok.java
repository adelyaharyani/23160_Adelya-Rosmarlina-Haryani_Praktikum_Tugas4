
package Tugas4;

class Balok extends BangunRuang {
    private double panjang;
    private double lebar;
    private double tinggi;

    // Constructor untuk menginisialisasi panjang, lebar, dan tinggi balok
    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    // Overriding method hitungVolume dari superclass
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    // Overriding method hitungLuasPermukaan dari superclass
    
    public double hitungLuasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
}

