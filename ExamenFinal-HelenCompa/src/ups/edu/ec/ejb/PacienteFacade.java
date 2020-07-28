package ups.edu.ec.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ups.edu.ec.modelo.CitaMedica;
import ups.edu.ec.modelo.Paciente;

@Stateless
public class PacienteFacade extends AbstractFacade<Paciente>{
	
	 @PersistenceContext(unitName = "ExamenFinal-HelenCompa")
	    private EntityManager em;
	    
	    public PacienteFacade() {
		super(Paciente.class);
	    }    

	    @Override
	    protected EntityManager getEntityManager() {
	        return em;
	    }
	
}
