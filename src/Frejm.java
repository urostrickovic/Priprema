import javax.swing.JFrame;

public class Frejm extends JFrame
{
	public PanelSaDugmicima psd;
	public PanelZaDodavanjeFilma pzdf;
	List lista;
	Film film;
	
	public Frejm()  // pravimo konstruktor
	{
		this.setLayout(null);
		this.setSize(800, 600);  // podesavamo velicinu frejma
		
		PanelSaDugmicima psd=new PanelSaDugmicima();
		psd.setBounds(0, 0, this.getWidth(), this.getHeight()/9);
		this.add(psd);
		
		PanelZaDodavanjeFilma pzdf=new PanelZaDodavanjeFilma();
		pzdf.setBounds(psd.getX(),psd.getHeight(), this.getWidth(), this.getHeight()-psd.getHeight());
		this.setVisible(true);
		this.add(pzdf);
		
		OsluskivacZaDodajFilm ozdf=new OsluskivacZaDodajFilm(this);
		psd.dodajB.addActionListener(ozdf);
		
		
	}

}
