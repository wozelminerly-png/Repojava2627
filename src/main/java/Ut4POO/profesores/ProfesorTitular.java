package profesores;

public class ProfesorTitular extends Profesor {

    private int aniosAntiguedad;

    public ProfesorTitular(String dniProfesor,
                           String nombre,
                           String apellidos,
                           int edad,
                           Asignaturas modulo,
                           int aniosAntiguedad) {

        super(dniProfesor, nombre, apellidos, edad, modulo);
        this.aniosAntiguedad = aniosAntiguedad;
    }

    public int getAniosAntiguedad() {
        return aniosAntiguedad;
    }

    public void setAniosAntiguedad(int aniosAntiguedad) {
        this.aniosAntiguedad = aniosAntiguedad;
    }

    /**
     * Deducciones = 10 € por cada año de antigüedad
     */
    public void importeNomina(float sueldoBase,
                              float complementos) {

        float deducciones = aniosAntiguedad * 10;

        this.nomina = sueldoBase + complementos - deducciones;
    }

    @Override
    public String toString() {
        return "ProfesorTitular{" +
                "aniosAntiguedad=" + aniosAntiguedad +
                ", nomina=" + nomina +
                '}';
    }
}
