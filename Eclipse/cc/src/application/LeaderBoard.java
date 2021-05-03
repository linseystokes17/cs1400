package application;

public class LeaderBoard {
	String name;
	int score;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public LeaderBoard() {
		// TODO Auto-generated constructor stub
	}
	public LeaderBoard(String name, int score) {
		
	}
	@Override
	public String toString() {
		return "LeaderBoard [name=" + name + ", score=" + score + "]";
	}
	public LeaderBoard(String nextLine) {
		String [] data = nextLine.split(",");
		name = data[0];
		score = Integer.parseInt(data[1]);
	}

}
