import javax.swing.*;

public class PanelSaDugmicima extends JPanel
{
	public int buttonW=110;
	public int buttonH=20;
	public int offsetW=buttonW+10;
	public JButton dodajB;
	public JButton prikaziB;

	
	public PanelSaDugmicima()
	{
		this.setLayout(null);
		
		//Dugme dodaj
		this.dodajB=new JButton("Dodaj");
		this.dodajB.setBounds(5, 5, buttonW, buttonH);
		this.add(dodajB);
		
		//Dugme prikazi
		this.prikaziB=new JButton("Prikazi");
		this.prikaziB.setBounds(this.dodajB.getX()+offsetW, this.dodajB.getY(), buttonW, buttonH);
		this.add(prikaziB);
	}
}
