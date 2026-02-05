# EJERCICIOS PRÁCTICOS
# Programación Orientada a Objetos en Java
## De Conceptos Básicos a Avanzados

**15 Ejercicios Detallados para Dominar la POO**

---

## Introducción

Este documento contiene 15 ejercicios cuidadosamente diseñados para ayudarte a dominar la Programación Orientada a Objetos en Java desde cero. Cada ejercicio está basado en un concepto fundamental de POO y está estructurado para guiarte paso a paso.

**Estructura de cada ejercicio:**
- **Objetivo**: Lo que aprenderás
- **Enunciado detallado**: Descripción completa de lo que debes hacer
- **Requisitos específicos**: Lista de lo que debe incluir tu solución
- **Ejemplo de salida esperada**: Para que veas cómo debe funcionar tu programa
- **Pistas y consejos**: Orientación para resolver el ejercicio

---

## Ejercicio 1: Estructura de una Clase

### Objetivo
Comprender la estructura básica de una clase en Java, incluyendo atributos, constructores, métodos, getters y setters.

### Enunciado
Crea una clase llamada **Estudiante** que represente a un estudiante de una universidad. La clase debe almacenar información sobre el estudiante y permitir mostrar sus datos.

### Requisitos

1. **Atributos privados:** La clase debe tener los siguientes atributos privados:
   - `String nombre` - El nombre completo del estudiante
   - `String matricula` - El número de matrícula (ej: "EST2024001")
   - `int edad` - La edad del estudiante
   - `double promedioNotas` - El promedio de calificaciones (0.0 a 10.0)

2. **Constructor:** Crea un constructor que reciba todos los atributos como parámetros e inicialice el objeto.

3. **Métodos getter y setter:** Crea métodos getter (get) y setter (set) para todos los atributos.

4. **Método `mostrarInformacion()`:** Crea un método público que imprima en consola toda la información del estudiante de forma legible.

5. **Método `estaAprobado()`:** Crea un método que retorne `true` si el promedio es mayor o igual a 5.0, y `false` en caso contrario.

6. **Clase Main:** Crea una clase `Main` con el método `main` donde:
   - Crees al menos 2 objetos de tipo `Estudiante` con diferentes datos
   - Muestres la información de cada estudiante usando el método `mostrarInformacion()`
   - Modifiques el promedio de uno de los estudiantes usando el setter
   - Verifiques si cada estudiante está aprobado usando `estaAprobado()`

### Ejemplo de Salida Esperada
```
=== Información del Estudiante ===
Nombre: María García López
Matrícula: EST2024001
Edad: 20 años
Promedio: 7.5
Estado: APROBADO

=== Información del Estudiante ===
Nombre: Juan Pérez Martínez
Matrícula: EST2024002
Edad: 19 años
Promedio: 4.2
Estado: NO APROBADO

--- Después de actualizar el promedio de Juan ---
=== Información del Estudiante ===
Nombre: Juan Pérez Martínez
Matrícula: EST2024002
Edad: 19 años
Promedio: 6.8
Estado: APROBADO
```

### Pistas y Consejos
- Recuerda que los atributos deben ser `private` para garantizar el encapsulamiento
- El constructor debe tener el mismo nombre que la clase y no tiene tipo de retorno
- Usa `this.atributo = parametro` en el constructor para diferenciar entre atributos y parámetros
- Los getters retornan el valor del atributo: `public String getNombre() { return nombre; }`
- Los setters modifican el valor del atributo: `public void setNombre(String nombre) { this.nombre = nombre; }`
- Puedes usar `System.out.println()` dentro de `mostrarInformacion()`

---

## Ejercicio 2: Propiedades y Atributos

### Objetivo
Comprender los diferentes tipos de atributos (primitivos y de referencia) y cómo acceder a ellos correctamente mediante getters y setters.

### Enunciado
Crea una clase **ProductoTienda** que represente un producto en una tienda online. Esta clase trabajará con diferentes tipos de datos para gestionar la información del producto.

### Requisitos

1. **Atributos privados:**
   - `String codigoProducto` - Código único del producto (ej: "PROD-001")
   - `String nombre` - Nombre del producto
   - `double precio` - Precio en euros
   - `int stock` - Cantidad disponible en almacén
   - `boolean disponible` - Indica si el producto está disponible para venta
   - `String categoria` - Categoría del producto (ej: "Electrónica", "Ropa", "Alimentación")

2. **Constructor:** Crea un constructor que inicialice todos los atributos.

3. **Getters y Setters:** Crea getters y setters para todos los atributos. En el setter de `precio`, valida que el precio no sea negativo (si lo es, asigna 0.0).

4. **Método `vender(int cantidad)`:** Método que:
   - Reduce el stock en la cantidad especificada
   - Si el stock llega a 0 o menos, cambia `disponible` a `false`
   - Muestra un mensaje indicando cuántas unidades se vendieron
   - Si no hay suficiente stock, muestra un mensaje de error

5. **Método `reabastecer(int cantidad)`:** Aumenta el stock y cambia `disponible` a `true`

6. **Método `aplicarDescuento(double porcentaje)`:** Reduce el precio según el porcentaje dado (ej: 10 para 10%)

7. **Método `mostrarProducto()`:** Muestra toda la información del producto de forma clara

8. **Clase Main:** Crea varios productos, realiza ventas, reabastecimientos y aplica descuentos para probar todos los métodos.

### Ejemplo de Salida Esperada
```
=== PRODUCTO ===
Código: PROD-001
Nombre: Laptop HP
Categoría: Electrónica
Precio: 599.99 €
Stock: 15 unidades
Disponible: Sí

>>> Se vendieron 3 unidades de Laptop HP
Stock restante: 12 unidades

>>> Aplicando descuento del 10%...
Nuevo precio: 539.99 €

>>> Se vendieron 12 unidades de Laptop HP
Stock restante: 0 unidades
¡PRODUCTO AGOTADO!

>>> Reabasteciendo 20 unidades...
Stock actual: 20 unidades
Producto disponible nuevamente
```

### Pistas y Consejos
- Recuerda que `boolean` es un tipo primitivo que solo puede ser `true` o `false`
- Para aplicar un descuento del 10%, multiplica el precio por 0.9 (o resta precio * 0.1)
- Usa `if` para validar condiciones antes de modificar atributos
- En el setter de precio, puedes usar: `this.precio = (precio < 0) ? 0.0 : precio;`

---

## Ejercicio 3: Métodos de Instancia y Estáticos

### Objetivo
Comprender la diferencia entre métodos de instancia (que operan sobre objetos específicos) y métodos estáticos (que pertenecen a la clase).

### Enunciado
Crea una clase **CuentaBancaria** que gestione cuentas bancarias y además lleve un registro del total de cuentas creadas y el dinero total en el banco.

### Requisitos

1. **Atributos de instancia privados:**
   - `String numeroCuenta` - Número único de cuenta
   - `String titular` - Nombre del titular
   - `double saldo` - Saldo actual de la cuenta

2. **Atributos estáticos privados:**
   - `static int totalCuentas = 0` - Contador de cuentas creadas
   - `static double dineroTotalBanco = 0.0` - Suma de todos los saldos
   - `static final double INTERES_ANUAL = 0.02` - Tasa de interés (2%) - constante

3. **Constructor:** Debe:
   - Recibir numeroCuenta, titular y saldo inicial
   - Incrementar `totalCuentas` en 1
   - Sumar el saldo inicial a `dineroTotalBanco`

4. **Métodos de instancia públicos:**
   - `depositar(double cantidad)` - Aumenta el saldo y el dinero total del banco
   - `retirar(double cantidad)` - Reduce el saldo si hay fondos suficientes, actualiza dinero total del banco
   - `aplicarInteresAnual()` - Aumenta el saldo según INTERES_ANUAL
   - `mostrarInformacion()` - Muestra los datos de la cuenta
   - Getters para todos los atributos

5. **Métodos estáticos públicos:**
   - `static int getTotalCuentas()` - Retorna el número total de cuentas
   - `static double getDineroTotalBanco()` - Retorna el dinero total en el banco
   - `static void mostrarEstadisticasBanco()` - Muestra el total de cuentas y dinero total

6. **Clase Main:** Crea 3 cuentas, realiza operaciones y muestra las estadísticas del banco usando métodos estáticos.

