package BidangDatar.BidangDatar1;
//Menghitung luas dan keliling segitiga siku-siku
public class Segitiga {
    private double alas, tinggi;
    private double KelilingSegitiga, LuasSegitiga;

    //constructor
    public Segitiga() {
        super();
    }
    public Segitiga(double alas, double tinggi) {
        super();
        this.alas = alas;
        this.tinggi = tinggi;
    }

    //Menghitung luas
    public void setLuasSegitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.LuasSegitiga = (0.5*(alas*tinggi));
    }
    public double getLuasSegitiga()
    {
        return LuasSegitiga;
    }

    //Menghitung keliling

    public void setKelilingSegitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.KelilingSegitiga = alas + tinggi + Math.sqrt((alas*alas)+(tinggi*tinggi));
    }
    public double getKelilingSegitiga()
    {
        return KelilingSegitiga;
    }
}
