package profesores;

import java.util.Calendar;

public class ProfesorInterino extends Profesor {

    private Calendar fechaInicioInterinidad;

    public ProfesorInterino(String dniProfesor,
                            String nombre,
                            String apellidos,
                            int edad,
                            Asignaturas modulo,
                            Calendar fechaInicioInterinidad) {

        super(dniProfesor, nombre, apellidos, edad, modulo);
        this.fechaInicioInterinidad = fechaInicioInterinidad;
    }

    public Calendar getFechaInicioInterinidad() {
        return fechaInicioInterinidad;
    }

    public void setFechaInicioInterinidad(Calendar fechaInicioInterinidad) {
        this.fechaInicioInterinidad = fechaInicioInterinidad;
    }

    /**
     * Deducciones fijas de 100€
     */
    public void importeNomina(float sueldoBase,
                              float complementos) {

        this.nomina = sueldoBase + complementos - 100;
    }

    @Override
    public String toString() {
        return "ProfesorInterino{" +
                "fechaInicioInterinidad=" +
                fechaInicioInterinidad.getTime() +
                ", nomina=" + nomina +
                '}';
    }
}
