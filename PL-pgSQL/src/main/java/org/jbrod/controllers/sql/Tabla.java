package org.jbrod.controllers.sql;

import java.util.LinkedList;

public class Tabla {
    private String nombre;

    // Usuarios con permisos - - -
    private LinkedList<String> permSelect;
    private LinkedList<String> permInsert;
    private LinkedList<String> permUpdate;
    private LinkedList<String> permDelete;

    // Contenido de la tabla
    //Ejemplo en orden:
    /* pk     ,        , fk       (caracteristicas)
     * Integer, decimal, Integer  (tipos)
     * id     , salario, puesto   (nombre columnas)
     * los contenidos deben estar coordinados para funcionar. */
    private LinkedList<String> caractaristicas;
    private LinkedList<String> tipos;
    private LinkedList<String> nombreColumnas;

    private LinkedList<ForeignKeyConstraint> foreignKeys;

    private LinkedList<LinkedList<String>> contenido;



    /* Constructor de la tabla.
     * @param String nombreTabla: String con el nombre de la tabla.
     * @param LinkedList<String> caracteristicas: Define que características tienen las columnas: Llave foranea fk, llave primaria pk.
     * @param LinkedList<String> tipos: Define los tipos de las columnas: String, boolean, Integer, etc.
     * @param LinkedList<String> nombreColumnas: Define los nombres que tienen las columnas en la tabla.
     * */
    public Tabla(String nombreTabla, LinkedList<String> caractaristicas, LinkedList<String> tipos, LinkedList<String> nombreColumnas){
        this.caractaristicas = caractaristicas;
        this.tipos = tipos;
        this.nombreColumnas = nombreColumnas;

        this.nombre = nombreTabla;

        contenido = new LinkedList<>();
        foreignKeys = new LinkedList<>();


        //Manejar la carga de las listas de permisos :3
        permSelect = new LinkedList<>();
        permInsert = new LinkedList<>();
        permUpdate = new LinkedList<>();
        permDelete = new LinkedList<>();

    }




    /* Agrega una tupla a la tabla
     * @param LinkedList<String> columnas: lista enlazada con los nombres de las columnas donde se insertara.
     * @param LinkedList<String> valores: lista enlazada con los valores que se insertarán en la tabla.*/
    public void agregarTupla(LinkedList<String> columnas, LinkedList<String> valores) {

        // 0. Evitar duplicados en columnas
        verificarDuplicados(columnas);

        // 1. Inicializar nuevaTupla con nulls
        LinkedList<String> nuevaTupla = new LinkedList<>();
        for (int i = 0; i < nombreColumnas.size(); i++) {
            nuevaTupla.add(null);
        }

        // 2. Buscar columnas y asignar valores
        for (int j = 0; j < columnas.size(); j++) {
            String columnaBuscada = columnas.get(j);
            String valor = valores.get(j);

            int indice = buscarIndiceColumna(columnaBuscada);
            if (indice == -1) {
                throw new IllegalArgumentException("Columna no encontrada: " + columnaBuscada);
            }

            // Validar tipo antes de asignar
            String tipoEsperado = tipos.get(indice);
            validarTipo(tipoEsperado, valor);

            nuevaTupla.set(indice, valor);
        }

        // 3. Validar PK no repetida
        validarPkUnica(nuevaTupla);

        // 4. Agregar la tupla validada al contenido
        contenido.add(nuevaTupla);

        // 5. Validar claves foráneas
        validarFks(nuevaTupla);

    }



    /* Verifica que no se repitan columnas en la inserción */
    private void verificarDuplicados(LinkedList<String> columnas) {
        for (int i = 0; i < columnas.size(); i++) {
            for (int j = i + 1; j < columnas.size(); j++) {
                if (columnas.get(i).equals(columnas.get(j))) {
                    throw new IllegalArgumentException("No se permiten columnas duplicadas: " + columnas.get(i));
                }
            }
        }
    }

    /* Devuelve el índice de la columna en la tabla, o -1 si no existe */
    private int buscarIndiceColumna(String columna) {
        for (int i = 0; i < nombreColumnas.size(); i++) {
            if (nombreColumnas.get(i).equals(columna)) {
                return i;
            }
        }
        return -1;
    }

