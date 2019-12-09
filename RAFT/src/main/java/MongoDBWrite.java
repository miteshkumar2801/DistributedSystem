import java.net.UnknownHostException;
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
            document.put("term",3);
            document.put("index", 4);
            document.put("decree", 5);
            table.insert(document);

            /**** Find and display ****/
            BasicDBObject searchQuery = new BasicDBObject();
            searchQuery.put("term", "1");

            // Read db's collection and populate hash
            DBCursor cursor = table.find();
            System.out.println("cursor is"+cursor);
            while (cursor.hasNext()) {
//                    System.out.println(cursor.next());
                DBObject dbobject = cursor.next();
                System.out.println(dbobject.get("term"));
                System.out.println(dbobject.get("index"));
                System.out.println(dbobject.get("decree"));
            }
           /* Read DB and populate logHash*/

        }
}

