import javax.swing.*;
import java.awt.*;

public class Module_deadline extends JPanel {
    Module_deadline(){
        month = new JComboBox(month_data);
        day = new JComboBox(day_data);
        memo = new JTextField(15);

        memo_label = new JLabel();
        memo_label.setVisible(false);

        date_label = new JLabel();
        date_label.setVisible(false);

        this.add(memo);
        this.add(memo_label);
        this.add(month);
        //this.add(month_label);
        this.add(gatsu);
        this.add(day);
        this.add(date_label);
        //this.add(day_label);
        this.add(nichi);
    }


    JTextField memo;
    JLabel memo_label;

    JLabel gatsu = new JLabel("月");
    JLabel nichi = new JLabel("日");
    JComboBox month;
    JComboBox day;
    JLabel date_label;

    String[] month_data = {"1","2","3","4","5","6","7","8","9","10","11","12"};
    String[] day_data ={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
}
