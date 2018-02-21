package src;



import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;



public class Controller extends JPanel implements MouseListener {

	public static int xpos=0;
	public static int ypos=0;
	public static int firstxpos=0;
	public static int firstypos=0;
	public static int lastxpos=0;
	public static int lastypos=0;
	public static int lastdir=0;
	int movement =0;
	int xMove=0;
	int yMove=0;
	static int move=0;
	public static boolean Zispressed = false;
	public static boolean isSelected=false;
	public boolean isRight=false;
	public boolean isLeft=false;
	public boolean isDown=false;
	public boolean isUp=false;
	int lastArrow = 0;
	int tileID=0;
	private JPanel gamePanel;
	long starttime = 0;

	//BattleshorePanel bPanel = new BattleshorePanel(bshore);
	private static boolean[] keyboardState = new boolean[525];

	public Controller(){
		this.setDoubleBuffered(true);

	}
	public static boolean keyboardKeyState(int key)
	{
		return keyboardState[key];
	}

	public void setGamePanel(JPanel panelRef) {
		gamePanel = panelRef;
		gamePanel.addMouseListener(this);
	}
	public void updateAll(){
		if (gamePanel != null)
			gamePanel.getParent().repaint();
		repaint();
	}
	public void Updateypos(int y){
		ypos = y;
	}


	public void mouseClicked(MouseEvent e){

		updateAll();
		if(e.getX()>0&&e.getY()<=50&&e.getX()<50&&e.getY()>=0){		
			DivineOrb.useTransmutation();
		}
		else if(e.getX()>50&&e.getY()<=50&&e.getX()<100&&e.getY()>=0){		
			DivineOrb.useAlteration();
		}
		else if(e.getX()>100&&e.getY()<=50&&e.getX()<150&&e.getY()>=0){		
			DivineOrb.useAugmentation();
		}
		else if(e.getX()>150&&e.getY()<=50&&e.getX()<200&&e.getY()>=0){		
			DivineOrb.useChance();
		}
		else if(e.getX()>200&&e.getY()<=50&&e.getX()<250&&e.getY()>=0){		
			DivineOrb.useScouring();
		}
		else if(e.getX()>250&&e.getY()<=50&&e.getX()<300&&e.getY()>=0){		
			DivineOrb.useAlchemy();
		}
		else if(e.getX()>300&&e.getY()<=50&&e.getX()<350&&e.getY()>=0){		
			DivineOrb.useBlessed();
		}
		else if(e.getX()>350&&e.getY()<=50&&e.getX()<400&&e.getY()>=0){		
			DivineOrb.useChaos();
		}
		else if(e.getX()>400&&e.getY()<=50&&e.getX()<450&&e.getY()>=0){		
			DivineOrb.useRegal();
		}
		else if(e.getX()>450&&e.getY()<=50&&e.getX()<500&&e.getY()>=0){		
			DivineOrb.useDivine();
		}
		else if(e.getX()>500&&e.getY()<=50&&e.getX()<550&&e.getY()>=0){		
			DivineOrb.useExalted();
		}
		else if(e.getX()>550&&e.getY()<=50&&e.getX()<600&&e.getY()>=0){		
			DivineOrb.useEternal();
		}
		//delete button
		else if(e.getX()>679&&e.getY()<=284&&e.getX()<721&&e.getY()>=268){		
			DivineOrb.useScouring();
			DivineOrb.resetStatistics();
		}

		//imprints
		for(int i = 0; i< 4; i++){
			for(int j = 0; j<8;j++){
				if(DivineOrb.stash[i][j]!=null){
					if(e.getX()>DivineOrb.stash[i][j].pos.x&&e.getY()<=DivineOrb.stash[i][j].pos.y+50&&e.getX()<DivineOrb.stash[i][j].pos.x+50&&e.getY()>=DivineOrb.stash[i][j].pos.y){
						DivineOrb.stash[i][j].use();
						DivineOrb.stash[i][j]=null;
					}
				}
			}
		}


	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}


}
