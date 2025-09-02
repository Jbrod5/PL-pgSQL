package org.jbrod.controllers.sql;

public class ForeignKeyConstraint {
    String nombreConstraint;
    String columnaLocal;
    Tabla tablaReferenciada;
    String columnaReferenciada;

    public ForeignKeyConstraint(String nombreConstraint, String columnaLocal, Tabla tablaReferenciada, String columnaReferenciada) {
        this.nombreConstraint = nombreConstraint;
        this.columnaLocal = columnaLocal;
        this.tablaReferenciada = tablaReferenciada;
        this.columnaReferenciada = columnaReferenciada;
    }
}
