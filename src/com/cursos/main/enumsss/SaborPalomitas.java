package com.cursos.main.enumsss;

public enum SaborPalomitas {
    CHILE("Chilito", 50), MANTEQUILLA("Mantequilla", 43), QUESO("Quesito", 50);
    private String nombreVenta;
    private int precio;

    SaborPalomitas(String nombreVenta, int precio) {
        this.nombreVenta = nombreVenta;
        this.precio = precio;
    }

    public String getNombreVenta() {
        return nombreVenta;
    }

    public int getPrecio() {
        return precio;
    }
}
