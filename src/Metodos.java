import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);
    Coche coche1 = new Coche("Toyota", "C-HR", "azul", "3245 LCX", 4, 4, "AIOI NISSAY DOWA INSURANCE EUROPE LIMITED", "todo riesgo",  1000);
    public void CalcularPrecio(int descuento){
        double descuentoreal = (coche1.getPrecioseguro() * descuento) / 100;
        double total = coche1.getPrecioseguro() - descuentoreal;
        System.out.println("Para un descuento del " + descuento + "%, se quedaría en " + total + "€");
    }

    public void VerCoche(){
        System.out.println(coche1);
    }

    public void Marca(){
        System.out.println("\nMarca actual: " + coche1.getMarca());
        System.out.println("Introduzca nueva marca: ");
        String Nmarca = sc.nextLine();
        coche1.setMarca(Nmarca);
        System.out.println("Marca cambiada a: " + coche1.getMarca());
    }

    public void Modelo(){
        System.out.println("\nModelo actual: " + coche1.getModelo());
        System.out.println("Introduzca nuevo modelo: ");
        String Nmodelo = sc.nextLine();
        coche1.setMarca(Nmodelo);
        System.out.println("Modelo cambiado a: " + coche1.getModelo());
    }

    public void Color(){
        System.out.println("\nColor actual: " + coche1.getColor());
        System.out.println("Introduzca nuevo color: ");
        String Ncolor = sc.nextLine();
        coche1.setColor(Ncolor);
        System.out.println("Color cambiado a: " + coche1.getColor());
    }

    public void Matricula(){
        System.out.println("\nMatrícula actual: " + coche1.getMatricula());
        System.out.println("Introduzca nueva matrícula: ");
        String Nmatricula = sc.nextLine();
        coche1.setMatricula(Nmatricula);
        System.out.println("Matrícula cambiada a: " + coche1.getMatricula());
    }

    public void NumRuedas(){
        System.out.println("\nNúmero de ruedas actual: " + coche1.getMarca());
        System.out.println("Introduzca nuevo número de ruedas: ");
        int Nruedas = sc.nextInt();
        coche1.setNumruedas(Nruedas);
        System.out.println("Número de ruedas cambiado a: " + coche1.getNumruedas());
    }

    public void NumPuertas(){
        System.out.println("\nNúmero de puertas actual: " + coche1.getMarca());
        System.out.println("Introduzca nuevo número de puertas: ");
        int Npuertas = sc.nextInt();
        coche1.setNumpuertas(Npuertas);
        System.out.println("Número de puertas cambiado a: " + coche1.getNumpuertas());
    }

    public void Aseguradora(){
        System.out.println("\nAseguradora actual: " + coche1.getAseguradora());
        System.out.println("Introduzca nueva aseguradora: ");
        String Naseguradora = sc.nextLine();
        coche1.setAseguradora(Naseguradora);
        System.out.println("Aseguradora cambiada a: " + coche1.getAseguradora());
    }

    public void TipoSeguro(){
        System.out.println("\nTipo de seguro actual: " + coche1.getSeguro());
        System.out.println("Introduzca nuevo tipo de seguro: ");
        String Nseguro = sc.nextLine();
        coche1.setSeguro(Nseguro);
        System.out.println("Tipo de seguro cambiado a: " + coche1.getSeguro());
    }

    public void PrecioSeguro(){
        System.out.println("\nMarca actual: " + coche1.getPrecioseguro() + "€");
        System.out.println("Introduzca nuevo precio del seguro: ");
        double Nprecio = sc.nextDouble();
        coche1.setPrecioseguro(Nprecio);
        System.out.println("Precio del seguro cambiado a: " + coche1.getPrecioseguro() + "€");
    }
}
