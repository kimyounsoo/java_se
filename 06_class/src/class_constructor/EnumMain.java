package class_constructor;

//class EnumColor {
//	//상수 정의
//	public static final String RED = "빨강";
//	public static final String GREEN = "초록";
//	public static final String BLUE = "파랑";
//	public static final String MAGENTA = "보라";
//}

enum EnumColor {
	RED, GREEN, BLUE, MAGENTA
}
public class EnumMain {
	String colorName;
	EnumColor color;

	public static void main(String[] args) {
		System.out.println(EnumColor.RED);
		System.out.println();
		
		EnumMain em = new EnumMain(); // 이 아래는 책에 있어서 그냥 한것 쓸일이 거의 없다
		em.colorName = "빨강";
		em.color = EnumColor.RED;
		System.out.println(em.colorName+"\t"+em.color);
		System.out.println();
		
		em.colorName = "보라";
		EnumColor VIOLET = EnumColor.MAGENTA;
		System.out.println(em.colorName+"\t"+VIOLET);
		System.out.println();
		
		for(EnumColor data : EnumColor.values()) {
			System.out.println(data + "\t"
					+ data.ordinal() + "\t"
					+ data.valueOf(data+""));
					//+data.valueOf("BLACK"));
					
		}

	}

}



















