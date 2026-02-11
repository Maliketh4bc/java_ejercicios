# Proyecto POO - Simulación Policías y Ladrones

## Descripción
Simulación visual en tiempo real de un sistema de persecución entre policías y ladrones utilizando Programación Orientada a Objetos.

## Estructura del Proyecto

```
proyecto_poo/
├── src/
│   ├── App.java                    # Clase principal
│   ├── mapa/
│   │   └── Mapa.java              # Gestión del tablero y lógica
│   ├── personajes/
│   │   ├── Atomo.java             # Clase abstracta base
│   │   ├── Policia.java           # Policía perseguidor
│   │   ├── Ladron.java            # Ladrón que huye
│   │   └── Caja.java              # Obstáculo estático
│   └── posicion/
│       └── Posicion.java          # Manejo de coordenadas
└── bin/                            # Archivos compilados (.class)
```

### ✓ Documentación de Clases
- Descripción del propósito de cada clase
- Tags @author y @version
- Referencias cruzadas con @see

### ✓ Documentación de Métodos
- Descripción de qué hace cada método
- Tag @param para cada parámetro
- Tag @return para valores de retorno
- Tag @throws para excepciones

### ✓ Documentación de Atributos
- Comentarios breves para cada variable de instancia

### ✓ Información Adicional
- Explicación de algoritmos (ej: distancia Manhattan)
- Complejidad computacional donde es relevante
- Notas sobre dependencias ANSI
- Detalles de implementación importantes

## Conceptos POO Demostrados

1. **Herencia**: Atomo → Policia, Ladron, Caja
2. **Abstracción**: Clase abstracta Atomo con método toString() abstracto
3. **Polimorfismo**: Diferentes implementaciones de toString()
4. **Encapsulación**: Atributos private con getters/setters
5. **Composición**: Mapa contiene ArrayLists de personajes

## Requisitos

- Java JDK 8 o superior
- Terminal con soporte para códigos ANSI (para colores)

## Autor

Marco

## Versión

1.0 - Checkpoint 1
