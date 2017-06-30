package db;

import java.time.LocalDateTime;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class TaskDB {
	@PersistenceContext(unitName = "todolist")
	private EntityManager em;
	public void create(Task task){
		task.setDeadline(LocalDateTime.now());
		em.persist(task);
	}
}
