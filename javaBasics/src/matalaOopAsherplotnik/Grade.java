package matalaOopAsherplotnik;

public class Grade {
	
	private ProfessionEnum gradeProfession;
	private int score;
	
	public Grade(ProfessionEnum profession, int score) {
		setProfession(profession);
		setScore(score);
	}

	public ProfessionEnum getProfession() {
		return gradeProfession;
	}

	public void setProfession(ProfessionEnum gradeProfession) {
		this.gradeProfession = gradeProfession;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		if (score >= 40 && score <= 100)
		{
			this.score = score;
		}
		else {
			System.out.println("failed to set "+ score + " invalid score . default set to 40:");
			this.score = 40;
		}
			
	}

	@Override
	public String toString() {
		return "["+ gradeProfession + ", " + score + "]";
	}
	
	
	

	

}
