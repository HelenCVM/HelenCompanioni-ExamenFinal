package ups.edu.ec.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ups.edu.ec.modelo.Paciente;
import ups.edu.ec.modelo.SignosVitales;

@Stateless
public class SignosVitalesFacade extends AbstractFacade<SignosVitales>{
	
	 @PersistenceContext(unitName = "ExamenFinal-HelenCompa")
	    private EntityManager em;
	    
	    public SignosVitalesFacade() {
		super(SignosVitales.class);
	    }    

	    @Override
	    protected EntityManager getEntityManager() {
	        return em;
	    }
	
	
	    
	
}
