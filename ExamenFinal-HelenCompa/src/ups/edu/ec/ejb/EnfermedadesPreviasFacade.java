package ups.edu.ec.ejb;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ups.edu.ec.modelo.EnfermedadesPrevias;
import ups.edu.ec.modelo.Sintomas;

public class EnfermedadesPreviasFacade extends AbstractFacade<EnfermedadesPrevias>{
	
	 @PersistenceContext(unitName = "ExamenFinal-HelenCompa")
	    private EntityManager em;
	    
	    public EnfermedadesPreviasFacade() {
		super(EnfermedadesPrevias.class);
	    }    

	    @Override
	    protected EntityManager getEntityManager() {
	        return em;
	    }
	
}
