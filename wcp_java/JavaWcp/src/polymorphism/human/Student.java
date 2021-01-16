package polymorphism.human;

public class Student extends Human {
	private int score;

	public Student(String name, int age, int score) {
		super(name, age);
		this.score = score;
	}
	
	@Override
	public String getProfile() {
		String profile = "年齢は" + super.age + "です。";
//		this.ageでもおk？
		profile += "学生で、テストの点数は" + this.score + "です。";
		return profile;
	}
}