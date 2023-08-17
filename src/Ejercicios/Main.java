package Ejercicios;

/**
 *
 * @author Benji
 */
public class Main {

    public static void main(String[] args) {

        String codigo = "U22101319";
        String nombre = "Benjamin";
        String condicionContrato = "Estable";
        String tipoActividad = "Supervisión de Obras";
        String especialidad = "Recursos Híbridos";
        String tipoAfiliacion = "AFP";

        Arquitecto benji = new Arquitecto(codigo, nombre, condicionContrato, especialidad, tipoActividad, tipoAfiliacion);

        double sueldoBase = benji.getSueldoBase();
        double bonificacion = benji.getBonificacion();
        double descAfiliacion = 0;
        switch (tipoAfiliacion) {
            case "AFP":
                descAfiliacion = benji.getAfp();
                break;
            case "SNP":
                descAfiliacion = benji.getSnp();
                break;
            default:
        }

        double sueldoFinal = benji.getSueldoFinal();

        System.out.println("Sueldo base: " + sueldoBase);
        System.out.println("Bonificacion: " + bonificacion);
        System.out.println("Decuento por afiliacion: " + descAfiliacion);
        System.out.println("Sueldo Final: " + sueldoFinal);

    }

}
