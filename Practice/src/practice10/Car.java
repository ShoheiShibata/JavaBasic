package practice10;

public class Car {
	int serialNo;
	String color;
	int gasoline;

	public int run() {
		gasoline--;
		int num = new java.util.Random().nextInt(15);
		if(gasoline >= 0){

			int result = num+1;
			return result;
		}else {
			int result = -1;
			return result;
		}
	}
}
