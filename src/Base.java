import javax.swing.*;
import java.awt.Container;//ボタン
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;//色
import java.awt.Dimension;//長さ
import javax.swing.border.LineBorder;//枠線
import java.awt.Font;//フォント
import java.awt.Insets;//ボタン余白の変更
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;


public class Base extends JFrame{
    public static void main(String args[]){
        Base frame = new Base("Todo");
        frame.setVisible(true);
    }


    Base(String title) {
        listList = new ArrayList<TodoTitle>(); //TodoListのリスト

        setTitle(title);
        setBounds(100, 100, 1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        //メニューバー
        menuPanel = new JPanel(new BorderLayout());
        menuPanel.setBackground(Color.GRAY);
        menuPanel.setPreferredSize(new Dimension(300, 200));

        //タイトル
        menuLabel = new JLabel("マイリスト");
        menuLabel.setFont(new Font("MS ゴシック", Font.PLAIN, 24));
        menuLabel.setForeground(Color.BLACK);
        menuPanel.add(menuLabel, BorderLayout.NORTH);

        //タイトル追加ボタン
        folderButton = new JButton("リスト作成");
        folderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addTitle(listList,getContentPane());
            }
        });

        //リスト削除
        removeBotton = new JButton("リスト削除");
        removeBotton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pushDelete();
            }
        });

        //テキストボックス用のパネル
        listArea = new JPanel();
        listArea.setBackground(Color.GRAY);

        //パネルに追加
        bottonPanel = new JPanel();
        menuPanel.add(bottonPanel,BorderLayout.SOUTH);
        menuPanel.add(listArea,BorderLayout.CENTER);
        bottonPanel.add(folderButton);
        bottonPanel.add(removeBotton);


        //追加
        Container contentPane = getContentPane();
        contentPane.add(menuPanel,BorderLayout.LINE_START);
    }


    ArrayList<TodoTitle> listList;
    JPanel menuPanel;
    JLabel menuLabel;
    JButton folderButton;
    //JTextField baseTitle;
    JPanel listArea;
    JButton removeBotton;
    JPanel bottonPanel;


    void addTitle(ArrayList<TodoTitle> list,Container content){
        TodoList todolist = new TodoList();
        TodoTitle todotitle = new TodoTitle(todolist,this);
        listArea.add(todotitle);
        listArea.updateUI();
        list.add(0,todotitle);
        content.add(todolist,BorderLayout.CENTER);
        switchList(todotitle);

    }
    void pushDelete(){
        for(TodoTitle todotitle:listList){
            if(todotitle.checkBox.isSelected()){
                todotitle.setVisible(false);
                todotitle.todolist.setVisible(false);
                //cardList.remove(card);
            }
        }
    }

    void switchList(TodoTitle todotitle){
        for(TodoTitle card:listList){
            if(card==todotitle){
                todotitle.todolist.setVisible(true);
                todotitle.setBackground(Color.cyan);
                todotitle.main_panel.setBackground(Color.cyan);
                todotitle.change_panel.setBackground(Color.cyan);
            }
            else{
                card.todolist.setVisible(false);
                card.setBackground(Color.gray);
                card.main_panel.setBackground(Color.gray);
                card.change_panel.setBackground(Color.gray);
            }
        }
    }

}