### Ejemplo de Salida Esperada
```
Cuenta creada: CT-001 - Ana Martínez - Saldo: 1000.0 €
Cuenta creada: CT-002 - Luis Gómez - Saldo: 1500.0 €
Cuenta creada: CT-003 - Carla Ruiz - Saldo: 2000.0 €

====== ESTADÍSTICAS DEL BANCO ======
Total de cuentas: 3
Dinero total en el banco: 4500.0 €
=====================================

>>> Ana deposita 500 €
Nuevo saldo de Ana: 1500.0 €

>>> Luis retira 200 €
Nuevo saldo de Luis: 1300.0 €

>>> Aplicando interés anual a todas las cuentas...
Cuenta CT-001: Interés aplicado. Nuevo saldo: 1530.0 €

====== ESTADÍSTICAS DEL BANCO ======
Total de cuentas: 3
Dinero total en el banco: 4830.0 €
=====================================
```

### Pistas y Consejos
- Las variables estáticas se declaran con la palabra `static` y son compartidas por todos los objetos
- Los métodos estáticos se llaman con el nombre de la clase: `CuentaBancaria.getTotalCuentas()`
- Usa `final` para constantes que no deben cambiar
- Recuerda actualizar `dineroTotalBanco` en cada depósito y retiro
- Para aplicar el interés: `saldo = saldo + (saldo * INTERES_ANUAL)`

---

## Ejercicio 4: Constructores

### Objetivo
Comprender cómo funcionan los constructores, incluyendo constructores por defecto y constructores sobrecargados (múltiples constructores con diferentes parámetros).

### Enunciado
Crea una clase **Rectangulo** que represente un rectángulo con diferentes formas de creación. Implementarás sobrecarga de constructores para permitir crear rectángulos de diferentes maneras.

### Requisitos

1. **Atributos privados:**
   - `double base` - La base del rectángulo
   - `double altura` - La altura del rectángulo
   - `String color` - El color del rectángulo

2. **Constructor 1 (sin parámetros):** Crea un rectángulo con valores por defecto:
   - base = 1.0
   - altura = 1.0
   - color = "Blanco"
   - Muestra un mensaje: "Rectángulo creado con valores por defecto"

3. **Constructor 2 (base y altura):** Recibe base y altura, usa color por defecto "Blanco"
   - Muestra un mensaje: "Rectángulo creado con dimensiones personalizadas"

4. **Constructor 3 (todos los parámetros):** Recibe base, altura y color
   - Muestra un mensaje: "Rectángulo creado completamente personalizado"

5. **Constructor 4 (cuadrado):** Recibe un solo parámetro `lado` y crea un cuadrado (base = altura = lado), color "Blanco"
   - Muestra un mensaje: "Cuadrado creado con lado X"

6. **Métodos:**
   - `double calcularArea()` - Retorna base * altura
   - `double calcularPerimetro()` - Retorna 2 * (base + altura)
   - `boolean esCuadrado()` - Retorna true si base == altura
   - `void mostrarInformacion()` - Muestra base, altura, color, área y perímetro
   - Getters y setters para todos los atributos

7. **Clase Main:** Crea al menos 4 rectángulos usando los diferentes constructores y muestra su información.

### Ejemplo de Salida Esperada
```
Rectángulo creado con valores por defecto
--- Rectángulo 1 ---
Base: 1.0
Altura: 1.0
Color: Blanco
Área: 1.0
Perímetro: 4.0
¿Es cuadrado?: Sí

Rectángulo creado con dimensiones personalizadas
--- Rectángulo 2 ---
Base: 5.0
Altura: 3.0
Color: Blanco
Área: 15.0
Perímetro: 16.0
¿Es cuadrado?: No

Rectángulo creado completamente personalizado
--- Rectángulo 3 ---
Base: 7.0
Altura: 4.0
Color: Azul
Área: 28.0
Perímetro: 22.0
¿Es cuadrado?: No

Cuadrado creado con lado 6.0
--- Rectángulo 4 ---
Base: 6.0
Altura: 6.0
Color: Blanco
Área: 36.0
Perímetro: 24.0
¿Es cuadrado?: Sí
```

### Pistas y Consejos
- La sobrecarga de constructores significa tener múltiples constructores con diferentes parámetros
- Cada constructor debe tener el mismo nombre que la clase pero diferente número o tipo de parámetros
- Puedes llamar a un constructor desde otro usando `this(parametros)` (búscalo en internet como "constructor chaining")
- Para comparar doubles con ==, puede haber problemas de precisión. En este caso simple está bien, pero investiga sobre `Math.abs(base - altura) < 0.0001`

---

## Ejercicio 5: Creación y Uso de Objetos

### Objetivo
Practicar la creación de múltiples objetos, la interacción entre ellos y la manipulación de sus estados.

### Enunciado
Crea un sistema de gestión para una biblioteca. Necesitarás una clase **Libro** y una clase **Usuario**. Los usuarios podrán pedir prestados y devolver libros.

### Requisitos

**Clase Libro:**

1. **Atributos privados:**
   - `String titulo`
   - `String autor`
   - `String ISBN` - Código único del libro
   - `boolean prestado` - Estado del libro (false = disponible, true = prestado)
   - `String prestadoA` - Nombre del usuario que lo tiene prestado (null si está disponible)

2. **Constructor:** Recibe título, autor e ISBN. Inicializa prestado como false y prestadoA como null.

3. **Métodos:**
   - `boolean prestar(String nombreUsuario)` - Si el libro no está prestado, marca como prestado y guarda el nombre del usuario. Retorna true si tuvo éxito, false si ya estaba prestado.
   - `boolean devolver()` - Si el libro está prestado, marca como disponible y limpia prestadoA. Retorna true si tuvo éxito, false si ya estaba disponible.
   - `void mostrarEstado()` - Muestra título, autor, ISBN y estado (disponible o prestado a [usuario])
   - Getters para todos los atributos

**Clase Usuario:**

1. **Atributos privados:**
   - `String nombre`
   - `String numeroSocio`
   - `int librosPrestados` - Contador de libros actualmente prestados
   - `static final int MAX_LIBROS = 3` - Máximo de libros que puede tener simultáneamente

2. **Constructor:** Recibe nombre y numeroSocio. Inicializa librosPrestados en 0.

3. **Métodos:**
   - `boolean pedirPrestado(Libro libro)` - Si el usuario no ha alcanzado MAX_LIBROS, intenta prestar el libro. Si tiene éxito, incrementa librosPrestados. Muestra mensajes apropiados.
   - `boolean devolverLibro(Libro libro)` - Devuelve el libro y decrementa librosPrestados. Muestra mensajes apropiados.
   - `void mostrarInformacion()` - Muestra nombre, número de socio y cantidad de libros prestados
   - Getters apropiados

4. **Clase Main:** Crea varios libros y usuarios. Simula préstamos y devoluciones mostrando el estado del sistema.

### Ejemplo de Salida Esperada
```
=== SISTEMA DE BIBLIOTECA ===

Libro: "Cien Años de Soledad" por Gabriel García Márquez
ISBN: 978-0307474728
Estado: DISPONIBLE

Usuario: María López (Socio: SOC-001)
Libros prestados: 0/3

>>> María intenta pedir "Cien Años de Soledad"
✓ Préstamo exitoso
Libro prestado a: María López

Libro: "Cien Años de Soledad" por Gabriel García Márquez
ISBN: 978-0307474728
Estado: PRESTADO a María López

Usuario: María López (Socio: SOC-001)
Libros prestados: 1/3

>>> Juan intenta pedir "Cien Años de Soledad"
✗ El libro ya está prestado

>>> María devuelve "Cien Años de Soledad"
✓ Devolución exitosa

Libro: "Cien Años de Soledad" por Gabriel García Márquez
ISBN: 978-0307474728
Estado: DISPONIBLE
```

### Pistas y Consejos
- Fíjate que el método `pedirPrestado` de Usuario recibe un objeto `Libro` como parámetro
- Esto es un ejemplo de composición: objetos que contienen o interactúan con otros objetos
- Usa `libro.prestar(this.nombre)` dentro del método de Usuario
- Valida siempre las condiciones antes de modificar el estado

---

## Ejercicio 6: Importar Clases y Paquetes

### Objetivo
Aprender a organizar código en paquetes, importar clases y usar clases de la biblioteca estándar de Java.

### Enunciado
Crea un sistema de registro de empleados que organice las clases en paquetes y utilice clases de la biblioteca estándar de Java como `ArrayList` y `Scanner`.

### Requisitos

1. **Estructura de paquetes:**
   - Crea un paquete llamado `com.empresa.empleados`
   - Crea un paquete llamado `com.empresa.gestion`

2. **Clase Empleado (en com.empresa.empleados):**
   - Atributos privados: `String nombre, String id, String departamento, double salario`
   - Constructor que reciba todos los parámetros
   - Método `aumentarSalario(double porcentaje)` - Aumenta el salario
   - Método `cambiarDepartamento(String nuevoDepartamento)`
   - Método `mostrarInformacion()`
   - Getters y setters

