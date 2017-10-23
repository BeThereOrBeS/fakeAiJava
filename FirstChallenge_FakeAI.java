import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class FakeAiDoll extends Baseframe2 {
//	JFrame frame;

	Connection myCon = null;
	Statement mySt = null;

	JPanel panelAbove;
	JPanel panelMiddle;
	JLabel label;
	JButton btnA;
	JButton btnB;
	JButton btnC;
	JButton btnAction = new JButton("Action!");
	ButtonGroup group:
	JRadioButton[] radios;

	// JLabelクラスのインスタンスを作成
	//JLabel label = new JLabel("ラベルです");

	// JTextFieldクラスのインスタンスを作成
	JTextField text = new JTextField("なんでそんなに怒ってるの？さぁ、言ってごらん…", 25);
   // フレームにコンポーネントを追加
	//frame.add(button);
  //  frame.add(label);
//	frame.add(text);


	public FakeAiDoll() {

		// フレームを作成してレイアウトをセット
		frame = new JFrame("Fake AI Doll");
		frame.setLayout(new BorderLayout());

		// パネルを作成してレイアウトをセット
		panelAbove = new JPanel();
		panelMiddle = new JPanel();

		// 表示用ラベルを作成
		label = new JLabel("リンナちゃんに慰めてもらいたい？ボタンを押してごらん。", JLabel.CENTER);

		// btnAを作成
		btnA = new JButton("Inprinting");



		// btnAがクリックされた時のイベントを定義
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
			JRadioButtonEvent();
			text.setText("AIに言葉を教えて！");
			//label.setText("btnAがクリックされました");
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


		panelAbove.setLayout(new GridLayout(1,3));
		// パネルにボタンをセット
		panelAbove.add(btnA);
		panelAbove.add(btnB);
		panelAbove.add(btnC);


		// フレームにパネルをセット（BorderLayoutの北側と真ん中）
		getContentPane().add(panelAbove, BorderLayout.NORTH);
		getContentPane().add(panelMiddle, BorderLayout.CENTER);
		getContentPane().add(btnAction, BorderLayout.SOUTH);

		// フレームにラベルをセット（BorderLayoutの残りエリア）
		//frame.add(label, BorderLayout.CENTER);//
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// フレームのサイズを設定して表示
		frame.setSize(250, 100);
		frame.setVisible(true);
	}


	public JRadioButtonEvent() {
			group = new ButtonGroup();
			radios = new JRadioButton[colors.length];

			for( int i=0; i<10; i++ ) {
			radios[i] = new JRadioButton();
			radios[i].setText(i);
			group.add( radios[i] );
			add( radios[i] );
			}

		radios[0].setForeground( Color.white );
		group.setSelected( radios[0].getModel(), true );
	}


//resultSetで昇順・降順の両方可能な奴
//Statement stmt = con.createStatement(
//					   ResultSet.TYPE_SCROLL_INSENSITIVE, 
//					   ResultSet.CONCUR_READ_ONLY);
//ResultSet scrollingRS = stmt.executeQuery("SELECT * FROM whatever");

	void showMyMessage(String strMessage) {
		JOptionPane.showMessageDialog(this, strMessage);
	}

	void doUpdate(String sql,int a,int b) {

		int AiF;

		AiF = (a*b);

		try {
		mySt = myCon.createStatement() ;

		ResultSet myRs = mySt.executeQuery("SELECT * FROM HOGEHOGE WHERE KIBUN == "+AiF);
	
		while(myRs.next){
			String line = myRs.getString("NAME") ;
			String strMes;
		 	strMes.append(line + "\n");

		}
	
	JOptionPane.showMessageDialog(this, strMes);

	//intCount = mySt.executeUpdate(sql);
	}catch(Exception ex) {
		showMyMessage("doUpdateでエラー発生：" + ex);
		intCount = 0;
	}
		return intCount;
	}


}
