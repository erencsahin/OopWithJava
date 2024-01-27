package JavaOdev.entites;

public class Courses {
	private int id;
	private String courseName;
	private String author;
	private int price;
	private String categoryName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Courses(int id, String courseName, String author, int price, String categoryName) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.author = author;
		this.price = price;
		this.categoryName = categoryName;
	}

	
}