3. **Clase GestorEmpleados (en com.empresa.gestion):**
   - Atributo privado: `ArrayList<Empleado> empleados`
   - Constructor que inicialice la lista
   - Método `agregarEmpleado(Empleado e)`
   - Método `buscarEmpleadoPorId(String id)` - Retorna el empleado o null
   - Método `mostrarTodosEmpleados()`
   - Método `calcularSalarioPromedio()`
   - Método `empleadosPorDepartamento(String departamento)` - Retorna un ArrayList con los empleados de ese departamento

4. **Clase Main (paquete por defecto o com.empresa):**
   - Importa las clases necesarias usando `import`
   - Importa `java.util.ArrayList` y `java.util.Scanner`
   - Crea un `GestorEmpleados`
   - Agrega al menos 5 empleados de diferentes departamentos
   - Muestra todos los empleados
   - Busca un empleado específico por ID
   - Muestra el salario promedio
   - Filtra y muestra empleados de un departamento específico

### Ejemplo de Salida Esperada
```
====== SISTEMA DE GESTIÓN DE EMPLEADOS ======

Agregando empleados al sistema...
✓ Empleado EMP-001 agregado
✓ Empleado EMP-002 agregado
✓ Empleado EMP-003 agregado

====== TODOS LOS EMPLEADOS ======
ID: EMP-001 | Ana Martínez | Ventas | 35000.0 €
ID: EMP-002 | Carlos Gómez | IT | 45000.0 €
ID: EMP-003 | Laura Sánchez | Marketing | 38000.0 €

====== BÚSQUEDA ======
Buscando empleado con ID: EMP-002
Empleado encontrado:
ID: EMP-002 | Carlos Gómez | IT | 45000.0 €

====== ESTADÍSTICAS ======
Salario promedio: 39333.33 €

====== EMPLEADOS DE IT ======
ID: EMP-002 | Carlos Gómez | IT | 45000.0 €
```

### Pistas y Consejos
- Al principio de cada archivo Java (excepto Main si no está en un paquete), incluye: `package nombre.del.paquete;`
- Para importar clases específicas: `import java.util.ArrayList;`
- Para importar todas las clases de un paquete: `import java.util.*;`
- Un `ArrayList` es como un array dinámico. Usa `.add()`, `.get()`, `.size()`
- Para recorrer un ArrayList: `for(Empleado e : empleados) { ... }`

---

## Ejercicio 7: Visibilidad (Modificadores de Acceso)

### Objetivo
Comprender los modificadores de acceso (`public, private, protected, default`) y cómo controlan la visibilidad de clases, atributos y métodos.

### Enunciado
Crea un sistema bancario con diferentes niveles de acceso para demostrar el uso de modificadores de acceso. El sistema tendrá clases en diferentes paquetes que interactuarán entre sí con restricciones de visibilidad.

### Requisitos

1. **Estructura de paquetes:**
   - `com.banco.cuentas`
   - `com.banco.operaciones`
   - `com.banco.seguridad`

2. **Clase CuentaBancaria (en com.banco.cuentas):**
   - `private String numeroCuenta`
   - `private double saldo` - NUNCA debe ser accesible directamente fuera de la clase
   - `protected String titular` - Accesible por subclases
   - `String tipoCuenta` - (sin modificador = package-private) Accesible solo en el mismo paquete
   - `private static final double SALDO_MINIMO = 100.0`
   - Constructor público que reciba todos los parámetros
   - `public double getSaldo()` - Getter público
   - `public void depositar(double cantidad)`
   - `private boolean verificarSaldoMinimo()` - Método privado usado internamente
   - `protected void retirarInterno(double cantidad)` - Permite que subclases lo usen
   - `public void retirar(double cantidad)` - Usa retirarInterno después de validaciones
   - `void mostrarTipoCuenta()` - Package-private

3. **Clase CuentaAhorro (en com.banco.cuentas, extiende CuentaBancaria):**
   - `private double tasaInteres`
   - Constructor apropiado
   - `public void aplicarInteres()` - Usa `depositar()` (público) o `retirarInterno()` (protected)
   - Demuestra que puede acceder a `titular` (protected) pero NO a `saldo` (private)

4. **Clase GestorCuentas (en com.banco.cuentas - mismo paquete):**
   - Demuestra acceso a `tipoCuenta` (package-private)
   - Puede llamar a `mostrarTipoCuenta()`

5. **Clase Operaciones (en com.banco.operaciones - paquete diferente):**
   - Método `public static void transferir(CuentaBancaria origen, CuentaBancaria destino, double cantidad)`
   - Demuestra que solo puede usar métodos públicos de CuentaBancaria
   - NO puede acceder a `tipoCuenta`, `titular` ni métodos package-private

6. **Clase Main:** Crea instancias y demuestra qué puede y qué no puede acceder desde diferentes contextos.

### Ejemplo de Salida Esperada
```
=== PRUEBA DE VISIBILIDAD ===

Creando cuenta bancaria...
Cuenta: CT-001
Titular: María García
Saldo inicial: 1000.0 €

--- Acceso desde la misma clase ---
✓ Puede acceder a todos los miembros (público, protected, package, private)

--- Acceso desde subclase (CuentaAhorro) ---
✓ Puede acceder a: public, protected
✓ Puede usar titular (protected): María García
✗ NO puede acceder a saldo (private) - debe usar getSaldo()

--- Acceso desde misma clase en mismo paquete (GestorCuentas) ---
✓ Puede acceder a: public, protected, package-private
✓ Puede ver tipoCuenta: AHORRO
✗ NO puede acceder a saldo (private)

--- Acceso desde otro paquete (Operaciones) ---
✓ Solo puede acceder a miembros public
✗ NO puede acceder a: protected, package-private, private

>>> Realizando transferencia entre cuentas...
✓ Transferencia exitosa: 200.0 € de CT-001 a CT-002
```

### Pistas y Consejos
- **Tabla de visibilidad:**
  - `public`: Accesible desde cualquier lugar
  - `protected`: Accesible en el mismo paquete y subclases (incluso en otros paquetes)
  - Sin modificador (default): Accesible solo en el mismo paquete
  - `private`: Accesible solo dentro de la misma clase
- Intenta acceder a miembros con diferentes visibilidades y observa los errores de compilación
- Los atributos sensibles (como saldo) siempre deben ser `private`

---

## Ejercicio 8: Buenas Prácticas en POO

### Objetivo
Aplicar principios de buenas prácticas: encapsulación, nombres significativos, responsabilidad única, cohesión y acoplamiento.

### Enunciado
Crea un sistema de gestión de tareas (TODO list) aplicando conscientemente las buenas prácticas de POO. El código debe estar bien documentado, ser mantenible y seguir el principio de responsabilidad única.

### Requisitos

1. **Clase Tarea (com.tareas.modelo):**
   - Atributos privados bien encapsulados con nombres descriptivos:
     - `String idTarea`
     - `String descripcion`
     - `String prioridad` ("ALTA", "MEDIA", "BAJA")
     - `boolean completada`
     - `String fechaCreacion`
   - Validación en setters (ej: prioridad solo acepta valores válidos)
   - Métodos con nombres claros: `marcarComoCompletada()`, `desmarcarCompletada()`, `cambiarPrioridad(String nuevaPrioridad)`
   - **Documentación Javadoc:** Documenta la clase y métodos principales

2. **Clase GestorTareas (com.tareas.gestion):**
   - **Responsabilidad única:** Gestionar colección de tareas
   - `ArrayList<Tarea> listaTareas`
   - Métodos bien definidos:
     - `agregarTarea(Tarea tarea)`
     - `eliminarTarea(String idTarea)`
     - `buscarTareaPorId(String idTarea)`
     - `obtenerTareasPorPrioridad(String prioridad)`
     - `obtenerTareasCompletadas()`
     - `obtenerTareasPendientes()`
     - `contarTareas()`
   - Documentación Javadoc completa

3. **Clase ValidadorTareas (com.tareas.utilidades):**
   - **Responsabilidad única:** Validar datos de tareas
   - Métodos estáticos:
     - `static boolean esPrioridadValida(String prioridad)`
     - `static boolean esDescripcionValida(String descripcion)` - No vacía, longitud adecuada
     - `static String formatearDescripcion(String descripcion)` - Limpia espacios, capitaliza

4. **Clase ImpresionTareas (com.tareas.presentacion):**
   - **Responsabilidad única:** Presentar información
   - Métodos estáticos:
     - `static void imprimirTarea(Tarea tarea)`
     - `static void imprimirListaTareas(ArrayList<Tarea> tareas)`
     - `static void imprimirEstadisticas(GestorTareas gestor)`

