package ups.edu.ec.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: EnfermedadesPrevias
 *
 */
@Entity

public class EnfermedadesPrevias implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String descripcion;
	@ManyToOne
	@JoinColumn
	private Paciente paciente3;
	
	public EnfermedadesPrevias() {
		super();
	}

	public EnfermedadesPrevias(String descripcion) {
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

	
	public Paciente getPaciente3() {
		return paciente3;
	}

	public void setPaciente3(Paciente paciente3) {
		this.paciente3 = paciente3;
	}

	@Override
	public String toString() {
		return "EnfermedadesPrevias [id=" + id + ", descripcion=" + descripcion + "]";
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
		EnfermedadesPrevias other = (EnfermedadesPrevias) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	

	
	
	
   
}
