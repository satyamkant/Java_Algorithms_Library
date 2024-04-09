package Algorithms.FrequentAlgorithms;

import java.util.ArrayList;

/**
 * class used to precalculate the divisors
 * of Numbers from 1 to 2e5
 */
public class PrecalculateDivisor {
    final ArrayList<ArrayList<Integer>> divisor;

    PrecalculateDivisor(){
        divisor = new ArrayList<>();
        for(int i = 1;i <= 200001;i++){
            divisor.add(new ArrayList<>());
        }

        for(int i = 1;i < 200001;i++){
            divisor.get(i).add(1);
        }

        for(int i = 2;i < 200001;i++){
            for(int j = i;j < 200001;j += i){
                divisor.get(j).add(i);
            }
        }
    }

    ArrayList<Integer> getDivisors(int num){
        return divisor.get(num);
    }

}
