import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")

public class Q8_Calculator extends JFrame implements ActionListener {
  static JFrame f;

  static JTextField l;

  String s0, s1, s2;

  Q8_Calculator() {
    s0 = s1 = s2 = "";
  }

  public static void main(String[] args) {
    f = new JFrame("Calculator");
    f.setLayout(new CardLayout());

    Q8_Calculator c = new Q8_Calculator();
    l = new JTextField(10);
    l.setEditable(false);

    JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bd, bm, be, beq, beq1;

    b0 = new JButton("0");
    b1 = new JButton("1");
    b2 = new JButton("2");
    b3 = new JButton("3");
    b4 = new JButton("4");
    b5 = new JButton("5");
    b6 = new JButton("6");
    b7 = new JButton("7");
    b8 = new JButton("8");
    b9 = new JButton("9");

    beq1 = new JButton("=");

    ba = new JButton("+");
    bs = new JButton("-");
    bd = new JButton("/");
    bm = new JButton("*");
    beq = new JButton("C");

    be = new JButton(".");

    JPanel p = new JPanel();

    bm.addActionListener(c);
    bd.addActionListener(c);
    bs.addActionListener(c);
    ba.addActionListener(c);
    b9.addActionListener(c);
    b8.addActionListener(c);
    b7.addActionListener(c);
    b6.addActionListener(c);
    b5.addActionListener(c);
    b4.addActionListener(c);
    b3.addActionListener(c);
    b2.addActionListener(c);
    b1.addActionListener(c);
    b0.addActionListener(c);
    beq.addActionListener(c);
    beq1.addActionListener(c);

    p.add(l);
    p.add(ba);
    p.add(b1);
    p.add(b2);
    p.add(b3);
    p.add(bs);
    p.add(b4);
    p.add(b5);
    p.add(b6);
    p.add(bm);
    p.add(b7);
    p.add(b8);
    p.add(b9);
    p.add(b0);
    p.add(beq);
    p.add(beq1);

    p.setBackground(Color.blue);
    f.add(p);

    f.setSize(200, 220);
    f.setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    String s = e.getActionCommand();

    if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
      if (!s1.equals("")) {
        s2 = s2 + s;
      } else {
        s0 = s0 + s;
      }
      l.setText(s0 + s1 + s2);
    } else if (s.charAt(0) == 'C') {
      s0 = s1 = s2 = "";
      l.setText(s0 + s1 + s2);
    } else if (s.charAt(0) == '=') {
      double result;
      if (!s1.equals("") && !s2.equals("")) {
        double operand1 = Double.parseDouble(s0);
        double operand2 = Double.parseDouble(s2);
        switch (s1) {
          case "+":
            result = operand1 + operand2;
            break;
          case "-":
            result = operand1 - operand2;
            break;
          case "/":
            if (operand2 != 0) {
              result = operand1 / operand2;
            } else {
              l.setText("Error: Division by zero");
              return; // Exit method without resetting values
            }
            break;
          case "*":
            result = operand1 * operand2;
            break;
          default:
            return; // Invalid operator
        }
        s0 = Double.toString(result);
        s1 = s2 = "";
        l.setText(s0);
      }
    } else {
      if (!s0.equals("") && !s2.equals("")) {
        double operand1 = Double.parseDouble(s0);
        double operand2 = Double.parseDouble(s2);
        double result;
        switch (s1) {
          case "+":
            result = operand1 + operand2;
            break;
          case "-":
            result = operand1 - operand2;
            break;
          case "/":
            if (operand2 != 0) {
              result = operand1 / operand2;
            } else {
              l.setText("Error: Division by zero");
              return; // Exit method without resetting values
            }
            break;
          case "*":
            result = operand1 * operand2;
            break;
          default:
            return; // Invalid operator
        }
        s0 = Double.toString(result);
        s1 = s;
        s2 = "";
        l.setText(s0 + s1);
      } else {
        s1 = s;
        l.setText(s0 + s1);
      }
    }
  }

}
