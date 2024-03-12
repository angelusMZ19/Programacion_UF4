# Ejemplo
Supongamos que tienes una clase base llamada Vehiculo con un método llamado arrancar():

```java
public class Vehiculo {
    public void arrancar() {
        System.out.println("Arrancando el vehículo");
    }
}
```
Ahora, creemos dos clases derivadas (Coche y Bicicleta) que heredan de la clase Vehiculo y sobrescriben el método arrancar() para proporcionar implementaciones específicas:

```java
public class Coche extends Vehiculo {
    @Override
    public void arrancar() {
        System.out.println("Arrancando el coche");
    }
}

public class Bicicleta extends Vehiculo {
    @Override
    public void arrancar() {
        System.out.println("Comenzando a pedalear la bicicleta");
    }
}
```

Ahora, puedes utilizar polimorfismo al tratar objetos de estas clases derivadas como objetos de la clase base Vehiculo. Por ejemplo:

```java
public class EjemploPolimorfismo {
    public static void main(String[] args) {
        Vehiculo miCoche = new Coche();
        Vehiculo miBicicleta = new Bicicleta();

        // Llamando a arrancar() de manera polimórfica
        miCoche.arrancar();
        miBicicleta.arrancar();
    }
}
```
En este ejemplo, miCoche y miBicicleta son del tipo Vehiculo, pero en tiempo de ejecución, Java utiliza el método arrancar() de la clase concreta (Coche o Bicicleta). Esto es un ejemplo de polimorfismo, donde un objeto puede actuar de maneras diferentes según su tipo concreto. En este caso, ambos tipos de vehículos comparten la interfaz común de Vehiculo, pero cada uno tiene su propia implementación específica de arrancar.
