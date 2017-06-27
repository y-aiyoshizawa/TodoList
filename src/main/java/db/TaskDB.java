package db;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class TaskDB {
	@PersistenceContext
	private EntityManager em;
	public void create(Task task){
		em.persist(task);
	}
}
