class CellPhone {
	String model;
	String number;
	int chord;
	public void setNumber(String n){
		number = n;
	}
	public String getModel(){
 		return model;
	}
	public int getChord(){
		return chord;
	}
	public String getNumber(){
		return number;
	}
}
class MP3Phone extends CellPhone{
	int size;
	public MP3Phone(String model,String num, int chord, int size){
		this.model = model;
		number = num;
		this.chord = chord;
		this.size = size;
	}
}

class D_caPhone extends CellPhone{
	String pixel;
	public D_caPhone(String model,String num, int chord, String pixel){
		this.model = model;
		number = num;
		this.chord = chord;
		this.pixel = pixel;
	}
}
class CellPhoneTest {
	public static void main(String[] args){
		D_caPhone dca = new D_caPhone("IN-7600","011-9XXX-9XXXX",60,"400¸¸");
		MP3Phone mp = new MP3Phone("KN-600","011-9XXX-9XXXX",60,256);
		System.out.println(dca.getModel()+","+dca.getChord()+","+dca.getNumber());
		System.out.println(mp.getModel()+","+mp.getChord()+","+mp.getNumber());
	}
}