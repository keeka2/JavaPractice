package sleepy.jdbc.bean;

public class BookInputDTO {
	private int sal;
	private int deptno;
	
	public BookInputDTO(int sal, int deptno) {
		this.sal=sal;
		this.deptno=deptno;
		// TODO Auto-generated constructor stub
	}
	
	public int getSal() {
		return sal;
	}

	public int getDeptno() {
		return deptno;
	}

}
