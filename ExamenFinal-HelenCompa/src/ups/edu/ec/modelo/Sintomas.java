package ups.edu.ec.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Sintomas
 *
 */
@Entity

public class Sintomas implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String descripcion;
	@ManyToOne
	@JoinColumn
	private Paciente paciente1;
	
	public Sintomas() {
		super();
	}
	
	

	public Sintomas(String descripcion) {
		super();
		this.descripcion = descripcion;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Sintomas [descripcion=" + descripcion + "]";
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
		Sintomas other = (Sintomas) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
	
	
   
}
