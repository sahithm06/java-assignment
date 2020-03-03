package MyLinkedList;

/*Create a generic, singly linked list class called SList, which, to keep things simple,
 *  does not implement the List interface.

Each Link object in the list should contain a reference to the next 
element in the list, but not the previous one (LinkedList, in contrast,
 is a doubly linked list, which means it maintains links in both directions).

Create your own SListIterator which, again for simplicity, does not 
implement ListIterator. The only method in SList other than toString( ) 
should be iterator( ), which produces an SListIterator.

The only way to insert and remove elements from an SList is through
 SListIterator. Write code to demonstrate SList.*/
 
class Node<T>
{
 
	 T data ;
	
	 Node<T> next;
	public Node(T data)
	{
		this.data=data;
		this.next=null;
	}

	

	
}
class SListIterator<T>
{
	private Node<T> Head;
	
	public SListIterator()
	{
		this.Head=null;
	}
	
	public Node<T> getHead() 
	{
		return Head;
	}
	
	public   void add(T data)
	{
		//System.out.println(data);
		Node<T> temp= Head;
		
		  Node<T> node=new Node<T>(data);
		  
		// System.out.println(node+" "+node.data);
		  if(temp==null)
		  {
			  Head=node;
		  }
		  else
		  {
			  while(temp.next!=null)
			  {
				  temp=temp.next;
			  }
			  temp.next=node;
		  } 
		
	  
		  
	  }
 public boolean remove()
	{
		if(Head==null)
		{
			return false;
			
		}
		else
		{
			
			
			Node<T> prev=null;
			Node<T> temp=Head;
			while(temp.next!=null)
			  {
				prev=temp;
				  temp=temp.next;
			  }
			  if(prev==null)
			  {
				  Head=null;
				  return true;
			  }
			  else
			  {
				  
				  prev.next=null;
				  return false;
			  }
		}

		
	}

}

public class SList<T>
{
	SListIterator<T> si;
	public  String toString()
	{
		//System.out.println("hiii");
		//SListIterator<T> si = new SListIterator<T>();
		
		
		Node<T> temp=si.getHead();
		
		//System.out.println(temp);
		String s="";
		while(temp!=null)
			{
			s=s+temp.data+" ";
			temp=temp.next;
			}
		return s;

	}
	 
	public SListIterator<T> iterator()
	 {
		 si=new SListIterator<T>();
		 return si;
	 }

		public static void main(String args[])
		{
			SList<Integer> sl=new SList<Integer>();
			SListIterator<Integer> si =sl.iterator();
			si.add(1);
			si.remove();
			si.add(2);
		
			si.add(3);
			si.add(3);

			si.add(12);
			si.add(12);
			
			si.add(23);
			si.add(45);
			si.add(356);
		  System.out.println("Slist is  :"+sl);
	
			
			
			
		}
	
	
}



