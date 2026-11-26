package ut4POO.exaut4;

public class MasajistaXXX extends IntegranteSeleccionXXX {
	 private String titulacion;
	    private int aniosExperiencia;

	    public MasajistaXXX(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
	        super(id, nombre, apellidos, edad);
	        this.titulacion = titulacion;
	        this.aniosExperiencia = aniosExperiencia;
	    }

	    @Override
		public String toString() {
			return "MasajistaXXX [titulacion=" + titulacion + ", aniosExperiencia=" + aniosExperiencia
					+ ", getNombreCompleto()=" + getNombreCompleto() + ", toString()=" + super.toString()
					+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
		}

		public void darMasaje() {
	        System.out.println(getNombreCompleto() + " -> Está dando un masaje relajante.");
	    }
	    
}