5. **Aplicar estos principios:**
   - **Encapsulación:** Todos los atributos private, acceso mediante getters/setters
   - **Nombres significativos:** Variables y métodos con nombres descriptivos
   - **Responsabilidad única:** Cada clase hace una cosa y la hace bien
   - **Alta cohesión:** Todo en una clase está relacionado con su propósito
   - **Bajo acoplamiento:** Las clases dependen mínimamente entre sí
   - **Documentación:** Javadoc en todas las clases y métodos públicos

### Ejemplo de Documentación Javadoc
```java
/**
 * Representa una tarea en el sistema de gestión.
 * Una tarea tiene una descripción, prioridad y estado de completitud.
 * 
 * @author Tu Nombre
 * @version 1.0
 */
public class Tarea {
    
    /**
     * Marca la tarea como completada.
     * Cambia el estado interno de completada a true.
     */
    public void marcarComoCompletada() {
        this.completada = true;
    }
}
```

### Ejemplo de Salida Esperada
```
=== SISTEMA DE GESTIÓN DE TAREAS ===

✓ Tarea agregada: TAREA-001
✓ Tarea agregada: TAREA-002
✓ Tarea agregada: TAREA-003

====== TODAS LAS TAREAS ======
[ALTA] TAREA-001: Completar documentación del proyecto ❌
[MEDIA] TAREA-002: Revisar código con el equipo ✓
[BAJA] TAREA-003: Actualizar dependencias ❌

====== TAREAS PENDIENTES ======
[ALTA] TAREA-001: Completar documentación del proyecto
[BAJA] TAREA-003: Actualizar dependencias

====== TAREAS DE PRIORIDAD ALTA ======
[ALTA] TAREA-001: Completar documentación del proyecto

====== ESTADÍSTICAS ======
Total de tareas: 3
Completadas: 1
Pendientes: 2
Porcentaje de completitud: 33.33%
```

### Pistas y Consejos
- Cada clase debe tener UNA SOLA razón para cambiar
- Los nombres de clases deben ser sustantivos (Tarea, Gestor)
- Los nombres de métodos deben ser verbos (agregar, eliminar, buscar)
- Documenta el "por qué", no el "qué" (el código ya muestra el qué)
- Usa constantes para valores que no cambian: `private static final String PRIORIDAD_ALTA = "ALTA";`

---

## Ejercicio 9: Uso de Clases (Composición)

### Objetivo
Comprender la composición: cómo las clases pueden contener objetos de otras clases y trabajar juntas.

### Enunciado
Crea un sistema para gestionar pedidos en un restaurante. Un pedido contiene múltiples platos, y cada plato tiene su propia información.

### Requisitos

1. **Clase Plato:**
   - Atributos privados:
     - `String nombre`
     - `double precio`
     - `String categoria` ("Entrante", "Principal", "Postre", "Bebida")
     - `int tiempoPreparacion` - En minutos
   - Constructor completo
   - `void mostrarPlato()`
   - Getters y setters

2. **Clase Pedido:**
   - Atributos privados:
     - `String numeroPedido`
     - `ArrayList<Plato> platos`
     - `String nombreCliente`
     - `String estado` ("Pendiente", "En preparación", "Completado")
     - `String horaCreacion`
   - Constructor que reciba numeroPedido y nombreCliente
   - Métodos:
     - `void agregarPlato(Plato plato)`
     - `void eliminarPlato(String nombrePlato)`
     - `double calcularTotal()` - Suma los precios de todos los platos
     - `int calcularTiempoEstimado()` - Suma los tiempos de preparación
     - `void cambiarEstado(String nuevoEstado)`
     - `ArrayList<Plato> obtenerPlatosPorCategoria(String categoria)`
     - `void mostrarResumenPedido()`
     - `void mostrarPedidoDetallado()`

3. **Clase Main:**
   - Crea varios platos
   - Crea un pedido
   - Agrega platos al pedido
   - Muestra el resumen y el detalle
   - Calcula el total y tiempo estimado
   - Cambia el estado del pedido
   - Filtra platos por categoría

### Ejemplo de Salida Esperada
```
=== SISTEMA DE GESTIÓN DE PEDIDOS ===

====== NUEVO PEDIDO ======
Pedido: PED-001
Cliente: María López
Estado: Pendiente
Hora: 14:30

>>> Agregando platos al pedido...
✓ Ensalada César agregada
✓ Pasta Carbonara agregada
✓ Tiramisú agregado
✓ Agua mineral agregada

====== RESUMEN DEL PEDIDO PED-001 ======
Cliente: María López
Estado: Pendiente
Cantidad de platos: 4
Total: 28.50 €
Tiempo estimado: 35 minutos

====== DETALLE DEL PEDIDO ======
1. Ensalada César (Entrante) - 8.50 € [10 min]
2. Pasta Carbonara (Principal) - 12.00 € [20 min]
3. Tiramisú (Postre) - 6.00 € [5 min]
4. Agua mineral (Bebida) - 2.00 € [0 min]

>>> Platos principales en este pedido:
- Pasta Carbonara - 12.00 €

>>> Cambiando estado a "En preparación"...
✓ Estado actualizado

====== RESUMEN FINAL ======
Pedido: PED-001
Cliente: María López
Estado: En preparación
Total: 28.50 €
Tiempo restante estimado: 35 minutos
```

### Pistas y Consejos
- Este ejercicio demuestra **composición**: Pedido "tiene" Platos
- La relación es "has-a" (tiene): Un Pedido tiene Platos
- Para recorrer platos: `for(Plato p : this.platos) { total += p.getPrecio(); }`
- Usa `ArrayList.remove()` para eliminar platos
- Puedes usar `LocalTime.now()` de `java.time` para la hora (requiere importar)

---

## Ejercicio 10: Ejemplos Completos - Sistema Integrado

### Objetivo
Integrar todos los conceptos aprendidos en un sistema completo y funcional.

### Enunciado
Crea un sistema completo de gestión de una tienda de videojuegos que integre: clases bien estructuradas, paquetes, colecciones, métodos estáticos, validaciones y buenas prácticas.

### Requisitos

1. **Paquete com.tienda.productos:**
   
   **Clase Videojuego:**
   - `String codigo, String titulo, String plataforma, double precio, int stock`
   - `String genero` ("Acción", "Aventura", "RPG", "Deportes", "Estrategia")
   - `boolean disponible`
   - Constructor completo
   - `vender(int cantidad)` - Reduce stock
   - `reabastecer(int cantidad)` - Aumenta stock
   - `aplicarDescuento(double porcentaje)`
   - Getters, setters con validación
   - `mostrarInformacion()`

2. **Paquete com.tienda.clientes:**
   
   **Clase Cliente:**
   - `String idCliente, String nombre, String email, double saldoCuenta`
   - `ArrayList<Videojuego> juegosComprados`
   - `static int contadorClientes`
   - Constructor
   - `agregarSaldo(double cantidad)`
   - `realizarCompra(Videojuego juego)`
   - `obtenerHistorialCompras()`
   - `mostrarInformacion()`

3. **Paquete com.tienda.gestion:**
   
   **Clase GestorTienda:**
   - `ArrayList<Videojuego> inventario`
   - `ArrayList<Cliente> clientes`
   - `static double ventasTotales`
   - Métodos:
     - `agregarVideojuego(Videojuego juego)`
     - `registrarCliente(Cliente cliente)`
     - `buscarVideojuegoPorCodigo(String codigo)`
     - `buscarClientePorId(String id)`
     - `procesarVenta(Cliente cliente, Videojuego juego, int cantidad)`
     - `obtenerJuegosPorGenero(String genero)`
     - `obtenerJuegosPorPlataforma(String plataforma)`
     - `calcularIngresosTotales()`
     - `generarReporteInventario()`
     - `generarReporteVentas()`

4. **Paquete com.tienda.utilidades:**
   
   **Clase Validador:**
   - Métodos estáticos:
     - `static boolean validarEmail(String email)`
     - `static boolean validarPrecio(double precio)`
     - `static boolean validarStock(int stock)`
     - `static boolean validarGenero(String genero)`

5. **Clase Main:**
   - Crea inventario de videojuegos
   - Registra clientes
   - Procesa múltiples ventas
   - Genera reportes
   - Muestra estadísticas

