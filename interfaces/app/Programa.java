package interfaces.app;

import interfaces.classes.Pessoa;
import interfaces.classes.Cumprimentador;

public class Programa {
    public static void main(String[] args) {
        Cumprimentador p = new Pessoa();

        System.out.println(p.cumprimentar());
    }
}
