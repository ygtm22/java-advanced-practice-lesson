public class Cat extends animal{
	public Cat(){
		
	}
	
	public Cat(String name, int age) {
		super();
	}
	
	@Override
	public String introduceAge(){
		return ("種類は" + cat + "です。" + "人間で言うと、" + "30代です。");
	}
	
	@Override
	public String getFilePath(){
		return ("Cat.tex");
	}
}