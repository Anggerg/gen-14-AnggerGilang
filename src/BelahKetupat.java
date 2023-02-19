package BidangDatar.BidangDatar1;

public class BelahKetupat {
    private double diagonal1, diagonal2, LuasBelahKetupat, KelilingBelahKetupat;

    //constructor
        public BelahKetupat() {
            super();
        }
        public BelahKetupat(double diagonal1, double diagonal2) {
            super();
            this.diagonal1 = diagonal1;
            this.diagonal2 = diagonal2;
        }

    //Menghitung luas
    public void setLuasBelahKetupat(double diagonal1, double diagonal2){
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.LuasBelahKetupat = (0.5*(diagonal1 * diagonal2));
    }
    public double getLuasBelahKetupat()
    {
        return LuasBelahKetupat;
    }

    //Menghitung keliling
    public void setKelilingBelahKetupat(double diagonal1, double diagonal2){
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.KelilingBelahKetupat = 4 * (Math.sqrt(((0.5 * diagonal1)*(0.5 * diagonal1))
                                                + ((0.5 * diagonal2)*(0.5 * diagonal2))));
    }
    public double getKelilingBelahKetupat()
    {
        return KelilingBelahKetupat;
    }
}
