import java.util.*;

public class ArrayListExample {
   public static void main(String args[]) {
      /* Creating ArrayList of type "String" which means
       * we can only add "String" elements
       */
      ArrayList<String> names = new ArrayList<String>();

      /*This is how we add elements to an ArrayList*/
      names.add("Jean");
      names.add("Claude");
      names.add("Van");
      names.add("Damme");
      names.add("Montoya");

      // Displaying elements
      System.out.println("Original ArrayList:");
      for(String str:names)
         System.out.println(str);

      /* Add element at the given index
       * names.add(0, "Juan") - Adding element "Juan" at first position
       * names.add(1, "Pablo") - Adding element "Pablo" at second position
       */
      names.add(0, "Juan");
      names.add(1, "Pablo");

      // Displaying elements
      System.out.println("ArrayList after add operation:");
      for(String str:names)
         System.out.println(str);


	  //sorting
	  Collections.sort(names);

      for (String str : names) {
         System.out.println(str);
      }

      //Remove elements from ArrayList like this
      names.remove("Van"); //Removes "Van" from ArrayList
      names.remove("Damme"); //Removes "Damme" from ArrayList

      // Displaying elements
      System.out.println("ArrayList after remove operation:");
      for(String str:names)
         System.out.println(str);

      //Remove element from the specified index
      names.remove(1); //Removes Second element from the List

      // Displaying elements
      System.out.println("Final ArrayList:");
      for(String str:names)
         System.out.println(str);
   }
}