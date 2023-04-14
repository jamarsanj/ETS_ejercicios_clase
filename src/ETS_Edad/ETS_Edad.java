package ETS_Edad;

public class ETS_Edad {
	private int edad;	
	public ETS_Edad (int edad) {
		this.edad=edad;
	}
	
	public boolean isMayorDeEdad() {
		assert edad >= 0;
		return edad >= 18;
	}
}