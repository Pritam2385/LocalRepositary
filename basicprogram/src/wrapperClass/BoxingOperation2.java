package wrapperClass;
public class BoxingOperation2 {

	public static void main(String[] args) {
		
		char c1='A';
	
		Character charObj1=new Character(c1);// explicit 
		System.out.println(c1==charObj1);//
		Character charObj2=new Character('Z');//explicit
		
		Character charObj3='H';//implicit
		
		System.out.println("c1: "+c1);//A
		System.out.println("charObj1: "+charObj1);//A
		System.out.println("charObj2: "+charObj2);//Z
		System.out.println("charObj3: "+charObj3);//H
		
		boolean b=true;//implicit
		Boolean bObj=new Boolean(b);//explicit
		System.out.println(bObj==b);
	}
}
