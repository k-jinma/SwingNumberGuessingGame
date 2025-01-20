import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

public class App extends JFrame implements ActionListener {

    JPanel main; // パネルを宣言します

    JPanel panel1;
    JTextField textField1; // テキストフィールドを宣言します
    JLabel label1; // ラベルを宣言します

    JPanel panel2;
    JLabel maru; // ラベルを宣言します
    JLabel batu;
    JLabel sankaku;
    JLabel maru2;
    JLabel batu2;
    JLabel sankaku2;

    JPanel panel3; // 入力パネルを宣言します
    JButton key1; // ボタンを宣言します
    JButton key2;
    JButton key3;
    JButton key4;
    JButton key5;
    JButton key6;
    JButton key7;
    JButton key8;
    JButton key9;
    JButton key0;

    JPanel panel4;
    JButton b1; // 回答ボタンを宣言します

    int RND1; // ランダムな数値を保持する変数を宣言します
    int RND2;
    int RND3;
    int RND4;

    int[] answer = new int[4]; // 回答を保持する配列を宣言します
    int answerCount = 0;

    int maruCount = 0;
    int batuCount = 0;
    int sankakuCount = 0;

    public App() {

        super("GAME"); // ウィンドウのタイトルを設定します

        // 0から9までのランダムな数値を生成します
        RND1 = (int) (Math.random() * 10);
        RND2 = (int) (Math.random() * 10);
        RND3 = (int) (Math.random() * 10);
        RND4 = (int) (Math.random() * 10);
        System.out.println(RND1 + " " + RND2 + " " + RND3 + " " + RND4);

        setSize(400, 300); // ウィンドウのサイズを設定します
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ウィンドウを閉じたときの処理を設定します
        main = new JPanel(new GridLayout(2, 2)); // パネルを作成し、レイアウトを設定します
        add(main); // パネルをウィンドウに追加します

        Font font = new Font("Serif", Font.PLAIN, 24); // フォントを作成します

        panel1 = new JPanel(new GridLayout(2,1)); // パネルを作成します
        textField1 = new JTextField(4); // テキストフィールドを作成します
        textField1.setFont(font); // フォントを設定します
        textField1.setEditable(false); // テキストフィールドを入力不可にします
        panel1.add(textField1); // テキストフィールドをパネルに追加します
        label1 = new JLabel(""); // ラベルを作成します
        label1.setFont(font); // フォントを設定します
        panel1.add(label1); // ラベルをパネルに追加します
        main.add(panel1);

        panel2 = new JPanel(new GridLayout(2, 3)); // パネルを作成します
        maru = new JLabel("○"); // ラベルを作成します
        maru.setFont(font); // フォントを設定します
        panel2.add(maru); // ラベルをパネルに追加します
        batu = new JLabel("×");
        batu.setFont(font);
        panel2.add(batu);
        sankaku = new JLabel("△");
        sankaku.setFont(font);
        panel2.add(sankaku);

        maru2 = new JLabel("1");
        maru2.setFont(font);
        panel2.add(maru2);
        batu2 = new JLabel("2");
        batu2.setFont(font);
        panel2.add(batu2);
        sankaku2 = new JLabel("3");
        sankaku2.setFont(font);
        panel2.add(sankaku2);
        main.add(panel2); // パネルをウィンドウに追加します

        panel3 = new JPanel(); // 入力パネルを作成します
        panel3.setLayout(new GridLayout(4, 3));
        main.add(panel3); // 入力パネルをパネルに追加します

        key1 = new JButton("1"); // ボタンを作成します
        key1.addActionListener(this); // ボタンにアクションリスナーを追加します
        panel3.add(key1); // ボタンを入力パネルに追加します

        key2 = new JButton("2");
        key2.addActionListener(this);
        panel3.add(key2);

        key3 = new JButton("3");
        key3.addActionListener(this);
        panel3.add(key3);

        key4 = new JButton("4");
        key4.addActionListener(this);
        panel3.add(key4);

        key5 = new JButton("5");
        key5.addActionListener(this);
        panel3.add(key5);

        key6 = new JButton("6");
        key6.addActionListener(this);
        panel3.add(key6);

        key7 = new JButton("7");
        key7.addActionListener(this);
        panel3.add(key7);

        key8 = new JButton("8");
        key8.addActionListener(this);
        panel3.add(key8);

        key9 = new JButton("9");
        key9.addActionListener(this);
        panel3.add(key9);

        key0 = new JButton("0");
        key0.addActionListener(this);
        panel3.add(key0);

        panel4 = new JPanel();
        b1 = new JButton("回答"); // ボタンを作成します
        b1.addActionListener(this); // ボタンにアクションリスナーを追加します
        panel4.add(b1); // ボタンを入力パネルに追加します
        main.add(panel4);

        setVisible(true); // ウィンドウを表示します
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        if( answerCount < 4){
            // ボタンがクリックされたときの処理を記述します
            if (e.getSource() == key1) {
                String str = key1.getText();
                answer[answerCount] = Integer.parseInt(str);
                answerCount++;
                textField1.setText(textField1.getText() + str);
            }
            if (e.getSource() == key2) {
                String str = key2.getText();
                answer[answerCount] = Integer.parseInt(str);
                answerCount++;
                textField1.setText(textField1.getText() + str);
            }
            if (e.getSource() == key3) {
                String str = key3.getText();
                answer[answerCount] = Integer.parseInt(str);
                answerCount++;
                textField1.setText(textField1.getText() + str);
            }
            if (e.getSource() == key4) {
                String str = key4.getText();
                answer[answerCount] = Integer.parseInt(str);
                answerCount++;
                textField1.setText(textField1.getText() + str);
            }
            if (e.getSource() == key5) {
                String str = key5.getText();
                answer[answerCount] = Integer.parseInt(str);
                answerCount++;
                textField1.setText(textField1.getText() + str);
            }
            if (e.getSource() == key6) {
                String str = key6.getText();
                answer[answerCount] = Integer.parseInt(str);
                answerCount++;
                textField1.setText(textField1.getText() + str);
            }
            if (e.getSource() == key7) {
                String str = key7.getText();
                answer[answerCount] = Integer.parseInt(str);
                answerCount++;
                textField1.setText(textField1.getText() + str);
            }
            if (e.getSource() == key8) {
                String str = key8.getText();
                answer[answerCount] = Integer.parseInt(str);
                answerCount++;
                textField1.setText(textField1.getText() + str);
            }
            if (e.getSource() == key9) {
                String str = key9.getText();
                answer[answerCount] = Integer.parseInt(str);
                answerCount++;
                textField1.setText(textField1.getText() + str);
            }
            if (e.getSource() == key0) {
                String str = key0.getText();
                answer[answerCount] = Integer.parseInt(str);
                answerCount++;
                textField1.setText(textField1.getText() + str);
            }
        }
        
        System.out.println( answer[0] + " " + answer[1] + " " + answer[2] + " " + answer[3]);


        if (e.getSource() == b1) {


            if( RND1 == answer[0]){
                maruCount++;
            }else if( RND1 == answer[1] || RND1 == answer[2] || RND1 == answer[3]){
                sankakuCount++;
            }else{
                batuCount++;
            }
            if( RND2 == answer[1]){
                maruCount++;
            }else if( RND2 == answer[0] || RND2 == answer[2] || RND2 == answer[3]){
                sankakuCount++;
            }else{
                batuCount++;
            }

            if( RND3 == answer[2]){
                maruCount++;
            }else if( RND3 == answer[0] || RND3 == answer[1] || RND3 == answer[3]){
                sankakuCount++;
            }else{
                batuCount++;
            }

            if( RND4 == answer[3]){
                maruCount++;
            }else if( RND4 == answer[0] || RND4 == answer[1] || RND4 == answer[2]){
                sankakuCount++;
            }else{
                batuCount++;
            }

            if (maruCount == 4) {
                label1.setText("正解です");
            }else{
                label1.setText(textField1.getText());
                System.out.println(maruCount + " " + batuCount + " " + sankakuCount);
                
            }

            maru2.setText(String.valueOf(maruCount));
            batu2.setText(String.valueOf(batuCount));
            sankaku2.setText(String.valueOf(sankakuCount));
            
            maruCount = 0;
            batuCount = 0;
            sankakuCount = 0;
            textField1.setText("");
            answerCount = 0;
        }
    }
}
