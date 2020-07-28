package ups.edu.ec.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Alergias
 *
 */
@Entity

public class Alergias implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String descripcion;
	@ManyToOne
	@JoinColumn
	private Paciente paciente2;
	
	
	public Alergias() {
		super();
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Paciente getPaciente2() {
		return paciente2;
	}


	public void setPaciente2(Paciente paciente2) {
		this.paciente2 = paciente2;
	}


	public Alergias(String descripcion) {
		super();
		this.descripcion = descripcion;
	}


	@Override
	public String toString() {
		return "Alergias [descripcion=" + descripcion + "]";
	}
   
	
	
}
