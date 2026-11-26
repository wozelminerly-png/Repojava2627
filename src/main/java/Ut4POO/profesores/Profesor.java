package profesores;

public abstract class Profesor {

    // Enumeración de asignaturas
    public enum Asignaturas {
        BBDD,
        MARCAS,
        PROGRAMACION,
        ENTORNOS,
        INTERFACES
    }

    private String dniProfesor;
    private String nombre;
    private String apellidos;
    private int edad;
    protected float nomina;
    private Asignaturas modulo;

    public Profesor(String dniProfesor,
                    String nombre,
                    String apellidos,
                    int edad,
                    Asignaturas modulo) {

        this.dniProfesor = dniProfesor;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.modulo = modulo;
        this.nomina = 0;
    }

    // Método abstracto que deberá implementar cada subclase
    public abstract void importeNomina(float sueldoBase,
                                       float complementos);

    public String getDniProfesor() {
        return dniProfesor;
    }

    public void setDniProfesor(String dniProfesor) {
        this.dniProfesor = dniProfesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getNomina() {
        return nomina;
    }

    public Asignaturas getModulo() {
        return modulo;
    }

    public void setModulo(Asignaturas modulo) {
        this.modulo = modulo;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Profesor otro = (Profesor) obj;

        return Float.compare(this.nomina, otro.nomina) == 0;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "dniProfesor='" + dniProfesor + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", modulo=" + modulo +
                ", nomina=" + nomina +
                '}';
    }
}
