import java.util.Scanner;

public class ProgramaCoche {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Metodos mt = new Metodos();
        int opcion = 0;
        System.out.println("\nMenú Banco");
        while(opcion!=12){
            System.out.println("\n1. Ver coche\n2. Modificar marca\n3. Modificar modelo\n4. Modificar color" +
                    "\n5. Modificar matrícula\n6. Modificar número de ruedas\n7. Modificar número de puertas" +
                    "\n8. Modificar aseguradora\n9. Modificar tipo de seguro\n10. Modificar precio del seguro" +
                    "\n11. Calcular precio\n12. Salir");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    mt.VerCoche();
                    break;

                case 2:
                    mt.Marca();
                    break;

                case 3:
                    mt.Modelo();
                    break;

                case 4:
                    mt.Color();
                    break;

                case 5:
                    mt.Matricula();
                    break;

                case 6:
                    mt.NumRuedas();
                    break;

                case 7:
                    mt.NumPuertas();
                    break;

                case 8:
                    mt.Aseguradora();
                    break;

                case 9:
                    mt.TipoSeguro();
                    break;

                case 10:
                    mt.PrecioSeguro();
                    break;

                case 11:
                    System.out.println("Escriba el porcentaje de descuento: ");
                    int descuento = sc.nextInt();
                    mt.CalcularPrecio(descuento);
                    break;
            }
        }
    }
}
