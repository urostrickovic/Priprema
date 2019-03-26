import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class OsluskivacZaDodajFilm implements ActionListener
{

	Frejm f;
	public int buttonW=110;
	public int buttonH=20;
	public int offsetW=buttonW+10;
	public int inputW=110;
	public int inputH=25;
	public int offsetH=inputH+10;
	
	public OsluskivacZaDodajFilm(Frejm f)
	{
		this.f=f;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		// TODO Auto-generated method stub
		this.f.film=new Film(f.pzdf.nazivT.getText(),f.pzdf.godinaT.getText(),f.pzdf.reziserT.getText(),f.pzdf.zanrT.getText(),Integer.parseInt(f.pzdf.brojGlumacaT.getText()));
		for (int i=0;i<Integer.parseInt(f.pzdf.brojGlumacaT.getText());i++)
		{
			f.film.imenaGlumaca[i]=f.pzdf.glumciT[i].getText();
		}
		f.lista.addToHead(f.film);	
			
	}
		
		
		
		
	}


