package chapter6.substitutealgorithm;

import java.util.Arrays;
import java.util.List;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-14 21:24
 */

public class SubstituteAlgorithmSummary {

    String foundPerson(String[] peoples) {
        List candidates = Arrays.asList(new String[]{"Don", "John", "Kent"});
        for (String people : peoples) {
            if (candidates.contains(people)) {
                return people;
            }
        }
        return "";
    }

}
