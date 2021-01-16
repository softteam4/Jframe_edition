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
        ArrayList<TodoList> listList = new ArrayList<TodoList>(); //TodoListのリスト

        setTitle(title);
        setBounds(100, 100, 200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        //メニューバー
        JPanel menuPanel =new JPanel(new BorderLayout());
        menuPanel.setPreferredSize(new Dimension(200, 200));
        JLabel menuLabel = new JLabel("マイリスト");
        menuPanel.setBackground(Color.GRAY);
        menuPanel.add(menuLabel,BorderLayout.NORTH);
        JButton folderButton = new JButton("リスト作成");
        menuPanel.add(folderButton,BorderLayout.SOUTH);

        Container contentPane = getContentPane();
        contentPane.add(menuPanel,BorderLayout.LINE_START);
        contentPane.add(todolist,BorderLayout.CENTER);
    }

}


