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
        removeCB = new JCheckBox();

        title_label = new JLabel();
        title_label.setVisible(false);

        defineButton = new JButton("確定");
        editButton = new JButton("編集");
        editButton.setVisible(false);



        removeCB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
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

        //main_panel.add(removeButton);
        main_panel.add(removeCB);
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

    JButton removeButton;
    JCheckBox removeCB;
    //JButton completeButton; 完了ボタン（仮）
    JButton editButton;
    JButton defineButton;

    JPanel main_panel;
    Module_deadline additional_module;
    JPanel change_panel;

    void modeChange(String mode){
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
                additional_module.month_label.setVisible(false);
                additional_module.day_label.setVisible(false);
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
                additional_module.month_label.setVisible(true);
                additional_module.day_label.setVisible(true);
                additional_module.month_label.setText(String.valueOf(additional_module.month.getSelectedItem()));
                additional_module.day_label.setText(String.valueOf(additional_module.day.getSelectedItem()));
                break;
        }
    }
}
