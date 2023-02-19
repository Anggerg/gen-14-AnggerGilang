package projects.src.Model;

public class Lingkaran {
    private double jarijari, LuasLingkaran, KelilingLingkaran;

    //constructor
    public Lingkaran() {
        super();
    }
    public Lingkaran(double jarijari) {
        super();
        this.jarijari = jarijari;
    }

    //Menghitung luas
    public void setLuasLingkaran(double jarijari){
        this.jarijari = jarijari;
        this.LuasLingkaran = Math.PI * jarijari * jarijari;
    }
    public double getLuasLingkaran()
    {
        return LuasLingkaran;
    }

    //Menghitung keliling
    public void setKelilingLingkaran(double jarijari){
        this.jarijari = jarijari;
        this.KelilingLingkaran = 2 * Math.PI * jarijari;
    }
    public double getKelilingLingkaran()
    {
        return KelilingLingkaran;
    }
}
