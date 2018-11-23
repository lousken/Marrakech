public class Test {
    public static void main(String[] args){
		StockageJeu jeu = StockageJeu.initialize();
		for(int i = 0; i < 7; i++){
			for (int j = 0; j < 7; j++){
				System.out.print(jeu.cases[i][j].getCouleurTapis());
			}
			System.out.print("\n");
		}
    }
}