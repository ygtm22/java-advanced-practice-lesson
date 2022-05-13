package app;

public abstract class GameApp implements App {
	private String item;
	private int playTime;

	
	 public GameApp() {
	  
	 }
	 
	 public GameApp(String item) { 
		 this.item = item; 
	 }
	 

	public String getItem() {
		return this.item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getPlayTime() {
		return this.playTime;
	}

	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}

	protected abstract String play();

	public String start(String name) {
		return (name + "さんと" + item + "でゲームを開始します。" + play());
	}
}