import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Card extends JPanel {
    Card(){
        this.setLayout(new BorderLayout());
        deadline = new Module_deadline();
        main_panel = new JPanel();

        title = new JTextField(20);
        removeButton = new JButton("削除");

        title_label = new JLabel();
        title_label.setVisible(false);

        defineButton = new JButton("確定");
        editButton = new JButton("編集");
        editButton.setVisible(false);



        removeButton.addActionListener(new ActionListener() {
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

        main_panel.add(removeButton);
        main_panel.add(defineButton);
        main_panel.add(editButton);
        main_panel.add(title);
        main_panel.add(title_label);
        this.add(main_panel, BorderLayout.CENTER);
        this.add(deadline, BorderLayout.SOUTH);
    }

    JTextField title;
    JLabel title_label;

    JButton removeButton;
    //JButton completeButton; 完了ボタン（仮）
    JButton editButton;
    JButton defineButton;

    JPanel main_panel;
    Module_deadline deadline;

    void modeChange(String mode){
        switch(mode){
            case "clickEdit":
                defineButton.setVisible(true);
                editButton.setVisible(false);
                title.setVisible(true);
                title_label.setVisible(false);
                break;

            case "clickDefine":
                defineButton.setVisible(false);
                editButton.setVisible(true);
                title.setVisible(false);
                title_label.setVisible(true);
                title_label.setText(title.getText());
                break;
        }
    }
}
