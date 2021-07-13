package classes;

import exceptions.*;

public class Pilha {
    private int numElementos;
    private Object[] elementos;

    public Pilha(int tamanho) {
        elementos = new Object[tamanho];
        numElementos = 0;
    }

    public int getNumElementos() {
        return numElementos;
    }
    
    public void adicionar(Object elemento) {
        if(numElementos == elementos.length) {
            throw new SemEspacoException();
        }

        elementos[numElementos] = elemento;
        numElementos++;
    }

    public Object remover() {
        if(numElementos == 0) {
            return null;
        }

        numElementos--;
        return elementos[numElementos];
    }
}
