package db;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Task implements Serializable{
	@Id @NotNull
	private Integer id;
	private String taskName;
	private String taskMemo;
	private Date deadline;

	public Task(){}

	public Task(Integer id, String taskName, String taskMemo, Date deadline) {
		super();
		this.id = id;
		this.taskName = taskName;
		this.taskMemo = taskMemo;
		this.deadline = deadline;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getTaskMemo() {
		return taskMemo;
	}
	public void setTaskMemo(String taskMemo) {
		this.taskMemo = taskMemo;
	}
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
}
