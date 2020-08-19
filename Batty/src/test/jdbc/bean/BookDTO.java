package test.jdbc.bean;

import java.sql.Timestamp;

public class BookDTO {
	
	private int num;
	private String writer;
	private String title;
	private String content;
	private Timestamp reg;
	


	
	public void setNum(int num) {
		this.num = num;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	

	public void setTitle(String title) {
		this.title = title;
	}
	

	public void setContent(String content) {
		this.content = content;
	}
	
	public void setReg(Timestamp reg) {
		this.reg = reg;
	}
	
	public Timestamp getReg() {
		return reg;
	}
	
	public int getNum() {
		return num;
	}

	public String getWriter() {
		return writer;
	}

	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	
	public void print() {
		System.out.println(this.num+" "+this.writer+" "+this.title+" "+this.content+" "+this.reg);
	}
	
	
}
