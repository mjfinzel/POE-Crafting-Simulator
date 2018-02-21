package src;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Imprint {
	String rarity;
	String itemName;
	Point pos;
	boolean hasToolTip;
	ArrayList<ItemModifier> Mods = new ArrayList<ItemModifier>();
	BufferedImage imprint = Images.load("/Images/Imprint.png");
	public Imprint(String name, String Rarity, Point position){
		for(int i = 0; i<DivineOrb.mods.size();i++){
			if(DivineOrb.mods!=null);
			Mods.add(DivineOrb.mods.get(i));
		}
		itemName=name;
		rarity=Rarity;
		pos=position;
	}
	public void use(){
		DivineOrb.itemName=this.itemName;
		DivineOrb.mods.clear();
		for(int i = 0; i<Mods.size();i++){
			DivineOrb.mods.add(Mods.get(i));
		}
		DivineOrb.numMods=DivineOrb.mods.size();
		DivineOrb.rarity=this.rarity;
	}
	public void Draw(Graphics g){
		//if(pos!=null){
			g.drawImage(imprint, pos.x, pos.y,50, 50, null);
		//}
	}
}
