package exercises;

import model.Puzzle;

import java.math.BigInteger;
import java.util.List;

public class Day06_02 extends Puzzle {

    @Override
    public <R> R solve(List<String> input) {
        long count = 0;
        String strTime = input.get(0).split("Time:")[1].trim().replaceAll("\\s+", "");
        String strDistance = input.get(1).split("Distance:")[1].trim().replaceAll("\\s+", "");
        long time = Long.parseLong(strTime);
        BigInteger distance = new BigInteger(strDistance);

        for (long i = 0; i < time ; i++) {
            try {
                BigInteger bigIntI = BigInteger.valueOf(i);
                BigInteger bigIntTime = BigInteger.valueOf(time);
                BigInteger product = bigIntI.multiply(bigIntTime.subtract(bigIntI));
                boolean isBigger = product.compareTo(distance) > 0;

                if (isBigger) {
                    count++;
                }
            } catch (ClassCastException nfe) {
                System.out.println("ClassCastException with i: " + i);
            }

        }

        return (R) Long.valueOf(count);
    }

}
