package Controller;
/**
 * @author Milton Josué Díaz Sorto
 * U20191113
 */

import Lessons.ClassCA;
import Lessons.ClassCB;
import Lessons.ClassCD;
import java.util.ArrayList;
import java.util.Collections;

public class RunTask {

    private static ArrayList ClassCA = new ArrayList<>();

    public static void main(String[] args) {
        ClassCA a = new ClassCB(1, 2, 3);
        ClassCD d = new ClassCD(1, 2);
        ClassCA ca = new ClassCA(1, 3);
        System.out.println("La suma es " + a.sumar());
        System.out.println("La suma es " + d.suma());
        System.out.println("La suma es " + ca.sumar());
        System.out.println("La multiplicación es " + ca.multi());

        System.out.println("El valor mayor es " + ca.mayor());

        ArrayList<ClassCA> Clase1 = new ArrayList<ClassCA>();
        Clase1.add(new ClassCA(8, 5));
        Clase1.add(new ClassCA(7, 5));
        Clase1.add(new ClassCA(2, 4));
        Clase1.add(new ClassCA(45, 78));

        Collections.sort(Clase1);

        for (ClassCA auxiliar : Clase1) {
            System.out.println("Los elementos ordenados de mayor a menor X " + auxiliar.x + 
                    " Números Y " + auxiliar.y);
        }
    }
}