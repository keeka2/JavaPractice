class Parent {	
	String msg = "ParentŬ����";
	Parent(){}
	public String getMsg(){
		return msg;
	}}
class Child extends Parent{
	String msg = "ChildŬ����";
	public String getMsg(){
		return msg;
	}}
public class OverridingEx {
	public static void main(String[] args){
		Child cd = new Child();
		System.out.println("cd : "+cd.getMsg());
		Parent pt = new Parent();
		System.out.println("pt : "+pt.getMsg());
	}}