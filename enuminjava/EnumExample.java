package enuminjava;

public class EnumExample {
	enum Season{
		WINTER(15),SPRING(30),SUMMER(25),FALL(20);
		private int value;
		private Season(int value) {
			this.value=value;
		}
	}
public static void main(String[] args) {
	for(Season s:Season.values()) {
		System.out.println(s+" "+s.value);
	}
}
}
