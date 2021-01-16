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


    Base(String title){
        TodoList todolist =new TodoList();
        listList = new ArrayList<TodoList>(); //TodoListのリスト

        setTitle(title);
        setBounds(100, 100, 1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        //メニューバー
        menuPanel =new JPanel(new BorderLayout());
        menuPanel.setBackground(Color.GRAY);
        menuPanel.setPreferredSize(new Dimension(400, 200));

        //タイトル
        menuLabel = new JLabel("マイリスト");
        menuPanel.add(menuLabel,BorderLayout.NORTH);

        //タイトル追加ボタン
        folderButton = new JButton("リスト作成");
        folderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addTitle(listList);
            }
        });


        listArea = new JPanel();

        //パネルに追加
        menuPanel.add(folderButton,BorderLayout.SOUTH);
        menuPanel.add(listArea,BorderLayout.CENTER);

        //追加
        Container contentPane = getContentPane();
        contentPane.add(menuPanel,BorderLayout.LINE_START);
        contentPane.add(todolist,BorderLayout.CENTER);
    }


    ArrayList<TodoList> listList;
    JPanel menuPanel;
    JLabel menuLabel;
    JButton folderButton;
    JTextField baseTitle;
    JPanel listArea;


    void addTitle(ArrayList<TodoList> list){
        baseTitle = new JTextField(20);
        listArea.add(baseTitle);
        listArea.updateUI();
        //list.add(0,);
    }

}


