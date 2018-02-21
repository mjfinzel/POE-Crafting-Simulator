package src;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DivineOrb extends JFrame {
	public static String whatItem = "";
	public static String rarity = "Normal";
	public static int ilvl = 80;
	static int divinesUsed = 0;
	static int blessedUsed = 0;
	static int transmutesUsed = 0;
	static int alterationsUsed = 0;
	static int augmentationsUsed = 0;
	static int exaltsUsed = 0;
	static int scoursUsed = 0;
	static int regalsUsed = 0;
	static int chaosUsed = 0;
	static int chancesUsed = 0;
	static int alchsUsed = 0;
	static int eternalUsed = 0;
	static int numMods = 0;//number of mods on the item

	static ArrayList<ItemModifier> mods = new ArrayList<ItemModifier>();
	static Imprint [][]stash = new Imprint[4][8];
	static ItemModifier implicit;

	static String implicitRoll="";
	static String firstRoll = "";
	static String secondRoll = "";
	static String thirdRoll = "";
	static String fourthRoll = "";
	static String fifthRoll = "";
	static String sixthRoll = "";

	static String itemName = "";
	static String baseItem = "Amulet";
	static String defenseStat = "";
	static String requirements = "";

	public static boolean perfectEs = false;
	public static boolean perfectAccr = false;
	public static boolean perfectLL = false;
	public static boolean perfectML = false;
	public static boolean perfectImp = false;
	public static boolean perfectIir = false;
	public static boolean perfectLres = false;
	public static DivineOrb f;
	int temps = 0;
	static long lastGameUpdate = System.currentTimeMillis();
	Container pane;
	static JPanel drawPanel;
	int DEcount = 0;
	Controller ctrl;
	public static void main(String[] args) {
		f = new DivineOrb ();
		f.setSize(816,634);
		f.setVisible(true);
		Thread gameThread = new Thread() {
			@Override
			public void run(){
				gameLoop();
			}
		};
		gameThread.run();

	}
	public DivineOrb(){
		//useAlchemy();
		ctrl = new Controller();
		pane = getContentPane();
		pane.setLayout(new BorderLayout());

		drawPanel = new Panel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawPanel.setBackground(Color.BLACK);

		this.addMouseListener(ctrl);
		ctrl.setGamePanel(drawPanel);

		this.setFocusable(true);
		pane.add(drawPanel);
		this.setTitle("Orb Simulator");
		//useTransmutation();
		useAlchemy();
		

		while(!hasDesiredRoll()){
		//temps++;
		//useAlteration();
		useChaos();
		
		}
	}
	public boolean hasDesiredRoll(){
		int count=0;
		for(int i = 0; i<mods.size();i++){
			if(mods.get(i).tier==1){
				count++;
			}
			
			if(count==mods.size()&&count==6){
				//System.out.println(temps);
				return true;
			}
		}
		return false;
	}
	public static void gameLoop(){
		Graphics temp = drawPanel.getGraphics();
		Font font = new Font("Fontin",Font.BOLD,12);
		temp.setColor(new Color(136,136,255));
		temp.setFont(font);
		int targetI = 0;
		int targetJ = 0;
		int oldI=0;
		int oldJ=0;
		while(true){
			if(lastGameUpdate+50<System.currentTimeMillis()){
				
				//for every imprint
				for(int i = 0; i< 4; i++){
					for(int j = 0; j<8;j++){
						
						int x = MouseInfo.getPointerInfo().getLocation().x-(f.getLocation().x)-9;
						int y = MouseInfo.getPointerInfo().getLocation().y-(f.getLocation().y)-30;
						
						if(stash[i][j]!=null){
							
							if(x>=stash[i][j].pos.x&&x<stash[i][j].pos.x+50&&y>stash[i][j].pos.y&&y<stash[i][j].pos.y+50){
								oldI=targetI;
								oldJ=targetJ;
								targetI=i;
								targetJ=j;
								stash[i][j].hasToolTip=true;
								temp.drawImage(Panel.imprintTooltip, stash[i][j].pos.x+10, stash[i][j].pos.y-200,400, 200, null);

								for(int k = 0;k<stash[i][j].Mods.size();k++){
									
									if(stash[i][j].Mods.get(k).description!=null)
										temp.drawString(stash[i][j].Mods.get(k).description, stash[i][j].pos.x+200-(stash[i][j].Mods.get(k).description.length()*3), stash[i][j].pos.y-130+(k*20));
								}

							}
							else{
								if(!(targetI==oldI&&targetJ==oldJ)||!hasTooltip())
								drawPanel.repaint();
							}
							
							lastGameUpdate=System.currentTimeMillis();


						}
					}
				}

			}
		}
	}
	public static boolean hasTooltip(){
		int x = MouseInfo.getPointerInfo().getLocation().x-(f.getLocation().x)-9;
		int y = MouseInfo.getPointerInfo().getLocation().y-(f.getLocation().y)-30;
		for(int i = 0; i< 4; i++){
			for(int j = 0; j<8;j++){
				if(stash[i][j]!=null)
				if(x>=stash[i][j].pos.x&&x<stash[i][j].pos.x+50&&y>stash[i][j].pos.y&&y<stash[i][j].pos.y+50){
					return true;
				}
			}
		}
		return false;
	}
	static int randomNumber(int min, int max){
		return min + (int)(Math.random() * ((max - min) + 1));
	}
	public static void addPrefix(){
		ArrayList<ItemModifier> prefixMods = new ArrayList<ItemModifier>();
		//get a list of all possible prefixes
		for(int i = 0; i<=102;i++){
			prefixMods.add(new ItemModifier(i,"prefix"));
		}
		//remove any prefixes from the list that require a higher ilvl than the base item is
		for(int i = 0; i< prefixMods.size();i++){
			if(prefixMods.get(i).modLVL>=ilvl){
				prefixMods.remove(i);
				System.out.println("Removed modifier with invalid ilvl "+prefixMods.get(i).affixName);
			}
		}
		//remove any prefixes from the list that are in the same catagory as an existing prefix on the item
		for(int i = 0; i< mods.size();i++){//for each mod
			for(int j = 0; j<prefixMods.size();j++){//check each category
				if(prefixMods.get(j).affixCatagory.equals(mods.get(i).affixCatagory)){//if the mod shares catagories with a prefix
					//System.out.println("Removed \""+prefixMods.get(j).affixName+"\" from the available prefix mods. Was equal to catagory: "+prefixMods.get(j).affixCatagory);
					prefixMods.remove(j);//remove the prefix
					if(j>0)
						j-=1;

				}
			}
		}

		//add information to each modifier regarding it's rarity
		int total = 0;
		for(int i = 0; i< prefixMods.size();i++){
			prefixMods.get(i).rarityLowerBound=total;
			total=total+prefixMods.get(i).rarity;
			prefixMods.get(i).rarityUpperBound=total;
			//System.out.println(prefixMods.get(i).rarity);
		}
		//add a random modifier
		int roll = randomNumber(1,total);
		//System.out.println("roll = "+roll);
		for(int i = 0; i< prefixMods.size();i++){
			if(prefixMods.get(i).rarityLowerBound<roll&&prefixMods.get(i).rarityUpperBound>=roll){
				mods.add(prefixMods.get(i));
				//System.out.println("Added prefix");
				return;
			}
		}
	}
	public static void resetStatistics(){
		divinesUsed = 0;
		blessedUsed = 0;
		transmutesUsed = 0;
		alterationsUsed = 0;
		augmentationsUsed = 0;
		exaltsUsed = 0;
		scoursUsed = 0;
		regalsUsed = 0;
		chaosUsed = 0;
		chancesUsed = 0;
		alchsUsed = 0;
	}
	public static void addSuffix(){
		ArrayList<ItemModifier> suffixMods = new ArrayList<ItemModifier>();

		//get a list of all possible suffixes
		for(int i = 0; i<=119;i++){
			suffixMods.add(new ItemModifier(i,"suffix"));
		}
		//remove any suffixes from the list that require a higher ilvl than the base item is
		for(int i = 0; i< suffixMods.size();i++){
			if(suffixMods.get(i).modLVL>=ilvl){

				suffixMods.remove(i);

			}
		}
		//remove any suffixes from the list that are in the same catagory as an existing prefix on the item
		for(int i = 0; i< mods.size();i++){
			for(int j = 0; j<suffixMods.size();j++){
				if(suffixMods.get(j).affixCatagory.equals(mods.get(i).affixCatagory)){
					//System.out.println("Removed \""+suffixMods.get(j).affixName+"\" from the available suffix mods. Was equal to catagory: "+suffixMods.get(j).affixCatagory);
					suffixMods.remove(j);
					if(j>0)
						j-=1;
				}
			}
		}
		//remove any suffixes from the list that are in the same catagory as an existing prefix on the item

		//add information to each modifier regarding it's rarity
		int total = 0;
		for(int i = 0; i< suffixMods.size();i++){
			suffixMods.get(i).rarityLowerBound=total;
			total=total+suffixMods.get(i).rarity;
			suffixMods.get(i).rarityUpperBound=total;
			//System.out.println(prefixMods.get(i).rarity);
		}
		//add a random modifier
		int roll = randomNumber(1,total);
		//System.out.println("roll = "+roll);
		for(int i = 0; i< suffixMods.size();i++){
			if(suffixMods.get(i).rarityLowerBound<roll&&suffixMods.get(i).rarityUpperBound>=roll){
				mods.add(suffixMods.get(i));
				//System.out.println("Added suffix");
				return;
			}
		}
	}
	public static void addModifier(){
		int prefixes = 0;
		int suffixes = 0;
		//determine the number of existing prefixes and suffixes
		for(int i = 0; i<mods.size();i++){
			if(mods.get(i).affixType=="prefix"){
				prefixes++;
			}
			else{
				suffixes++;
			}
		}
		//if there is room for a prefix or a suffix
		if(prefixes<3&&suffixes<3&&rarity=="Rare"){
			if(randomNumber(1,2)==1){
				addPrefix();
			}
			else{
				addSuffix();
			}
		}
		else if(prefixes<1&&suffixes<1&&rarity=="Magic"){
			if(randomNumber(1,2)==1){
				addPrefix();
			}
			else{
				addSuffix();
			}
		}
		//if there is no room for a prefix
		else if(prefixes==3&&rarity=="Rare"){
			addSuffix();
		}
		else if(suffixes==3&&rarity=="Rare"){
			addPrefix();
		}
		else if(prefixes==1&&rarity=="Magic"){
			addSuffix();
		}
		else if(suffixes==1&&rarity=="Magic"){
			addPrefix();
		}

	}
	public static void divineCOE(){



	}
	public static void divineAndvarius(){

	}
	public static void blessAndvarius(){

	}
	public static void divineShavronnes(){

	}
	public static void blessShavronnes(){

	}
	public static void generateItemName(){
		String[] namePrefixes = {"Agony","Apocalypse","Armageddon","Beast", "Behemoth", "Blight", "Blood","Bramble","Brimstone", "Brood", "Carrion",
				"Cataclysm","Chimeric","Corpse","Corruption","Damnation","Death","Demon", "Dire", "Dragon", "Dread","Doom","Dusk","Eagle","Emyrean",
				"Fate", "Foe", "Gale", "Ghoul", "Gloom", "Glyph", "Golem", "Grim", "Hate", "Havoc", "Honour", "Horror", "Hypnotic", "Kraken", "Loath",
				"Maelstrom", "Mind", "Miracle", "Morbid", "Oblivion", "Onslaught", "Pain", "Pandemonium", "Phoenix", "Plague", "Rage", "Rapture",
				"Rune", "Skull", "Sol", "Soul", "Sorrow", "Spirit", "Storm", "Tempest", "Torment", "Vengeance", "Victory", "Viper", "Vortex", "Woe", "Wrath"};
		if(baseItem=="Amulet"){
			String [] nameSuffixes = {"Beads","Braid","Charm","Choker","Clasp","Collar","Idol","Gorget","Heart","Locket","Medallion","Noose","Pendant",
					"Rosary","Scarab","Talisman","Torc"};
			itemName=namePrefixes[randomNumber(0,namePrefixes.length-1)]+" "+nameSuffixes[randomNumber(0,nameSuffixes.length-1)];
		}
	}
	public static void useAlchemy(){
		if(rarity=="Normal"){
			generateItemName();
			rarity="Rare";
			numMods=randomNumber(4,6);
			for(int i = 0; i<numMods; i++){
				addModifier();
				//System.out.println("added modifier");
			}
			alchsUsed++;
		}
	}
	public static void useEternal(){
		eternalUsed++;
		Point pos = new Point(7,388);

		for(int i = 0; i< 4; i++){
			for(int j = 0; j<8;j++){
				pos=(new Point(7+(j*50),389+(i*50)));
				if(stash[i][j]==null){
					stash[i][j]=new Imprint(itemName, rarity, pos);
					System.out.println("added imprint");
					return;
				}
			}
		}
	}
	public static void useBlessed(){
		blessedUsed++;
	}
	public static void useDivine(){
		divinesUsed++;
	}
	public static boolean alreadyHasMod(ItemModifier mod){
		for(int i = 0; i<mods.size();i++){
			if(mods.get(i).affixName==mod.affixName){
				return true;
			}
		}
		return false;
	}
	public static void useTransmutation(){
		if(rarity=="Normal"){
			rarity="Magic";
			numMods=randomNumber(1,2);
			for(int i = 0; i<numMods; i++){
				addModifier();
			}
			transmutesUsed++;
		}
	}
	public static void useRegal(){
		if(rarity=="Magic"){
			rarity="Rare";
			numMods++;
			addModifier();
			generateItemName();
			regalsUsed++;
		}
	}
	public static void useChance(){
		if(rarity=="Normal"){
			if(randomNumber(1,54)<=10){
				generateItemName();
				rarity="Rare";
				numMods=randomNumber(4,6);
				for(int i = 0; i<numMods; i++){
					addModifier();
					//System.out.println("added modifier");
				}
			}
			else{
				if(rarity=="Normal"){
					rarity="Magic";
					numMods=randomNumber(1,2);
					for(int i = 0; i<numMods; i++){
						addModifier();
					}
				}
			}
			chancesUsed++;
		}
	}
	public static void useScouring(){
		if(rarity=="Magic"||rarity=="Rare"){
			rarity="Normal";
			numMods=0;
			mods.clear();
			itemName="";
			scoursUsed++;
		}
	}
	public static void useAlteration(){
		if(rarity=="Magic"){
			if(rarity=="Magic"||rarity=="Rare"){
				rarity="Normal";
				numMods=0;
				mods.clear();
				itemName="";
			}
			if(rarity=="Normal"){
				rarity="Magic";
				numMods=randomNumber(1,2);
				for(int i = 0; i<numMods; i++){
					addModifier();
				}
			}
			alterationsUsed++;
		}
	}
	public static void useChaos(){
		if(rarity=="Rare"){
			if(rarity=="Magic"||rarity=="Rare"){
				rarity="Normal";
				numMods=0;
				mods.clear();
				itemName="";
			}
			if(rarity=="Normal"){
				generateItemName();
				rarity="Rare";
				numMods=randomNumber(4,6);
				for(int i = 0; i<numMods; i++){
					addModifier();
					//System.out.println("added modifier");
				}
			}
			chaosUsed++;
		}
	}
	public static void useAugmentation(){
		if(rarity=="Magic"&&numMods==1){
			numMods++;
			addModifier();
			augmentationsUsed++;
		}
	}
	public static void useExalted(){
		if(rarity=="Rare"&&numMods<6){
			numMods++;
			addModifier();
			exaltsUsed++;
		}
	}

	public void Draw(Graphics g){

	}

}
