import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BaseFrame extends JFrame {
  public BaseFrame(String title) {
    super(title);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    try {		
      UIManager.setLookAndFeel(
        "com.sun.java.swing.plaf.motif.MotifLookAndFeel");
      SwingUtilities.updateComponentTreeUI(this);
    } catch (Exception e) {
    }

  }
  public static void main(String args [] ) {
    BaseFrame myFrame = new BaseFrame("AI Fake Doll");
      myFrame.setSize(500, 300);
      myFrame.setVisible(true);
  }
}