### Ejemplo de Salida Esperada
```
=== SISTEMA DE GESTIÓN - TIENDA DE VIDEOJUEGOS ===

>>> Inicializando inventario...
✓ Juego agregado: The Witcher 3 (PS5) - 49.99 €
✓ Juego agregado: FIFA 24 (Xbox Series X) - 59.99 €
✓ Juego agregado: Zelda TOTK (Nintendo Switch) - 69.99 €

>>> Registrando clientes...
✓ Cliente registrado: CLI-001 - Juan Pérez
✓ Cliente registrado: CLI-002 - Ana García

====== INVENTARIO COMPLETO ======
1. [VJ-001] The Witcher 3 | RPG | PS5 | 49.99 € | Stock: 10
2. [VJ-002] FIFA 24 | Deportes | Xbox Series X | 59.99 € | Stock: 15
3. [VJ-003] Zelda TOTK | Aventura | Nintendo Switch | 69.99 € | Stock: 8

====== PROCESANDO VENTAS ======
>>> Juan Pérez compra 1x The Witcher 3
✓ Venta procesada exitosamente
Nuevo stock: 9 unidades
Saldo restante del cliente: 50.01 €

>>> Ana García compra 2x FIFA 24
✓ Venta procesada exitosamente
Nuevo stock: 13 unidades
Saldo restante del cliente: 80.02 €

====== REPORTE DE VENTAS ======
Total de ventas procesadas: 3 juegos
Ingresos totales: 169.97 €
Clientes que compraron: 2

====== JUEGOS POR GÉNERO ======
RPG:
- The Witcher 3 (PS5) - 49.99 €

Deportes:
- FIFA 24 (Xbox Series X) - 59.99 €

====== HISTORIAL DE COMPRAS - Juan Pérez ======
1. The Witcher 3 - 49.99 €

Total gastado: 49.99 €
Saldo actual: 50.01 €
```

### Pistas y Consejos
- Este ejercicio combina TODOS los conceptos anteriores
- Asegúrate de validar datos antes de procesar ventas
- Verifica que el cliente tenga saldo suficiente
- Verifica que haya stock disponible
- Actualiza todos los contadores y totales correctamente
- Usa métodos de búsqueda para encontrar objetos en las listas
- Mantén separadas las responsabilidades en diferentes clases

---

## Ejercicio 11: Herencia

### Objetivo
Comprender cómo la herencia permite reutilizar código y crear jerarquías de clases.

### Enunciado
Crea un sistema de gestión de vehículos donde diferentes tipos de vehículos compartan características comunes pero también tengan comportamientos específicos.

### Requisitos

1. **Clase Vehiculo (superclase):**
   - Atributos protegidos:
     - `String marca`
     - `String modelo`
     - `int anio`
     - `double precio`
   - Constructor que reciba todos los parámetros
   - Métodos:
     - `void mostrarInformacion()` - Muestra información básica
     - `void arrancar()` - Imprime "El vehículo está arrancando"
     - `void detener()` - Imprime "El vehículo se ha detenido"
     - `double calcularDepreciacion(int aniosUso)` - Retorna precio * 0.9^aniosUso
   - Getters y setters

2. **Clase Coche (hereda de Vehiculo):**
   - Atributos privados adicionales:
     - `int numeroPuertas`
     - `String tipoCombustible` ("Gasolina", "Diésel", "Eléctrico", "Híbrido")
   - Constructor que use `super()`
   - Métodos adicionales:
     - `void abrirMaletero()` - Imprime mensaje específico
     - `String obtenerTipoCombustible()`
   - Sobrescribe `mostrarInformacion()` para incluir información adicional
   - Sobrescribe `arrancar()` con mensaje específico para coches

3. **Clase Motocicleta (hereda de Vehiculo):**
   - Atributos privados adicionales:
     - `int cilindrada`
     - `String tipoManillar` ("Deportivo", "Crucero", "Touring")
   - Constructor que use `super()`
   - Métodos adicionales:
     - `void hacerCaballito()` - Mensaje específico
     - `int obtenerCilindrada()`
   - Sobrescribe `mostrarInformacion()`
   - Sobrescribe `arrancar()` con mensaje específico

4. **Clase Camion (hereda de Vehiculo):**
   - Atributos privados adicionales:
     - `double capacidadCarga` - En toneladas
     - `int numeroEjes`
   - Constructor que use `super()`
   - Métodos adicionales:
     - `void cargar(double peso)` - Verifica que no exceda capacidad
     - `void descargar()`
   - Sobrescribe `mostrarInformacion()`
   - Sobrescribe `arrancar()` con mensaje específico

5. **Clase Main:**
   - Crea instancias de cada tipo de vehículo
   - Demuestra el uso de herencia llamando métodos heredados
   - Demuestra polimorfismo: `Vehiculo v = new Coche(...)`
   - Muestra cómo los métodos sobrescritos se comportan diferente

### Ejemplo de Salida Esperada
```
=== SISTEMA DE GESTIÓN DE VEHÍCULOS ===

====== CREANDO VEHÍCULOS ======

>>> Coche creado:
Marca: Toyota
Modelo: Corolla
Año: 2022
Precio: 25000.0 €
Puertas: 4
Combustible: Híbrido

>>> Motocicleta creada:
Marca: Yamaha
Modelo: R1
Año: 2023
Precio: 18000.0 €
Cilindrada: 1000 cc
Manillar: Deportivo

>>> Camión creado:
Marca: Volvo
Modelo: FH16
Año: 2021
Precio: 95000.0 €
Capacidad de carga: 25.0 toneladas
Número de ejes: 4

====== PROBANDO HERENCIA ======

>>> Arrancando vehículos...
🚗 El coche Toyota Corolla está arrancando con el motor híbrido
🏍️ La motocicleta Yamaha R1 ruge al arrancar
🚚 El camión Volvo FH16 arranca con un rugido diésel

>>> Probando métodos específicos...
🚗 Abriendo el maletero del Toyota Corolla...
🏍️ ¡La Yamaha R1 está haciendo un caballito!
🚚 Cargando 20.0 toneladas en el Volvo FH16... ✓ Carga exitosa

====== DEMOSTRANDO POLIMORFISMO ======

>>> Array de vehículos (tipo Vehiculo):
Vehículo 1: Toyota Corolla (Coche)
Vehículo 2: Yamaha R1 (Motocicleta)
Vehículo 3: Volvo FH16 (Camión)

>>> Arrancando todos los vehículos (polimorfismo):
🚗 El coche Toyota Corolla está arrancando con el motor híbrido
🏍️ La motocicleta Yamaha R1 ruge al arrancar
🚚 El camión Volvo FH16 arranca con un rugido diésel

====== CÁLCULO DE DEPRECIACIÓN ======
Toyota Corolla después de 3 años: 18225.0 €
Yamaha R1 después de 3 años: 13122.0 €
Volvo FH16 después de 3 años: 69255.0 €
```

### Pistas y Consejos
- Usa `extends` para indicar que una clase hereda de otra
- Usa `super()` en el constructor de la subclase para llamar al constructor de la superclase
- Usa `@Override` antes de métodos que sobrescriben métodos de la superclase
- Los atributos `protected` son accesibles en subclases
- Puedes usar `super.metodo()` para llamar a la versión del método de la superclase
- El polimorfismo te permite tratar diferentes subclases como su superclase común

---

## Ejercicio 12: Polimorfismo

### Objetivo
Comprender y aplicar el polimorfismo para que objetos de diferentes clases puedan ser tratados de manera uniforme.

### Enunciado
Crea un sistema de procesamiento de pagos donde diferentes métodos de pago (tarjeta, PayPal, transferencia) compartan una interfaz común pero tengan comportamientos específicos.

### Requisitos

1. **Clase abstracta MetodoPago:**
   - Atributos protegidos:
     - `String titular`
     - `double saldo`
   - Constructor
   - Método abstracto: `boolean procesarPago(double cantidad)`
   - Método abstracto: `String obtenerDetalles()`
   - Método concreto: `boolean verificarSaldo(double cantidad)` - Retorna si hay saldo suficiente
   - Método concreto: `void mostrarInformacion()`

2. **Clase TarjetaCredito (hereda de MetodoPago):**
   - Atributos privados adicionales:
     - `String numeroTarjeta` - Solo últimos 4 dígitos (ej: "**** 1234")
     - `String fechaExpiracion`
     - `double limiteCredito`
   - Constructor
   - Implementa `procesarPago()`:
     - Verifica límite de crédito
     - Reduce el límite disponible
     - Simula procesamiento
   - Implementa `obtenerDetalles()`
   - Método adicional: `void pagarCuota(double cantidad)` - Restaura crédito

3. **Clase PayPal (hereda de MetodoPago):**
   - Atributos privados adicionales:
     - `String email`
     - `boolean verificado`
   - Constructor
   - Implementa `procesarPago()`:
     - Verifica que la cuenta esté verificada
     - Verifica saldo
     - Reduce saldo
   - Implementa `obtenerDetalles()`
   - Método adicional: `void agregarFondos(double cantidad)`

