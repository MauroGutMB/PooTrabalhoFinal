import java.awt.*;
import javax.swing.*;

/**
 * App
 */
public class App {

  public static void main(String[] args) {
     
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run(){
        Janela janelaPrincipal = new Janela();
        janelaPrincipal.exibir();
      }

    });

  }

}
