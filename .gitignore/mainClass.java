import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SampleD8L1 {
    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JButton btnA;
    private JButton btnB;
    private JButton btnC;


    // JButtonクラスのインスタンスを作成
    //JRadioButton rdo1 = new JRadioButton();
    //JRadioButton rdo2 = new JRadioButton();
    //JRadioButton rdo3 = new JRadioButton();

//  public JRadioButtonEvent() {
//        ButtonGroup group = new ButtonGroup();
//        Color[] colors = { Color.black, Color.red, Color.orange,
//                           Color.yellow, Color.green, Color.cyan,
//                           Color.blue, Color.magenta, Color.white
//                         };
//        JRadioButton[] radios = new JRadioButton[colors.length];
//        for( int i=0; i<colors.length; i++ ) {
//            radios[i] = new JRadioButton();
//            radios[i].setBackground( colors[i] );
//            radios[i].setText(i); 
//            group.add( radios[i] );
//            add( radios[i] );

//        }
//        radios[0].setForeground( Color.white );
//        group.setSelected( radios[0].getModel(), true );
//    }
 

    // JLabelクラスのインスタンスを作成
  //  JLabel label = new JLabel("ラベルです");

    // JTextFieldクラスのインスタンスを作成
//    JTextField text = new JTextField("なんでそんなに怒ってるの？さぁ、言ってごらん…", 25);

    // フレームにコンポーネントを追加
    //frame.add(button);
  //  frame.add(label);
//    frame.add(text);


    public SampleD8L1() {

        // フレームを作成してレイアウトをセット
        frame = new JFrame("Click Me Buttons ！");
        frame.setLayout(new BorderLayout());

        // パネルを作成してレイアウトをセット
        panel = new JPanel();
        panel.setLayout(new GridLayout(1, 3, 5, 5));

        // 表示用ラベルを作成
        label = new JLabel("リンナちゃんに慰めてもらいたい？ボタンを押してごらん。", JLabel.CENTER);

        // btnAを作成
        btnA = new JButton("btnA");

        // btnAがクリックされた時のイベントを定義
        btnA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                label.setText("btnAがクリックされました");
            }
        });

        // btnBを作成
        btnB = new JButton("btnB");

        // btnBがクリックされた時のイベントを定義
        btnB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                label.setText("btnBがクリックされました");
            }
        });

        // btnCを作成
        btnC = new JButton("btnC");

        // btnCがクリックされた時のイベントを定義
        btnC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                label.setText("btnCがクリックされました");
            }
        });

        // パネルにボタンをセット
        panel.add(btnA);
        panel.add(btnB);
        panel.add(btnC);

        // フレームにパネルをセット（BorderLayoutの北側）
        frame.add(panel, BorderLayout.NORTH);

        // フレームにラベルをセット（BorderLayoutの残りエリア）
        //frame.add(label, BorderLayout.CENTER);//
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // フレームのサイズを設定して表示
        frame.setSize(250, 100);
        frame.setVisible(true);
    }

   // mainメソッドの定義
    public static void main(String[] args) {
        // SampleD8L1クラスの新規インスタンスを作成
        SampleD8L1 application = new SampleD8L1();
     }
}
