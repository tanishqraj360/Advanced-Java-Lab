import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Q9_TableExample {

  public static void main(String[] args) {
    JFrame f = new JFrame("Table Example");

    String data[][] = {
        { "101", "Amit", "ISE", "4" },
        { "102", "Jai", "CSE", "2" },
        { "103", "Sachin", "MECH", "8" }
    };

    String column[] = { "Rollno", "SNAME", "BRANCH", "SEM" };

    JTable jt = new JTable(data, column);
    jt.setCellSelectionEnabled(true);
    ListSelectionModel select = jt.getSelectionModel();
    select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    select.addListSelectionListener(new ListSelectionListener() {
      public void valueChanged(ListSelectionEvent e) {
        String data = null;

        int row = jt.getSelectedRow();
        int column = jt.getSelectedColumn();

        if (row >= 0 && column >= 0) {
          data = (String) jt.getValueAt(row, column);
          System.out.println("Selected element: " + data);
        }
      }
    });

    f.add(jt);
    f.setSize(300, 200);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
