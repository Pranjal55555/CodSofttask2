import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
public class word{
    public static void main(String args[])throws FileNotFoundException{
        HashMap<String,Integer>map=new HashMap<String,Integer>();
        
        Scanner txtFile=new Scanner(new File("C:\\Users\\Pranjal Warang\\OneDrive\\Desktop\\CodSoft Task-2\\word.txt"));
        while(txtFile.hasNext()){
            String word=txtFile.next();
            if(map.containsKey(word)){
                int count=map.get(word)+1;
                map.put(word,count);
            }
            else{
                map.put(word,1);

            }
            }
            txtFile.close();
            for(Map.Entry<String,Integer>entry:map.entrySet()){
                System.out.println(entry);
            }
        }
    }