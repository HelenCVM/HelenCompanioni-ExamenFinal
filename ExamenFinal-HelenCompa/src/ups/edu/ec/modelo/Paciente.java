package ups.edu.ec.modelo;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Paciente
 *
 */
@Entity

public class Paciente implements Serializable {

	
	private static final long serialVersionUID = 1L;
    @Id
    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private String correo;
    @OneToMany(cascade=CascadeType.ALL,mappedBy="paciente")
    private Set<CitaMedica> cita;
    @OneToMany(cascade=CascadeType.ALL,mappedBy="signos")
    private Set<SignosVitales> signos;
    @OneToMany(cascade=CascadeType.ALL,mappedBy="paciente2")
    private Set<Alergias> alergias;
    @OneToMany(cascade=CascadeType.ALL,mappedBy="paciente3")
    private Set<EnfermedadesPrevias> enferpre;
    @OneToMany(cascade=CascadeType.ALL,mappedBy="paciente1")
    private Set<Sintomas> sinto;
    
	public Paciente() {
		super();
	}

	
	
	public Paciente(String cedula, String nombre, String apellido, String telefono, String direccion, String correo) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.direccion = direccion;
		this.correo = correo;
	}


	

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cedula == null) ? 0 : cedula.hashCode());
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
		Paciente other = (Paciente) obj;
		if (cedula == null) {
			if (other.cedula != null)
				return false;
		} else if (!cedula.equals(other.cedula))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Paciente [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono
				+ ", direccion=" + direccion + ", correo=" + correo + "]";
	}
	
	
	
	
   
}
