package code401challenges.hashtable;

public class RepeatedWord {

    public static String getFirstRepeatedWord(String lengthyString){
        String[] words = lengthyString.split(" ");
        Hashtable hashtable = new Hashtable(1024);
        for(String word : words){
            if(hashtable.contains(word.toLowerCase())!=false){
                return word.toLowerCase();
            }else{
                hashtable.add(word.toLowerCase(),word.toLowerCase());
            }
        }
        return null;
    }
}
