public class Assam{

	/**
	*	Position en X de Assam entre 1 et 7
	*/
	private static int posXPion;

	/**
	*	Position e Y de Assam entre 1 et 7
	*/
	private static int posYPion;


	/**
	*	Methode pour deplacer en X le pion
	*	@param b 	true on incremente de 1 posXPion
	*				false on decremente de 1 posXPion
	*/
	public static void changePosXPion(boolean b){
		if(b){
			posXPion++;
		} else {
			posXPion--;
		}

	}

	/**
	*	Methode pour deplacer en Y le pion
	*	@param b 	true on incremente de 1 posYPion
	*				false on le decremente
	*/
	public static void changePosYPion(boolean b){
		if(b){
			posYPion++;
		} else {
			posYPion--;
		}
	}
}