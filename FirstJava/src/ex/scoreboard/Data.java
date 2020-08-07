package ex.scoreboard;

public class Data {
	private String name;
	private int id;
	private int korean;
	private int english;
	private int math;
	
	Data(String name, int id, int korean, int english, int math){
		this.name = name;
		this.id = id;
		this.korean = korean;
		this.english =english;
		this.math=math;
	}
	
	public String getName() {
		return this.name;
	}
	public int getId() {
		return this.id;
	}
	public int getKorean() {
		return this.korean;
	}
	public int getEnglish() {
		return this.english;
	}
	public int getMath() {
		return this.math;
	}

}
