
public class Singleton {
	
	   private Singleton() {}

       private static Singleton instancia = null;

       public static Singleton getInstance() {

	      if (instancia == null) {
	    	  
            System.out.println("instancia criada....");
	        instancia = new Singleton(); 

	      }

	      return instancia;

	   }




	}


