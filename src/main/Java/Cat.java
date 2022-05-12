public class Cat extends animal{
	public Cat(){
		
	}
	
	public Cat(String name, int age) {
		super(String, int);
	}
	
	@Override
	public String introduceAge(){
		return ("種類は" + cat + "です。" + "人間で言うと、" + "30代です。");
	}
	
	@Override
	public String getFilePath(){
		return ("C:\work\cat.txt");
	}
}