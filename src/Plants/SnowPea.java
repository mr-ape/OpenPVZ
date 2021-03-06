package Plants;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.HashMap;
import PVZ.Context;

public class SnowPea extends Plants implements Shooters{
	
    //----当检查到僵尸才进行子弹发射
	//发射子弹是否继续
	protected boolean isShoot;

	public SnowPea(int x, int y){
		
		this.x =x-28;
		this.y =y-26;
		//给一个装图片的集合___后期可能需要多张,提高扩展冗余
		images = new HashMap<String,Image>();
		//设置图片
		images.put("1",Toolkit.getDefaultToolkit().getImage(Context.PATHP_P + "SnowPea/" + "SnowPea.gif"));
		
		//设置生命值
		HP=100;
		
	}
	
	//拿到图片
	public Image getImages() {
		return images.get("1");
	}


	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}
	
	public Bullet shootBullet() {
		return new Bullet(x+80, y);	
	}
	
}
