package org.iesalandalus.programacion.reyajedrez;
public enum Color {
    BLANCO("Blanco"), NEGRO("Negro");

    private final String textoColor;

    Color(String textoColor) {
        this.textoColor = textoColor;
    }


    public String toString() {
        return textoColor;
    }
}