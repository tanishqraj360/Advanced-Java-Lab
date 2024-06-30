import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class solve extends JFrame implements ListSelectionListener {
  static JFrame f;
  static JList b, b1, b2;
  static JLabel l1;

  public static void main(String[] args) {
    f = new JFrame("frame");
    solve s = new solve();
    JPanel p = new JPanel();
    JLabel l = new JLabel("select your birthday");
    l1 = new JLabel();
    String month[] = { "January", "February", "March",
        "April", "May", "June", "July", "August",
        "September", "October", "November", "December" };
    String date[] = new String[31], year[] = new String[31];
    // add month number and year to list
    for (int i = 0; i < 31; i++) {
      date[i] = "" + (int) (i + 1);
      year[i] = "" + (int) (2018 - i);
    }
    b = new JList(date);
    b1 = new JList(month);
    b2 = new JList(year);

    // set a selected index
    b.setSelectedIndex(3);
    b1.setSelectedIndex(2);
    b2.setSelectedIndex(2);
    l1.setText(b.getSelectedValue() + "" + b1.getSelectedValue()
        + " " + b2.getSelectedValue());
    // add item listener
    b.addListSelectionListener(s);
    b1.addListSelectionListener(s);
    b2.addListSelectionListener(s);
    // add list to panel
    p.add(l);
    p.add(b);
    p.add(b1);
    p.add(b2);
    p.add(l1);
    f.add(p);
    // set the size of frame
    f.setSize(500, 600);
    f.setVisible(true);
  }

  public void valueChanged(ListSelectionEvent e) {
    // set the text of the label to the selected value of lists
    l1.setText(b.getSelectedValue() + " " + b1.getSelectedValue()
        + " " + b2.getSelectedValue());
  }
}
