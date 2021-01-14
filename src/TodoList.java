import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.awt.event.ActionListener;

public class TodoList extends JPanel {
    TodoList(){
    listTitle = "タイトル";
    cardList = new ArrayList<>();
    listTitleLabel = new JLabel(listTitle);
    addButton = new JButton("+");
    addButton.addActionListener(new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent e) {
                pushAdd(cardList);
            }
        });

    this.add(listTitleLabel);
    this.add(addButton);

    }
    String listTitle;
    ArrayList<Card> cardList;
    JLabel listTitleLabel;
    JButton addButton;

    void pushAdd(ArrayList<Card> cardList){
        Card cardPanel = new Card();
        this.add(cardPanel);
        this.updateUI();
        cardList.add(0,cardPanel);
    }



}

