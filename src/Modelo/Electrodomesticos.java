package Modelo;

import java.util.Arrays;

public class Electrodomesticos {
	/**
	 *                              SUPER CLASE
	*/
	/**
	@author
	*Michael Jamett L.
	*/
	/**
	 * ******************************************************************************
	 *                               ATRIBUTOS
	 */
	private double preciobase1;
	private String color1;
	private char consumoenergetico1;
	private float peso1;
	private double precio;
	private char consumo;
	/**
	 * ************************************************************************  
	 *                           VALORES POR DEFECTO
	 *                            VARIABLES FIJAS//
	*/             
	static final double preciobase = (float) 100.000;
	static final String color = "blanco";
	static final char consumoenergetico = 'F' ;
	static final float peso = 5; 
	/**
	 * @param Color del electrodomestico.
	 * 
	 * 
	blanco,
	negro, 
	rojo,
	azul 
	gris
	 */
	public void setColor(String color) {
        String colores[] = {"blanco", "negro", "rojo", "azul", "gris"};

        if ( Arrays.asList(colores).contains(color.toLowerCase()) ){
            this.color1 = color.toUpperCase();
        } else {
            this.color1 = "BLANCO";
        }
    }
	/******************************************************************************
	 *                               CONSTRUCTOR POR DEFECTO
	 */
	public Electrodomesticos() {
		super();
	}
	/******************************************************************************
	 *                               CONSTRUCTOR PRECIO PESO
	 */
	public Electrodomesticos(double preciobase, float peso) {
		super();
		this.preciobase1 = preciobase;
		this.peso1 = peso;
	}
	/**
	 * **************************************************************************++++
	 *                                 CONSTRUCTOR TODOS
	 */
	public Electrodomesticos(double preciobase, String color,
		char consumoenergetico, float peso) {
		super();
		this.preciobase1 = preciobase;
		this.color1 = color;
		this.consumoenergetico1 = consumoenergetico;
		this.peso1 = peso;
	}
	/**
	 * **************************************************************************
	 *                                 GET TODOS
	 */
	public double getPreciobase() {
		return preciobase1;
	}
	public String getColor() {
		return color1;
	}
	public char getConsumoenergetico() {
		return consumoenergetico1;
	}
	public float getPeso() {
		return peso1;
	}
	/**                          
	 * ************************************************************************* 
	 *                              METODOS
	    ***********************************************************************
	     METODO    comprobarConsumoEnergetico(char letra):   
	 */
	public void ComprobarConsumoEnergetico(char letra) {
		boolean ext = false;
		switch(letra) {
			case 'A':
				ext = true;
				this.precio = 100.00;
			break;
			case 'B':
				ext = true;
				this.precio = 80.00;
			break;
			case 'C':
				ext = true;
				this.precio = 60.00;
			break;
			case 'D':
				ext= true;
				this.precio = 50.00;
			break;
			case 'E':
				ext = true;
				this.precio = 30.00;
			break;
			case 'F':
				ext = true;
				this.precio = 10.00;
			break;
		}
		
		if(ext) {
			this.consumo = letra;
		}
	}
	/**
	    ***********************************************************************
	    METODO         comprobarColor(String color):
	*/
	public void comprobarColor(String color) {
		if(color == "BLANCO" || color == "NEGRO"
			|| color == "ROJO" || color == "AZUL"
			|| color == "GRIS") {
			Electrodomesticos.color1 = "color";
		} else {
			Electrodomesticos.color1 = "Blanco";
		}		
	}
	/**
       **********************************************************************
	    METODO         precioFinal()
	    variable tx=1;
	*/
	public int PrecioFinal() {
	            int tx= 0; 
		if (consumoenergetico1 == 'A') {
			tx += 100;
		    } else if (consumoenergetico1 =='B') {
			tx += 80;
		    } else if (consumoenergetico1 == 'C') {
			tx += 60;
		    } else if (consumoenergetico1 == 'D') {
			tx += 50;
		    } else if (consumoenergetico1 == 'E') {
			tx += 30;
		    } else
			tx += 10;
		if(peso1 >= 0 && peso1 <= 19) {
			tx += 10;
		    } else if (peso1 == 20 && peso1 <= 49) {
			tx +=50;
		    }else if (peso1 == 50 && peso1 <=79) {
			tx += 80;
	    	}else if (peso1 > 79) {
			tx += 100;
		    }
	  	    return (int) (preciobase1 + tx) ;	
	  	    
	  	    
	  	
	  	    
	  	    
	  	        
	}	
}
