class LgTv
{
	private static LgTv lt1 = new LgTv();
	public LgTv add(){
		return lt1;
	}
	public static LgTv getInstance(){
		return lt1;
	}
}
class LgSamTv
{
	public static void main(String[] args) 
	{
		LgTv lt1 = new LgTv();
		LgTv lt2 = lt1.add();
		LgTv lt3 = lt1.add();
		System.out.println(lt1);

		//lt2=lt3=lt4 같은 메모리 주소 공유
		System.out.println(lt2);
		System.out.println(lt3);
		System.out.println(LgTv.getInstance());
	}
}
