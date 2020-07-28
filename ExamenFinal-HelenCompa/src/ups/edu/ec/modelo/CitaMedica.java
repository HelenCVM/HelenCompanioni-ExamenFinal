package ups.edu.ec.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: CitaMedica
 *
 */
@Entity

public class CitaMedica implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String fecha;
	private String hora;
	private String tiempo;
	@Transient
	private boolean editable;
	@ManyToOne
	@JoinColumn
	private Paciente paciente;
	
	public CitaMedica() {
		super();
	}
	
	

	public CitaMedica(String fecha, String hora, String tiempo) {
		super();
		this.fecha = fecha;
		this.hora = hora;
		this.tiempo = tiempo;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getTiempo() {
		return tiempo;
	}

	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}

	public boolean isEditable() {
		return editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	@Override
	public String toString() {
		return "CitaMedica [id=" + id + ", fecha=" + fecha + ", hora=" + hora + ", tiempo=" + tiempo + "]";
	}
	
	
	
   
}
