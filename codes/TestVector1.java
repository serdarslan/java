import java.util.*;    
class TestVector1{    
 public static void main(String args[]){    
  Vector<String> v=new Vector<String>();//creating vector
  v.add("Ekin");        //method of Collection
  v.addElement("Deren");//method of Vector
  v.addElement("Serdar");

  Enumeration e=v.elements();
  while(e.hasMoreElements()){
   System.out.println(e.nextElement());
  }
 }    
}    
