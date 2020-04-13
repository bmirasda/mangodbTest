package com.cucumbernew.mangodbTest;

import java.util.Iterator;

import org.bson.codecs.configuration.CodecRegistry;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase; 
import com.mongodb.*;
import com.sun.xml.internal.txw2.Document;

public class mongoTest {	

	public static void main(String[] args) {
	
		MongoClient mongo = new MongoClient( "localhost" , 27017 );
		System.out.println("Connection successful");
		 MongoDatabase database = mongo.getDatabase("mydb");
		 
		 MongoCollection<org.bson.Document> collection = database.getCollection("mycollection2");
	      System.out.println("Collection sampleCollection selected successfully"); 

	      // Getting the iterable object 
	      FindIterable<org.bson.Document> iterDoc = collection.find(); 
	      int i = 1; 

	      // Getting the iterator 
	      Iterator it = iterDoc.iterator(); 
	    
	      while (it.hasNext()) {  
	         System.out.println(it.next());  
	      i++; 
	      }
	   } 
	
		
		
	}


