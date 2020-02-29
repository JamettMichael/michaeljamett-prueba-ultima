package Modelo;

public class Television extends Electrodomesticos {
	/**
	@author
	*Michael Jamett L.
	*/
	/********************************************************************************
	 * 
	 *                            ATRIBUTOS
	 * 
	 * 
	 */
	private double resolucion;
	private boolean sintonizador;
	/**
	ATRIBUTOS ERERADOS
	*/
	/**
	DEFECTO
	resolucion   20
	sintonizador  false
	/*
	/**
	 *                       CONSTRUCTOR POR DEFECTO
	 */
	public Television() {
		super();
	}
	/**
	 *                        CONSTRUCTOR PRECIO PESO
	 * @param sintonizador 
	 */
	public Television(double preciobase,float peso, boolean sintonizador) {
		super(preciobase, peso);
		this.resolucion = resolucion;
		this.sintonizador = sintonizador;
	}
	/**
	 *                     CONSTRUCTOR RESOLUCION SINTONIZADO                         
	 */
	public Television(double resolucion, boolean sintonizador) {
		super();
		this.resolucion = resolucion;
		this.sintonizador = sintonizador;
	}
	/**
	EL RESTO ERERADOS
	LLAMAR AL CONSREUCTO DE CLASWE  PADRE
	/*
	/**
	 * 
	 * 
	 * 
	 * ****************************************************************************************************
	 */
	 *                             METODO
	 *                     GET RESOLUCION Y SINTONISADORTDT                          
	 */                           
	public double getResolucion() {
		return resolucion;
	}
	public boolean isSintonizador() {
		return sintonizador;
	}
	/**
	 *                           METODO
	 *                        PRECIO FINAL
	 *                                
	 *            precioFinal(): si tiene una resolución mayor de 40 pulgadas, 
	 *            se incrementara el precio un 30% y si tiene un sintonizador 
	 *            TDT incorporado, aumentara 50 €. Recuerda que las condiciones 
	 *            que hemos visto en la clase Electrodoméstico también deben 
	 *            afectar al precio.                    
	 *                                                                                                                    
	 *                                
	 */ 
}





	
