package src;






import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;








import javax.swing.JPanel;


public class Panel extends JPanel{

	private static final long serialVersionUID = 7734877696044080629L;

	public static int Chapter;
	public static int mapLength = 20;
	public static int mapHeight = 20;
	public static enum Gamestate{appletui_init,Controller_init};

	//Controller ctrl = new Controller();


	public static Gamestate gamestate;
	public static boolean game_is_running = false;
	final int TICKS_PER_SECOND = 40;
	final int SKIP_TICKS = 1000/TICKS_PER_SECOND;
	final int MAX_FRAMESKIP = 5;
	long starttime = System.currentTimeMillis();
	int tickcount = 0;
	int next_game_tick = (int) GetTickCount();
	long tickstart=0;
	boolean go_on=false;
	private BufferedImage divine = Images.load("/Images/Divine Orb.png");
	private BufferedImage blessed = Images.load("/Images/Blessed Orb.png");
	private BufferedImage chaos = Images.load("/Images/Chaos Orb.png");
	private BufferedImage scour = Images.load("/Images/Orb of Scouring.png");
	private BufferedImage alchemy = Images.load("/Images/Orb of Alchemy.png");
	private BufferedImage chance = Images.load("/Images/Orb of Chance.png");
	private BufferedImage transmute = Images.load("/Images/Orb of Transmutation.png");
	private BufferedImage alteration = Images.load("/Images/Orb of Alteration.png");
	private BufferedImage augmentation = Images.load("/Images/Orb of Augmentation.png");
	private BufferedImage exalt = Images.load("/Images/Exalted Orb.png");
	private BufferedImage eternal = Images.load("/Images/Eternal Orb.png");
	private BufferedImage regal = Images.load("/Images/Regal Orb.png");
	private BufferedImage uniqueNameplate = Images.load("/Images/NamePlate.png");
	private BufferedImage rareNameplate = Images.load("/Images/RareNamePlate.png");
	private BufferedImage magicNameplate = Images.load("/Images/MagicNamePlate.png");
	private BufferedImage normalNameplate = Images.load("/Images/NormalNamePlate.png");
	static BufferedImage imprintTooltip = Images.load("/Images/ImprintTooltip.png");
	private BufferedImage COE = Images.load("/Images/CrownOfEyes.png");
	private BufferedImage Andvarius = Images.load("/Images/Andvarius.png");
	private BufferedImage sWraps = Images.load("/Images/ShavronnesWrappings.png");
	private BufferedImage statSeperator = Images.load("/Images/StatSeperator.png");
	static BufferedImage deleteButton = Images.load("/Images/DeleteButton.png");
	private BufferedImage stash = Images.load("/Images/Stash.png");

	int sleep_time = 0;

	public long GetTickCount(){
		return (System.currentTimeMillis()-starttime);
	}
	public Panel(){

		this.setDoubleBuffered(true);



	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Draw(g);


	}
	public Graphics getGraphic(){
		return super.getGraphics();
		
	}

