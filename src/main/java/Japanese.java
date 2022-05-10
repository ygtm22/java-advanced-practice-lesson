import Utility.Utility;

public class Japanese extends Human{

    /**
     * コンストラクタ(引数なし)
     */
    public Japanese() {
        // 初期値をセット
    	super();
        language = "日本語";
    }

    /**
     * コンストラクタ (受け取った引数を元に初期値をセット)
     */
    public Japanese(String name, String language) {
        // フィールドを初期化
    	super();
        if (!Utility.isNullOrEmpty(name)) {
            this.name = name;
        }

        if (!Utility.isNullOrEmpty(language)) {
            this.language = language;
        }
    }

    /**
     * 出身地の情報を返却するメソッド
     */
    @Override
    public String returnBirthPlaceInfo() {
        // 出身地用の文字列
        String msg = "出身地:日本";
        msg += "。" + "日本の公用語は「日本語」です。";

        // 作成した文字列を返却
        return msg;
    }

}