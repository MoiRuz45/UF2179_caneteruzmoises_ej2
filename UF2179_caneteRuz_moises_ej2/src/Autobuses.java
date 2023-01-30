import java.util.Objects;
public class Autobuses {

	private String matricula;
	private String marca;
	private String modelo;
	private int kilometros;
	private int num_plazas;
	
	public Autobuses() {
		this.matricula="";
		this.marca="";
		this.modelo="";
		this.kilometros=0;
		this.num_plazas=0;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
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
	public int getKilometros() {
		return kilometros;
	}
	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}
	public int getNum_plazas() {
		return num_plazas;
	}
	public void setNum_plazas(int num_plazas) {
		this.num_plazas = num_plazas;
	}
	@Override
	public int hashCode() {
		return Objects.hash(kilometros, marca, matricula, modelo, num_plazas);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autobuses other = (Autobuses) obj;
		return kilometros == other.kilometros && Objects.equals(marca, other.marca)
				&& Objects.equals(matricula, other.matricula) && Objects.equals(modelo, other.modelo)
				&& num_plazas == other.num_plazas;
	}
	@Override
	public String toString() {
		return "Autobuses [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", kilometros="
				+ kilometros + ", num_plazas=" + num_plazas + "]";
	}
	
	
	
}
