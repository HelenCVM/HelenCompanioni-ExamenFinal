package ups.edu.ec.ejb;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ups.edu.ec.modelo.Alergias;
import ups.edu.ec.modelo.Sintomas;

public class SintomasFacade extends AbstractFacade<Sintomas>{
	
	 @PersistenceContext(unitName = "ExamenFinal-HelenCompa")
	    private EntityManager em;
	    
	    public SintomasFacade() {
		super(Sintomas.class);
	    }    

	    @Override
	    protected EntityManager getEntityManager() {
	        return em;
	    }
	
}
