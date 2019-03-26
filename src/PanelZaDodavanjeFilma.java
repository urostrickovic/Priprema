import javax.swing.*;
public class PanelZaDodavanjeFilma extends JPanel
{
	public int buttonW=110;
	public int buttonH=20;
	public int offsetW=buttonW+10;
	public int inputW=110;
	public int inputH=25;
	public int offsetH=inputH+10;

	//komponente
	public JLabel nazivL;
	public JLabel godinaL;
	public JLabel zanrL;
	public JLabel reziserL;
	public JLabel brojGlumacaL;
	public JLabel prikazi;
	public JLabel[] glumciL=new JLabel[10];
	
	
	public JTextField nazivT;
	public JTextField godinaT;
	public JTextField zanrT;
	public JTextField reziserT;
	public JTextField brojGlumacaT;
	public JTextField[] glumciT=new JTextField[10];
	
	public PanelZaDodavanjeFilma()
	{
		this.setLayout(null);
		
		this.nazivL=new JLabel("Naziv:");
		nazivL.setBounds(20,20,inputW,inputH);
		this.add(nazivL);
		
		this.nazivT=new JTextField();
		nazivT.setBounds(this.nazivL.getX()+offsetW, this.nazivL.getY(), inputW, inputH);
		this.add(nazivT);
		
		this.godinaL=new JLabel("Godina:");
		this.godinaL.setBounds(this.nazivL.getX(), this.nazivL.getY()+offsetH, inputW, inputH);
		this.add(godinaL);
		
		this.godinaT=new JTextField();
		this.godinaT.setBounds(this.godinaL.getX()+offsetW,this.godinaL.getY() , inputW, inputH);
		this.add(godinaT);
		
		this.zanrL=new JLabel("Zanr:");
		this.zanrL.setBounds(this.godinaL.getX(), this.godinaL.getY()+offsetH, inputW, inputH);
		this.add(zanrL);
		
		this.zanrT=new JTextField();
		this.zanrT.setBounds(this.zanrL.getX()+offsetW, this.zanrL.getY(), inputW, inputH);
		this.add(zanrT);
		
		this.reziserL=new JLabel("Reziser:");
		this.reziserL.setBounds(this.zanrL.getX(), this.zanrL.getY()+offsetH, inputW, inputH);
		this.add(reziserL);
		
		this.reziserT=new  JTextField();
		this.reziserT.setBounds(this.reziserL.getX()+offsetW, this.reziserL.getY(), inputW, inputH);
		this.add(reziserT);
		
		this.brojGlumacaL=new JLabel("Broj glumaca:");
		this.brojGlumacaL.setBounds(this.reziserL.getX(), this.reziserL.getY()+offsetH, inputW, inputH);
		this.add(brojGlumacaL);
		
		this.brojGlumacaT=new JTextField();
		this.brojGlumacaT.setBounds(this.brojGlumacaL.getX()+offsetW, this.brojGlumacaL.getY(), inputW, inputH);
		FieldListener fl=new FieldListener(this);
		brojGlumacaT.addActionListener(fl);
		this.add(brojGlumacaT);
		
		int x=this.nazivL.getX()+2*offsetW;
		int y=this.nazivL.getY()-offsetH;
		for (int i=0;i<10;i++)
		{
			this.glumciL[i]=new JLabel("Unesi "+(i+1)+". glumca:");
			this.glumciL[i].setBounds(x, y+=offsetH, inputW, inputH);
			glumciL[i].setVisible(false);
			this.add(glumciL[i]);
			
			this.glumciT[i]=new JTextField();
			this.glumciT[i].setBounds(this.glumciL[i].getX()+offsetW, this.glumciL[i].getY(), inputW, inputH);
			this.glumciT[i].setVisible(false);
			this.add(glumciT[i]);
		}
		
		
	}
}
