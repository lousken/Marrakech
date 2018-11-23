/**
*Classe Joueur sert a contenir les informations sur les différents joueurs de la partie
*@author Groupe Ranto
*/
public class Joueur{

  /**
  *Numero du joueur
  */
  private int numJoueur;

  /**
  *L'argent que possède le joueurs
  */
  private int monnaie;

  /**
  *Le nombre de tapis restants
  */
  private int tapisRest;

  /**
  *Le constructeur fait correspondre les variables au dessus
  *@param numJoueur
  *@param monnaie
  *@param tapisRest
  */
  public Joueur(int n, int m, int t){
    this.numJoueur=n;
    this.monnaie=m;
    this.tapisRest=t;
  }

  /**
  *Accesseur en lecture de numJoueur
  *@return numJoueur
  */
  public int getNumJoueur(){
    return this.numJoueur;
  }

  /**
  *Accesseur en ecriture de numJoueur
  *@param numJoueur
  */
  public void setNumJoueur(int n){
    this.numJoueur = n;
  }

  /**
  *Accesseur en lecture de monnaie
  *@return monnaie
  */
  public int getMonnaie(){
    return this.monnaie;
  }

  /**
  *Accesseur en ecriture de monnaie
  *@param monnaie
  */
  public void setMonnaie(int m){
    this.monnaie = m;
  }

  /**
  *Accesseur en lecture de tapisRest
  *@return tapisRest
  */
  public int getTapisRest(){
    return this.tapisRest;
  }

  /**
  *Accesseur en ecriture de tapisRest
  *@param tapisRest
  */
  public void setTapisRest(int t){
   this.tapisRest = t;
  }

}
