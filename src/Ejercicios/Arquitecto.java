package Ejercicios;

/**
 *
 * @author Benji
 */
public class Arquitecto {

    private String codigo;
    private String nombre;
    private String condicionContrato;
    private String especialidad;
    private String tipoActividad;
    private String tipoAfiliacion;

    private final double AFP = 0.15;
    private final double SNP = 0.08;

    public Arquitecto(String codigo, String nombre, String condicionContrato, String especialidad, String tipoActividad, String tipoAfiliacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.condicionContrato = condicionContrato;
        this.especialidad = especialidad;
        this.tipoActividad = tipoActividad;
        this.tipoAfiliacion = tipoAfiliacion;
    }

    public double getSueldoBase() {
        double sueldoBase = 0;

        switch (condicionContrato) {
            case "Estable":
                switch (tipoActividad) {
                    case "Supervisión de Obras":
                        sueldoBase = 4000;
                        break;
                    case "Supervisión de Vias":
                        sueldoBase = 6000;
                        break;
                    default:
                }
                break;
            case "Contratado":
                switch (tipoActividad) {
                    case "Supervisión de Obras":
                        sueldoBase = 2000;
                        break;
                    case "Supervisión de Vias":
                        sueldoBase = 4500;
                        break;
                    default:
                }
                break;
            default:

        }
        return sueldoBase;
    }

    public double getBonificacion() {
        double bonificacion = 0;

        switch (especialidad) {
            case "Estructuras":
                bonificacion = 0.16 * getSueldoBase();
                break;
            case "Recursos Híbridos":
                bonificacion = 0.18 * getSueldoBase();
                break;
            default:

        }
        return bonificacion;
    }
    
    public double getAfp() {
        return AFP * getSueldoBase();
    }

    public double getSnp() {
        return SNP + getSueldoBase();
    }

    public double getSueldoFinal() {
        switch (tipoAfiliacion) {
            case "AFP":
                return getSueldoBase() + getBonificacion() - getAfp();
            case "SNP":
                return getSueldoBase() + getBonificacion() - getSnp();
            default:
        }
        return  0;
    }

}
