import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.awt.event.ActionListener;

public class TodoList extends JPanel {
    TodoList(){
        this.setLayout(new BorderLayout());

        //タイトルパネル　：タイトル　＋：
        titlePanel = new JPanel();
        listTitle = "タイトル";
        listTitleLabel = new JLabel(listTitle);
        addButton = new JButton("+");
        addButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                pushAdd(cardList);
            }
        });

        //カードについて
        cardArea = new JPanel();
        cardList = new ArrayList<>();




        //パネルに追加
        titlePanel.add(listTitleLabel);
        titlePanel.add(addButton);
        this.add(titlePanel,BorderLayout.NORTH);
        this.add(cardArea,BorderLayout.CENTER);

    }

    String listTitle;
    ArrayList<Card> cardList;
    JLabel listTitleLabel;
    JButton addButton;
    JPanel titlePanel;
    JPanel cardArea;


    void pushAdd(ArrayList<Card> cardList){
        Card cardPanel = new Card();
        cardArea.add(cardPanel);
        cardArea.updateUI();
        cardList.add(0,cardPanel);
    }



}