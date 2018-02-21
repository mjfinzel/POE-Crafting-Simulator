package src;

import java.awt.Graphics;
import java.awt.Point;


public class ItemModifier {
	String description;
	Point range;
	int rarity;
	int id;
	int rarityUpperBound;
	int rarityLowerBound;
	int affixRoll;
	int affixRollMax;
	int affixRollMin;
	int requiredILVL=DivineOrb.ilvl;
	int roll;
	int modLVL;
	int tier;
	public String affixCatagory="";
	String affixType="prefix";
	String affixName = "";
	String baseItem="Amulet";
	public ItemModifier(int ID, String affix){
		affixType=affix;
		id=ID;
		//item is an amulet
		
		if(baseItem=="Amulet"){

			if(affixType=="prefix"){


				//added physical dmg
				if(id==0){
					affixCatagory="Added Physical Damage";
					affixName = "Glinting";
					rarity=1181;
					modLVL=5;
					affixRollMin=1;
					affixRollMax=2;
					description="Adds "+affixRollMin+" to "+affixRollMax+" physical damage to attacks";
				}
				else if(id==1){
					affixCatagory="Added Physical Damage";
					affixName = "Burnished";
					rarity=1181;
					modLVL=13;
					affixRollMin=DivineOrb.randomNumber(2,3);
					affixRollMax=DivineOrb.randomNumber(4,5);
					description="Adds "+affixRollMin+" to "+affixRollMax+" physical damage to attacks";
				}
				else if(id==2){
					affixCatagory="Added Physical Damage";
					affixName = "Polished";
					rarity=1181;
					modLVL=19;
					affixRollMin=DivineOrb.randomNumber(3,4);
					affixRollMax=DivineOrb.randomNumber(6,7);
					description="Adds "+affixRollMin+" to "+affixRollMax+" physical damage to attacks";
				}
				else if(id==3){
					affixCatagory="Added Physical Damage";
					affixName = "Honed";
					rarity=1181;
					modLVL=28;
					affixRollMin=DivineOrb.randomNumber(4,6);
					affixRollMax=DivineOrb.randomNumber(9,10);
					description="Adds "+affixRollMin+" to "+affixRollMax+" physical damage to attacks";
				}
				else if(id==4){
					affixCatagory="Added Physical Damage";
					affixName = "Gleaming";
					rarity=1181;
					modLVL=35;
					affixRollMin=DivineOrb.randomNumber(5,7);
					affixRollMax=DivineOrb.randomNumber(11,12);
					description="Adds "+affixRollMin+" to "+affixRollMax+" physical damage to attacks";
				}
				else if(id==5){
					affixCatagory="Added Physical Damage";
					affixName = "Annealed";
					rarity=1181;
					modLVL=44;
					affixRollMin=DivineOrb.randomNumber(6,9);
					affixRollMax=DivineOrb.randomNumber(13,15);
					description="Adds "+affixRollMin+" to "+affixRollMax+" physical damage to attacks";
				}
				else if(id==6){
					affixCatagory="Added Physical Damage";
					affixName = "Razor Sharp";
					rarity=1181;
					modLVL=52;
					affixRollMin=DivineOrb.randomNumber(7,10);
					affixRollMax=DivineOrb.randomNumber(15,18);
					description="Adds "+affixRollMin+" to "+affixRollMax+" physical damage to attacks";
				}
				else if(id==7){
					affixCatagory="Added Physical Damage";
					affixName = "Tempered";
					rarity=1181;
					modLVL=64;
					affixRollMin=DivineOrb.randomNumber(9,12);
					affixRollMax=DivineOrb.randomNumber(19,22);
					description="Adds "+affixRollMin+" to "+affixRollMax+" physical damage to attacks";
					tier = 2;
				}
				else if(id==8){
					affixCatagory="Added Physical Damage";
					affixName = "Flaring";
					rarity=1181;
					modLVL=76;
					affixRollMin=DivineOrb.randomNumber(11,15);
					affixRollMax=DivineOrb.randomNumber(22,26);
					description="Adds "+affixRollMin+" to "+affixRollMax+" physical damage to attacks";
					tier = 1;
				}

				//Increased Energy Shield
				else if(id==9){
					affixCatagory="Increased Maximum Energy Shield";
					affixName = "Shining";
					rarity=1181;
					modLVL=3;
					affixRoll=DivineOrb.randomNumber(1, 3);
					description="+"+affixRoll+" to maximum Energy Shield";
				}
				else if(id==10){
					affixCatagory="Increased Maximum Energy Shield";
					affixName = "Glimmering";
					rarity=1181;
					modLVL=11;
					affixRoll=DivineOrb.randomNumber(4, 8);
					description="+"+affixRoll+" to maximum Energy Shield";
				}
				else if(id==11){
					affixCatagory="Increased Maximum Energy Shield";
					affixName = "Glittering";
					rarity=1181;
					modLVL=17;
					affixRoll=DivineOrb.randomNumber(9, 12);
					description="+"+affixRoll+" to maximum Energy Shield";
				}
				else if(id==12){
					affixCatagory="Increased Maximum Energy Shield";
					affixName = "Glowing";
					rarity=1181;
					modLVL=23;
					affixRoll=DivineOrb.randomNumber(13, 15);
					description="+"+affixRoll+" to maximum Energy Shield";
				}
				else if(id==13){
					affixCatagory="Increased Maximum Energy Shield";
					affixName = "Radiating";
					rarity=1181;
					modLVL=29;
					affixRoll=DivineOrb.randomNumber(16, 19);
					description="+"+affixRoll+" to maximum Energy Shield";
				}
				else if(id==14){
					affixCatagory="Increased Maximum Energy Shield";
					affixName = "Pulsing";
					rarity=1181;
					modLVL=35;
					affixRoll=DivineOrb.randomNumber(20, 22);
					description="+"+affixRoll+" to maximum Energy Shield";
				}
				else if(id==15){
					affixCatagory="Increased Maximum Energy Shield";
					affixName = "Seething";
					rarity=1181;
					modLVL=42;
					affixRoll=DivineOrb.randomNumber(23, 26);
					description="+"+affixRoll+" to maximum Energy Shield";
				}
				else if(id==16){
					affixCatagory="Increased Maximum Energy Shield";
					affixName = "Blazing";
					rarity=1181;
					modLVL=50;
					affixRoll=DivineOrb.randomNumber(27, 31);
					description="+"+affixRoll+" to maximum Energy Shield";
				}
				else if(id==17){
					affixCatagory="Increased Maximum Energy Shield";
					affixName = "Scintillating";
					rarity=1181;
					modLVL=59;
					affixRoll=DivineOrb.randomNumber(32, 37);
					description="+"+affixRoll+" to maximum Energy Shield";
				}
				else if(id==18){
					affixCatagory="Increased Maximum Energy Shield";
					affixName = "Incandescent";
					rarity=1181;
					modLVL=68;
					affixRoll=DivineOrb.randomNumber(38, 43);
					description="+"+affixRoll+" to maximum Energy Shield";
					tier = 2;
				}
				else if(id==19){
					affixCatagory="Increased Maximum Energy Shield";
					affixName = "Resplendent";
					rarity=1181;
					modLVL=74;
					affixRoll=DivineOrb.randomNumber(44, 47);
					description="+"+affixRoll+" to Maximum Energy Shield";
					tier = 1;
				}

				//Percent increased energy shield
				else if(id==20){
					affixCatagory="Percent Increased Energy Shield";
					affixName = "Protective";
					rarity=1181;
					modLVL=3;
					affixRoll=DivineOrb.randomNumber(2, 4);
					description=affixRoll+"% increased maximum Energy Shield";
				}
				else if(id==21){
					affixCatagory="Percent Increased Energy Shield";
					affixName = "Strong-Willed";
					rarity=1181;
					modLVL=18;
					affixRoll=DivineOrb.randomNumber(5, 7);
					description=affixRoll+"% increased maximum Energy Shield";
				}
				else if(id==22){
					affixCatagory="Percent Increased Energy Shield";
					affixName = "Resolute";
					rarity=1181;
					modLVL=30;
					affixRoll=DivineOrb.randomNumber(8, 10);
					description=affixRoll+"% increased maximum Energy Shield";
				}
				else if(id==23){
					affixCatagory="Percent Increased Energy Shield";
					affixName = "Fearless";
					rarity=1181;
					modLVL=42;
					affixRoll=DivineOrb.randomNumber(11, 13);
					description=affixRoll+"% increased maximum Energy Shield";
				}
				else if(id==24){
					affixCatagory="Percent Increased Energy Shield";
					affixName = "Dauntless";
					rarity=1181;
					modLVL=56;
					affixRoll=DivineOrb.randomNumber(14, 16);
					description=affixRoll+"% increased maximum Energy Shield";
				}
				else if(id==25){
					affixCatagory="Percent Increased Energy Shield";
					affixName = "Indomitable";
					rarity=1181;
					modLVL=70;
					affixRoll=DivineOrb.randomNumber(17, 19);
					description=affixRoll+"% increased maximum Energy Shield";
					tier = 2;
				}
				else if(id==26){
					affixCatagory="Percent Increased Energy Shield";
					affixName = "Unassailable";
					rarity=1181;
					modLVL=77;
					affixRoll=DivineOrb.randomNumber(20, 22);
					description=affixRoll+"% increased maximum Energy Shield";
					tier = 1;
				}

				//Percent increased evasion rating
				else if(id==27){
					affixCatagory="Percent Increased Evasion Rating";
					affixName = "Agile";
					rarity=1181;
					modLVL=2;
					affixRoll=DivineOrb.randomNumber(2, 4);
					description=affixRoll+"% increased Evasion Rating";
				}
				else if(id==28){
					affixCatagory="Percent Increased Evasion Rating";
					affixName = "Dancer's";
					rarity=1181;
					modLVL=19;
					affixRoll=DivineOrb.randomNumber(5, 7);
					description=affixRoll+"% increased Evasion Rating";
				}
				else if(id==29){
					affixCatagory="Percent Increased Evasion Rating";
					affixName = "Acrobat's";
					rarity=1181;
					modLVL=30;
					affixRoll=DivineOrb.randomNumber(8, 10);
					description=affixRoll+"% increased Evasion Rating";
				}
				else if(id==30){
					affixCatagory="Percent Increased Evasion Rating";
					affixName = "Fleet";
					rarity=1181;
					modLVL=42;
					affixRoll=DivineOrb.randomNumber(11, 13);
					description=affixRoll+"% increased Evasion Rating";
				}
				else if(id==31){
					affixCatagory="Percent Increased Evasion Rating";
					affixName = "Blurred";
					rarity=1181;
					modLVL=56;
					affixRoll=DivineOrb.randomNumber(14, 16);
					description=affixRoll+"% increased Evasion Rating";
				}
				else if(id==32){
					affixCatagory="Percent Increased Evasion Rating";
					affixName = "Phased";
					rarity=1181;
					modLVL=70;
					affixRoll=DivineOrb.randomNumber(17, 19);
					description=affixRoll+"% increased Evasion Rating";
					tier = 2;
				}
				else if(id==33){
					affixCatagory="Percent Increased Evasion Rating";
					affixName = "Vaporous";
					rarity=1181;
					modLVL=77;
					affixRoll=DivineOrb.randomNumber(20, 22);
					description=affixRoll+"% increased Evasion Rating";
					tier = 1;
				}

				//Increased Life
				else if(id==34){
					affixCatagory="Increased Life";
					affixName = "Healthy";
					rarity=1181;
					modLVL=1;
					affixRoll=DivineOrb.randomNumber(10, 19);
					description="+"+affixRoll+" to maximum Life";
				}
				else if(id==35){
					affixCatagory="Increased Life";
					affixName = "Sanguine";
					rarity=1181;
					modLVL=11;
					affixRoll=DivineOrb.randomNumber(20, 29);
					description="+"+affixRoll+" to maximum Life";
				}
				else if(id==36){
					affixCatagory="Increased Life";
					affixName = "Stalwart";
					rarity=1181;
					modLVL=18;
					affixRoll=DivineOrb.randomNumber(30, 39);
					description="+"+affixRoll+" to maximum Life";
				}
				else if(id==37){
					affixCatagory="Increased Life";
					affixName = "Stout";
					rarity=1181;
					modLVL=24;
					affixRoll=DivineOrb.randomNumber(40, 49);
					description="+"+affixRoll+" to maximum Life";
				}
				else if(id==38){
					affixCatagory="Increased Life";
					affixName = "Robust";
					rarity=1181;
					modLVL=30;
					affixRoll=DivineOrb.randomNumber(50, 59);
					description="+"+affixRoll+" to maximum Life";
				}
				else if(id==39){
					affixCatagory="Increased Life";
					affixName = "Rotund";
					rarity=1181;
					modLVL=36;
					affixRoll=DivineOrb.randomNumber(60, 69);
					description="+"+affixRoll+" to maximum Life";
					tier = 2;
				}
				else if(id==40){
					affixCatagory="Increased Life";
					affixName = "Virile";
					rarity=1181;
					modLVL=44;
					affixRoll=DivineOrb.randomNumber(70, 79);
					description="+"+affixRoll+" to maximum Life";
					tier = 1;
				}

				//Increased Mana
				else if(id==41){
					affixCatagory="Increased Mana";
					affixName = "Beryl";
					rarity=1181;
					modLVL=1;
					range = new Point(15,19);
					affixRoll=DivineOrb.randomNumber(range.x,range.y);
					description="+"+affixRoll+" to Maximum Mana";
				}
				else if(id==42){
					affixCatagory="Increased Mana";
					affixName = "Cobalt";
					rarity=1181;
					modLVL=11;
					range = new Point(20,24);
					affixRoll=DivineOrb.randomNumber(range.x,range.y);
					description="+"+affixRoll+" to Maximum Mana";
				}
				else if(id==43){
					affixCatagory="Increased Mana";
					affixName = "Azure";
					rarity=1181;
					modLVL=17;
					range = new Point(25,29);
					affixRoll=DivineOrb.randomNumber(range.x,range.y);
					description="+"+affixRoll+" to Maximum Mana";
				}
				else if(id==44){
					affixCatagory="Increased Mana";
					affixName = "Sapphire";
					rarity=1181;
					modLVL=23;
					range = new Point(30,34);
					affixRoll=DivineOrb.randomNumber(range.x,range.y);
					description="+"+affixRoll+" to Maximum Mana";
				}
				else if(id==45){
					affixCatagory="Increased Mana";
					affixName = "Cerulean";
					rarity=1181;
					modLVL=29;
					range = new Point(35,39);
					affixRoll=DivineOrb.randomNumber(range.x,range.y);
					description="+"+affixRoll+" to Maximum Mana";
				}
				else if(id==46){
					affixCatagory="Increased Mana";
					affixName = "Aqua";
					rarity=1181;
					modLVL=35;
					range = new Point(40,44);
					affixRoll=DivineOrb.randomNumber(range.x,range.y);
					description="+"+affixRoll+" to Maximum Mana";
				}
				else if(id==47){
					affixCatagory="Increased Mana";
					affixName = "Opanescent";
					rarity=1181;
					modLVL=42;
					range = new Point(45,49);
					affixRoll=DivineOrb.randomNumber(range.x,range.y);
					description="+"+affixRoll+" to Maximum Mana";
				}
				else if(id==48){
					affixCatagory="Increased Mana";
					affixName = "Gentian";
					rarity=1181;
					modLVL=51;
					range = new Point(50,54);
					affixRoll=DivineOrb.randomNumber(range.x,range.y);
					description="+"+affixRoll+" to Maximum Mana";
				}
				else if(id==49){
					affixCatagory="Increased Mana";
					affixName = "Chalybeous";
					rarity=1181;
					modLVL=60;
					range = new Point(55,59);
					affixRoll=DivineOrb.randomNumber(range.x,range.y);
					description="+"+affixRoll+" to Maximum Mana";
				}
				else if(id==50){
					affixCatagory="Increased Mana";
					affixName = "Mazerine";
					rarity=1181;
					modLVL=69;
					range = new Point(60,64);
					affixRoll=DivineOrb.randomNumber(range.x,range.y);
					description="+"+affixRoll+" to Maximum Mana";
					tier = 2;
				}
				else if(id==51){
					affixCatagory="Increased Mana";
					affixName = "Blue";
					rarity=1181;
					modLVL=75;
					range = new Point(65,68);
					affixRoll=DivineOrb.randomNumber(range.x,range.y);
					description="+"+affixRoll+" to Maximum Mana";
					tier = 1;
				}

				//Percent increased Armour
				else if(id==52){
					affixCatagory="Percent Increased Armour";
					affixName = "Reinforced";
					rarity=1181;
					modLVL=2;
					range = new Point(2,4);
					affixRoll=DivineOrb.randomNumber(range.x,range.y);
					description=affixRoll+"% increased Armour";
				}
				else if(id==53){
					affixCatagory="Percent Increased Armour";
					affixName = "Layered";
					rarity=1181;
					modLVL=18;
					range = new Point(5,7);
					affixRoll=DivineOrb.randomNumber(range.x,range.y);
					description=affixRoll+"% increased Armour";
				}
				else if(id==54){
					affixCatagory="Percent Increased Armour";
					affixName = "Lobstered";
					rarity=1181;
					modLVL=30;
					range = new Point(8,10);
					affixRoll=DivineOrb.randomNumber(range.x,range.y);
					description=affixRoll+"% increased Armour";
				}
				else if(id==55){
					affixCatagory="Percent Increased Armour";
					affixName = "Buttressed";
					rarity=1181;
					modLVL=42;
					range = new Point(11,13);
					affixRoll=DivineOrb.randomNumber(range.x,range.y);
					description=affixRoll+"% increased Armour";
				}
				else if(id==56){
					affixCatagory="Percent Increased Armour";
					affixName = "Thickened";
					rarity=1181;
					modLVL=56;
					range = new Point(14,16);
					affixRoll=DivineOrb.randomNumber(range.x,range.y);
					description=affixRoll+"% increased Armour";
				}
				else if(id==57){
					affixCatagory="Percent Increased Armour";
					affixName = "Solid";
					rarity=1181;
					modLVL=70;
					range = new Point(17,19);
					affixRoll=DivineOrb.randomNumber(range.x,range.y);
					description=affixRoll+"% increased Armour";
					tier = 2;
				}
				else if(id==58){
					affixCatagory="Percent Increased Armour";
					affixName = "Impregnable";
					rarity=1181;
					modLVL=77;
					range = new Point(20,22);
					affixRoll=DivineOrb.randomNumber(range.x,range.y);
					description=affixRoll+"% increased Armour";
					tier = 1;
				}

				//increased rarity of items found
				else if(id==59){
					affixCatagory="Prefix Item Rarity";
					affixName = "Magpie's";
					rarity=1181;
					modLVL=20;
					range = new Point(8,12);
					affixRoll=DivineOrb.randomNumber(range.x,range.y);
					description=affixRoll+"% increased Elemental Damage";
				}
				else if(id==60){
					affixCatagory="Prefix Item Rarity";
					affixName = "Pirates";
					rarity=1181;
					modLVL=39;
					range = new Point(13,18);
					affixRoll=DivineOrb.randomNumber(range.x,range.y);
					description=affixRoll+"% increased Elemental Damage";
					tier = 2;
				}
				else if(id==61){
					affixCatagory="Prefix Item Rarity";
					affixName = "Dragon's";
					rarity=1181;
					modLVL=62;
					range = new Point(19,24);
					affixRoll=DivineOrb.randomNumber(range.x,range.y);
					description=affixRoll+"% increased rarity of Items found";
					tier = 1;
				}

				//Life Leech
				else if(id==62){
					affixCatagory="Life Leech";
					affixName = "Remora's";
					rarity=1181;
					modLVL=9;
					range = new Point(1,2);
					affixRoll=DivineOrb.randomNumber(range.x,range.y);
					description=affixRoll+"% of Physical damage Leeched back as Life";
				}
				else if(id==63){
					affixCatagory="Life Leech";
					affixName = "Lamprey's";
					rarity=590;
					modLVL=25;
					range = new Point(3,4);
					affixRoll=DivineOrb.randomNumber(range.x,range.y);
					description=affixRoll+"% of Physical damage Leeched back as Life";
					tier = 2;
				}
				else if(id==64){
					affixCatagory="Life Leech";
					affixName = "Vampire's";
					rarity=295;
					modLVL=72;
					range = new Point(5,6);
					affixRoll=DivineOrb.randomNumber(range.x,range.y);
					description=affixRoll+"% of Physical damage Leeched back as Life";
					tier = 1;
				}

				//Mana Leech
				else if(id==65){
					affixCatagory="Mana Leech";
					affixName = "Thirsty";
					rarity=1181;
					modLVL=9;
					range = new Point(1,2);
					affixRoll=DivineOrb.randomNumber(range.x,range.y);
					description=affixRoll+"% of Physical damage Leeched back as Mana";
					tier = 2;
				}
				else if(id==66){
					affixCatagory="Mana Leech";
					affixName = "Parched";
					rarity=1181;
					modLVL=74;
					range = new Point(3,4);
					affixRoll=DivineOrb.randomNumber(range.x,range.y);
					description=affixRoll+"% of Physical damage Leeched back as Mana";
					tier = 1;
				}

				//Percent Increased Spell damage
				else if(id==67){
					affixCatagory="Spell Damage";
					affixName = "Chanter's";
					rarity=1181;
					modLVL=5;
					range = new Point(3,7);
					affixRoll=DivineOrb.randomNumber(range.x,range.y);
					description=affixRoll+"% increased spell damage";
				}
				else if(id==68){
					affixCatagory="Spell Damage";
					affixName = "Mage's";
					rarity=1181;
					modLVL=20;
					range = new Point(8,12);
					affixRoll=DivineOrb.randomNumber(range.x,range.y);
					description=affixRoll+"% increased spell damage";
				}
				else if(id==69){
					affixCatagory="Spell Damage";
					affixName = "Sorcerer's";
					rarity=1181;
					modLVL=38;
					range = new Point(13,17);
					affixRoll=DivineOrb.randomNumber(range.x,range.y);
					description=affixRoll+"% increased spell damage";
				}
				else if(id==70){
					affixCatagory="Spell Damage";
					affixName = "Thaumaturgist's";
					rarity=1181;
					modLVL=56;
					range = new Point(18,22);
					affixRoll=DivineOrb.randomNumber(range.x,range.y);
					description=affixRoll+"% increased spell damage";
					tier = 2;
				}
				else if(id==71){
					affixCatagory="Spell Damage";
					affixName = "Wizard's";
					rarity=1181;
					modLVL=76;
					range = new Point(23,26);
					affixRoll=DivineOrb.randomNumber(range.x,range.y);
					description=affixRoll+"% increased spell damage";
					tier = 1;
				}

				//Added cold Damage
				else if(id==72){
					affixCatagory="Added Cold Damage";
					affixName = "Frosted";
					rarity=590;
					modLVL=2;
					affixRollMin=DivineOrb.randomNumber(1,1);
					affixRollMax=DivineOrb.randomNumber(2,2);
					description="Adds "+affixRollMin+" to "+affixRollMax+" cold Damage";
				}
				else if(id==73){
					affixCatagory="Added Cold Damage";
					affixName = "Chilled";
					rarity=590;
					modLVL=13;
					affixRollMin=DivineOrb.randomNumber(3,4);
					affixRollMax=DivineOrb.randomNumber(7,8);
					description="Adds "+affixRollMin+" to "+affixRollMax+" cold Damage";
				}
				else if(id==74){
					affixCatagory="Added Cold Damage";
					affixName = "Icy";
					rarity=590;
					modLVL=14;
					affixRollMin=DivineOrb.randomNumber(5,7);
					affixRollMax=DivineOrb.randomNumber(11,12);
					description="Adds "+affixRollMin+" to "+affixRollMax+" cold Damage";
				}
				else if(id==75){
					affixCatagory="Added Cold Damage";
					affixName = "Frigid";
					rarity=590;
					modLVL=29;
					affixRollMin=DivineOrb.randomNumber(6,9);
					affixRollMax=DivineOrb.randomNumber(13,16);
					description="Adds "+affixRollMin+" to "+affixRollMax+" cold Damage";
				}
				else if(id==76){
					affixCatagory="Added Cold Damage";
					affixName = "Freezing";
					rarity=590;
					modLVL=36;
					affixRollMin=DivineOrb.randomNumber(8,11);
					affixRollMax=DivineOrb.randomNumber(16,19);
					description="Adds "+affixRollMin+" to "+affixRollMax+" cold Damage";
				}
				else if(id==77){
					affixCatagory="Added Cold Damage";
					affixName = "Frozen";
					rarity=590;
					modLVL=45;
					affixRollMin=DivineOrb.randomNumber(10,13);
					affixRollMax=DivineOrb.randomNumber(20,24);
					description="Adds "+affixRollMin+" to "+affixRollMax+" cold Damage";
				}
				else if(id==78){
					affixCatagory="Added Cold Damage";
					affixName = "Glaciated";
					rarity=590;
					modLVL=53;
					affixRollMin=DivineOrb.randomNumber(12,16);
					affixRollMax=DivineOrb.randomNumber(24,28);
					description="Adds "+affixRollMin+" to "+affixRollMax+" cold Damage";
				}
				else if(id==79){
					affixCatagory="Added Cold Damage";
					affixName = "Polar";
					rarity=590;
					modLVL=65;affixRollMin=DivineOrb.randomNumber(14,19);
					affixRollMax=DivineOrb.randomNumber(29,34);
					description="Adds "+affixRollMin+" to "+affixRollMax+" cold Damage";
					tier = 2;
				}
				else if(id==80){
					affixCatagory="Added Cold Damage";
					affixName = "Entombing";
					rarity=295;
					modLVL=77;
					affixRollMin=DivineOrb.randomNumber(17,22);
					affixRollMax=DivineOrb.randomNumber(34,40);
					description="Adds "+affixRollMin+" to "+affixRollMax+" cold Damage";
					tier = 1;
				}

				//Added Fire damage
				else if(id==81){
					affixCatagory="Added Fire Damage";
					affixName = "Heated";
					rarity=590;
					modLVL=1;
					affixRollMin=DivineOrb.randomNumber(1,1);
					affixRollMax=DivineOrb.randomNumber(2,2);
					description="Adds "+affixRollMin+" to "+affixRollMax+" Fire Damage";
				}
				else if(id==82){
					affixCatagory="Added Fire Damage";
					affixName = "Smoldering";
					rarity=590;
					modLVL=12;
					affixRollMin=DivineOrb.randomNumber(3,5);
					affixRollMax=DivineOrb.randomNumber(7,8);
					description="Adds "+affixRollMin+" to "+affixRollMax+" Fire Damage";
				}
				else if(id==83){
					affixCatagory="Added Fire Damage";
					affixName = "Smoking";
					rarity=590;
					modLVL=20;
					affixRollMin=DivineOrb.randomNumber(5,7);
					affixRollMax=DivineOrb.randomNumber(11,13);
					description="Adds "+affixRollMin+" to "+affixRollMax+" Fire Damage";
				}
				else if(id==84){
					affixCatagory="Added Fire Damage";
					affixName = "Burning";
					rarity=590;
					modLVL=28;
					affixRollMin=DivineOrb.randomNumber(7,10);
					affixRollMax=DivineOrb.randomNumber(15,18);
					description="Adds "+affixRollMin+" to "+affixRollMax+" Fire Damage";
				}
				else if(id==85){
					affixCatagory="Added Fire Damage";
					affixName = "Flaming";
					rarity=590;
					modLVL=35;
					affixRollMin=DivineOrb.randomNumber(9,12);
					affixRollMax=DivineOrb.randomNumber(19,22);
					description="Adds "+affixRollMin+" to "+affixRollMax+" Fire Damage";
				}
				else if(id==86){
					affixCatagory="Added Fire Damage";
					affixName = "Scorching";
					rarity=590;
					modLVL=44;
					affixRollMin=DivineOrb.randomNumber(11,15);
					affixRollMax=DivineOrb.randomNumber(23,27);
					description="Adds "+affixRollMin+" to "+affixRollMax+" Fire Damage";
				}
				else if(id==87){
					affixCatagory="Added Fire Damage";
					affixName = "Incinerating";
					rarity=590;
					modLVL=52;
					affixRollMin=DivineOrb.randomNumber(13,18);
					affixRollMax=DivineOrb.randomNumber(27,31);
					description="Adds "+affixRollMin+" to "+affixRollMax+" Fire Damage";
				}
				else if(id==88){
					affixCatagory="Added Fire Damage";
					affixName = "Blasting";
					rarity=590;
					modLVL=64;
					affixRollMin=DivineOrb.randomNumber(16,22);
					affixRollMax=DivineOrb.randomNumber(32,38);
					description="Adds "+affixRollMin+" to "+affixRollMax+" Fire Damage";
					tier = 2;
				}
				else if(id==89){
					affixCatagory="Added Fire Damage";
					affixName = "Cremating";
					rarity=295;
					modLVL=76;
					affixRollMin=DivineOrb.randomNumber(19,25);
					affixRollMax=DivineOrb.randomNumber(39,45);
					description="Adds "+affixRollMin+" to "+affixRollMax+" Fire Damage";
					tier = 1;
				}

				//Added lightning damage
				else if(id==90){
					affixCatagory="Added Lightning Damage";
					affixName = "Humming";
					rarity=590;
					modLVL=3;
					description="Adds "+5+" lightning damage";
				}
				else if(id==91){
					affixCatagory="Added Lightning Damage";
					affixName = "Buzzing";
					rarity=590;
					modLVL=13;
					affixRollMin=DivineOrb.randomNumber(1,1);
					affixRollMax=DivineOrb.randomNumber(14,15);
					description="Adds "+affixRollMin+" to "+affixRollMax+" Lightning Damage";
				}
				else if(id==92){
					affixCatagory="Added Lightning Damage";
					affixName = "Snapping";
					rarity=590;
					modLVL=22;
					affixRollMin=DivineOrb.randomNumber(1,2);
					affixRollMax=DivineOrb.randomNumber(22,23);
					description="Adds "+affixRollMin+" to "+affixRollMax+" Lightning Damage";
				}
				else if(id==93){
					affixCatagory="Added Lightning Damage";
					affixName = "Crackling";
					rarity=590;
					modLVL=28;
					affixRollMin=DivineOrb.randomNumber(1,2);
					affixRollMax=DivineOrb.randomNumber(27,28);
					description="Adds "+affixRollMin+" to "+affixRollMax+" Lightning Damage";
				}
				else if(id==94){
					affixCatagory="Added Lightning Damage";
					affixName = "Sparking";
					rarity=590;
					modLVL=35;
					affixRollMin=DivineOrb.randomNumber(1,3);
					affixRollMax=DivineOrb.randomNumber(33,34);
					description="Adds "+affixRollMin+" to "+affixRollMax+" Lightning Damage";
				}
				else if(id==95){
					affixCatagory="Added Lightning Damage";
					affixName = "Arcing";
					rarity=590;
					modLVL=44;
					affixRollMin=DivineOrb.randomNumber(1,4);
					affixRollMax=DivineOrb.randomNumber(40,43);
					description="Adds "+affixRollMin+" to "+affixRollMax+" Lightning Damage";
				}
				else if(id==96){
					affixCatagory="Added Lightning Damage";
					affixName = "Shocking";
					rarity=590;
					modLVL=52;
					affixRollMin=DivineOrb.randomNumber(2,5);
					affixRollMax=DivineOrb.randomNumber(47,50);
					description="Adds "+affixRollMin+" to "+affixRollMax+" Lightning Damage";
				}
				else if(id==97){
					affixCatagory="Added Lightning Damage";
					affixName = "Discharging";
					rarity=590;
					modLVL=64;
					affixRollMin=DivineOrb.randomNumber(3,6);
					affixRollMax=DivineOrb.randomNumber(57,61);
					description="Adds "+affixRollMin+" to "+affixRollMax+" Lightning Damage";
					tier = 2;
				}
				else if(id==98){
					affixCatagory="Added Lightning Damage";
					affixName = "Electrocuting";
					rarity=295;
					modLVL=76;
					affixRollMin=DivineOrb.randomNumber(3,7);
					affixRollMax=DivineOrb.randomNumber(68,72);
					description="Adds "+affixRollMin+" to "+affixRollMax+" Lightning Damage";
					tier = 1;
				}

				//Weapon elemental damage
				else if(id==99){
					affixCatagory="Weapon Elemental Damage";
					affixName = "Catalyzing";
					rarity=354;
					modLVL=4;
					range = new Point(5,10);
					affixRoll=DivineOrb.randomNumber(range.x,range.y);
					description=affixRoll+"% increased Elemental Damage";
				}
				else if(id==100){
					affixCatagory="Weapon Elemental Damage";
					affixName = "Infusing";
					rarity=354;
					modLVL=15;
					range = new Point(11,20);
					affixRoll=DivineOrb.randomNumber(range.x,range.y);
					description=affixRoll+"% increased Elemental Damage";
				}
				else if(id==101){
					affixCatagory="Weapon Elemental Damage";
					affixName = "Empowering";
					rarity=354;
					modLVL=30;
					range = new Point(21,30);
					affixRoll=DivineOrb.randomNumber(range.x,range.y);
					description=affixRoll+"% increased Elemental Damage";
					tier = 2;
				}
				else if(id==102){
					affixCatagory="Weapon Elemental Damage";
					affixName = "Unleashed";
					rarity=354;
					modLVL=75;
					range = new Point(31,36);
					affixRoll=DivineOrb.randomNumber(range.x,range.y);
					description=affixRoll+"% increased Elemental Damage";
					tier = 1;
				}
			}
			else if(affixType=="suffix"){
				//all resist
				if(id==0){
					affixCatagory="All Resistance";
					affixName = " of the Crystal";
					rarity=873;
					modLVL=12;
					range = new Point(3,5);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+"% to all Elemental Resistances";
				}
				else if(id==1){
					affixCatagory="All Resistance";
					affixName = " of the Prism";
					rarity=873;
					modLVL=24;
					range = new Point(6,8);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+"% to all Elemental Resistances";
				}
				else if(id==2){
					affixCatagory="All Resistance";
					affixName = " of the Kaleidoscope";
					rarity=873;
					modLVL=36;
					range = new Point(9,11);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+"% to all Elemental Resistances";
				}
				else if(id==3){
					affixCatagory="All Resistance";
					affixName = " of Variegation";
					rarity=873;
					modLVL=48;
					range = new Point(12,14);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+"% to all Elemental Resistances";
					tier = 2;
				}
				else if(id==4){
					affixCatagory="All Resistance";
					affixName = " of the Rainbow";
					rarity=873;
					modLVL=60;
					range = new Point(15,16);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+"% to all Elemental Resistances";
					tier = 1;
				}

				//cold resist
				else if(id==5){
					affixCatagory="Cold Resistance";
					affixName = " of the Inuit";
					rarity=873;
					modLVL=1;
					range = new Point(6,11);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% Increased Cold Resistance";
				}
				else if(id==6){
					affixCatagory="Cold Resistance";
					affixName = " of the Seal";
					rarity=873;
					modLVL=14;
					range = new Point(12,17);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% Increased Cold Resistance";
				}
				else if(id==7){
					affixCatagory="Cold Resistance";
					affixName = " of the Penguin";
					rarity=873;
					modLVL=26;
					range = new Point(18,23);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% Increased Cold Resistance";
				}
				else if(id==8){
					affixCatagory="Cold Resistance";
					affixName = " of the Yeti";
					rarity=873;
					modLVL=38;
					range = new Point(24,29);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% Increased Cold Resistance";
				}
				else if(id==9){
					affixCatagory="Cold Resistance";
					affixName = " of the Walrus";
					rarity=873;
					modLVL=50;
					range = new Point(30,35);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% Increased Cold Resistance";
				}
				else if(id==10){
					affixCatagory="Cold Resistance";
					affixName = " of the Polar Bear";
					rarity=873;
					modLVL=60;
					range = new Point(36,41);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% Increased Cold Resistance";
					tier = 2;
				}
				else if(id==11){
					affixCatagory="Cold Resistance";
					affixName = " of the Ice";
					rarity=873;
					modLVL=72;
					range = new Point(42,45);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% Increased Cold Resistance";
					tier = 1;
				}

				//Critical strike multiplier
				else if(id==12){
					affixCatagory="Critical Strike Multiplier";
					affixName = " of Ire";
					rarity=873;
					modLVL=8;
					range = new Point(10,14);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% Increased Critical Strike Damage Multiplier";
				}
				else if(id==13){
					affixCatagory="Critical Strike Multiplier";
					affixName = " of Anger";
					rarity=873;
					modLVL=21;
					range = new Point(15,19);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% Increased Critical Strike Damage Multiplier";
				}
				else if(id==14){
					affixCatagory="Critical Strike Multiplier";
					affixName = " of Rage";
					rarity=873;
					modLVL=31;
					range = new Point(20,24);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% Increased Critical Strike Damage Multiplier";
				}
				else if(id==15){
					affixCatagory="Critical Strike Multiplier";
					affixName = " of Fury";
					rarity=873;
					modLVL=45;
					range = new Point(25,29);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% Increased Critical Strike Damage Multiplier";
				}
				else if(id==16){
					affixCatagory="Critical Strike Multiplier";
					affixName = " of Ferocity";
					rarity=873;
					modLVL=59;
					range = new Point(30,34);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% Increased Critical Strike Damage Multiplier";
					tier = 2;
				}
				else if(id==17){
					affixCatagory="Critical Strike Multiplier";
					affixName = " of Destruction";
					rarity=873;
					modLVL=74;
					range = new Point(35,38);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% Increased Critical Strike Damage Multiplier";
					tier = 1;
				}

				//Critical strike chance
				else if(id==18){
					affixCatagory="Critical Strike Chance";
					affixName = " of Needling";
					rarity=873;
					modLVL=5;
					range = new Point(10,14);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% Increased Critical Strike Chance";
				}
				else if(id==19){
					affixCatagory="Critical Strike Chance";
					affixName = " of Stinging";
					rarity=873;
					modLVL=20;
					range = new Point(15,19);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% Increased Critical Strike Chance";
				}
				else if(id==20){
					affixCatagory="Critical Strike Chance";
					affixName = " of Piercing";
					rarity=873;
					modLVL=30;
					range = new Point(20,24);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% Increased Critical Strike Chance";
				}
				else if(id==21){
					affixCatagory="Critical Strike Chance";
					affixName = " of Puncturing";
					rarity=873;
					modLVL=44;
					range = new Point(25,29);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% Increased Critical Strike Chance";
				}
				else if(id==22){
					affixCatagory="Critical Strike Chance";
					affixName = " of Penetrating";
					rarity=873;
					modLVL=58;
					range = new Point(30,34);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% Increased Critical Strike Chance";
					tier = 2;
				}
				else if(id==23){
					affixCatagory="Critical Strike Chance";
					affixName = " of Incision";
					rarity=873;
					modLVL=72;
					range = new Point(35,38);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% Increased Critical Strike Chance";
					tier = 1;
				}

				//dexterity
				else if(id==24){
					affixCatagory="Added Dexterity";
					affixName = " of the Mongoose";
					rarity=873;
					modLVL=1;
					range = new Point(8,12);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" to Dexterity";
				}
				else if(id==25){
					affixCatagory="Added Dexterity";
					affixName = " of the Lynx";
					rarity=873;
					modLVL=11;
					range = new Point(13,17);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" to Dexterity";
				}
				else if(id==26){
					affixCatagory="Added Dexterity";
					affixName = " of the Fox";
					rarity=873;
					modLVL=22;
					range = new Point(18,22);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" to Dexterity";
				}
				else if(id==27){
					affixCatagory="Added Dexterity";
					affixName = " of the Falcon";
					rarity=873;
					modLVL=33;
					range = new Point(23,27);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" to Dexterity";
				}
				else if(id==28){
					affixCatagory="Added Dexterity";
					affixName = " of the Panther";
					rarity=873;
					modLVL=44;
					range = new Point(28,32);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" to Dexterity";
				}
				else if(id==29){
					affixCatagory="Added Dexterity";
					affixName = " of the Leopard";
					rarity=873;
					modLVL=55;
					range = new Point(33,37);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" to Dexterity";
				}
				else if(id==30){
					affixCatagory="Added Dexterity";
					affixName = " of the Jaguar";
					rarity=873;
					modLVL=66;
					range = new Point(38,42);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" to Dexterity";
					tier = 2;
				}
				else if(id==31){
					affixCatagory="Added Dexterity";
					affixName = " of the Phantasm";
					rarity=873;
					modLVL=74;
					range = new Point(43,50);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" to Dexterity";
					tier = 1;
				}

				//fire resist
				else if(id==32){
					affixCatagory="Increased Fire Resistance";
					affixName = " of the Whelpling";
					rarity=873;
					modLVL=1;
					range = new Point(6,11);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% increased Fire Resistance";
				}
				else if(id==33){
					affixCatagory="Increased Fire Resistance";
					affixName = " of the Salamander";
					rarity=873;
					modLVL=12;
					range = new Point(12,17);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% increased Fire Resistance";
				}
				else if(id==34){
					affixCatagory="Increased Fire Resistance";
					affixName = " of the Drake";
					rarity=873;
					modLVL=24;
					range = new Point(18,23);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% increased Fire Resistance";
				}
				else if(id==35){
					affixCatagory="Increased Fire Resistance";
					affixName = " of the Kiln";
					rarity=873;
					modLVL=36;
					range = new Point(24,29);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% increased Fire Resistance";
				}
				else if(id==36){
					affixCatagory="Increased Fire Resistance";
					affixName = " of the Furnace";
					rarity=873;
					modLVL=48;
					range = new Point(30,35);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% increased Fire Resistance";
				}
				else if(id==37){
					affixCatagory="Increased Fire Resistance";
					affixName = " of the Volcano";
					rarity=873;
					modLVL=60;
					range = new Point(36,41);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% increased Fire Resistance";
					tier = 2;
				}
				else if(id==38){
					affixCatagory="Increased Fire Resistance";
					affixName = " of the Magma";
					rarity=873;
					modLVL=72;
					range = new Point(42,45);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% increased Fire Resistance";
					tier = 1;
				}
				//Increased accuracy
				else if(id==39){
					affixCatagory="Increased Accuracy Rating";
					affixName = " of Calm";
					rarity=873;
					modLVL=1;
					range = new Point(5,15);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" to Accuracy Rating";
				}
				else if(id==40){
					affixCatagory="Increased Accuracy Rating";
					affixName = " of Steadiness";
					rarity=873;
					modLVL=12;
					range = new Point(16,60);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" to Accuracy Rating";
				}
				else if(id==41){
					affixCatagory="Increased Accuracy Rating";
					affixName = " of Accuracy";
					rarity=873;
					modLVL=20;
					range = new Point(61,100);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" to Accuracy Rating";
				}
				else if(id==42){
					affixCatagory="Increased Accuracy Rating";
					affixName = " of Precision";
					rarity=873;
					modLVL=26;
					range = new Point(101,130);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" to Accuracy Rating";
				}
				else if(id==43){
					affixCatagory="Increased Accuracy Rating";
					affixName = " of the Sniper";
					rarity=873;
					modLVL=33;
					range = new Point(131,165);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" to Accuracy Rating";
				}
				else if(id==44){
					affixCatagory="Increased Accuracy Rating";
					affixName = " of the Marksman";
					rarity=873;
					modLVL=41;
					range = new Point(166,200);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" to Accuracy Rating";
				}
				else if(id==45){
					affixCatagory="Increased Accuracy Rating";
					affixName = " of the Deadeye";
					rarity=873;
					modLVL=50;
					range = new Point(201,250);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" to Accuracy Rating";
				}
				else if(id==45){
					affixCatagory="Increased Accuracy Rating";
					affixName = " of the Ranger";
					rarity=873;
					modLVL=63;
					range = new Point(251,320);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" to Accuracy Rating";
					tier = 2;
				}
				else if(id==46){
					affixCatagory="Increased Accuracy Rating";
					affixName = "of the Assassin";
					rarity=873;
					modLVL=76;
					range = new Point(321,400);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" to Accuracy Rating";
					tier = 1;
				}
				
				//intellegence
				else if(id==47){
					affixCatagory="Added Intellegence";
					affixName = " of the Pupil";
					rarity=873;
					modLVL=1;
					range = new Point(8,12);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" to Intellegence";
				}
				else if(id==48){
					affixCatagory="Added Intellegence";
					affixName = " of the Student";
					rarity=873;
					modLVL=11;
					range = new Point(13,17);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" to Intellegence";
				}
				else if(id==49){
					affixCatagory="Added Intellegence";
					affixName = " of the Prodigy";
					rarity=873;
					modLVL=22;
					range = new Point(18,22);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" to Intellegence";
				}
				else if(id==50){
					affixCatagory="Added Intellegence";
					affixName = " of the Augur";
					rarity=873;
					modLVL=33;
					range = new Point(23,27);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" to Intellegence";
				}
				else if(id==51){
					affixCatagory="Added Intellegence";
					affixName = " of the Philosopher";
					rarity=873;
					modLVL=44;
					range = new Point(28,32);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" to Intellegence";
				}
				else if(id==52){
					affixCatagory="Added Intellegence";
					affixName = " of the Sage";
					rarity=873;
					modLVL=55;
					range = new Point(33,37);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" to Intellegence";
				}
				else if(id==53){
					affixCatagory="Added Intellegence";
					affixName = " of the Savant";
					rarity=873;
					modLVL=66;
					range = new Point(38,42);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" to Intellegence";
					tier = 2;
				}
				else if(id==54){
					affixCatagory="Added Intellegence";
					affixName = " of the Virtuoso";
					rarity=873;
					modLVL=74;
					range = new Point(43,50);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" to Intellegence";
					tier = 1;
				}

				//rarity of items found
				else if(id==55){
					affixCatagory="Suffix Item Rarity";
					affixName = " of Plunder";
					rarity=873;
					modLVL=3;
					range = new Point(6,10);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% increased rarity of Items found";
				}
				else if(id==56){
					affixCatagory="Suffix Item Rarity";
					affixName = " of Raiding";
					rarity=873;
					modLVL=30;
					range = new Point(11,14);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% increased rarity of Items found";
				}
				else if(id==57){
					affixCatagory="Suffix Item Rarity";
					affixName = " of Archaeology";
					rarity=873;
					modLVL=53;
					range = new Point(15,20);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% increased rarity of Items found";
					tier = 2;
				}
				else if(id==58){
					affixCatagory="Suffix Item Rarity";
					affixName = " of Excavation";
					rarity=873;
					modLVL=75;
					range = new Point(21,26);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% increased rarity of Items found";
					tier = 1;
				}

				//life on kill
				else if(id==59){
					affixCatagory="Life on Kill";
					affixName = " of Success";
					rarity=873;
					modLVL=1;
					range = new Point(2,4);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" Life gained When You Kill An Enemy";
				}
				else if(id==60){
					affixCatagory="Life on Kill";
					affixName = " of Victory";
					rarity=873;
					modLVL=23;
					range = new Point(5,7);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" Life gained When You Kill An Enemy";
					tier = 2;
				}
				else if(id==61){
					affixCatagory="Life on Kill";
					affixName = " of Triumph";
					rarity=873;
					modLVL=40;
					range = new Point(8,11);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" Life gained When You Kill An Enemy";
					tier = 1;
				}

				//life on hit
				else if(id==62){
					affixCatagory="Life on Hit";
					affixName = " of Rejuvination";
					rarity=873;
					modLVL=8;
					range = new Point(2,2);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" Life gained for Each Enemy hit by your Attacks";
				}
				else if(id==63){
					affixCatagory="Life on Hit";
					affixName = " of Restoration";
					rarity=873;
					modLVL=20;
					range = new Point(3,3);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" Life gained for Each Enemy hit by your Attacks";
					tier = 2;
				}
				else if(id==64){
					affixCatagory="Life on Hit";
					affixName = " of Regrowth";
					rarity=873;
					modLVL=30;
					range = new Point(4,4);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" Life gained for Each Enemy hit by your Attacks";
					tier = 1;
				}

				//life regen
				else if(id==65){
					affixCatagory="Life Regeneration";
					affixName = " of the Newt";
					rarity=873;
					modLVL=1;
					range = new Point(10,20);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll/10.0+" Life Regenerated per Second";
				}
				else if(id==66){
					affixCatagory="Life Regeneration";
					affixName = " of the Lizard";
					rarity=873;
					modLVL=18;
					range = new Point(20,30);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll/10.0+" Life Regenerated per Second";
				}
				else if(id==67){
					affixCatagory="Life Regeneration";
					affixName = " of the Starfish";
					rarity=873;
					modLVL=30;
					range = new Point(30,40);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll/10.0+" Life Regenerated per Second";
				}
				else if(id==68){
					affixCatagory="Life Regeneration";
					affixName = " of the Hydra";
					rarity=873;
					modLVL=44;
					range = new Point(40,50);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll/10.0+" Life Regenerated per Second";
				}
				else if(id==69){
					affixCatagory="Life Regeneration";
					affixName = " of the Troll";
					rarity=873;
					modLVL=59;
					range = new Point(50,60);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll/10.0+" Life Regenerated per Second";
					tier = 2;
				}
				else if(id==70){
					affixCatagory="Life Regeneration";
					affixName = " of the Phoenix";
					rarity=873;
					modLVL=78;
					range = new Point(60,70);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll/10.0+" Life Regenerated per Second";
					tier = 1;
				}

				//lightning resist
				else if(id==71){
					affixCatagory="Lightning Resistance";
					affixName = " of the Cloud";
					rarity=873;
					modLVL=1;
					range = new Point(6,11);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% increased Lightning Resistance";
				}
				else if(id==72){
					affixCatagory="Lightning Resistance";
					affixName = " of the Squall";
					rarity=873;
					modLVL=13;
					range = new Point(12,17);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% increased Lightning Resistance";
				}
				else if(id==73){
					affixCatagory="Lightning Resistance";
					affixName = " of the Storm";
					rarity=873;
					modLVL=25;
					range = new Point(18,23);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% increased Lightning Resistance";
				}
				else if(id==74){
					affixCatagory="Lightning Resistance";
					affixName = " of the Thunderhead";
					rarity=873;
					modLVL=37;
					range = new Point(24,29);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% increased Lightning Resistance";
				}
				else if(id==75){
					affixCatagory="Lightning Resistance";
					affixName = " of the Tempest";
					rarity=873;
					modLVL=49;
					range = new Point(30,35);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% increased Lightning Resistance";
				}
				else if(id==76){
					affixCatagory="Lightning Resistance";
					affixName = " of the Maelstrom";
					rarity=873;
					modLVL=60;
					range = new Point(36,41);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% increased Lightning Resistance";
					tier = 2;
				}
				else if(id==77){
					affixCatagory="Lightning Resistance";
					affixName = " of the Lightning";
					rarity=873;
					modLVL=72;
					range = new Point(42,45);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% increased Lightning Resistance";
					tier = 1;
				}

				//mana on kill
				else if(id==78){
					affixCatagory="Mana on Kill";
					affixName = " of Absorbtion";
					rarity=873;
					modLVL=1;
					range = new Point(1,1);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" Mana gained on Kill";
				}
				else if(id==79){
					affixCatagory="Mana on Kill";
					affixName = " of Osmosis";
					rarity=873;
					modLVL=24;
					range = new Point(2,3);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" Mana gained on Kill";
					tier = 2;
				}
				else if(id==80){
					affixCatagory="Mana on Kill";
					affixName = " of Consumption";
					rarity=873;
					modLVL=40;
					range = new Point(4,6);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" Mana gained on Kill";
					tier = 1;
				}

				//mana regen
				else if(id==81){
					affixCatagory="Mana Regeneration";
					affixName = " of Excitment";
					rarity=873;
					modLVL=2;
					range = new Point(10,19);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% increased Mana Regeneration Rate";
				}
				else if(id==82){
					affixCatagory="Mana Regeneration";
					affixName = " of Joy";
					rarity=873;
					modLVL=18;
					range = new Point(20,29);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% increased Mana Regeneration Rate";
				}
				else if(id==83){
					affixCatagory="Mana Regeneration";
					affixName = " of Elation";
					rarity=873;
					modLVL=29;
					range = new Point(30,39);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% increased Mana Regeneration Rate";
				}
				else if(id==84){
					affixCatagory="Mana Regeneration";
					affixName = " of Bliss";
					rarity=873;
					modLVL=42;
					range = new Point(40,49);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% increased Mana Regeneration Rate";;
				}
				else if(id==85){
					affixCatagory="Mana Regeneration";
					affixName = " of Euphoria";
					rarity=873;
					modLVL=55;
					range = new Point(50,59);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% increased Mana Regeneration Rate";
					tier = 2;
				}
				else if(id==86){
					affixCatagory="Mana Regeneration";
					affixName = " of Nirvana";
					rarity=873;
					modLVL=79;
					range = new Point(60,69);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% increased Mana Regeneration Rate";
					tier = 1;
				}

				//strength
				else if(id==87){
					affixCatagory="Added Strength";
					affixName = " of the Brute";
					rarity=873;
					modLVL=1;
					range = new Point(8,12);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" to Strength";
				}
				else if(id==88){
					affixCatagory="Added Strength";
					affixName = " of the Wrestler";
					rarity=873;
					modLVL=11;
					range = new Point(13,17);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" to Strength";
				}
				else if(id==89){
					affixCatagory="Added Strength";
					affixName = " of the Bear";
					rarity=873;
					modLVL=22;
					range = new Point(18,22);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" to Strength";
				}
				else if(id==90){
					affixCatagory="Added Strength";
					affixName = " of the Lion";
					rarity=873;
					modLVL=33;
					range = new Point(23,27);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" to Strength";
				}
				else if(id==91){
					affixCatagory="Added Strength";
					affixName = " of the Gorilla";
					rarity=873;
					modLVL=44;
					range = new Point(28,32);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" to Strength";
				}
				else if(id==92){
					affixCatagory="Added Strength";
					affixName = " of the Goliath";
					rarity=873;
					modLVL=55;
					range = new Point(33,37);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" to Strength";
				}
				else if(id==93){
					affixCatagory="Added Strength";
					affixName = " of the Leviathan";
					rarity=873;
					modLVL=66;
					range = new Point(38,42);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" to Strength";
					tier = 2;
				}
				else if(id==94){
					affixCatagory="Added Strength";
					affixName = " of the Titan";
					rarity=873;
					modLVL=74;
					range = new Point(43,50);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" to Strength";
					tier = 1;
				}

				//all attributes
				else if(id==95){
					affixCatagory="All Attributes";
					affixName = " of the Clouds";
					rarity=698;
					modLVL=1;
					range = new Point(1,4);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" to all Attributes";
				}
				else if(id==96){
					affixCatagory="All Attributes";
					affixName = " of the Sky";
					rarity=698;
					modLVL=11;
					range = new Point(5,8);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" to all Attributes";
				}
				else if(id==97){
					affixCatagory="All Attributes";
					affixName = " of the Meteor";
					rarity=698;
					modLVL=22;
					range = new Point(9,12);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" to all Attributes";
				}
				else if(id==98){
					affixCatagory="All Attributes";
					affixName = " of the Comet";
					rarity=698;
					modLVL=33;
					range = new Point(13,16);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" to all Attributes";
				}
				else if(id==99){
					affixCatagory="All Attributes";
					affixName = " of the Heavens";
					rarity=698;
					modLVL=44;
					range = new Point(17,20);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" to all Attributes";
				}
				else if(id==100){
					affixCatagory="All Attributes";
					affixName = " of the Galaxy";
					rarity=698;
					modLVL=55;
					range = new Point(21,24);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" to all Attributes";
				}
				else if(id==101){
					affixCatagory="All Attributes";
					affixName = " of the Universe";
					rarity=698;
					modLVL=66;
					range = new Point(25,28);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" to all Attributes";
					tier = 2;
				}
				else if(id==102){
					affixCatagory="All Attributes";
					affixName = " of the Infinite";
					rarity=698;
					modLVL=77;
					range = new Point(29,31);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = "+"+affixRoll+" to all Attributes";
					tier = 1;
				}

				//increased cast speed
				else if(id==103){
					affixCatagory="Cast Speed";
					affixName = " of Talent";
					rarity=698;
					modLVL=2;
					range = new Point(5,7);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% increased Cast Speed";
				}
				else if(id==104){
					affixCatagory="Cast Speed";
					affixName = " of Nimbleness";
					rarity=698;
					modLVL=15;
					range = new Point(8,10);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% increased Cast Speed";
					tier = 2;
				}
				else if(id==105){
					affixCatagory="Cast Speed";
					affixName = " of Expertise";
					rarity=698;
					modLVL=30;
					range = new Point(11,13);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% increased Cast Speed";
					tier = 1;
				}

				//percent increased cold damage
				else if(id==106){
					affixCatagory="Percent Increased Cold Damage";
					affixName = " of Snow";
					rarity=436;
					modLVL=12;
					range = new Point(3,7);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% increased Cold Damage";
				}
				else if(id==107){
					affixCatagory="Percent Increased Cold Damage";
					affixName = " of Sleet";
					rarity=436;
					modLVL=24;
					range = new Point(8,12);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% increased Cold Damage";
					tier = 2;
				}
				else if(id==108){
					affixCatagory="Percent Increased Cold Damage";
					affixName = " of Ice";
					rarity=436;
					modLVL=36;
					range = new Point(13,17);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% increased Cold Damage";
					tier = 1;
				}

				//percent increased fire damage
				else if(id==109){
					affixCatagory="Percent Increased Fire Damage";
					affixName = " of Embers";
					rarity=436;
					modLVL=8;
					range = new Point(3,7);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% increased Fire Damage";
				}
				else if(id==110){
					affixCatagory="Percent Increased Fire Damage";
					affixName = " of Coals";
					rarity=436;
					modLVL=22;
					range = new Point(8,12);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% increased Fire Damage";
					tier = 2;
				}
				else if(id==111){
					affixCatagory="Percent Increased Fire Damage";
					affixName = " of Cinders";
					rarity=436;
					modLVL=36;
					range = new Point(13,17);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% increased Fire Damage";
					tier = 1;
				}

				//percent increased lightning damage
				else if(id==112){
					affixCatagory="Percent Increased Lightning Damage";
					affixName = " of Sparks";
					rarity=436;
					modLVL=10;
					range = new Point(3,7);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% increased Lightning Damage";
				}
				else if(id==113){
					affixCatagory="Percent Increased Lightning Damage";
					affixName = " of Static";
					rarity=436;
					modLVL=23;
					range = new Point(8,12);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% increased Lightning Damage";
					tier = 2;
				}
				else if(id==114){
					affixCatagory="Percent Increased Lightning Damage";
					affixName = " of Electricity";
					rarity=436;
					modLVL=36;
					range = new Point(13,17);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% increased Lightning Damage";
					tier = 1;
				}

				//chaos resist
				else if(id==115){
					affixCatagory="Chaos Resistance";
					affixName = " of the Lost";
					rarity=218;
					modLVL=16;
					range = new Point(5,10);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% increased Chaos Resistance";
				}
				else if(id==116){
					affixCatagory="Chaos Resistance";
					affixName = " of Banishment";
					rarity=218;
					modLVL=30;
					range = new Point(11,15);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% increased Chaos Resistance";
				}
				else if(id==117){
					affixCatagory="Chaos Resistance";
					affixName = " of Eviction";
					rarity=218;
					modLVL=44;
					range = new Point(16,20);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% increased Chaos Resistance";
				}
				else if(id==118){
					affixCatagory="Chaos Resistance";
					affixName = " of Expulsion";
					rarity=218;
					modLVL=56;
					range = new Point(21,25);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% increased Chaos Resistance";
					tier = 2;
				}
				else if(id==119){
					affixCatagory="Chaos Resistance";
					affixName = " of Exile";
					rarity=218;
					modLVL=65;
					range = new Point(26,30);
					affixRoll=DivineOrb.randomNumber(range.x, range.y);
					description = affixRoll+"% increased Chaos Resistance";
					tier = 1;
				}

			}
		}
	}
	public void Draw(Graphics g){

	}
}
