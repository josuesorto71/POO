package Lessons;
/**
 * @author Milton Josué Díaz Sorto
 * U20191113
 */

public class ClassCB extends ClassCA {

    public int z;

    public ClassCB() {
        z = 0;
    }

    public ClassCB(int z, int x, int y) {
        super(x, y);
        this.z = z;
    }

    public int suma() {
        return x + y + z;
    }
}