import java.util.HashMap;
import java.util.Set;

public class HashMapFun{
    public void trackList(){  
        HashMap<String, String> track = new HashMap<String, String>(); // 4 songs stored by title
        track.put("Love Song", "Whenever I'm alone with you You make me feel like I am home again...");
        track.put("Amber", "Brainstorm take me away from the norm I got to tell you something...");
        track.put("Maria Maria", "Maria, Maria She remind me of a West Side story...");
        track.put("A Song For You", "I've been so many places in my life and time...");

        String single = track.get("Amber"); // get song by track title
        System.out.println(single);

        Set<String> keys = track.keySet();
        for(String key : keys){
            System.out.println(key+": "+(track.get(key))); // print out all track and lyrics in format Track: Lyrics
       
        }
    }
}