4. **Clase TransferenciaBancaria (hereda de MetodoPago):**
   - Atributos privados adicionales:
     - `String numeroCuenta`
     - `String banco`
     - `String codigoSwift`
   - Constructor
   - Implementa `procesarPago()`:
     - Verifica saldo
     - Simula tiempo de procesamiento (mensaje)
     - Reduce saldo
   - Implementa `obtenerDetalles()`

5. **Clase ProcesadorPagos:**
   - Atributos:
     - `ArrayList<MetodoPago> metodosPago`
     - `static double totalProcesado`
   - Métodos:
     - `void registrarMetodoPago(MetodoPago metodo)`
     - `boolean realizarPago(MetodoPago metodo, double cantidad)` - Usa polimorfismo
     - `void procesarMultiplesPagos(ArrayList<MetodoPago> metodos, double cantidad)` - Procesa con todos los métodos
     - `void mostrarMetodosDisponibles()`
     - `static double getTotalProcesado()`

6. **Clase Main:**
   - Crea diferentes métodos de pago
   - Crea un procesador
   - Demuestra polimorfismo procesando pagos con diferentes métodos
   - Usa arrays de tipo `MetodoPago` con diferentes subclases
   - Procesa pagos de diferentes maneras

### Ejemplo de Salida Esperada
```
=== SISTEMA DE PROCESAMIENTO DE PAGOS ===

====== REGISTRANDO MÉTODOS DE PAGO ======
✓ Tarjeta de crédito registrada: **** 1234
✓ PayPal registrado: usuario@email.com
✓ Transferencia bancaria registrada: ES12-3456-7890

====== MÉTODOS DE PAGO DISPONIBLES ======
1. Tarjeta de Crédito
   Titular: Juan Pérez
   Número: **** 1234
   Expira: 12/2025
   Crédito disponible: 3000.0 €

2. PayPal
   Titular: María García
   Email: maria@email.com
   Verificada: Sí
   Saldo: 1500.0 €

3. Transferencia Bancaria
   Titular: Carlos Ruiz
   Cuenta: ES12-3456-7890
   Banco: Banco Santander
   Saldo: 5000.0 €

====== PROCESANDO PAGOS (POLIMORFISMO) ======

>>> Procesando pago de 250.0 € con tarjeta...
🔄 Procesando pago con tarjeta de crédito...
✓ Pago aprobado: 250.0 €
💳 Crédito restante: 2750.0 €

>>> Procesando pago de 180.0 € con PayPal...
🔄 Conectando con PayPal...
✓ Pago procesado: 180.0 €
💰 Saldo restante: 1320.0 €

>>> Procesando pago de 500.0 € con transferencia...
🔄 Iniciando transferencia bancaria...
⏳ Procesamiento puede tardar 1-2 días hábiles
✓ Transferencia autorizada: 500.0 €
💰 Saldo restante: 4500.0 €

====== PROCESAMIENTO EN LOTE ======
>>> Procesando compra de 100.0 € con todos los métodos...

Con Tarjeta **** 1234: ✓ Exitoso
Con PayPal maria@email.com: ✓ Exitoso
Con Transferencia ES12-3456-7890: ✓ Exitoso

====== ESTADÍSTICAS ======
Total procesado en esta sesión: 1230.0 €
Métodos registrados: 3
```

### Pistas y Consejos
- Una clase abstracta puede tener tanto métodos abstractos (sin implementación) como métodos concretos
- Usa `abstract` antes del nombre de la clase y de los métodos abstractos
- Las clases que heredan de una clase abstracta DEBEN implementar todos los métodos abstractos
- El polimorfismo permite esto: `MetodoPago metodo = new TarjetaCredito(...)` 
- Luego puedes llamar a `metodo.procesarPago()` y se ejecutará la versión específica de TarjetaCredito
- Esto es muy útil para colecciones: `ArrayList<MetodoPago>` puede contener tarjetas, PayPal, transferencias, etc.
- Cada uno se comportará según su propia implementación cuando llames a sus métodos

---

## Ejercicio 13: Clases Abstractas

### Objetivo
Dominar el uso de clases abstractas como plantillas para crear familias de clases relacionadas.

### Enunciado
Crea un sistema de gestión de figuras geométricas donde una clase abstracta define el contrato que todas las figuras deben cumplir.

### Requisitos

1. **Clase abstracta FiguraGeometrica:**
   - Atributos protegidos:
     - `String nombre`
     - `String color`
   - Constructor que reciba nombre y color
   - Métodos abstractos (cada subclase debe implementarlos):
     - `abstract double calcularArea()`
     - `abstract double calcularPerimetro()`
     - `abstract String obtenerTipo()`
   - Métodos concretos:
     - `void dibujar()` - Muestra un mensaje simulando dibujo
     - `void mostrarInformacion()` - Muestra nombre, color, área y perímetro
     - `boolean esIgual(FiguraGeometrica otra)` - Compara áreas
   - Getters y setters

2. **Clase Circulo (hereda de FiguraGeometrica):**
   - Atributo privado:
     - `double radio`
   - Constructor
   - Implementa métodos abstractos:
     - `calcularArea()` → π * radio²
     - `calcularPerimetro()` → 2 * π * radio
     - `obtenerTipo()` → "Círculo"
   - Método adicional:
     - `double calcularDiametro()`

3. **Clase Rectangulo (hereda de FiguraGeometrica):**
   - Atributos privados:
     - `double base`
     - `double altura`
   - Constructor
   - Implementa métodos abstractos:
     - `calcularArea()` → base * altura
     - `calcularPerimetro()` → 2 * (base + altura)
     - `obtenerTipo()` → "Rectángulo"
   - Método adicional:
     - `boolean esCuadrado()` → base == altura

4. **Clase Triangulo (hereda de FiguraGeometrica):**
   - Atributos privados:
     - `double lado1, lado2, lado3`
   - Constructor que valide que los lados puedan formar un triángulo
   - Implementa métodos abstractos:
     - `calcularArea()` → Usa fórmula de Herón
     - `calcularPerimetro()` → lado1 + lado2 + lado3
     - `obtenerTipo()` → "Triángulo"
   - Métodos adicionales:
     - `String clasificarPorLados()` → "Equilátero", "Isósceles", "Escaleno"
     - `boolean esValido()` → Verifica desigualdad triangular

5. **Clase GestorFiguras:**
   - Atributo:
     - `ArrayList<FiguraGeometrica> figuras`
   - Métodos:
     - `void agregarFigura(FiguraGeometrica figura)`
     - `double calcularAreaTotal()`
     - `double calcularPerimetroTotal()`
     - `ArrayList<FiguraGeometrica> obtenerPorTipo(String tipo)`
     - `FiguraGeometrica obtenerMayorArea()`
     - `void ordenarPorArea()` - Ordena de menor a mayor
     - `void mostrarTodasLasFiguras()`
     - `void compararFiguras(FiguraGeometrica f1, FiguraGeometrica f2)`

6. **Clase Main:**
   - Crea múltiples figuras de diferentes tipos
   - Agrégalas a un gestor
   - Demuestra el uso de polimorfismo
   - Calcula estadísticas
   - Ordena y compara figuras

### Ejemplo de Salida Esperada
```
=== SISTEMA DE GESTIÓN DE FIGURAS GEOMÉTRICAS ===

====== CREANDO FIGURAS ======
✓ Círculo creado: Radio 5.0, Color: Rojo
✓ Rectángulo creado: 10.0 x 5.0, Color: Azul
✓ Triángulo creado: Lados 3-4-5, Color: Verde
✓ Círculo creado: Radio 3.0, Color: Amarillo

====== TODAS LAS FIGURAS ======

[Círculo] - Rojo
  Radio: 5.0
  Área: 78.54 unidades²
  Perímetro: 31.42 unidades

[Rectángulo] - Azul
  Dimensiones: 10.0 x 5.0
  Área: 50.0 unidades²
  Perímetro: 30.0 unidades
  ¿Es cuadrado?: No

[Triángulo] - Verde
  Lados: 3.0, 4.0, 5.0
  Tipo: Escaleno
  Área: 6.0 unidades²
  Perímetro: 12.0 unidades

[Círculo] - Amarillo
  Radio: 3.0
  Área: 28.27 unidades²
  Perímetro: 18.85 unidades

====== ESTADÍSTICAS GENERALES ======
Total de figuras: 4
Área total: 162.81 unidades²
Perímetro total: 92.27 unidades

====== FIGURAS POR TIPO ======
Círculos encontrados: 2
Rectángulos encontrados: 1
Triángulos encontrados: 1

====== FIGURA CON MAYOR ÁREA ======
🏆 Círculo (Rojo) con 78.54 unidades²

====== COMPARANDO FIGURAS ======
Círculo (Rojo) vs Rectángulo (Azul):
  Círculo tiene mayor área (78.54 > 50.0)

====== FIGURAS ORDENADAS POR ÁREA ======
1. Triángulo (Verde): 6.0 unidades²
2. Círculo (Amarillo): 28.27 unidades²
3. Rectángulo (Azul): 50.0 unidades²
4. Círculo (Rojo): 78.54 unidades²
```

