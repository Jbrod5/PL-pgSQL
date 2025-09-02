package org.jbrod.controllers.sql;

import java.util.LinkedList;

public class MainPruebaMotorSQL {

    public static void main(String[] args) {
        Esquema esquema = new Esquema("PruebaEsquemaaaaaa");

        // ----------------- Tabla Departamentos -----------------
        LinkedList<String> caractDep = new LinkedList<>();
        caractDep.add("pk"); // id_departamento es PK
        caractDep.add("");   // nombre sin restricción

        LinkedList<String> tiposDep = new LinkedList<>();
        tiposDep.add("INTEGER");
        tiposDep.add("VARCHAR(50)");

        LinkedList<String> colsDep = new LinkedList<>();
        colsDep.add("id_departamento");
        colsDep.add("nombre");

        esquema.agregarTabla("Departamentos", caractDep, tiposDep, colsDep);
        System.out.println("🔹 YAML después de agregar la tabla Departamentos:");
        System.out.println(esquema.exportarAYaml());

        // ----------------- Tabla Empleados -----------------
        LinkedList<String> caractEmp = new LinkedList<>();
        caractEmp.add("pk");  // id_empleado es PK
        caractEmp.add("");    // nombre sin restricción
        caractEmp.add("fk");  // departamento es FK

        LinkedList<String> tiposEmp = new LinkedList<>();
        tiposEmp.add("INTEGER");
        tiposEmp.add("VARCHAR(50)");
        tiposEmp.add("INTEGER");

        LinkedList<String> colsEmp = new LinkedList<>();
        colsEmp.add("id_empleado");
        colsEmp.add("nombre");
        colsEmp.add("departamento");

        esquema.agregarTabla("Empleados", caractEmp, tiposEmp, colsEmp);
        System.out.println("🔹 YAML después de agregar la tabla Empleados:");
        System.out.println(esquema.exportarAYaml());

        // ----------------- Agregar constraint FK -----------------
        esquema.agregarConstraintFKTabla(
                "Empleados",
                "FK_Empleado_Departamento",
                "departamento",
                "Departamentos",
                "id_departamento"
        );
        System.out.println("🔹 YAML después de agregar la FK:");
        System.out.println(esquema.exportarAYaml());

        // ----------------- Insertar datos válidos -----------------
        LinkedList<String> colsInsertDep = new LinkedList<>();
        colsInsertDep.add("id_departamento");
        colsInsertDep.add("nombre");

        LinkedList<String> valsInsertDep = new LinkedList<>();
        valsInsertDep.add("1");
        valsInsertDep.add("\"Recursos Humanos\"");

        esquema.agregarTuplaEnTabla("Departamentos", colsInsertDep, valsInsertDep);
        System.out.println("🔹 YAML después de insertar en Departamentos:");
        System.out.println(esquema.exportarAYaml());

        // Insert válido en Empleados (FK existe en Departamentos)
        LinkedList<String> colsInsertEmp1 = new LinkedList<>();
        colsInsertEmp1.add("id_empleado");
        colsInsertEmp1.add("nombre");
        colsInsertEmp1.add("departamento");

        LinkedList<String> valsInsertEmp1 = new LinkedList<>();
        valsInsertEmp1.add("100");
        valsInsertEmp1.add("\"Juan Pérez\"");
        valsInsertEmp1.add("1"); // FK válida

        esquema.agregarTuplaEnTabla("Empleados", colsInsertEmp1, valsInsertEmp1);
        System.out.println("✅ Insert válido en Empleados realizado con éxito.");
        System.out.println("🔹 YAML después de insertar en Empleados:");
        System.out.println(esquema.exportarAYaml());

        // ----------------- Insert inválido (FK no existe) -----------------
        LinkedList<String> colsInsertEmp2 = new LinkedList<>();
        colsInsertEmp2.add("id_empleado");
        colsInsertEmp2.add("nombre");
        colsInsertEmp2.add("departamento");

        LinkedList<String> valsInsertEmp2 = new LinkedList<>();
        valsInsertEmp2.add("101");
        valsInsertEmp2.add("\"Ana Torres\"");
        valsInsertEmp2.add("999"); // 🚨 FK inválida

        try {
            esquema.agregarTuplaEnTabla("Empleados", colsInsertEmp2, valsInsertEmp2);
        } catch (IllegalArgumentException e) {
            System.out.println("⚠️ Error esperado por FK inválida: " + e.getMessage());
        }

        // ----------------- ALTER TABLE: agregar nueva columna -----------------
        esquema.agregarColumnaTabla("Empleados", "salario", "DECIMAL");
        System.out.println("✅ Columna 'salario' agregada a Empleados con éxito.");
        System.out.println("🔹 YAML después de agregar columna 'salario':");
        System.out.println(esquema.exportarAYaml());
    }
}
