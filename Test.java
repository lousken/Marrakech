//Ceci importe la classe Scanner du package java.util
import java.util.Scanner; 
//Ceci importe toutes les classes du package java.util
import java.util.*;

public class Test {
    public static void main(String[] args){
		StockageJeu jeu = StockageJeu.initialize(3);
		Assam pion = jeu.getAssam();
		while(true){
			for(int i = 0; i < 7; i++){
				for (int j = 0; j < 7; j++){

					if(pion.getXPion()-1 == j && pion.getYPion()-1 == i){
						System.out.print("A ");
					} else {
						System.out.print(jeu.cases[i][j].getCouleurTapis()+" ");
					}
					
					
				}
				System.out.print("\n");
			}
			

			while(true){
				Scanner sc = new Scanner(System.in);
				String tmp = sc.nextLine();
				if(tmp.equals("g")){
					pion.changePosXPion(false);
					break;
				} else if(tmp.equals("d")){
					pion.changePosXPion(true);
					break;
				} else if(tmp.equals("h")){
					pion.changePosYPion(false);
					break;
				} else if(tmp.equals("b")){
					pion.changePosYPion(true);
					break;

				} else {
					System.out.println("Tapez g, d, h, b");
				}

			}
			


		}
		
    }
}