    /* Verifica que la clave primaria no esté repetida */
    private void validarPkUnica(LinkedList<String> nuevaTupla) {
        for (int i = 0; i < nombreColumnas.size(); i++) {
            if ("pk".equalsIgnoreCase(caractaristicas.get(i))) {
                String pkValor = nuevaTupla.get(i);
                for (LinkedList<String> filaExistente : contenido) {
                    if (pkValor != null && pkValor.equals(filaExistente.get(i))) {
                        throw new IllegalArgumentException("La clave primaria ya existe: " + pkValor);
                    }
                }
            }
        }
    }


    /* Valida que el valor coincida con el tipo esperado */
    private void validarTipo(String tipoEsperado, String valor) {
        tipoEsperado = tipoEsperado.toUpperCase();

        switch (tipoEsperado) {
            case "INTEGER":
                try {
                    Integer.parseInt(valor);
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Se esperaba un INTEGER pero se recibió: " + valor);
                }
                break;

            case "DECIMAL":
                try {
                    Double.parseDouble(valor);
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Se esperaba un DECIMAL pero se recibió: " + valor);
                }
                break;

            default:
                if (tipoEsperado.startsWith("VARCHAR")) {
                    int max = Integer.parseInt(tipoEsperado.replaceAll("\\D+", ""));
                    if (!valor.startsWith("\"") || !valor.endsWith("\"")) {
                        throw new IllegalArgumentException("El valor debe estar entre comillas dobles: " + valor);
                    }
                    if (valor.length() - 2 > max) {
                        throw new IllegalArgumentException("El VARCHAR excede la longitud máxima (" + max + "): " + valor);
                    }
                } else if ("CHAR".equals(tipoEsperado)) {
                    if (!valor.startsWith("'") || !valor.endsWith("'") || valor.length() != 3) {
                        throw new IllegalArgumentException("El valor debe ser un CHAR válido entre comillas simples: " + valor);
                    }
                } else if ("BOOLEAN".equals(tipoEsperado)) {
                    if (!(valor.equalsIgnoreCase("true") || valor.equalsIgnoreCase("false"))) {
                        throw new IllegalArgumentException("Se esperaba un BOOLEAN (true/false) pero se recibió: " + valor);
                    }
                } else if ("DATE".equals(tipoEsperado)) {
                    if (!valor.matches("\\d{4}-\\d{2}-\\d{2}")) {
                        throw new IllegalArgumentException("Se esperaba un DATE en formato YYYY-MM-DD pero se recibió: " + valor);
                    }
                }
                break;
        }
    }














    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - Metodos para Alter Table - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    /* Agrega una nueva columna a la tabla.
     * @param String nombreColumna: nombre de la nueva columna.
     * @param String tipo: tipo de la nueva columna (INTEGER, DECIMAL, VARCHAR(n), etc.)
     */
    public void agregarColumna(String nombreColumna, String tipo) {
        // Verificar que no exista ya
        if (buscarIndiceColumna(nombreColumna) != -1) {
            throw new IllegalArgumentException("La columna ya existe: " + nombreColumna);
        }

        // Agregar definiciones
        nombreColumnas.add(nombreColumna);
        tipos.add(tipo);
        caractaristicas.add(" "); // por defecto ninguna restricción

        // Inicializar columna con null en todas las filas
        for (LinkedList<String> fila : contenido) {
            fila.add(null);
        }
    }

    /* Elimina una columna de la tabla.
     * @param String nombreColumna: nombre de la columna a eliminar.
     */
    public void eliminarColumna(String nombreColumna) {
        int indice = buscarIndiceColumna(nombreColumna);
        if (indice == -1) {
            throw new IllegalArgumentException("Columna no encontrada: " + nombreColumna);
        }

        // Eliminar de definiciones
        nombreColumnas.remove(indice);
        tipos.remove(indice);
        caractaristicas.remove(indice);

        // Eliminar valor de esa columna en cada fila
        for (LinkedList<String> fila : contenido) {
            fila.remove(indice);
        }
    }


