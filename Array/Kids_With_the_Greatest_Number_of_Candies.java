package Array;

import java.util.ArrayList;
import java.util.List;

public class Kids_With_the_Greatest_Number_of_Candies {
    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2 };

        kidsWithCandies(candies, 1);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // List<Boolean> result = new ArrayList<>();
        // boolean check = false;
        // for (int i = 0; i < candies.length; i++) {
        //     int temp = candies[i] + extraCandies;
        //     for (int j = 0; j < candies.length; j++) {
        //         if (candies[j] != temp - extraCandies) {
        //             if (temp < candies[j]) {
        //                 check = false;
        //                 break;
        //             } else {
        //                 check = true;
        //             }
        //         }
        //     }
        //     if (check) {
        //         result.add(true);
        //     } else {
        //         result.add(false);
        //     }
        // }

       
        // return result;


        int max = candies[0];

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        ArrayList<Boolean> greatestNumberCheck = new ArrayList<Boolean>(candies.length);

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                greatestNumberCheck.add(true);
            } else {
                greatestNumberCheck.add(false);
            }
        }
        return greatestNumberCheck;
    }
}
