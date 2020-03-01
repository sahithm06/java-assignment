package textgen;

public class LinkedListadd 
{
	public static void  main(String[] args)
	{
		MyLinkedList<Integer> ll=new MyLinkedList<Integer>();
		ll.add(2);
		//ll.add(3);
		ll.add(4);
		ll.add(5);
		
		ll.add(1, 6);
		System.out.println(ll.get(0));
		System.out.println(ll.get(1));
		System.out.println(ll.get(2));
		System.out.println(ll.get(3));
		
		//System.out.println(ll.size());
		
		//System.out.println(ll.remove(3));
		System.out.println("changed element"+ll.set(4,11));
		System.out.println("changed element"+ll.set(3,10));
		System.out.println("size: "+ll.size());
		System.out.println(ll.get(0));
		System.out.println(ll.get(1));
		System.out.println(ll.get(2));
		System.out.println(ll.get(3));
		
	}

	
}
