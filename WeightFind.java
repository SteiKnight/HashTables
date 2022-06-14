import java.util.Arrays;
public class WeightFind {
          public static void main ( String [] args ){
                    int collisions=0;
                    int[] weights;
                    //object h in TestHashTable is declared outside of run (global) in order for this to work
                    do{           
                        TestHashTable test= new TestHashTable ();
                        test.run(Integer.valueOf (args[0]));
                        collisions=test.h.getCollisions();
                        weights= test.h.htf.weights;
                        System.out.println(collisions);
                    } while((collisions)!=0);
                    System.out.print(Arrays.toString(weights));
                }       
}
