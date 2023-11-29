package org.iesalandalus.programacion.reyajedrez;

public class Rey {
    private Color color;
    private Posicion posicion;
    private int totalMovimientos;

    // Constructores y otros métodos

    // Métodos get y set para el atributo 'color'
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        // Validar que el color no sea nulo
        if (color == null) {
            throw new IllegalArgumentException("El color no puede ser nulo.");
        }
        this.color = color;
    }

    // Métodos get y set para el atributo 'posicion'
    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        // Validar que la posición no sea nula y esté dentro del tablero
        if (posicion == null) {
            throw new IllegalArgumentException("La posición no puede ser nula.");
        }

        // Obtener la fila y columna de la posición
        int fila = posicion.getFila();
        char columna = posicion.getColumna();

        // Validar que la fila y columna estén en el rango correcto
        if (fila < 1 || fila > 8 || columna < 'a' || columna > 'h') {
            throw new IllegalArgumentException("La posición no es válida.");
        }

        this.posicion = posicion;
    }

    // Resto de métodos (mover, toString, etc.)
}

