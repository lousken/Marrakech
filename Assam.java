public class Assam{

	/**
	*	Position en X de Assam entre 1 et 7
	*/
	private static int posXPion;

	/**
	*	Direction de Assam
	*	1 = gauche
	*	2 = droite
	*	3 = haut
	*	4 = bas
	*	0 = aucune
	*/
	private static int direction;

	/**
	*	Position Y de Assam entre 1 et 7
	*/
	private static int posYPion;

	/**
	*	Constructeur
	*/
	public Assam(){
		posXPion = 4;
		posYPion = 4;
		direction = 0;
	}


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

		if(posXPion > 7 || posXPion < 1){
			changement();
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

		if(posYPion > 7 || posYPion < 1){
			changement();
		}
	}

	/**
	*	Methode pour changer la position de Assam sur les bords
	*/
	private static void changement(){
		if(posYPion == 0){
			if(posXPion < 7){
				if(posXPion%2 == 1){
					posXPion++;
					//
				} else {
					posXPion--;
					//
				}
			} else {
				//
			}
			posYPion++;
		}
		else if(posYPion == 8){
			if(posXPion > 1){
				if(posXPion%2 == 0){
					posXPion++;
					//
				} else{
					posXPion--;
					//
				}
			} else {
				//
			}
			posYPion--;
		}
	}

	/**
	*	Methode pour obtenir pos X du pion
	*	@return posXPion
	*/
	public int getXPion(){
		return posXPion;
	}

	/**
	*	Methode pour obtenir pos Y du pion
	*	@return posYPion
	*/
	public int getYPion(){
		return posYPion;
	}
}