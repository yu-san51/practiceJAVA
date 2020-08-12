package application;

public class Contstants {

	//	定数クラスの中にネコにまつわる定数を定義
	public static class Cat {
		public static final String NAME = "ネコ";
		public static final int LEG_COUNT = 4;
	}

	//	定数クラスの中にタコにまつわる定数を定義
	public static class Octopus {
		public static final String NAME = "タコ";
		public static final int LEG_COUNT = 8;
	}
}

//実行コード
//System.out.println(Constants.Cat.NAME);
//System.out.println(Constants.Cat.LEG_COUNT);
//System.out.println(Constants.Octopus.NAME);
//System.out.println(Constants.Octopus.LEG_COUNT);