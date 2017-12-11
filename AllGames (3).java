
import java.net.*;
import javax.swing.JOptionPane;

import java.awt.Desktop;


public class AllGames {

	public static void main(String[] args) throws URISyntaxException {
		
		int fl=0,no=0;
		while(fl==0)
		{
		String inputValue = JOptionPane.showInputDialog("Please input a value from the below list:\n  1)Online Games \n  2)Dots and crosses");
		no=Integer.parseInt(inputValue);
		if((no==1)||(no==2))
		{
			fl=1;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Please enter a valid input number","Alert", JOptionPane.ERROR_MESSAGE);
		}
		}
		
		try {
			System.out.println("Opening your browser");
			
			if(no==1)
			{
				URI uri = new URI("https://www.miniclip.com/games/genre-482/kids/en/");
				Desktop.getDesktop().browse(uri);
			
			}
			else if(no==2)
					{
						Game obj1=new Game();
						obj1.main(args);
					}
			}catch(Exception e){
				
			}					
		} 
	
	}

