package jp.co.axiz.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import jp.co.axiz.app.CardGameApp;
import jp.co.axiz.app.ClockApp;
import jp.co.axiz.app.DartsGameApp;
import jp.co.axiz.util.AppUtil;

public class AppUtilTest {

	@Test
	public void ゲーム() {
		CardGameApp card = new CardGameApp();
		boolean result1 = AppUtil.isGameApp(card);
		boolean gameApp1 = true;
		assertEquals(gameApp1, result1);
		
		DartsGameApp darts = new DartsGameApp();
		boolean result2 = AppUtil.isGameApp(darts);
		boolean gameApp2 = true;
		assertEquals(gameApp2, result2);
		
		ClockApp clock = new ClockApp();
		boolean result3 = AppUtil.isGameApp(clock);
		boolean gameApp3 = false;
		assertEquals(gameApp3, result3);
	}
	
	@Test
	public void カードゲーム() {
		CardGameApp card = new CardGameApp();
		boolean result1 = AppUtil.isCardGameApp(card);
		boolean gameApp1 = true;
		assertEquals(gameApp1, result1);
		
		DartsGameApp darts = new DartsGameApp();
		boolean result2 = AppUtil.isCardGameApp(darts);
		boolean gameApp2 = false;
		assertEquals(gameApp2, result2);
		
		ClockApp clock = new ClockApp();
		boolean result3 = AppUtil.isCardGameApp(clock);
		boolean gameApp3 = false;
		assertEquals(gameApp3, result3);
	}
	
	@Test
	public void ダーツ() {
		CardGameApp card = new CardGameApp();
		boolean result1 = AppUtil.isDartsGameApp(card);
		boolean gameApp1 = false;
		assertEquals(gameApp1, result1);
		
		DartsGameApp darts = new DartsGameApp();
		boolean result2 = AppUtil.isDartsGameApp(darts);
		boolean gameApp2 = true;
		assertEquals(gameApp2, result2);
		
		ClockApp clock = new ClockApp();
		boolean result3 = AppUtil.isDartsGameApp(clock);
		boolean gameApp3 = false;
		assertEquals(gameApp3, result3);
	}
	
	@Test
	public void 時計() {
		CardGameApp card = new CardGameApp();
		boolean result1 = AppUtil.isClockApp(card);
		boolean gameApp1 = false;
		assertEquals(gameApp1, result1);
		
		DartsGameApp darts = new DartsGameApp();
		boolean result2 = AppUtil.isClockApp(darts);
		boolean gameApp2 = false;
		assertEquals(gameApp2, result2);
		
		ClockApp clock = new ClockApp();
		boolean result3 = AppUtil.isClockApp(clock);
		boolean gameApp3 = true;
		assertEquals(gameApp3, result3);
	}
	
	@Test
	public void ゲーム名() {
		CardGameApp card = new CardGameApp();
		String result1 = AppUtil.getAppName(card);
		String gameApp1 = "ゲーム：カード";
		assertEquals(gameApp1, result1);
		
		DartsGameApp darts = new DartsGameApp();
		String result2 = AppUtil.getAppName(darts);
		String gameApp2 = "ゲーム：ダーツ";
		assertEquals(gameApp2, result2);
		
		ClockApp clock = new ClockApp();
		String result3 = AppUtil.getAppName(clock);
		String gameApp3 = "時計";
		assertEquals(gameApp3, result3);
	}

}
