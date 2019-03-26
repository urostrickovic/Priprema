import java.util.*;
public class Film
{
	public String nazivFilma;
	public	String godIzdavanja;
	public String imeIPrezimeRezisera;
	public String zanr;
	public int brGlumaca;
	public String[] imenaGlumaca;
	
	Scanner unesi=new Scanner(System.in);
	
	public Film(String nf,String gi,String ipr,String zanr,int bg)
	{
		this.nazivFilma=nf;
		this.godIzdavanja=gi;
		this.imeIPrezimeRezisera=ipr;
		this.zanr=zanr;
		this.brGlumaca=bg;
		this.imenaGlumaca = new String[this.brGlumaca];
		for (int i=0;i<this.brGlumaca;i++)
		{
			this.imenaGlumaca[i]=null;
		}
		
		
		
	}
	public void prikazi()
	{
		System.out.println("----------------------");
		System.out.println("Naziv: "+this.nazivFilma);
		System.out.println("Godina izdavanja: "+this.godIzdavanja);
		System.out.println("Ime i prezime rezisera: " +this.imeIPrezimeRezisera);
		System.out.println("Zanr: "+this.zanr);
		System.out.print("Lista glumaca: ");
		for (int i=0;i<this.brGlumaca;i++)
		{
			System.out.print(this.imenaGlumaca[i]+", ");
		}
		System.out.println();
		System.out.println("----------------------");
		
	}
	
	public String getNaziv()
	{
		return this.nazivFilma;
	}


}
