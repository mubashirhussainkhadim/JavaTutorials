public class Logical {
   public static void main(String[] args) {
	   
	   boolean a = false;
	   boolean b = false;
	   boolean c = true;
     
     // AND OPERATOR
     System.out.println("for Logical And......");
	   if (a && b && c) {
		   System.out.println("y");
	   } else {
		   System.out.println("N");
	   }
     // OR OPERATOR
       System.out.println("for Logical Or......");
	   
        if (a || b || c) {
		   System.out.println("y");
	   } else {
		   System.out.println("N");
	   }
	   // NOT OPERATOR
        System.out.println("for Logical Not......");
 	   
        System.out.print("Note A is:");
        System.out.println(!a);
        System.out.print("Note B is:");
        System.out.println(!b);

	   
   }
}
