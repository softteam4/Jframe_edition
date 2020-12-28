import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Card extends JPanel {
    Card(){
        title = new JTextField(20);
        removeButton = new JButton("削除");
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        this.add(removeButton);
        this.add(title);
    }

    JTextField title;
    JButton removeButton;
    //JTextArea memo;
    //DeleteButton deleteButton ?
}
