import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.awt.event.ActionListener;

public class TodoList extends JPanel {
    TodoList(){
        this.setLayout(new BorderLayout());

        //タイトルパネル　：タイトル　＋ 削除：
        titlePanel = new JPanel();
        listTitleLabel = new JLabel();
        addButton = new JButton("+");
        addButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                pushAdd(cardList);
            }
        });
        deleteButton = new JButton("削除");
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pushDelete();
            }
        });

        //タイトルについて
        listTitleLabel.setFont(new Font("Alien",Font.PLAIN, 36));


        //カードについて
        cardArea = new JPanel();
        cardArea.setLayout(new AfYLayout());

        cardList = new ArrayList<>();


        //パネルに追加
        titlePanel.add(listTitleLabel);
        titlePanel.add(addButton);
        titlePanel.add(deleteButton);
        this.add(titlePanel,BorderLayout.NORTH);
        this.add(cardArea,BorderLayout.CENTER);

        Dimension size = cardArea.getPreferredSize();
        if(size == null)
            size = new Dimension(0,0);
        size.width = 50;
        cardArea.setPreferredSize(size);

    }


    ArrayList<Card> cardList;
    JLabel listTitleLabel;

    JButton addButton;
    JButton deleteButton;

    JPanel titlePanel;
    JPanel cardArea;


    void pushAdd(ArrayList<Card> cardList){
        Card cardPanel = new Card();
        cardArea.add(cardPanel, "50px");
        cardArea.updateUI();
        cardList.add(0,cardPanel);
    }

    void pushDelete(){
        for(Card card : cardList){
            if(card.checkBox.isSelected()){
                card.setVisible(false);
                //cardList.remove(card);
            }
        }
    }



}