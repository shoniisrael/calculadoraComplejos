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
