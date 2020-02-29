package Modelo;

public class Lavadora extends Electrodomesticos{
	/**
	@author
	*Michael Jamett L.
	*/
	/**
	 * ************************************************************************  
	 *                           VALORES POR DEFECTO
	 *                            VARIABLES FIJAS//
	*/
	static int carga = 5;
	/**
	 * ***************************************************************************
	 *                                CONSTRUCTOR POR DEFECTO
	 */
	public Lavadora() {
		super();
	}
	/**
	 * ******************************************************************************
	 *                                      CONSTRUCTOR 
	 */
	public Lavadora(int preciobase,String color,String consumoenergetico,
		int peso,int carga) {
		super();
		this.carga=carga;
	}
	/**
	 * *****************************************************************************
	 *                                      CONSTRUCTOR PRECIO PESO
	 */
	public Lavadora(int preciobase,int peso) {
		super(preciobase,peso);
	}
	/**
	 * *****************************************************************************
	 *                                      CONSTRUCTOR CARGA
	 */
	public Lavadora(int carga) {
		super();
		Lavadora.carga = carga;
	}
	/**
	 * *****************************************************************************
	 *                              CONSTRUCTOR CLASE PADRE
	 * @return 
	 */
	
		
	
	
	/**
	 * *****************************************************************************
	 *                                METODO GET CARGA
	 * @return 
	 */
	public int getCarga() {
		return carga;
	}
	/**
	 * ****************************************************************************
	 *                                    METODO PRECIO FINAL
	 */
	public int PrecioFinal() {
		int resolucion = 0;
		boolean sintonizadorTdt = false;
		int tx=super.PrecioFinal();
		
		if(resolucion>40) {
			tx+=preciobase*0.3;
		}
		if (sintonizadorTdt) {
			tx+=50;
		}
		return tx;
	}

}
