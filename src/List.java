
public class List 
{
	public Node head,tail;
	
	public List()
	{
		this.head=null;
		this.tail=null;
	}
	
	public boolean isEmpty()
	{
		return this.head==null;
	}
	
	public void addToHead(Film info)
	{
		if (isEmpty())
		{
			this.head=this.tail=new Node(info);
		}
		else
		{
			this.head=new Node(null,head,info);
			head.next.prev=head;
		}
	}
	
	public void addToTail(Film info)
	{
		if(isEmpty())
		{
			this.head=this.tail=new Node(info);
		}
		else
		{
			tail.next=new Node(tail,null,info);
			tail=tail.next;
		}
	}
	
	public Film deleteFromHead()
	{
		if(isEmpty())
		{
			System.out.println("Lista je prazna.Nemoguce obrisati.");
			return null;
		}
		else
		{
			Film f=head.info;
			if(head==tail)
			{
				this.head=this.tail=null;
				return f;
			}
			
			else
			{
				head=head.next;
				head.prev=null;
				return f;
			}
			
		}
	}
	
	public Film deleteFromTail()

	{
		if(isEmpty())
		{
			System.out.println("Lista je prazna.Nemoguce obrisati");
			return null;
		}
		else
		{
			Film f=tail.info;
			if(head==tail)
			{
				this.head=this.tail=null;
				return f;
			}
			else
			{
				tail=tail.prev;
				tail.next=null;
				return f;
				
			}
		}
		
	}
	
	public void deleteSelected(String nazivF)
	{
		if(isEmpty())
		{
			System.out.println("Lista je prazna.Nemoguce obrisati.");
		}
		else
		{
			if(head.info.getNaziv().equals(nazivF))
			{
				deleteFromHead();
			}
			else
			{
				if(tail.info.getNaziv().equals(nazivF))
				{
					deleteFromTail();
				}
				else
				{
					Node tmp=head.next;
					while(!(tmp.info.getNaziv().equals(nazivF)))
					{
						tmp=tmp.next;
					}
				
					tmp.next.prev=tmp.prev;
					tmp.prev.next=tmp.next;
				}
			}}
		
		
	}
	
	public void printAll()
	{
		for(Node tmp=head;tmp!=null;tmp=tmp.next)
		{
			tmp.info.prikazi();
		}
		
	}

	public int numberOfElements()
	{
		int counter=0;
	
		for (Node tmp=head;tmp!=null;tmp=tmp.next)
		{
			counter++;
		}
		return counter;
	}
}