### Pistas y Consejos
- Una clase abstracta NO puede ser instanciada: `new FiguraGeometrica()` daría error
- Las clases abstractas sirven como "plantillas" o "contratos"
- Usa `Math.PI` para π
- Fórmula de Herón para área del triángulo:
  ```
  s = (lado1 + lado2 + lado3) / 2
  area = √(s * (s-lado1) * (s-lado2) * (s-lado3))
  ```
- Desigualdad triangular: La suma de dos lados debe ser mayor que el tercer lado
- Para ordenar, investiga `Collections.sort()` con un `Comparator`
- Ejemplo de uso de clase abstracta: `FiguraGeometrica fig = new Circulo(...)` (polimorfismo)

---

## Ejercicio 14: Interfaces

### Objetivo
Comprender las interfaces como contratos que definen comportamientos que las clases deben implementar.

### Enunciado
Crea un sistema de dispositivos electrónicos donde diferentes dispositivos implementen múltiples interfaces según sus capacidades.

### Requisitos

1. **Interface Encendible:**
   ```java
   public interface Encendible {
       void encender();
       void apagar();
       boolean estaEncendido();
   }
   ```

2. **Interface Conectable:**
   ```java
   public interface Conectable {
       boolean conectarWiFi(String nombreRed, String password);
       void desconectarWiFi();
       boolean estaConectado();
       String obtenerIP();
   }
   ```

3. **Interface Recargable:**
   ```java
   public interface Recargable {
       void cargar(int minutos);
       int obtenerNivelBateria();
       int obtenerTiempoRestante();
       boolean necesitaCarga();
   }
   ```

4. **Clase Smartphone (implementa las 3 interfaces):**
   - Atributos privados:
     - `String marca, String modelo`
     - `boolean encendido`
     - `String redWiFi, String ipAddress`
     - `boolean conectado`
     - `int nivelBateria` (0-100)
   - Constructor
   - Implementa todos los métodos de las 3 interfaces
   - Métodos adicionales:
     - `void hacerLlamada(String numero)`
     - `void instalarAplicacion(String nombre)`
     - `void mostrarEstado()`

5. **Clase Laptop (implementa Encendible y Conectable):**
   - Atributos privados:
     - `String marca, String modelo`
     - `boolean encendido`
     - `String redWiFi, String ipAddress`
     - `boolean conectado`
     - `int memoriaRAM`
   - Constructor
   - Implementa métodos de Encendible y Conectable
   - NO implementa Recargable (funciona conectada a corriente)
   - Métodos adicionales:
     - `void ejecutarPrograma(String nombre)`
     - `void mostrarEstado()`

6. **Clase Tablet (implementa las 3 interfaces):**
   - Similar a Smartphone pero con:
     - `double tamanoPantalla`
     - `boolean soportaLapiz`
   - Métodos adicionales específicos:
     - `void usarLapiz()`
     - `void mostrarEstado()`

7. **Clase SmartWatch (implementa Encendible y Recargable):**
   - Atributos privados:
     - `String marca, String modelo`
     - `boolean encendido`
     - `int nivelBateria`
     - `int pasos` - Contador de pasos
   - NO implementa Conectable (se conecta por Bluetooth, no WiFi)
   - Métodos adicionales:
     - `void contarPasos(int pasos)`
     - `void medirRitmo()`
     - `void mostrarEstado()`

8. **Clase GestorDispositivos:**
   - Métodos:
     - `void encenderTodos(ArrayList<Encendible> dispositivos)`
     - `void conectarTodos(ArrayList<Conectable> dispositivos, String red, String pass)`
     - `void cargarTodos(ArrayList<Recargable> dispositivos, int minutos)`
     - `void mostrarDispositivosConBateriaBaja(ArrayList<Recargable> dispositivos)`
     - `void mostrarDispositivosConectados(ArrayList<Conectable> dispositivos)`

9. **Clase Main:**
   - Crea instancias de cada tipo de dispositivo
   - Demuestra el uso de interfaces
   - Crea listas de diferentes tipos de interfaces
   - Usa el gestor para operar sobre grupos de dispositivos

### Ejemplo de Salida Esperada
```
=== SISTEMA DE GESTIÓN DE DISPOSITIVOS ELECTRÓNICOS ===

====== CREANDO DISPOSITIVOS ======
✓ Smartphone: Samsung Galaxy S23
✓ Laptop: Dell XPS 15
✓ Tablet: iPad Air
✓ SmartWatch: Apple Watch Series 8

====== ESTADO INICIAL DE DISPOSITIVOS ======

[Smartphone] Samsung Galaxy S23
  Estado: Apagado
  Batería: 75%
  WiFi: Desconectado

[Laptop] Dell XPS 15
  Estado: Apagado
  WiFi: Desconectado
  RAM: 16 GB

[Tablet] iPad Air
  Estado: Apagado
  Batería: 60%
  WiFi: Desconectado
  Soporte Lápiz: Sí

[SmartWatch] Apple Watch Series 8
  Estado: Apagado
  Batería: 40%
  Pasos hoy: 0

====== ENCENDIENDO TODOS LOS DISPOSITIVOS ======
📱 Samsung Galaxy S23 encendiéndose...
💻 Dell XPS 15 iniciando sistema...
📱 iPad Air encendiéndose...
⌚ Apple Watch Series 8 encendiéndose...
✓ Todos los dispositivos encendidos

====== CONECTANDO DISPOSITIVOS A WIFI ======
Conectando a red: "MiCasa_WiFi"
📱 Samsung Galaxy S23 conectado → IP: 192.168.1.101
💻 Dell XPS 15 conectado → IP: 192.168.1.102
📱 iPad Air conectado → IP: 192.168.1.103
✓ 3 dispositivos conectados a WiFi

====== DISPOSITIVOS CON BATERÍA BAJA ======
⚠️ SmartWatch (Apple Watch Series 8): 40% - Necesita carga

====== CARGANDO DISPOSITIVOS RECARGABLES ======
🔋 Cargando Samsung Galaxy S23... +30% → 100%
🔋 Cargando iPad Air... +30% → 90%
🔋 Cargando Apple Watch Series 8... +30% → 70%

====== USANDO DISPOSITIVOS ======
📞 Samsung Galaxy S23 llamando a 612345678...
💻 Dell XPS 15 ejecutando: Visual Studio Code
✍️ iPad Air usando Apple Pencil para dibujar...
👟 Apple Watch registró 5000 pasos

====== ESTADO FINAL ======
Dispositivos encendidos: 4
Dispositivos conectados a WiFi: 3
Dispositivos con carga completa: 1
```

### Pistas y Consejos
- Una clase puede implementar múltiples interfaces: `class Smartphone implements Encendible, Conectable, Recargable`
- Las interfaces definen QUÉ debe hacer un objeto, no CÓMO lo hace
- Cada clase implementa los métodos a su manera
- Puedes crear listas de interfaces: `ArrayList<Encendible>` puede contener Smartphones, Laptops, Tablets, SmartWatches
- Esto es útil para agrupar objetos por capacidades, no por tipo
- Las interfaces son perfectas para el principio de "programar contra interfaces, no implementaciones"
- Nota la diferencia con herencia: una clase solo puede heredar de UNA superclase, pero puede implementar MUCHAS interfaces

---

## Ejercicio 15: Manejo Avanzado de Excepciones

### Objetivo
Comprender cómo crear y manejar excepciones personalizadas para gestionar errores de manera profesional.

### Enunciado
Crea un sistema bancario robusto que maneje diferentes tipos de errores mediante excepciones personalizadas.

### Requisitos

1. **Excepciones Personalizadas:**

   **Clase `SaldoInsuficienteException` (extends Exception):**
   ```java
   public class SaldoInsuficienteException extends Exception {
       private double saldoActual;
       private double cantidadRequerida;
       
       // Constructor con mensaje y datos
       // Getters para saldoActual y cantidadRequerida
   }
   ```

   **Clase `CuentaBloqueadaException` (extends Exception):**
   ```java
   public class CuentaBloqueadaException extends Exception {
       private String motivo;
       private String fechaBloqueo;
       
       // Constructor con datos
       // Getters
   }
   ```

   **Clase `LimiteDiarioExcedidoException` (extends Exception):**
   ```java
   public class LimiteDiarioExcedidoException extends Exception {
       private double limitePermitido;
       private double totalDia;
       
       // Constructor con datos
       // Getters
   }
   ```

   **Clase `DatosInvalidosException` (extends Exception):**
   ```java
   public class DatosInvalidosException extends Exception {
       private String campo;
       private String valorInvalido;
       
       // Constructor con datos
       // Getters
   }
   ```

