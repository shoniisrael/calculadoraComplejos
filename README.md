# Calculadora Complejos Java

## Asignación
Definir una clase en Java para realizar las operaciones de lectura, escritura, suma, y multiplicación de números complejos. Un número complejo es aquel cuya parte real e imaginaria son valores reales. La clase debe tener además al menos un constructor y los métodos getters y setters.

## public class NumeroComplejo

```java
public class NumeroComplejo {
    public int real;
    public int imaginario;

    public NumeroComplejo(int real, int imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }
    public String format(){
        return this.real + " + " + this.imaginario + "i";
    }
    public int getReal() {
        return real;
    }
    public void setReal(int real) {
        this.real = real;
    }
    public int getImaginario() {
        return imaginario;
    }
    public void setImaginario(int imaginario) {
        this.imaginario = imaginario;
    }
}

```

## public class Calculadora 
```java
public class Calculadora {
    public NumeroComplejo sumar(NumeroComplejo n1, NumeroComplejo n2){
        int reales = n1.real + n2.real;
        int imaginarios = n1.imaginario + n2.imaginario;
        return new NumeroComplejo(reales,imaginarios);
    }

    public NumeroComplejo multiplicar(NumeroComplejo n1, NumeroComplejo n2){
        int reales = (n1.real * n2.real)-(n1.imaginario * n2.imaginario);
        int imaginarios = (n1.real * n2.imaginario)-(n1.imaginario * n2.real);
        return new NumeroComplejo(reales,imaginarios);
    }

    public NumeroComplejo restar(NumeroComplejo n1, NumeroComplejo n2){
        int reales = n1.real - n2.real;
        int imaginarios = n1.imaginario - n2.imaginario;
        return new NumeroComplejo(reales,imaginarios);
    }
}

```
## clase principal  (MAIN)
```java
public class calculadoraComplejos {
    public static void main(String[] args) {
        //Creo los numeros con el constructor
        NumeroComplejo val1=new NumeroComplejo(3,5);
        NumeroComplejo val2=new NumeroComplejo(-19,10);

        //Ocupo la clase de las operaciones para enviar los valores y recibir las respuestas
        Calculadora cal=new Calculadora();
        NumeroComplejo respuestaSuma=cal.sumar(val1,val2);
        NumeroComplejo respuestaMultiplicacion=cal.multiplicar(val1,val2);

        //imprimo las respuestas, ocupo la funcion format para transformar el obtejo a String
        System.out.println(respuestaSuma.format());
        System.out.println(respuestaMultiplicacion.format());
    }
}


```


## Contribuyendo
Las mejoras, cambios y sugerencias son bienvenidas. 

## License
[MIT](https://choosealicense.com/licenses/mit/)
