package Nivell1Fase2;

public class NewMain {

    public static void main(String[] args) {
        
        //Excepció
        try {
            
            //Declaració de variables 
            int[] potenciasCoet = {10,30,80};
            int[] potenciasCoet2 = {30, 40, 50, 50, 30, 10};
	    
            //Instanciació de clase Coets
            Coets coet = new Coets("32WESSDS", 3, potenciasCoet);
            Coets coet2 = new Coets("LDSFJA32", 6, potenciasCoet2);
            
            //Sortida de dades per consola
            System.out.println(coet.toString());
            System.out.println();
            System.out.println(coet2.toString());
            
        } catch (Exception e) {
            
            e.printStackTrace();
	
        }
        
    }

}
    

