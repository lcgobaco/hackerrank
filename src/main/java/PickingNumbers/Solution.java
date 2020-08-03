package PickingNumbers;

import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        int currentMax = 0;
        Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        for (Integer x: a) {
            Integer count = countMap.get(x);
            if (count == null) {
                count = 0;
            }
            countMap.put(x, ++count);
        }

        for (Integer key: countMap.keySet()) {
            Integer left = countMap.get(key-1) == null ? 0 : countMap.get(key-1);
            Integer right = countMap.get(key+1) == null ? 0 : countMap.get(key+1);
            Integer num = countMap.get(key);

            if (left+num > currentMax) {
                currentMax = left+num;
            }
            if (right+num > currentMax) {
                currentMax = right+num;
            }
        }
        return currentMax;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        int result = Result.pickingNumbers(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
