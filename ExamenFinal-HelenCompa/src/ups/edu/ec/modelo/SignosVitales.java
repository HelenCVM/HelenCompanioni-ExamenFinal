package ups.edu.ec.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: SignosVitales
 *
 */
@Entity

public class SignosVitales implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	private String presion;
	private String frecuenciaCardiaca;
	private String frecuenciaRespiratoria;
	private String temperaturaSaturacion;
	@Transient
	private boolean editable;
	@ManyToOne
	@JoinColumn
	private Paciente signos;
	
	
	public SignosVitales() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getPresion() {
		return presion;
	}


	public void setPresion(String presion) {
		this.presion = presion;
	}


	public String getFrecuenciaCardiaca() {
		return frecuenciaCardiaca;
	}


	
	public boolean isEditable() {
		return editable;
	}


	public void setEditable(boolean editable) {
		this.editable = editable;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SignosVitales other = (SignosVitales) obj;
		if (id != other.id)
			return false;
		return true;
	}


	public void setFrecuenciaCardiaca(String frecuenciaCardiaca) {
		this.frecuenciaCardiaca = frecuenciaCardiaca;
	}


	public String getFrecuenciaRespiratoria() {
		return frecuenciaRespiratoria;
	}


	public void setFrecuenciaRespiratoria(String frecuenciaRespiratoria) {
		this.frecuenciaRespiratoria = frecuenciaRespiratoria;
	}


	public String getTemperaturaSaturacion() {
		return temperaturaSaturacion;
	}


	public void setTemperaturaSaturacion(String temperaturaSaturacion) {
		this.temperaturaSaturacion = temperaturaSaturacion;
	}


	public Paciente getSignos() {
		return signos;
	}


	public void setSignos(Paciente signos) {
		this.signos = signos;
	}


	

	public SignosVitales(int id, String presion, String frecuenciaCardiaca, String frecuenciaRespiratoria,
			String temperaturaSaturacion, Paciente signos) {
		super();
		this.id = id;
		this.presion = presion;
		this.frecuenciaCardiaca = frecuenciaCardiaca;
		this.frecuenciaRespiratoria = frecuenciaRespiratoria;
		this.temperaturaSaturacion = temperaturaSaturacion;
		this.signos = signos;
	}


	@Override
	public String toString() {
		return "SignosVitales [id=" + id + ", presion=" + presion + ", frecuenciaCardiaca=" + frecuenciaCardiaca
				+ ", frecuenciaRespiratoria=" + frecuenciaRespiratoria + ", temperaturaSaturacion="
				+ temperaturaSaturacion + "]";
	}
	
	
	
   
}
