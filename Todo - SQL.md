# Definiciones

## 1. Esquemas
 - Los esquemas estarán en el mismo nivel del jar en una carpeta llamada schemes
 - Cada esquema será un archivo de texto por separado:
    + nombre_esquema.schm
    + nombre_2_esquema.schm
    + etc.schm

 - Cada esquema tendrá un conjunto de tablas dentro :3


 ## 2. Yaml (documentacion de interes sobre la sintaxisssss :3) 

- USAN ESPACIOOOOS no tabulaciones

- Usan pares clave valor:
```yaml
    nombre: María
    edad: 25
    es_estudiante: true
```

- Listas o arrays
    + De una linea:
        ```yaml
        frutas: [manzana, banana, naranja]
        ```

    + De multiples lineas:
        ```yaml
        frutas:
            - manzana
            - banana
            - naranja
        ```

- Objetos anidados:
```yaml
persona:
    nombre: Carlos
    edad: 30
    #Este es un objeto anidado, empieza al mismo nivel que los atributor anteriores 
    #Su contenido está a más niveles que su declaracion :3
    direccion: 
        calle: Av. Principal
        ciudad: Madrid
```

- Multiples documentos:
```yaml
---
nombre: Documento 1
valor: 100
---
nombre: Documento 2
valor: 200
---
```


## 3. Propuesta de yaml para manejar la bd :3
#### 3.1 versiones para rollback
- cada version de la base de datos será un documento de yaml
- para hacer rollback unicamenta habrá que eliminar la ultima version (el ultimo documento)

```yaml
---
#version 1
---
#version 2
---
```
#### Ejemplo completo de un yaml de prueba :3

```yaml
---
#Esta es la v1 del esquema
tablas: 
  # - - - - - - - - - - - - - - - - - - Inicio de la tabla - - - - - - - - - - - - - - - - - -
  - nombre_tabla: "Este es el nombre de la tabla"
    #Gestion de usuarios
    usuarios:
      select: 
        - usuario1
        - usuario2
        - usuario3
      insert:
        - usuario5
      update:
        - usuario3
      delete:
        - usuario1
    #definicion de valores
    valores:
        caracteristicas: [pk,       , fk]
        tipos: [varchar(50), integer, boolean]
        nombres_columnas: [nombre, edad, casado]
        filas: 
         - [valor 1, valor 2, valor 3]
         - [valor 1, valor 2, valor 4]
         - [nombree, 33, true]
         - etc
  # - - - - - - - - - - - - - - - - - - Final de la tabla - - - - - - - - - - - - - - - - - -


  # - - - - - - - - - - - - - - - - - - Inicio de la tabla - - - - - - - - - - - - - - - - - -
  - nombre_tabla: "tabla2"
    #Gestion de usuarios
    usuarios:
      select: 
        - Juan
        - mario
        - juanito
      insert:
        - juanito
      update:
        - mario
        - juanito
      delete:
        - mario
    #definicion de valores
    valores:
        tipos: [varchar(50), integer, boolean]
        nombres_columnas: [direccion, numero_casa, con empleo]
        filas: 
         - [valor 1, valor 2, valor 3]
         - [valor 1, valor 2, valor 4]
         - [nombree, 33, true]
         - etc
  # - - - - - - - - - - - - - - - - - - Final de la tabla - - - - - - - - - - - - - - - - - -




--- 
//esta sería la version dos del esquema
---

```