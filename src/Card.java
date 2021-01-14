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
    }

    JTextField title;
    JButton removeButton;

    JPanel main_panel;
    Module_deadline deadline;
    //JTextArea memo;
}
