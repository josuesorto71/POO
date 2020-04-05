package Lessons;
/**
 * @author Milton Josué Díaz Sorto
 * U20191113
 */

import AbstractClass.ClassCC;

public class ClassCD extends ClassCC {

    public int x, y;

    public ClassCD(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int suma() {
        return x+y;

    }
}