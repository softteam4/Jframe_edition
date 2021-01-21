import javax.swing.*;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class TodoTitle extends JPanel {
    TodoTitle(TodoList todolist,Base base) {
        this.todolist = todolist;
        this.base = base;


        main_panel = new JPanel();
        change_panel = new JPanel();

        title = new JTextField(10);
        //removeButton = new JButton("削除");
        checkBox = new JCheckBox();

        title_label = new JLabel();
        title_label.setVisible(false);

        defineButton = new JButton("確定");
        editButton = new JButton("編集");
        editButton.setVisible(false);


        defineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modeChange("clickDefine");
                todolist.listTitleLabel.setText(title_label.getText());
            }
        });

        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modeChange("clickEdit");
            }
        });
        it =this;

        title_label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                base.switchList(it);
            }
        });








        main_panel.add(checkBox);
        main_panel.add(title);
        main_panel.add(title_label);

        change_panel.add(defineButton);
        change_panel.add(editButton);

        this.add(main_panel);
        this.add(change_panel);

    }

    JTextField title;
    JLabel title_label;

    JCheckBox checkBox;
    JButton editButton;
    JButton defineButton;

    JPanel main_panel;
    JPanel change_panel;
    TodoList todolist;
    Base base;
    TodoTitle it;

    void modeChange(String mode) {
        switch (mode) {
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