2. **Clase CuentaBancaria:**
   - Atributos privados:
     - `String numeroCuenta, String titular`
     - `double saldo`
     - `boolean bloqueada`
     - `String motivoBloqueo`
     - `double limiteRetiroDiario = 1000.0`
     - `double retiradoHoy`
     - `ArrayList<String> historialTransacciones`
   - Constructor que valide datos (lanza `DatosInvalidosException`)
   - Métodos que lanzan excepciones:
     - `void depositar(double cantidad) throws DatosInvalidosException`
     - `void retirar(double cantidad) throws SaldoInsuficienteException, CuentaBloqueadaException, LimiteDiarioExcedidoException, DatosInvalidosException`
     - `void transferir(CuentaBancaria destino, double cantidad) throws ...` (todas las anteriores)
     - `void bloquearCuenta(String motivo)`
     - `void desbloquearCuenta() throws CuentaBloqueadaException`
   - Métodos auxiliares:
     - `void registrarTransaccion(String tipo, double cantidad)`
     - `void reiniciarLimiteDiario()`
     - `void mostrarHistorial()`

3. **Clase SistemaBancario:**
   - Atributos:
     - `ArrayList<CuentaBancaria> cuentas`
     - `int intentosFallidos`
     - `static final int MAX_INTENTOS = 3`
   - Métodos:
     - `void registrarCuenta(CuentaBancaria cuenta)`
     - `CuentaBancaria buscarCuenta(String numero) throws DatosInvalidosException`
     - `void procesarTransaccion(String origen, String destino, double cantidad)`
       - Maneja todas las excepciones posibles
       - Registra intentos fallidos
       - Bloquea cuenta después de MAX_INTENTOS fallidos
     - `void generarReporteErrores()`

4. **Clase Main:**
   - Crea sistema bancario
   - Crea varias cuentas
   - Intenta varias operaciones que generen diferentes excepciones:
     - Retiro con saldo insuficiente
     - Operación en cuenta bloqueada
     - Superar límite diario
     - Datos inválidos (cantidad negativa)
   - Maneja cada excepción de forma específica
   - Muestra mensajes informativos al usuario
   - Demuestra el uso de try-catch-finally

### Ejemplo de Salida Esperada
```
=== SISTEMA BANCARIO CON MANEJO DE EXCEPCIONES ===

====== CREANDO CUENTAS ======
✓ Cuenta CT-001 creada para Juan Pérez (Saldo: 1000.0 €)
✓ Cuenta CT-002 creada para María García (Saldo: 500.0 €)

====== PROBANDO OPERACIONES ======

>>> OPERACIÓN 1: Depósito válido
Depositando 200.0 € en cuenta CT-001...
✓ Depósito exitoso. Nuevo saldo: 1200.0 €

>>> OPERACIÓN 2: Retiro válido
Retirando 100.0 € de cuenta CT-001...
✓ Retiro exitoso. Nuevo saldo: 1100.0 €

>>> OPERACIÓN 3: Retiro con saldo insuficiente
Retirando 2000.0 € de cuenta CT-002...
❌ ERROR: Saldo Insuficiente
   Saldo actual: 500.0 €
   Cantidad requerida: 2000.0 €
   Faltante: 1500.0 €
⚠️ Transacción rechazada

>>> OPERACIÓN 4: Cantidad negativa (datos inválidos)
Retirando -50.0 € de cuenta CT-001...
❌ ERROR: Datos Inválidos
   Campo: cantidad
   Valor inválido: -50.0
   Razón: La cantidad debe ser positiva
⚠️ Transacción rechazada

>>> OPERACIÓN 5: Exceder límite diario
Retirando 600.0 € de cuenta CT-001... ✓
Retirando 500.0 € de cuenta CT-001... 
❌ ERROR: Límite Diario Excedido
   Límite permitido: 1000.0 €
   Ya retirado hoy: 600.0 €
   Intentando retirar: 500.0 €
   Total sería: 1100.0 €
⚠️ Transacción rechazada

>>> OPERACIÓN 6: Bloquear cuenta
Bloqueando cuenta CT-002 por actividad sospechosa...
🔒 Cuenta bloqueada

>>> OPERACIÓN 7: Operar con cuenta bloqueada
Retirando 50.0 € de cuenta CT-002...
❌ ERROR: Cuenta Bloqueada
   Motivo: Actividad sospechosa
   Fecha de bloqueo: 2026-02-05
   Contacte con su banco para desbloquear
⚠️ Transacción rechazada

====== HISTORIAL DE TRANSACCIONES - CT-001 ======
1. DEPÓSITO: +200.0 € - Saldo: 1200.0 €
2. RETIRO: -100.0 € - Saldo: 1100.0 €
3. INTENTO FALLIDO: Retiro de -50.0 € (Datos inválidos)
4. RETIRO: -600.0 € - Saldo: 500.0 €
5. INTENTO FALLIDO: Retiro de 500.0 € (Límite diario)

====== REPORTE DE ERRORES DEL SISTEMA ======
Total de operaciones: 7
Exitosas: 3
Fallidas: 4

Tipos de errores:
- Saldo Insuficiente: 1
- Datos Inválidos: 1
- Límite Diario Excedido: 1
- Cuenta Bloqueada: 1

====== DEMOSTRANDO TRY-CATCH-FINALLY ======
>>> Intentando transferencia...
try {
    Preparando transferencia de 100.0 €...
    Verificando cuenta origen...
    Verificando cuenta destino...
    ✓ Transferencia completada
} catch (Exception e) {
    (No se ejecuta este bloque)
} finally {
    📝 Registrando en logs del sistema...
    ✓ Operación finalizada
}
```

### Pistas y Consejos
- Las excepciones personalizadas heredan de `Exception`
- Usa `throws` en la firma del método para indicar qué excepciones puede lanzar
- Usa `throw new MiExcepcion("mensaje")` para lanzar la excepción
- Captura excepciones específicas antes que las genéricas:
  ```java
  try {
      // código
  } catch (SaldoInsuficienteException e) {
      // manejo específico
  } catch (DatosInvalidosException e) {
      // otro manejo
  } catch (Exception e) {
      // manejo general
  } finally {
      // siempre se ejecuta
  }
  ```
- El bloque `finally` SIEMPRE se ejecuta, haya o no excepción
- Guarda información útil en las excepciones (saldos, cantidades, etc.)
- Las excepciones hacen el código más robusto y fácil de depurar

---

## Conclusión

¡Felicidades! Has completado los 15 ejercicios de Programación Orientada a Objetos en Java.

### Lo que has aprendido:

1. ✅ **Estructura de clases** - Cómo definir clases con atributos y métodos
2. ✅ **Propiedades y atributos** - Tipos de datos y encapsulación
3. ✅ **Métodos estáticos e instancia** - Diferencias y usos
4. ✅ **Constructores** - Inicialización y sobrecarga
5. ✅ **Creación de objetos** - Instanciación y manipulación
6. ✅ **Paquetes e importación** - Organización de código
7. ✅ **Visibilidad** - Modificadores de acceso
8. ✅ **Buenas prácticas** - Código limpio y mantenible
9. ✅ **Composición** - Objetos que contienen objetos
10. ✅ **Sistemas integrados** - Proyectos completos
11. ✅ **Herencia** - Reutilización de código
12. ✅ **Polimorfismo** - Flexibilidad en el diseño
13. ✅ **Clases abstractas** - Plantillas para familias de clases
14. ✅ **Interfaces** - Contratos de comportamiento
15. ✅ **Excepciones** - Manejo robusto de errores

### Próximos pasos:

- Practica creando tus propios proyectos
- Combina estos conceptos en aplicaciones más complejas
- Investiga patrones de diseño (Singleton, Factory, Observer, etc.)
- Aprende sobre colecciones avanzadas (Map, Set, Queue)
- Explora programación funcional en Java (Streams, Lambdas)
- Profundiza en el manejo de archivos y bases de datos

### Recursos adicionales:

- Documentación oficial de Oracle Java
- Tutoriales de refactoring y código limpio
- Ejercicios de plataformas como HackerRank, LeetCode
- Proyectos de GitHub para estudiar código real

¡Sigue practicando y mejorando tus habilidades! La POO es fundamental para convertirte en un excelente programador Java.

---

**Autor:** Claude (Anthropic)  
**Fecha:** Febrero 2026  
**Versión:** 1.0
