import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;

import com.mongodb.*;

public class MongoDBWrite {
        public static void main(String[] args) throws UnknownHostException {
            /**** Connect to MongoDB ****/
            // Since 2.10.0, uses MongoClient
            MongoClient mongo = new MongoClient("localhost", 27017);

            /**** Get database ****/
            // if database doesn't exists, MongoDB will create it for you
            DB db = mongo.getDB("raftLog");

            /**** Get collection / table from 'testdb' ****/
            // if collection doesn't exists, MongoDB will create it for you
            DBCollection table = db.getCollection("log");

            /**** Insert ****/
            // create a document to store key and value
            BasicDBObject document = new BasicDBObject();
//            document.put("id",1);
            document.put("term",6);
            document.put("index", 10);
            document.put("decree", 3);
            table.insert(document);

            /**** Find and display ****/
            BasicDBObject searchQuery = new BasicDBObject();
            searchQuery.put("term", "1");

            // Read db's collection and populate hash
            DBCursor cursor = table.find();
            System.out.println("cursor is"+cursor);
            ArrayList<Integer> indexColl = new ArrayList<>();
            while (cursor.hasNext()) {
//                    System.out.println(cursor.next());
                DBObject dbobject = cursor.next();
                System.out.println(dbobject.get("term"));
                System.out.println(dbobject.get("index"));
                System.out.println(dbobject.get("decree"));
                int a = (int)dbobject.get("index");
                System.out.println(a);
                indexColl.add(a);

            }
            Collections.sort(indexColl);
            int lastLogIndex = indexColl.get(indexColl.size()-1);
            System.out.println("LastLogIndex"+lastLogIndex);

           /* Read DB and populate logHash*/

        }
}

