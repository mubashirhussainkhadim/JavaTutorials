
public class ArrayInJava {
    public static void main(String[] args){
        int [] marks = {98,45,56,67,45,67,34,677};
        // float [] marks = {98.5f, 93.7f, 98.2f , 80.0f, 99.9f, 49.9f};
          // String [] students = {"Harry","Rohan", "Mubashir", "Marzia" , "Fatima", "Muneeba"};

        // System.out.println(students.length);
        // System.out.println(students[2]);
    
        // System.out.println(marks.length);
        // System.out.println(marks[2]);
        System.out.println("Print array using loop");
      for (int i = 0 ;  i < marks.length; i++){
        System.out.println(marks[i]);
      }
      System.out.println("Print array using loop in reverse order");
      for(int i = marks.length -1; i>=0; i-- ){
        System.out.println(marks[i]);
      }
      System.out.println("Print array using for each loop ");
      for(int element: marks){
        System.out.println(element);
      }
}
}
