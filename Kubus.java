
package Tugas4;

class Kubus extends BangunRuang {
    private double sisi;

    // Constructor untuk menginisialisasi sisi kubus
    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    // Overriding method hitungVolume dari superclass
    
    public double hitungVolume() {
        return sisi * sisi * sisi;
    }

    // Overriding method hitungLuasPermukaan dari superclass
    
    public double hitungLuasPermukaan() {
        return 6 * (sisi * sisi);
    }
}

