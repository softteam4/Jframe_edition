import javax.swing.*;
import java.awt.*;

public class Module_deadline extends JPanel {
    Module_deadline(){
        month = new JComboBox(month_data);
        day = new JComboBox(day_data);
        memo = new JTextField(15);

        this.add(memo);
        this.add(month);
        this.add(new JLabel("月"));
        this.add(day);
        this.add(new JLabel("日"));
    }


    JTextField memo;
    JComboBox month;
    JComboBox day;
    String[] month_data = {"1","2","3","4","5","6","7","8","9","10","11","12"};
    String[] day_data ={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
}
