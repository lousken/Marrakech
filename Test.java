//Ceci importe la classe Scanner du package java.util
import java.util.Scanner;
//Ceci importe toutes les classes du package java.util
import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Test {


	private static StockageJeu jeu;
	private static Assam pion;


	public static void main(String[] args){
		jeu = StockageJeu.initialize(3);
		pion = jeu.getAssam();
		fonctionABen();
		

	}

	private static void fonctionABen(){
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

			jeu.cases[3][2].setCouleurTapis(1);


			String[] direction = {"G", "D", "H", "B"};
			System.out.println("Direction de assam: "+direction[pion.getDirection()-1]);
			int n = de();
			System.out.println("On lance le de, vous obtenez: "+ n+"\nChoisissez une direction sans faire demi tour!");

			while(true){
				int d;
				while(true){
					Scanner sc = new Scanner(System.in);
		 			String tmp = sc.nextLine();
		 			
					if(tmp.equals("g")){
						d=1;
						break;
					} else if(tmp.equals("d")){
						d=2;
						break;
					} else if(tmp.equals("h")){
						d=3;
						break;
					} else if(tmp.equals("b")){
						d=4;
						break;

					} else {
						System.out.println("Tapez g, d, h, b");
					}
				}

				if(pion.deplacerAssam(n, d)){
					System.out.println("\n\n");
					System.out.println("Assam est en pos " + pion.getXPion() + "  " + pion.getYPion());
					System.out.println("Assam est sur un tapis :" + jeu.cases[pion.getYPion()-1][pion.getXPion()-1].getCouleurTapis());
		 			
					break;
				} else {
					System.out.println("Vous ne pouvez pas choisir cette direction!");
				}

			}



			/*while(true){
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
			}*/
		}
	}

	private static void fonctionASo(){
		Fenetre f = new Fenetre();
		Graphique G = new Graphique(jeu);
		f.add(G);
		f.addKeyListener(new Clavier(jeu.getAssam(),G));
	}

	public static int de(){
    Random rand = new Random();
    int nombreR = rand.nextInt()%6;
    if(nombreR<0){
      nombreR = -nombreR;
    }
    nombreR ++;

    if(nombreR == 2 || nombreR == 3){
      nombreR = 2;
    }
    else if(nombreR == 4 || nombreR == 5){
      nombreR = 3;
    } else if(nombreR == 6){
      nombreR = 4;
    } else {
      nombreR = 1;
    }
    return nombreR;

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
