package Maps;
import  java.util.*;
 public class map1{
public static void main(String[]args){
HashMap m=new HashMap();
m.put("Mohanlal",700);
m.put("Vikram",800);
m.put("Surya",1000);
m.put("vijay",600);
System.out.println(m);//surya=1000 Vikram=800 Mohanlal=700   vijay=600
System.out.println(m.put("chirinjeevi",1000));
Set s=m.keySet();
System.out.println(s);//
Collection c=m.values();
System.out.println(c);
Set s1=m.entrySet();
Iterator its=s1.iterator();
while(its.hasNext());{
Map.Entry m1=(Map.Entry)its.next();
System.out.println(m1.getKey()+"    "+m1.getValue());
if(m1.getKey().equals("Vikram")){
m1.setValue(10000);
}
System.out.println(m);
}
}
}