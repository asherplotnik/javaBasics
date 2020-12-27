package exApi;

import java.time.LocalDateTime;

public class Task implements Comparable<Task>{
	int id;
	private String description; 
	private boolean done;
	private LocalDateTime deadline;
	private boolean alertPopped;
	
	public Task(int id, String description, LocalDateTime deadline) {
		this.id = id;
		this.description = description;
		this.deadline = deadline;
	}
	
	
	
	@Override
	public int compareTo(Task o) {
		if (!this.deadline.isBefore(o.getDeadline())) {
			return -1;
		} else if (!this.deadline.isEqual(o.getDeadline())){
			return 0;
		}
		return -1;
	}

	public void doTask() {
		done = true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public LocalDateTime getDeadline() {
		return deadline;
	}

	public void setDeadline(LocalDateTime deadline) {
		this.deadline = deadline;
	}

	public boolean isAlertPopped() {
		return alertPopped;
	}

	public void setAlertPopped(boolean alertPopped) {
		this.alertPopped = alertPopped;
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		return this.id == ((Task) obj).getId();
	}

	@Override
	public String toString() {	
		return "[id: " + id + " , description: " + description +" , deadline: " + deadline + " done :" + done+ "]";
	}
	
	
	
}	
