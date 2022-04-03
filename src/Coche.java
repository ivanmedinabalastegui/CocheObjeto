public class Coche {
    private String marca;
    private String modelo;
    private String color;
    private String matricula;
    private int numruedas;
    private int numpuertas;
    private String aseguradora;
    private String seguro;
    private double precioseguro;

    public Coche(String marca, String modelo, String color, String matricula, int numruedas, int numpuertas, String aseguradora, String seguro, double precioseguro) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.matricula = matricula;
        this.numruedas = numruedas;
        this.numpuertas = numpuertas;
        this.aseguradora = aseguradora;
        this.seguro = seguro;
        this.precioseguro = precioseguro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getNumruedas() {
        return numruedas;
    }

    public void setNumruedas(int numruedas) {
        this.numruedas = numruedas;
    }

    public int getNumpuertas() {
        return numpuertas;
    }

    public void setNumpuertas(int numpuertas) {
        this.numpuertas = numpuertas;
    }

    public String getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(String aseguradora) {
        this.aseguradora = aseguradora;
    }

    public String getSeguro() {
        return seguro;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }

    public double getPrecioseguro() {
        return precioseguro;
    }

    public void setPrecioseguro(double precioseguro) {
        this.precioseguro = precioseguro;
    }

    public String toString() {
        return "Marca= " + marca +
                "Modelo= " + modelo +
                "Color= " + color +
                "Matrícula= " + matricula +
                "Número de ruedas= " + numruedas +
                "Número de puertas= " + numpuertas +
                "Aseguradora= " + aseguradora +
                "Seguro= " + seguro +
                "Precio del seguro= " + precioseguro;
    }
}
