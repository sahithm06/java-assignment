
import java.util.*;
import edu.duke.*;

public class LogAnalyzer
{
     private ArrayList<LogEntry> records;
     
     public LogAnalyzer() {
         records=new ArrayList<LogEntry>();
     }
        
     public void readFile(String filename)
     {
        FileResource fr=new FileResource(filename);
         
         for(String line : fr.lines())
         {
             records.add(WebLogParser.parseEntry(line));
             
            }
     }
        
     public void printAll() {
         for (LogEntry le : records) 
         {
             
             System.out.println(le);
         }
     }
     int  countUniqueIPs()
     {
         ArrayList<String> list=new ArrayList<String>();
         for(LogEntry le : records)
        { 
         
            String ipaddr=le.getIpAddress();
            if(!list.contains(ipaddr))
            {
               // System.out.println(le.getAccessTime().toString());
                list.add(ipaddr);
            }
         
        }
       
        return list.size();
      }
      
      void printAllHigherThanNum(int n)
      {
          
        for(LogEntry le :records)
        {
            
            if(le.getStatusCode()>n)
            System.out.println(le);
        }
        
        
        }
        
        
        
       ArrayList<String> uniqueIPVisitsOnDay(String someday)
        
        {
            ArrayList<String> list =new ArrayList<String>();
            for(LogEntry le :records)
            {
                String ipaddr=le.getIpAddress();
               Date date= le.getAccessTime();
                String dateString=date.toString();
                if(dateString.substring(4,10).equals(someday))
                {
                   if(!list.contains(ipaddr))
                    
                    list.add(ipaddr);
                }
               
                
            }
            return list;
        }
        
   int  countUniqueIPsInRange(int low,int high)
   {
     ArrayList<String> list =new ArrayList<String>();
     for(LogEntry le : records)
     {
          
          String ipaddr;
         if(le.getStatusCode()>=low && le.getStatusCode()<=high)
          { 
                 ipaddr=le.getIpAddress();
              if(!list.contains(ipaddr))
                 list.add(ipaddr);
        
            }
          
        
     }
     
     return list.size();
     
    }

 
     HashMap<String,Integer> countVisitsPerIp()  
        
      {
          HashMap<String,Integer> map=new HashMap<String,Integer>();
            for(LogEntry le :records)
            {
                    String ipaddr=le.getIpAddress();
                    if(!map.containsKey(ipaddr))
                    {
                        map.put(ipaddr,1);
                    }
                    else
                    {
                      map.put(ipaddr,map.get(ipaddr)+1);
                    }
            
            }
          
          
          return map;
        }
        
        int mostNumberVisitsByIP(HashMap<String,Integer> map)
        {
            int max=0;
            for(String s : map.keySet())
            {
                if(max<map.get(s))
                max=map.get(s);
                
            }
           return max; 
        }
        
        ArrayList<String> iPsMostVisits(HashMap<String, Integer> map)
        {
            ArrayList<String> list=new ArrayList<String>();
            int max=mostNumberVisitsByIP(map);
            for(String s :map.keySet())
            {
                if(map.get(s)==max)
                {
                    list.add(s);
                }
                
            }
            
            return list;
        }
        
       HashMap<String,ArrayList<String>> iPsForDays() 
      {
            HashMap<String ,ArrayList<String>> map=new HashMap<String ,ArrayList<String>> ();
            ArrayList<String> list;
            for(LogEntry le : records)
            {
                String ipaddr=le.getIpAddress();
              String date=le.getAccessTime().toString();
              date=date.substring(4,10);
              if(!map.containsKey(date))
              {
                list=new  ArrayList<String>();
                list.add(ipaddr);
                 map.put(date,list); 
                  
                }
                else
                {
                  list= map.get(date) ;
                  list.add(ipaddr);
                  map.put(date,list);
            
                }
            
          
                
                
            }
    
         return map;
        
        
       }
        
        String dayWithMostIPVisits(HashMap<String,ArrayList<String>> mappedList)
        {
            String mostVisitedDate="";
            int max=0;
            for(String date :mappedList.keySet())
            {
                if(max< mappedList.get(date).size())
                {
                    max=mappedList.get(date).size();
                    mostVisitedDate=date;
                }
            }
            return mostVisitedDate;
        
        
        }
        
        
      ArrayList<String>   iPsWithMostVisitsOnDay(HashMap<String, ArrayList<String>> mappedList,String date)
       { 
           ArrayList<String> list; 
           list=mappedList.get(date);
           
           HashMap<String,Integer> map=new HashMap<String,Integer>();
           
               for(String s :list)
              {
                    //String ipaddr=le.getIpAddress();
                    if(!map.containsKey(s))
                    {
                        map.put(s,1);
                    }
                    else
                    {
                      map.put(s,map.get(s)+1);
                    }
            
              }
               
           return iPsMostVisits(map);
            
        
        }
        
        
        
        
        
        
        
        
        
        
        
        
  
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
       
       
       
       
       
        
     
   }
