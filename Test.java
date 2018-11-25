//Ceci importe la classe Scanner du package java.util
import java.util.Scanner;
//Ceci importe toutes les classes du package java.util
import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Test {
	public static void main(String[] args){
		StockageJeu jeu = StockageJeu.initialize(3);
		Assam pion = jeu.getAssam();
		Fenetre f = new Fenetre();
		Graphique G = new Graphique(jeu, pion);
		f.add(G);
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

			G.repaint();
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

class Fenetre extends JFrame{
	public Fenetre(){
		super();
		this.setSize(675,675);
		this.setLocation(0,0);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
