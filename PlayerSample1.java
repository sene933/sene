

public class PlayerSample1 {

	private String myName = ""; //プレイヤ名
	private int myColor ; //先手後手情報(白黒)
	private int myTime ;  //時間制限情報
    private int myRate ;  //レーティング情報

	// メソッド
	public void setName(String name){ // プレイヤ名を受付
		myName = name;
	}
	public String getName(){	// プレイヤ名を取得
		return myName;
	}
	public void setColor(int c){ // 先手後手情報の受付
		myColor = c;
	}
	public int getColor(){ // 先手後手情報の取得
		return myColor;
	}
    public void setTime(int t) { //時間制限情報
    	myTime = t;
    }
    public int getTime() { //時間制限情報
    	 return myTime ;
    }
    public void setRate(int rate) { //レーティング情報
    	myRate = rate;
    }
    public int getRate() { //レーティング情報
    	 return myRate ;
    }

}