


import java.util.*;

public class Tester
{
    public void testLogEntry() {
        LogEntry le = new LogEntry("1.2.3.4", new Date(), "example request", 200, 500);
        System.out.println(le);
        LogEntry le2 = new LogEntry("1.2.100.4", new Date(), "example request 2", 300, 400);
        System.out.println(le2);
    }
    
    public void testLogAnalyzer()
    {
        LogAnalyzer la =new LogAnalyzer();
        la.readFile("short-test_log");
        la.printAll();
         System.out.println("the unique ips in the file"+la.countUniqueIPs());
        System.out.println("\n");
        //la.printAllHigherThanNum(200);)
        System.out.println("unique ip visitors on a day are "+la.uniqueIPVisitsOnDay("Sep 30"));
        
          System.out.println("\n");
            System.out.println("\n");
            System.out.println("the ips greater than 300 status code are");la.printAllHigherThanNum(300); 
        System.out.println( "the unique ips in a given rangee"+la.countUniqueIPsInRange(200,299));
          System.out.println( "the unique ips in a given rangee"+la.countUniqueIPsInRange(300,399));  
    }


  /*void testUniqueIp()
  {
      LogAnalyzer la=new LogAnalyzer();
      la.readFile("short-test_log");
      System.out.println(la.countUniqueIPs());
      la.printAll();
      
    }
*/
  void hashTester()
  {
      LogAnalyzer la=new LogAnalyzer();
      la.readFile("weblog3-short_log");
      la.printAll();
      System.out.println();
     HashMap<String,Integer> map= la.countVisitsPerIp() ;
      System.out.println(map);
      System.out.println("the ip having most visits in weblog3-short_log is : "+la.mostNumberVisitsByIP(map));
      System.out.println();
      System.out.println("the follwing are the ips having most visits"+la.iPsMostVisits(map));
   
      System.out.println();
      
      HashMap<String,ArrayList<String>> mappedList= la.iPsForDays();
      for(String date: mappedList.keySet())
      {
          System.out.println("on "+date+"the no of vistiors are "+mappedList.get(date).size());
          
        }
      System.out.println();
    System.out.println("the day having highest visits is : "+la.dayWithMostIPVisits(mappedList)   );
    
    System.out.println();

    
    System.out.println("the most visited ips on the day sep 30 are : "+la.iPsWithMostVisitsOnDay(mappedList,"Sep 30"));
    
    
    
    
    



}
  
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}


