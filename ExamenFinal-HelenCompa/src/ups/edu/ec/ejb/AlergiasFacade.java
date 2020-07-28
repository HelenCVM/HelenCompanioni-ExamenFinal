package ups.edu.ec.ejb;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ups.edu.ec.modelo.Alergias;
import ups.edu.ec.modelo.CitaMedica;

public class AlergiasFacade extends AbstractFacade<Alergias>{
	
	 @PersistenceContext(unitName = "ExamenFinal-HelenCompa")
	    private EntityManager em;
	    
	    public AlergiasFacade() {
		super(Alergias.class);
	    }    

	    @Override
	    protected EntityManager getEntityManager() {
	        return em;
	    }
}
