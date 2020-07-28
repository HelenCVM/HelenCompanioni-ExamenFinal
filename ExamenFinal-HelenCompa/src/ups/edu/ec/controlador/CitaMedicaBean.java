package ups.edu.ec.controlador;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ups.edu.ec.ejb.CitasMeditasFacade;
import ups.edu.ec.ejb.SignosVitalesFacade;
import ups.edu.ec.modelo.CitaMedica;
import ups.edu.ec.modelo.SignosVitales;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class CitaMedicaBean implements Serializable{

	@EJB
	private CitasMeditasFacade ejbSignosVitales;
	private List<CitaMedica> list;
	private int id;
	private String fecha;
	private String hora;
	private String tiempo;
	public CitaMedicaBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
