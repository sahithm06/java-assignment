package textgen;

import java.util.AbstractList;


/** A class that implements a doubly linked list
 * 
 * @author UC San Diego Intermediate Programming MOOC team
 *
 * @param <E> The type of the elements stored in the list
 */
public class MyLinkedList<E> extends AbstractList<E> {
	LLNode<E> head;
	LLNode<E> tail;
	int size;

	/** Create a new empty LinkedList */
	public MyLinkedList() 
	{
		// TODO: Implement this metho
		//MyLinkedList<E> ll = new MyLinkedList<E>();
		head=null;
		tail=null;
		size=0;
	}

	/**
	 * Appends an element to the end of the list
	 * @param element The element to add
	 */
	public boolean add(E element ) 
	{
		// TODO: Implement this method
		 LLNode<E> node =new LLNode<E>(element);
		 if(head==null)
		 {
			 head=node; 
			 tail=node;
			 //System.out.println(head+"  "+tail);
			 size++;
			 return true;
		 }
		
		 else
		 {
			 LLNode<E> temp=head;
			// System.out.println(temp);

			 while(temp.next!=null)
			 {
				 temp=temp.next;
			 }
			 
			 temp.next=node;
			 node.prev=temp;
			 tail=node;
		//	 System.out.println(head+"  "+tail);
			 size++;
			 return true;
		 }
		
		
	}

	/** Get the element at position index 
	 * @throws IndexOutOfBoundsException if the index is out of bounds. */
	public E get(int index) 
	{
		
		LLNode<E> temp=head;
		
		try 
	   {
		  if(index<0 || index>= size())
		 throw new IndexOutOfBoundsException();
		
		
				int countIndex=0;
				while(countIndex!=index)
				{
					temp=temp.next;
				
					countIndex++;
				}
		 
	          return temp.data;
	   }
		catch(IndexOutOfBoundsException iob)
		{
			iob.printStackTrace();
		}
		return null;
	}

	/**
	 * Add an element to the list at the specified index
	 * @param The index where the element should be added
	 * @param element The element to add
	 */
	public void add(int index, E element ) 
	{
		// TODO: Implement this method
		LLNode<E> node=new LLNode<E>(element);
		LLNode<E> temp=head;
		if(index==0)
		{
			node.next=head;
			head.prev=node;
			head=node;
			size++;
		}
		else if(index==size)
		{
			while(index!=1)
			{
				temp=temp.next;
				index--;	
			}
			node.prev=temp;
			temp.next=node;
			tail=node;
			size++;
		}
		else
		{
			
			while(index!=1)
			{
				temp=temp.next;
				index--;	
			}
			node.next=temp.next;
			node.prev=temp;
			temp.next=node;
			node.next.prev=node;
			
			size++;
		}

	}


	/** Return the size of the list */
	public int size() 
	{
		// TODO: Implement this method
		return size;
	}

	/** Remove a node at the specified index and return its data element.
	 * @param index The index of the element to remove
	 * @return The data element removed
	 * @throws IndexOutOfBoundsException If index is outside the bounds of the list
	 * 
	 */
	public E remove(int index) 
	{
		// TODO: Implement this method
		
		try
		{
			
			if(index<0 || index>=size)
				throw new IndexOutOfBoundsException();
			
			
			
		   LLNode<E> temp=head;
		if(index==0)
		{
			head=head.next;
			head.prev=null;
			size--;
		}
		else if(index==size-1)
		{
			tail=tail.prev;
			tail.next=null;
			size--;
		}
		else
		{
		  while(index!=0)
		  {
			temp=temp.next;
			index--;	
		  }
		  
		  temp.prev.next=temp.next;
		  temp.next.prev=temp.prev;
		  size--;
		}
		
		return temp.data;
	}
		catch(IndexOutOfBoundsException iob)
		{
			iob.printStackTrace();
			
		}
		return null;
	
	}

	/**
	 * Set an index position in the list to a new element
	 * @param index The index of the element to change
	 * @param element The new element
	 * @return The element that was replaced
	 * @throws IndexOutOfBoundsException if the index is out of bounds.
	 */
	public E set(int index, E element) 
	{
		// TODO: Implement this method
		try 
		{
			  if(index<0 || index>= size())
				  throw new IndexOutOfBoundsException();
			
		E changedElement;
		LLNode<E> temp=head;
		while(index!=0)
		  {
			temp=temp.next;
			index--;	
		  }
		changedElement=temp.data;
		
		temp.data=element;
	
		return changedElement;
	   }
		catch(IndexOutOfBoundsException e)
		{
			e.printStackTrace();
			
		}
		return null;
	
	}	
		
		
}		

class LLNode<E> 
{
	LLNode<E> prev;
	LLNode<E> next;
	E data;

	// TODO: Add any other methods you think are useful here
	// E.g. you might want to add another constructor

	public LLNode(E e) 
	{
		this.data = e;
		this.prev = null;
		this.next = null;
	}

}
