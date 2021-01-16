import javax.swing.*;
import java.awt.*;

public class Module_deadline extends JPanel {
    Module_deadline(){
        month = new JComboBox(month_data);
        day = new JComboBox(day_data);
        memo = new JTextField(15);

        memo_label = new JLabel();
        memo_label.setVisible(false);

        month_label = new JLabel();
        month_label.setVisible(false);
        day_label = new JLabel();
        day_label.setVisible(false);

        this.add(memo);
        this.add(memo_label);
        this.add(month);
        this.add(month_label);
        this.add(new JLabel("月"));
        this.add(day);
        this.add(day_label);
        this.add(new JLabel("日"));
    }


    JTextField memo;
    JLabel memo_label;

    JComboBox month;
    JComboBox day;
    JLabel month_label;
    JLabel day_label;

    String[] month_data = {"1","2","3","4","5","6","7","8","9","10","11","12"};
    String[] day_data ={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
}
