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

