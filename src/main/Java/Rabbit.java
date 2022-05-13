public class Rabbit extends animal{
	public Rabbit(){
		
	}
	
	public Rabbit (String name, int age) {
		super();
	}
	
	@Override
	public String introduceAge(){
		return ("種類は" + rabbit + "です。" + "人間で言うと、" + "30代です。");
	}
	
	@Override
	public String getFilePath(){
		return ("Rabbit.txt");
	}
}