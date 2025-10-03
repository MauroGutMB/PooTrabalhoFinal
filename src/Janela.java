import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;


/**
 * Janela
 */
public class Janela {

  private JFrame janela;
  // private ArrayList<JLabel> conteudos;


  Janela(){

    janela = new JFrame("LUCK");

    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    janela.setSize(1024, 720);
    janela.setLocationRelativeTo(null);
    janela.setLayout(new BorderLayout());

    JLabel testLabel = new JLabel("ITS RUNNING!", JLabel.CENTER);
    janela.add(testLabel, BorderLayout.CENTER);

  }

  public void exibir(){
    janela.setVisible(true);
  }

}
