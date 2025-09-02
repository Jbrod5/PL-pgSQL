package org.jbrod.controllers.sql;

import java.util.LinkedList;

public class MainPruebaMotorSQL {

    public static void main(String[] args) {
        Esquema esquema = new Esquema("EsquemaCompleto");

        // - - - - - - - - Crear tabla Departamentos - - - - - - -
        LinkedList<String> caractDep = new LinkedList<>();
        caractDep.add("pk");
        caractDep.add("");

        LinkedList<String> tiposDep = new LinkedList<>();
        tiposDep.add("INTEGER");
        tiposDep.add("VARCHAR(50)");

        LinkedList<String> colsDep = new LinkedList<>();
        colsDep.add("id_departamento");
        colsDep.add("nombre");

        esquema.agregarTabla("Departamentos", caractDep, tiposDep, colsDep);
        System.out.println("🔹 YAML después de agregar tabla Departamentos:\n" + esquema.exportarAYaml());

        // - - - - - - - - - Crear tabla Empleados - - - - - - - -
        LinkedList<String> caractEmp = new LinkedList<>();
        caractEmp.add("pk");
        caractEmp.add("");
        caractEmp.add("fk");

        LinkedList<String> tiposEmp = new LinkedList<>();
        tiposEmp.add("INTEGER");
        tiposEmp.add("VARCHAR(50)");
        tiposEmp.add("INTEGER");

        LinkedList<String> colsEmp = new LinkedList<>();
        colsEmp.add("id_empleado");
        colsEmp.add("nombre");
        colsEmp.add("departamento");

        esquema.agregarTabla("Empleados", caractEmp, tiposEmp, colsEmp);
        System.out.println("🔹 YAML después de agregar tabla Empleados:\n" + esquema.exportarAYaml());

        // - - - - - - - - Agregar FK - - - - - - - -
        esquema.agregarConstraintFKTabla(
                "Empleados",
                "FK_Empleado_Departamento",
                "departamento",
                "Departamentos",
                "id_departamento"
        );
        System.out.println("🔹 YAML después de agregar FK:\n" + esquema.exportarAYaml());

        // - - - - - - - - Insertar tupla válida - - - - - - - - -
        LinkedList<String> colsInsertDep = new LinkedList<>();
        colsInsertDep.add("id_departamento");
        colsInsertDep.add("nombre");

        LinkedList<String> valsInsertDep = new LinkedList<>();
        valsInsertDep.add("1");
        valsInsertDep.add("\"Recursos Humanos\"");

        esquema.agregarTuplaEnTabla("Departamentos", colsInsertDep, valsInsertDep);

        LinkedList<String> colsInsertEmp1 = new LinkedList<>();
        colsInsertEmp1.add("id_empleado");
        colsInsertEmp1.add("nombre");
        colsInsertEmp1.add("departamento");

        LinkedList<String> valsInsertEmp1 = new LinkedList<>();
        valsInsertEmp1.add("100");
        valsInsertEmp1.add("\"Juan Pérez\"");
        valsInsertEmp1.add("1");

        esquema.agregarTuplaEnTabla("Empleados", colsInsertEmp1, valsInsertEmp1);
        System.out.println("🔹 YAML después de insertar tupla válida:\n" + esquema.exportarAYaml());

        // - - - - - - Insertar tupla inválida (FK) - - - - - - -
        LinkedList<String> valsInsertEmp2 = new LinkedList<>();
        valsInsertEmp2.add("101");
        valsInsertEmp2.add("\"Ana Torres\"");
        valsInsertEmp2.add("999");

        try {
            esquema.agregarTuplaEnTabla("Empleados", colsInsertEmp1, valsInsertEmp2);
        } catch (IllegalArgumentException e) {
            System.out.println("⚠️ Error esperado al insertar FK inválida: " + e.getMessage());
        }
        System.out.println("🔹 YAML después de intentar insertar tupla inválida:\n" + esquema.exportarAYaml());

        // - - - - - - - Agregar columna - - - - - - - -
        esquema.agregarColumnaTabla("Empleados", "salario", "DECIMAL");
        System.out.println("🔹 YAML después de agregar columna 'salario':\n" + esquema.exportarAYaml());

        // - - - - - - - Permisos - - - - - - - -


        // Agregar permisos
        esquema.agregarPermisoSelect("Empleados", "mario");
        esquema.agregarPermisoInsert("Empleados","juanito");
        esquema.agregarPermisoUpdate("Empleados","mario");
        esquema.agregarPermisoDelete("Empleados","juanito");

        System.out.println("🔹 YAML después de agregar permisos:\n" + esquema.exportarAYaml());

        // Eliminar permisos
        esquema.eliminarPermisoSelect("Empleados","mario");
        esquema.eliminarPermisoInsert("Empleados","juanito");
        esquema.eliminarPermisoUpdate("Empleados","mario");
        esquema.eliminarPermisoDelete("Empleados","juanito");

        System.out.println("🔹 YAML después de eliminar permisos:\n" + esquema.exportarAYaml());
    }
}
