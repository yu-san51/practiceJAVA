package practice;

import java.awt.FlowLayout;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;

public class JList_JComboBox extends JFrame {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new JList_JComboBox();
	}

	public JList_JComboBox() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(350, 250);

		//init_JList();
		//init_ListSelectionListener();
		//init_JComboBox();
		init_ActionListener();

		setVisible(true);
	}

	private void init_JList() {
		//JList(E[] listData)は内部的にAbstractListModelの匿名クラスを生成して
		//JListModel<E>dataModel)に渡している。
		//ジェネリックスに指定したクラスに対してtoString()メソッドの値が表示される

		setLayout(new FlowLayout());

		String[] data1 = { "item01", "item02", "item101", "item102" };
		JList<String> list1 = new JList<>(data1);
		add(list1);

		Double[] data2 = { 0.1, 0.2 };
		JList<Double> list2 = new JList<>(data2);
		add(list2);
		//toStringメソッドが実行されているため小数点付きの文字列が表示されている

		//getSelevtedValuedList
		//Eで選択された項目を返す。何も選択していないときは空のリストを返す。
		JButton button = new JButton("取得");
		add(button);
		button.addActionListener(event -> {
			//ここでストリング型を指定しているため、返り値はストリング型になる。
			List<String> items = list1.getSelectedValuesList();
			for (String s : items) {
				System.out.println(s);
			}
		});

	}

	private void init_ListSelectionListener() {
		setLayout(new FlowLayout());

		String[] data1 = { "item01", "item02", "item101", "item102" };
		JList<String> list1 = new JList<>(data1);
		add(list1);

		//選択項目が変更されたときに実行したい処理がある場合はリスナーを追加できる
		list1.addListSelectionListener(event -> {
			List<String> items = list1.getSelectedValuesList();
			for (String s : items) {
				System.out.println(s);
			}
		});
	}

	private void init_JComboBox() {
		setLayout(new FlowLayout());

		//いわゆるプルタブ形式
		String[] data = { "item01", "item02", "item101", "item102" };
		JComboBox<String> comboBox = new JComboBox<>(data);
		add(comboBox);

		//選択している項目を取得する
		//最初の項目は0から数字で返す
		JButton button = new JButton("取得");
		add(button);
		button.addActionListener(event -> {
			int index = comboBox.getSelectedIndex();
			System.out.println(index);
		});
	}

	private void init_ActionListener() {
		setLayout(new FlowLayout());

		String[] data = { "item01", "item02", "item101", "item102" };
		JComboBox<String> comboBox = new JComboBox<>(data);
		add(comboBox);

		//引数にActionListenerの実装クラスを指定することで、
		//項目が選択されたときに実行される処理を記述することができる
		//十字キーで項目を変更したときにも呼び出されてしまうので注意
		comboBox.addActionListener(event -> {
			System.out.println("選択されました");
		});

	}
}
