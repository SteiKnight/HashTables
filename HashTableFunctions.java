import java.util.*;
import java.util.Random;

class HashTableFunctions {
   Random rand = new Random();
   

   //these are the weights that give 0 collisions
   int[] weights = {4,2,0,3,1,0,1,2,4};

   //This below is the randomise function that was used to get the correct weight;
   //public int[] weights = { rand.nextInt(4-0) + 0 ,rand.nextInt(4-0) + 0 ,rand.nextInt(4-0) + 0 ,rand.nextInt(4-0) + 0 ,rand.nextInt(4-0) + 0 ,rand.nextInt(4-0) + 0 ,rand.nextInt(4-0) + 0 ,rand.nextInt(4-0) + 0 ,rand.nextInt(4-0) + 0 };  
   boolean find ( String s, int h, int hashTableSize, String [] hashTableArray )
   {
      List<String> hashTable = Arrays.asList(hashTableArray);
      return hashTable.contains(s);
   }
}
