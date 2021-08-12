package Nivell1Fase2;

import java.util.Arrays;

public class Coets {
    
    //Declaració de variables de clase
    private String idCodi;
    private int nombrePropulsors;
    private int[] potenciaPropulsors;
	
	//Constructor i inicialització de variables de clase
	public Coets(String idCodi, int nombrePropulsors, int[] potenciaPropulsors) throws Exception {
		
                this.idCodi = idCodi;
		this.nombrePropulsors = nombrePropulsors;
		this.potenciaPropulsors = potenciaPropulsors;
		
                //Excepcions de identificador de codi i potència de propulsors
		if(idCodi.length()!=8) throw new Exception("L´identificador de codi no té vuit caràcters!");
		if(potenciaPropulsors.length!=nombrePropulsors) throw new Exception("Cada propulsor té la seva potència màxima!");
		
	}

	public String getIdCodi() {//Getter
		return idCodi;
	}

        public void setIdCodi(String idCodi) {//Setter
		this.idCodi = idCodi;
	}

        public int getNombrePropulsors() {//Getter
		return nombrePropulsors;
	}

        public void setNombrePropulsors(int nombrePropulsors) {//Setter
		this.nombrePropulsors = nombrePropulsors;
	}

	public int[] getPotenciaPropulsors() {//Getter
		return potenciaPropulsors;
	}

        public void setPotenciaPropulsors(int[] potenciaPropulsors) {//Setter
		this.potenciaPropulsors = potenciaPropulsors;
	}

        @Override
	public String toString() {
		return "Rocket id=" + idCodi + "\nNombre de propulsors: " +
                        nombrePropulsors + "\nPotència màxima: " +
                        Arrays.toString(potenciaPropulsors);
	}

}
    

