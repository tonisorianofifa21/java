package entornos;

//Cuenta las veces que se repite el número más alto

public class Y{ 
	
	
	/**
	 * Punto de entrada del programa
	 * recorre el array de números para sacar el más mayor
	 * cuenta las veces que se repite
	 */
	

  

    public static void main(String[] args) { 

  

        int[] d = {4, 7, 2, 9, 2, 5}; //Representan las notas

        int e = 0; //Cuenta las veces que se repite la nota más alta

        int f = d[0]; //Guarda la nota más alta

  
        /*Recorre el array y guarda el número más alto*/
        for (int i = 1; i < d.length; i++) { 

            if (d[i] > f) { 

                f = d[i]; 

            } 

        } 

  
        /*Recorre el array en busca de las veces que se repite la nota más alta*/
        for (int i = 0; i < d.length; i++) { 

            if (d[i] == f) { 

                e++; 

            } 

        } 

  

        System.out.println(f + ":" + e); 

    } 

} 