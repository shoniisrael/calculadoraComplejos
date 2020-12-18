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
