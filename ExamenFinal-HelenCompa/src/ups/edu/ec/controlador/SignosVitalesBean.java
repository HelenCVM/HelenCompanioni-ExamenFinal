package ups.edu.ec.controlador;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;


import ups.edu.ec.ejb.SignosVitalesFacade;
import ups.edu.ec.modelo.Paciente;
import ups.edu.ec.modelo.SignosVitales;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class SignosVitalesBean implements Serializable{

	@EJB
	private SignosVitalesFacade ejbSignosVitales;
	private List<SignosVitales> list;
	private int id;
	private String presion;
	private String frecuenciaCardiaca;
	private String frecuenciaRespiratoria;
	private String temperaturaSaturacion;
	
	public SignosVitalesBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	public void init() {
		 
		 //ejbUsuarioFacade.create(new Usuario("Kevin","Cordero","0992726928","015128912","kevin@gmail.com","123",rol));
		 list= ejbSignosVitales.findAll();
	 }

	public SignosVitales[] getList() {
		return list.toArray(new SignosVitales[0]);
	}

	public void setList(List<SignosVitales> list) {
		this.list = list;
	}
	
	 public String add() {
		 Paciente pa=new Paciente();
		 pa.setCedula("0151489812");
		 ejbSignosVitales.create(new SignosVitales(this.id,this.presion,this.frecuenciaCardiaca,this.frecuenciaRespiratoria,this.temperaturaSaturacion,pa));
			list = ejbSignosVitales.findAll();
			return null;
		    }

		    public String delete(SignosVitales c) {	
		    	ejbSignosVitales.remove(c);
			list = ejbSignosVitales.findAll();
			return null;
		    }

		    
		    //para que se muestren los editables del proyecto (input) para editar
		    public String edit(SignosVitales c) {
			c.setEditable(true);
			return null;
		    }

		    public String save(SignosVitales c) {
		    	ejbSignosVitales.edit(c);
			c.setEditable(false);
			return null;
		    }

			public SignosVitalesFacade getEjbSignosVitales() {
				return ejbSignosVitales;
			}

			public void setEjbSignosVitales(SignosVitalesFacade ejbSignosVitales) {
				this.ejbSignosVitales = ejbSignosVitales;
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

	
	
}

