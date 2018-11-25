import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import java.lang.*;

public class Graphique extends JComponent {

  private StockageJeu stock;
  private Assam assam;

  public Graphique(StockageJeu j, Assam a) {
    super();
    this.stock = j;
    this.assam = a;
  }

  @Override
  public void paintComponent(Graphics g){
    URL url = this.getClass().getResource("marrakgrille.png");
    Image plateau = new ImageIcon(url).getImage();
    g.drawImage(plateau,0, 0, this.getWidth(),this.getHeight(), null, this);

    for(int i=1; i<9;i++){
      g.drawLine(0, i*(this.getHeight()/9), this.getWidth(), i*(this.getHeight()/9));
      g.drawLine(i*(this.getWidth()/9), 0, i*(this.getWidth()/9), this.getHeight());
    }

    url = this.getClass().getResource("arabe1.png");
    Image arabe = new ImageIcon(url).getImage();
    g.drawImage(arabe,assam.getXPion()*(this.getWidth()/9), assam.getYPion()*(this.getHeight()/9), this.getWidth()/9,this.getHeight()/9, null, this);

  }
}
