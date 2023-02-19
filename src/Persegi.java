package BidangDatar.BidangDatar1;

public class Persegi {
    private int sisi, LuasPersegi, KelilingPersegi;

    //constructor
    public Persegi() {
        super();
    }
    public Persegi(int sisi) {
        super();
        this.sisi = sisi;
    }

    //Menghitung luas
    public void setLuasPersegi(int sisi){
        this.sisi = sisi;
        this.LuasPersegi = sisi * sisi;
    }
    public double getLuasPersegi()
    {
        return LuasPersegi;
    }

    //Menghitung keliling
    public void setKelilingPersegi(int sisi){
        this.sisi = sisi;
        this.KelilingPersegi = 4 * sisi;
    }
    public double getKelilingPersegi()
    {
        return KelilingPersegi;
    }
}
