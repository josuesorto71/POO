package Lessons;
/**
 * @author Milton Josué Díaz Sorto
 * U20191113
 */

import Interfaces.IntA;
import Interfaces.IntC;
import Interfaces.IntB;

public class ClassCA implements IntA,IntB,IntC,Comparable<ClassCA>{

    public int x, y;

    public ClassCA() {
        x = 0;
        y = 0;

    }

    public ClassCA(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int sumar() {
        return x + y;
    }

    @Override
    public int suma() {
        return x+y;
    }

    @Override
    public int multi() {
        return x*y;
        
    }

    @Override
    public int mayor() {
      return Math.max(x, y);
    }

    @Override
    public int compareTo(ClassCA t) {
        return x==t.x?1:x>t.x?-1:0;
    }
}