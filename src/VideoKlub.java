
public class VideoKlub implements interfaceFilm
{
	public VideoKlub()
	{
		
	}
	List l=new List();

	@Override
	public void dodajFilm(Film f) 
	{
		l.addToHead(f);
	}

	@Override
	public void obrisiZadati(String nazivF) 
	{
		l.deleteSelected(nazivF);
		
	}

	@Override
	public void prikaziSveFilmove() 
	{
		for (Node tmp=l.head;tmp!=null;tmp=tmp.next)
		{
			tmp.info.prikazi();
		}
		
	}

}
