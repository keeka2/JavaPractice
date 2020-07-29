class Tv
{
	int channel;
	int vol;
	boolean power;
	public void channelUp(){}
}

class LgTv extends Tv
{	
	//...
	String name;
	public void channelUp(){
		channel++;
	}
}

class SamsungTv extends Tv
{
	//...
	String color;
	public void channelUp(){
		channel+=3;
	}
}

class Inherit 
{
	public static void main(String[] args) 
	{
		System.out.println(args[1]);


	}
}
