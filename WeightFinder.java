import java.util.Arrays;

public class WeightFinder extends HashTable{


    public static void main(String[] args)
    {

    int[] testWeight = new int[9];

    int collisions=50;
    int[] weights;







    for (int numWeights = 111111111;collisions!=0;numWeights++){
        TestHashTable t= new TestHashTable ();
        t.run(Integer.valueOf("15"));
        collisions = t.h.getCollisions();
        weights= t.h.htf.weights;
        int weightValue = numWeights;
        String weightCount = String.valueOf(numWeights);
        int weightCountLen = weightCount.length();
        int weightsOffset = t.h.htf.weights.length - weightCountLen;

        for (int i = 0; i < weightCountLen; i++) {
            testWeight[weightCountLen - i - 1] = weightValue % 10;
            weightValue /= 10;
        }

        for (int i = 0; i < weightsOffset; i++) {
            t.h.htf.weights[i] = 0;
        }

        int currentIndex = 0;
        for (int p = weightsOffset; p < t.h.htf.weights.length; p++) {
            if (currentIndex < weightCountLen) {
                t.h.htf.weights[p] = testWeight[currentIndex];
                currentIndex++;
            }
        }
        numWeights++;
        System.out.println("The weight is "+ Arrays.toString(weights));
    }
    }



}