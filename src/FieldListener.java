import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FieldListener implements ActionListener
{
	
	public int inputW=110;
	public int inputH=25;
	public int offsetH=inputH+10;
	public int offsetW=inputW+10;

	public PanelZaDodavanjeFilma pzdf;
	
	public FieldListener(PanelZaDodavanjeFilma pzdf)
	{
		this.pzdf=pzdf;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		for (int i=0;i<Integer.parseInt(pzdf.brojGlumacaT.getText());i++)
		{
			pzdf.glumciL[i].setVisible(true);
			pzdf.glumciT[i].setVisible(true);
		}
	}
		
	

}
