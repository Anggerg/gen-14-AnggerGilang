package projects.src.tugas4;

import java.io.Serializable;

public class ObjekBarang implements Serializable {
    private int harga;
    private int persediaan;
    private String nama;

    public ObjekBarang() {
    }

    public ObjekBarang(String nama, int harga, int persediaan) {
        this.nama = nama;
        this.harga = harga;
        this.persediaan = persediaan;
    }

    @Override
    public String toString() {
        return "\nProduk: " + nama + "\nHarga: " + harga + "\nPersediaan: " + persediaan;
    }
}
