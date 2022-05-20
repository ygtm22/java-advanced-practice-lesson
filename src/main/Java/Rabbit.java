public class Rabbit extends Animal{
	public Rabbit(){
		
	}
	
	public Rabbit (String name, int age) {
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
				ageMsg = "20代";
				break;
			case (3):
				ageMsg = "30代";
				break;
			case (4):
				ageMsg = "40代";
				break;
			case (5):
				ageMsg = "50代";
				break;
			default:
				ageMsg = "60代以上";
				break;
		}
		
		String result = "";
		result = "種類はウサギです。" + "人間で言うと、" + ageMsg + "です。";
		
		return result;
	}
	
	@Override
	public String getFilePath(){
		return ("c://work/Rabbit.txt");
	}
}