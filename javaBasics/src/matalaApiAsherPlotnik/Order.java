package matalaApiAsherPlotnik;

import java.time.LocalDateTime;

public class Order implements Comparable<Order>{
	
	private LocalDateTime expiration;
	private String description;
	private boolean important;
	private boolean poped;
	public Order(LocalDateTime expiration, String description, boolean important) {
		this.expiration = expiration;
		this.description = description;
		this.important = important;
		this.poped = false;
	}
	public LocalDateTime getExpiration() {
		return expiration;
	}
	public void setExpiration(LocalDateTime expiration) {
		this.expiration = expiration;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isImportant() {
		return important;
	}
	public void setImportant(boolean important) {
		this.important = important;
	}
	public boolean isPoped() {
		return poped;
	}
	public void setPoped(boolean poped) {
		this.poped = poped;
	}
	
	
	@Override
	public int compareTo(Order o) {
		if (this.equals(o)) {
			return 0;
		}
		return this.expiration.compareTo(o.expiration);
	} 
	
	
	@Override
	public String toString() {
		return "Order [expiration=" + expiration + ", description=" + description + ", important=" + important
				+ ", poped=" + poped + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + 5;
		result = prime * result + 2;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (!description.equals(other.description) && !expiration.equals(other.expiration))
			return false;
		
		return true;
	}
	
	
	
	

}
