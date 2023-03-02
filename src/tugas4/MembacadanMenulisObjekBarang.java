package projects.src.tugas4;

import java.io.*;

public class MembacadanMenulisObjekBarang {
    public static void main(String[] args) throws IOException {
        ObjekBarang b1 = new ObjekBarang("Oreo", 5000, 10);
        ObjekBarang b2 = new ObjekBarang("Ultra", 6000, 11);
        ObjekBarang b3 = new ObjekBarang("Silverqueen", 15000, 20);
        ObjekBarang b4 = new ObjekBarang("Pocky", 8000, 15);

        try {
            // membuat file
            File file = new File("ObjekBarang.txt");
            if (file.createNewFile()) {
                System.out.println("File created");
            } else {
                System.err.println("File already exists.");
            }
            FileOutputStream f = new FileOutputStream(file);
            ObjectOutputStream o = new ObjectOutputStream(f);

            //menulis objek ke dalam file
            o.writeObject(b1);
            o.writeObject(b2);
            o.writeObject(b3);
            o.writeObject(b4);

            o.close();
            f.close();

            //membaca objek
            FileInputStream f1 = new FileInputStream(file);
            ObjectInputStream o1 = new ObjectInputStream(f1);

            ObjekBarang br1 = (ObjekBarang) o1.readObject();
            ObjekBarang br2 = (ObjekBarang) o1.readObject();
            ObjekBarang br3 = (ObjekBarang) o1.readObject();
            ObjekBarang br4 = (ObjekBarang) o1.readObject();

            System.out.println(br1.toString());
            System.out.println(br2.toString());
            System.out.println(br3.toString());
            System.out.println(br4.toString());

            o.close();
            f.close();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
