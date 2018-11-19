package com.biz.hello;

import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCache;
import org.apache.ignite.Ignition;
 

public class Ignite1 
{

	public static void main(String[] args) 
	{
		 try (Ignite ignite = Ignition.start("F:\\Ignite\\apache-ignite-fabric-2.6.0-bin\\config\\default-config.xml")) 
		    {
		      // Put values in cache.
		      IgniteCache<Object, Object> objCache1 = ignite.getOrCreateCache("myCache");
				objCache1.put(1, "Bhuvanesh");
				objCache1.put(2, "Mahesh");
				objCache1.put(3, "Naresh");
				objCache1.put(4, "Unkonwn");
				objCache1.put(5, "Yellareddy");
				objCache1.put(6, "Katta");
		 
				// Get these items from cache
				 ignite.compute().broadcast(()->System.out.println(objCache1.get(1)+"\n"+objCache1.get(2)
				 
				 +"\n"+objCache1.get(3)+"\n"+objCache1.get(4)+"\n"+objCache1.get(5)+"\n"+objCache1.get(6)));
		    }
	}

}

