package matalaApiAsherPlotnik.EldarReminder;
import java.util.Calendar;

public class Reminder implements Comparable<Reminder>{
	
    private Calendar expiration;
    private String text;
    private boolean important;
    private boolean poped;
    
	public Reminder(Calendar expiration, String text, boolean important) {
		super();
		this.expiration = expiration;
		this.text = text;
		this.important=important;
	}

	public Calendar getExpiration() {
		return expiration;
	}
	public void setExpiration(Calendar expiration) {
		this.expiration = expiration;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public boolean isImportant() {
		return important;
	}
	public void setImportant(boolean important) {
		this.important = important;
	}
	
	@Override
	public int compareTo(Reminder r) {
		if(equals(r))return 0;
		return expiration.compareTo(r.expiration);
	}
	
	
	@Override
	public int hashCode() {
		return expiration.get(Calendar.DAY_OF_MONTH)+
			   expiration.get(Calendar.MONTH)+
			   expiration.get(Calendar.YEAR)+
			   expiration.get(Calendar.HOUR_OF_DAY)+
			   expiration.get(Calendar.MINUTE)+
			   text.hashCode();
	}

	@Override
	public boolean equals(Object o) {
		if(text.equals(((Reminder)o).getText())) {
			Calendar c=((Reminder)o).getExpiration();
			if(expiration.get(Calendar.DAY_OF_MONTH)==c.get(Calendar.DAY_OF_MONTH)&&
			   expiration.get(Calendar.MONTH)==c.get(Calendar.MONTH)&&
			   expiration.get(Calendar.YEAR)==c.get(Calendar.YEAR)&&
			   expiration.get(Calendar.HOUR_OF_DAY)==c.get(Calendar.HOUR_OF_DAY)&&
			   expiration.get(Calendar.MINUTE)==c.get(Calendar.MINUTE))
			   return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		int day=expiration.get(Calendar.DAY_OF_MONTH);
		int month=expiration.get(Calendar.MONTH)+1;
		int year=expiration.get(Calendar.YEAR);
		int hour=expiration.get(Calendar.HOUR_OF_DAY);
		int min=expiration.get(Calendar.MINUTE);
		String result="Reminder:   "+text+"   ["+day+"."+month+"."+year+" "+hour+":"+min+"] ";
		if(important)
			result+="-- IMPORTANT!--";
		if(isPoped())
			result+="   (Done)";
		return result;
			
	}

	public boolean isPoped() {
		return poped;
	}

	public void setPoped(boolean poped) {
		this.poped = poped;
	}

}
