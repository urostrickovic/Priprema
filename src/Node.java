
public class Node 
{
	public Node prev,next;
	public Film info;
	
	public Node()
	{
		this.prev=this.next=null;
	}
	
	public Node(Film info)
	{
		this.info=info;
	}
	
	public Node(Node prev,Node next,Film info)
	{
		this.prev=prev;
		this.next=next;
		this.info=info;
	}
	
	public Film print()
	{
		return this.info;
	}

}
