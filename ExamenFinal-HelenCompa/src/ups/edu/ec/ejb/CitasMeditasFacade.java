package ups.edu.ec.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ups.edu.ec.modelo.CitaMedica;



@Stateless
public class CitasMeditasFacade extends AbstractFacade<CitaMedica>{
	
	 @PersistenceContext(unitName = "ExamenFinal-HelenCompa")
	    private EntityManager em;
	    
	    public CitasMeditasFacade() {
		super(CitaMedica.class);
	    }    

	    @Override
	    protected EntityManager getEntityManager() {
	        return em;
	    }
	
}
