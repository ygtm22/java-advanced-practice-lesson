package app;

public class CardGameApp extends GameApp {
	
	public CardGameApp() {
		super();
	}
	
	public CardGameApp(String item) {
		super();
		this.item = item;
	}
	
	@Override
	public String start(String name) {
		return (name + "さんと" + item + "でゲームを開始します" + "ババ抜きを行います");
	}
}