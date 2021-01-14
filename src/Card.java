import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Card extends JPanel {
    Card(){
        this.setLayout(new BorderLayout());
        deadline = new JPanel();
        main_panel = new JPanel();

        title = new JTextField(20);
        removeButton = new JButton("削除");

        month = new JComboBox(month_data);
        day = new JComboBox(day_data);

        deadline.add(month);
        deadline.add(new JLabel("月"));
        deadline.add(day);
        deadline.add(new JLabel("日"));

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        main_panel.add(removeButton);
        main_panel.add(title);
        this.add(main_panel, BorderLayout.CENTER);
        this.add(deadline, BorderLayout.SOUTH);
        //this.getContentPane().add(sp);
    }

    JTextField title;
    JButton removeButton;

    JComboBox month;
    JComboBox day;
    JPanel main_panel;
    JPanel deadline;
    String[] month_data = {"1","2","3","4","5","6","7","8","9","10","11","12"};
    String[] day_data ={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};

    JScrollPane sp = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    //JTextArea memo;
    //DeleteButton deleteButton ?
}
