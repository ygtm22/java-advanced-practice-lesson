public class Cat extends Animal{
	public Cat(){
		
	}
	
	public Cat(String name, int age) {
		super(name, age);
	}
	
	@Override
	public String introduceAge(){
		String ageMsg = "";
		
		switch (age) {
			case (0):
				ageMsg = "0～10代中盤";
				break;
			case (1):
				ageMsg = "10代中盤";
				break;
			case (2):
			case (3):
				ageMsg = "20代";
				break;
			case (4):
			case (5):
				ageMsg = "30代";
				break;
			case (6):
			case (7):
			case (8):
				ageMsg = "40代";
				break;
			case (9):
			case (10):
				ageMsg = "50代";
				break;
			default:
				ageMsg = "60代以上";
				break;
		}
		
		String result = "";
		result = "種類はネコです。" + "人間で言うと、" + ageMsg + "です。";
		
		return result;
	}
	
	@Override
	public String getFilePath(){
		String path = "";
		path =  "c://work/Cat.txt";
		return path;
	}
}