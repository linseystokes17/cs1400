
public class Book {
	private String title;
	private String author;
	private int pgNum;
	private double rLevel;
	private int copiesAvailable;
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Book(String title, String author, int pgNum, double rLevel, int copiesAvailable) {
		super();
		this.title = title;
		this.author = author;
		this.pgNum = pgNum;
		this.rLevel = rLevel;
		this.copiesAvailable = copiesAvailable;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPgNum() {
		return pgNum;
	}

	public void setPgNum(int pgNum) {
		this.pgNum = pgNum;
	}

	public double getrLevel() {
		return rLevel;
	}

	public void setrLevel(double rLevel) {
		this.rLevel = rLevel;
	}

	public int getCopiesAvailable() {
		return copiesAvailable;
	}

	public void setCopiesAvailable(int copiesAvailable) {
		this.copiesAvailable = copiesAvailable;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", pgNum=" + pgNum + ", rLevel=" + rLevel
				+ ", copiesAvailable=" + copiesAvailable + "]";
	}
	
	
}