	public void Draw(Graphics g){
		//draw orb buttons
		g.drawImage(transmute, 0, 0,50, 50, null);
		g.drawImage(alteration, 50, 0,50, 50, null);
		g.drawImage(augmentation, 100, 0,50, 50, null);
		g.drawImage(chance, 150, 0,50, 50, null);
		g.drawImage(scour, 200, 0,50, 50, null);
		g.drawImage(alchemy, 250, 0,50, 50, null);
		g.drawImage(blessed, 300, 0,50, 50, null);
		g.drawImage(chaos, 350, 0,50, 50, null);
		g.drawImage(regal, 400, 0,50, 50, null);
		g.drawImage(divine, 450, 0,50, 50, null);
		g.drawImage(exalt, 500, 0,50, 50, null);
		g.drawImage(eternal, 550, 0,50, 50, null);

		//draw "delete statistics" button
		g.drawImage(deleteButton, 680, 268,40, 16, null);
		//draw stash for imprints
		g.drawImage(stash, 5, 360,404, 232, null);

		//draw statistics
		Font font = new Font("Fontin",Font.BOLD,13);;
		g.setFont(font);
		g.setColor(Color.gray);
		g.drawString("Statistics: ", 500, 280);
		g.drawString("________________________________", 500, 285);
		font = new Font("Fontin",Font.BOLD,11);;
		g.setFont(font);
		g.setColor(Color.DARK_GRAY);
		g.drawString("Orb of Transmutation's Used: ", 500, 300);
		g.drawString(""+DivineOrb.transmutesUsed, 700, 300);
		g.drawString("Orb of Alteration's Used:    ", 500, 320);
		g.drawString(""+DivineOrb.alterationsUsed, 700, 320);
		g.drawString("Orb of Augmentation's Used:  ", 500, 340);
		g.drawString(""+DivineOrb.augmentationsUsed, 700, 340);
		g.drawString("Orb of Chance's Used:        ", 500, 360);
		g.drawString(""+DivineOrb.chancesUsed, 700, 360);
		g.drawString("Orb of Scouring's Used:      ", 500, 380);
		g.drawString(""+DivineOrb.scoursUsed, 700, 380);
		g.drawString("Orb of Alchemy's Used:       ", 500, 400);
		g.drawString(""+DivineOrb.alchsUsed, 700, 400);
		g.drawString("Blessed Orbs Used:           ", 500, 420);
		g.drawString(""+DivineOrb.blessedUsed, 700, 420);
		g.drawString("Chaos Orbs Used:             ", 500, 440);
		g.drawString(""+DivineOrb.chaosUsed, 700, 440);
		g.drawString("Regal Orbs Used:             ", 500, 460);
		g.drawString(""+DivineOrb.regalsUsed, 700, 460);
		g.drawString("Divine Orbs Used:            ", 500, 480);
		g.drawString(""+DivineOrb.divinesUsed, 700, 480);
		g.drawString("Exalted Orbs Used:           ", 500, 500);
		g.drawString(""+DivineOrb.exaltsUsed, 700, 500);
		g.drawString("Eternal Orbs Used:           ", 500, 520);
		g.drawString(""+DivineOrb.eternalUsed, 700, 520);

		//draw affixes
		font = new Font("Fontin",Font.BOLD,13);;
		g.setFont(font);
		g.setColor(Color.gray);
		g.drawString("Affixes: ", 500, 120);
		g.drawString("________________________________", 500, 125);
		font = new Font("Fontin",Font.BOLD,11);;
		g.setFont(font);
		g.setColor(Color.DARK_GRAY);
		for(int i = 0;i<DivineOrb.mods.size();i++){
			g.drawString(DivineOrb.mods.get(i).affixName, 500, 145+(i*20));
		}

		if(DivineOrb.rarity=="Normal"){
			g.drawImage(normalNameplate, 0, 72,400, 25, null);
			font = new Font("Fontin",Font.BOLD,15);;
			g.setFont(font);
			g.setColor(new Color(200,200,200));
		}
		else if(DivineOrb.rarity=="Rare"){
			g.drawImage(rareNameplate, 0, 50,400, 50, null);
			font = new Font("Fontin",Font.BOLD,15);;
			g.setFont(font);
			g.setColor(new Color(255,254,121));
		}
		else if(DivineOrb.rarity=="Magic"){
			g.drawImage(magicNameplate, 0, 72,400, 25, null);
			font = new Font("Fontin",Font.BOLD,15);;
			g.setFont(font);
			g.setColor(new Color(136,136,255));
		}
		else if(DivineOrb.rarity=="Unique"){
			g.drawImage(uniqueNameplate, 0, 50,400, 50, null);
			font = new Font("Fontin",Font.BOLD,15);;
			g.setFont(font);
			g.setColor(new Color(175,96,37));
		}
		g.drawString(DivineOrb.itemName, 200-(DivineOrb.itemName.length()*3), 70);
		if(DivineOrb.rarity!="Magic"){
			g.drawString(DivineOrb.baseItem, 200-(DivineOrb.baseItem.length()*3), 90);

		}
		else{
			if(DivineOrb.mods.size()==1&&DivineOrb.mods.get(0).affixType=="prefix"){
				g.drawString(DivineOrb.mods.get(0).affixName+" "+DivineOrb.baseItem, 200-((DivineOrb.baseItem.length()+DivineOrb.mods.get(0).affixName.length())*3), 90);
			}
			else if(DivineOrb.mods.size()==1&&DivineOrb.mods.get(0).affixType=="suffix"){
				g.drawString(DivineOrb.baseItem+DivineOrb.mods.get(0).affixName, 200-((DivineOrb.baseItem.length()+DivineOrb.mods.get(0).affixName.length())*3), 90);
			}
			else if(DivineOrb.mods.size()==2){
				if(DivineOrb.mods.get(0).affixType=="prefix"){
					g.drawString(DivineOrb.mods.get(0).affixName+" "+DivineOrb.baseItem+DivineOrb.mods.get(1).affixName, 200-((DivineOrb.baseItem.length()+DivineOrb.mods.get(0).affixName.length()+DivineOrb.mods.get(1).affixName.length())*4), 90);
				}
				else if(DivineOrb.mods.get(0).affixType=="suffix"){
					g.drawString(DivineOrb.mods.get(1).affixName+" "+DivineOrb.baseItem+DivineOrb.mods.get(0).affixName, 200-((DivineOrb.baseItem.length()+DivineOrb.mods.get(0).affixName.length()+DivineOrb.mods.get(1).affixName.length())*4), 90);
				}

			}
		}

		//draw each item modifier
		font = new Font("Fontin",Font.PLAIN,14);;
		g.setFont(font);
		g.setColor(new Color(136,136,255));
		for(int i = 0; i<DivineOrb.numMods;i++){
			if(DivineOrb.mods.size()>0){
				if(DivineOrb.mods.get(i).description==null)
					g.drawString(DivineOrb.mods.get(i).affixName, 200-(DivineOrb.mods.get(i).affixName.length()*3), 130+(i*20));
				else
					g.drawString(DivineOrb.mods.get(i).description, 200-(DivineOrb.mods.get(i).description.length()*3), 130+(i*20));
			}
			else{
				System.out.println("Item has no modifiers");
			}
		}
		
		//draw every imprint
		for(int i = 0; i< 4; i++){
			for(int j = 0; j<8;j++){
				if(DivineOrb.stash[i][j]!=null){
					DivineOrb.stash[i][j].Draw(g);
				}
			}
		}

	}
}