    // - - - - - - - - - - - - - - - - - - - - - - - - Llaves foraneas - - - - - - - - - - - - - - - - - - - - - - - -
    /* Agrega una constraint de Foreign Key */
    public void agregarConstraintFK(String nombreConstraint, String columnaLocal, Tabla tablaReferenciada, String columnaReferenciada) {
        // Validar que no exista ya el constraint
        for (ForeignKeyConstraint fk : foreignKeys) {
            if (fk.nombreConstraint.equals(nombreConstraint)) {
                throw new IllegalArgumentException("Ya existe un constraint con ese nombre: " + nombreConstraint);
            }
        }

        // Validar columna local existe
        int indiceLocal = buscarIndiceColumna(columnaLocal);
        if (indiceLocal == -1) {
            throw new IllegalArgumentException("Columna local no encontrada: " + columnaLocal);
        }

        // Validar columna referenciada existe
        int indiceReferenciada = tablaReferenciada.buscarIndiceColumna(columnaReferenciada);
        if (indiceReferenciada == -1) {
            throw new IllegalArgumentException("Columna referenciada no encontrada en tabla " + tablaReferenciada.nombre + ": " + columnaReferenciada);
        }

        // Validar que columna referenciada sea PK
        if (!"pk".equalsIgnoreCase(tablaReferenciada.caractaristicas.get(indiceReferenciada))) {
            throw new IllegalArgumentException("La columna referenciada no es PK: " + columnaReferenciada);
        }

        // Guardar constraint
        foreignKeys.add(new ForeignKeyConstraint(nombreConstraint, columnaLocal, tablaReferenciada, columnaReferenciada));

        // Marcar columna local como FK
        caractaristicas.set(indiceLocal, "fk");
    }

    /* Elimina una constraint de Foreign Key */
    public void eliminarConstraintFK(String nombreConstraint) {
        ForeignKeyConstraint toRemove = null;
        for (ForeignKeyConstraint fk : foreignKeys) {
            if (fk.nombreConstraint.equals(nombreConstraint)) {
                toRemove = fk;
                break;
            }
        }
        if (toRemove == null) {
            throw new IllegalArgumentException("Constraint no encontrada: " + nombreConstraint);
        }

        // Desmarcar columna
        int indiceLocal = buscarIndiceColumna(toRemove.columnaLocal);
        if (indiceLocal != -1) {
            caractaristicas.set(indiceLocal, "none");
        }

        foreignKeys.remove(toRemove);
    }






    private void validarFks(LinkedList<String> nuevaTupla) {
        for (ForeignKeyConstraint fk : foreignKeys) {
            int indiceLocal = buscarIndiceColumna(fk.columnaLocal);
            String valorLocal = nuevaTupla.get(indiceLocal);

            if (valorLocal == null) continue; // null permitido

            int indiceReferenciada = fk.tablaReferenciada.buscarIndiceColumna(fk.columnaReferenciada);
            boolean existe = false;
            for (LinkedList<String> fila : fk.tablaReferenciada.contenido) {
                if (valorLocal.equals(fila.get(indiceReferenciada))) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                throw new IllegalArgumentException("Violación de FK en " + fk.columnaLocal + ": valor " + valorLocal + " no existe en tabla " + fk.tablaReferenciada.nombre);
            }
        }
    }







    // Getters


    public String getNombre() {
        return nombre;
    }









    //exportar yaml :3
    public String exportarAYaml() {
        StringBuilder sb = new StringBuilder();
        sb.append("  - nombre_tabla: \"" + nombre + "\"\n");

        // Usuarios
        sb.append("    usuarios:\n");
        sb.append("      select: " + listaAYaml(permSelect) + "\n");
        sb.append("      insert: " + listaAYaml(permInsert) + "\n");
        sb.append("      update: " + listaAYaml(permUpdate) + "\n");
        sb.append("      delete: " + listaAYaml(permDelete) + "\n");

        // Valores
        sb.append("    valores:\n");
        sb.append("      caracteristicas: " + listaAYaml(caractaristicas) + "\n");
        sb.append("      tipos: " + listaAYaml(tipos) + "\n");
        sb.append("      nombres_columnas: " + listaAYaml(nombreColumnas) + "\n");

        sb.append("      filas:\n");
        for (LinkedList<String> fila : contenido) {
            sb.append("       - " + listaAYaml(fila) + "\n");
        }

        // Foreign Keys
        if (!foreignKeys.isEmpty()) {
            sb.append("    foreign_keys:\n");
            for (ForeignKeyConstraint fk : foreignKeys) {
                sb.append("      - nombre_constraint: \"" + fk.nombreConstraint + "\"\n");
                sb.append("        columna_local: \"" + fk.columnaLocal + "\"\n");
                sb.append("        tabla_referenciada: \"" + fk.tablaReferenciada.getNombre() + "\"\n");
                sb.append("        columna_referenciada: \"" + fk.columnaReferenciada + "\"\n");
            }
        }

        return sb.toString();
    }

    // Método auxiliar para formatear listas como YAML
    private String listaAYaml(LinkedList<String> lista) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < lista.size(); i++) {
            sb.append(lista.get(i));
            if (i != lista.size() - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
