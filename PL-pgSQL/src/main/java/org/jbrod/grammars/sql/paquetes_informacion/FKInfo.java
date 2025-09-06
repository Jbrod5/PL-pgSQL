package org.jbrod.grammars.sql.paquetes_informacion;

public class FKInfo {
    String colLocal;
    String tablaRef;
    String colRef;

    public FKInfo(String colLocal, String tablaRef, String colRef) {
        this.colLocal = colLocal;
        this.tablaRef = tablaRef;
        this.colRef = colRef;
    }

    public String getTablaRef() {
        return tablaRef;
    }

    public String getColRef() {
        return colRef;
    }

    public String getColLocal() {
        return colLocal;
    }
}
