# Patrones de Diseño | Práctica 1
> ##### [Máster en Ingeniería Web por la Universidad Politécnica de Madrid (miw-upm)](http://miw.etsisi.upm.es)
> ##### Asignatura: *Arquitectura y Patrones para Aplicaciones Web*

### Estado del código

[![Build Status](https://travis-ci.org/tomas-teston/apaw.ecp1.TomasTeston.svg?branch=master)](https://travis-ci.org/tomas-teston/apaw.ecp1.TomasTeston)

![Quality Gate](https://sonarcloud.io/api/project_badges/measure?project=es.upm.miw%3Aapaw.ecp1.TomasTeston&metric=alert_status)

### Tecnologías necesarias
* Java
* Maven
* GitHub
* Travis-ci
* Sonarcloud

### Descripción
Se pide aplicar patrones de diseño a un proyecto creado bajo 4 entidades:

1. Empleado
    * Id: String
    * Departamento: Departamento
    * Nombre: String
    * Edad: Integer
    
2. Nómina
    * Salario: double
    * Cobrado: Boolean
    
3. Jefe
    * Id: Integer
    * Nombre: String
    * Telefono: Integer
    
4. Departamento (ENUM)
    * RRHH
    * Ventas
    * Desarrollo
    
5. Proyecto (Entidad independiente)
    * Id: Integer
    * Fecha: Date
    * Descripcion: String
    
### Patrones que hay que aplicar

* Empleado: Factoría con patrón Singleton. Se almacenan y se buscan las entidades por su id de la entidad principal, como entidad principal se refiere a la entidad que posee la relación, pero la factoría no los crea, solo gestiona los objetos. Debe ir con test de prueba

* Nómina: Builder de la entidad. Debe ir con test de prueba

* Jefe: Patrón Composite de la entidad . La entidad no puede ser cambiada de su interfaz publico dado. Mediante el método view() se visualiza la id si es una entidad y name (String) si es una agrupación. Debe ir con test de prueba

* Empleado: A la Factoría anterior,  aplicarle el patrón Observer, para que cada vez que se añade un objeto nuevo, provoque un evento.  Debe ir con test de prueba

* Ejemplo independiente: Patrón Strategy. Buscar, comprender, explicar y realizar un ejemplo propio de su funcionamiento

### Diagrama UML

[![UML](https://github.com/tomas-teston/apaw.ecp1.TomasTeston/blob/master/src/main/resources/ModeloDominio.png)](https://github.com/tomas-teston/apaw.ecp1.TomasTeston/blob/master/src/main/resources/UML.png)


