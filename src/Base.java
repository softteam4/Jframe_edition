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


public class Base extends JFrame{
    public static void main(String args[]){
        Base frame = new Base("Todo");
        frame.setVisible(true);
    }

    Base(String title){
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
        JPanel todoPanel =new JPanel();
        JLabel todoLabel = new JLabel("新規リスト");
        todoPanel.add(todoLabel);
        JButton todoButton = new JButton("+");
        todoPanel.add(todoButton);


        Container contentPane = getContentPane();
        contentPane.add(menuPanel,BorderLayout.LINE_START);
        contentPane.add(todoPanel,BorderLayout.CENTER);



    }
}
