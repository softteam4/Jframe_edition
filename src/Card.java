import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Card extends JPanel {
    Card(){
        additional_module = new Module_deadline();
        main_panel = new JPanel();
        change_panel = new JPanel();

        title = new JTextField(20);
        //removeButton = new JButton("削除");
        checkBox = new JCheckBox();

        title_label = new JLabel();
        title_label.setVisible(false);

        defineButton = new JButton("確定");
        editButton = new JButton("編集");
        editButton.setVisible(false);

        checkBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(checkBox.isSelected()){
                    if(title_label.isVisible()==false){
                        defineButton.doClick();
                    }
                    title_label.setForeground(Color.GRAY);
                    additional_module.date_label.setForeground(Color.GRAY);
                    additional_module.memo_label.setForeground(Color.GRAY);

                } else {
                    title_label.setForeground(Color.BLACK);
                    additional_module.date_label.setForeground(Color.BLACK);
                    additional_module.memo_label.setForeground(Color.BLACK);
                }
            }
        });

        defineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modeChange("clickDefine");
            }
        });

        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modeChange("clickEdit");
            }
        });

        main_panel.add(checkBox);
        main_panel.add(title);
        main_panel.add(title_label);

        change_panel.add(defineButton);
        change_panel.add(editButton);

        this.add(main_panel);
        this.add(additional_module);
        this.add(change_panel);
    }

    JTextField title;
    JLabel title_label;

    JCheckBox checkBox;
    JButton editButton;
    JButton defineButton;

    JPanel main_panel;
    Module_deadline additional_module;
    JPanel change_panel;

    void modeChange(String mode){
        String date_string = String.valueOf(additional_module.month.getSelectedItem())+additional_module.gatsu.getText()+ String.valueOf(additional_module.day.getSelectedItem()) +additional_module.nichi.getText();
        switch(mode){
            case "clickEdit":
                defineButton.setVisible(true);
                editButton.setVisible(false);

                title.setVisible(true);
                title_label.setVisible(false);

                additional_module.memo.setVisible(true);
                additional_module.memo_label.setVisible(false);

                additional_module.month.setVisible(true);
                additional_module.day.setVisible(true);
                additional_module.gatsu.setVisible(true);
                additional_module.nichi.setVisible(true);
                additional_module.date_label.setVisible(false);
                break;

            case "clickDefine":
                defineButton.setVisible(false);
                editButton.setVisible(true);

                title.setVisible(false);
                title_label.setVisible(true);
                title_label.setText(title.getText());

                additional_module.memo.setVisible(false);
                additional_module.memo_label.setVisible(true);
                additional_module.memo_label.setText(additional_module.memo.getText());

                additional_module.month.setVisible(false);
                additional_module.day.setVisible(false);
                additional_module.gatsu.setVisible(false);
                additional_module.nichi.setVisible(false);
                additional_module.date_label.setVisible(true);
                additional_module.date_label.setText(date_string);
                break;

        }
    }
}
