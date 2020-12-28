import javax.swing.JFrame;
import java.awt.Container;//ボタン
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;//色
import javax.swing.ImageIcon;//画像
import javax.swing.JPanel;//パネル
import javax.swing.JLabel;//ラベル
import javax.swing.JTextField;//テキスト
import java.awt.Dimension;//長さ
import javax.swing.border.LineBorder;//枠線
import java.awt.Font;//フォント
import java.awt.Insets;//ボタン余白の変更
import javax.swing.JOptionPane;
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

    void pushAdd(ArrayList<JPanel> cardList,JPanel todoPanel){
        JPanel textPanel = new JPanel();
        JTextField todoText = new JTextField(20);
        JButton removeButton = new JButton("削除");
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //削除ボタンが押された時
                textPanel.setVisible(false);
            }
        });
        textPanel.add(removeButton);
        textPanel.add(todoText);
        todoPanel.add(textPanel);
        todoPanel.updateUI();
        cardList.add(0,textPanel);
    }







    Base(String title){
        ArrayList<JPanel> cardList = new ArrayList<>();
        JPanel todoPanel =new JPanel();

        setTitle(title);
        setBounds(100, 100, 600, 400);
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

        //TODOパネル

        JLabel todoLabel = new JLabel("マイリストからリスト名を持ってくる");
        todoPanel.setBackground(Color.ORANGE);
        todoPanel.add(todoLabel);
        JButton todoButton = new JButton("+");
        todoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pushAdd(cardList,todoPanel);
            }
        });
        todoButton.setActionCommand("btn1");
        todoPanel.add(todoButton);


        Container contentPane = getContentPane();
        contentPane.add(menuPanel,BorderLayout.LINE_START);
        contentPane.add(todoPanel,BorderLayout.CENTER);



    }

}


