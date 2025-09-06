package org.jbrod.grammars.sql.paquetes_informacion;

public class ColumnaInfo {
    String nombre;
    String tipo;
    boolean esPK;
    boolean notNull;

    public ColumnaInfo(String nombre, String tipo, boolean esPK, boolean notNull) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.esPK = esPK;
        this.notNull = notNull;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isNotNull() {
        return notNull;
    }

    public boolean isPK() {
        return esPK;
    }
}

