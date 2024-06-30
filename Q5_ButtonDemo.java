import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Q5_ButtonDemo {
  JLabel jlab;

  Q5_ButtonDemo() {
    JFrame jfrm = new JFrame("An Event Example");
    jfrm.setLayout(new FlowLayout());
    jfrm.setSize(220, 90);
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JButton jbtnAlpha = new JButton("Alpha");
    JButton jbtnBeta = new JButton("Beta");

    jbtnAlpha.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        jlab.setText("Alpha was pressed.");
      }
    });

    jbtnBeta.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        jlab.setText("Beta was pressed.");
      }
    });

    jfrm.add(jbtnAlpha);
    jfrm.add(jbtnBeta);

    jlab = new JLabel("Press a button");
    jfrm.add(jlab);
    jfrm.setVisible(true);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        new Q5_ButtonDemo();
      }
    });
  }
}
