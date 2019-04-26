package chapter10.replaceexceptionwithtest;

import java.util.Stack;

/**
 * @author xiang.zhao@woqutech.com
 * @date 2019-04-26 21:42
 */

public class ResourcePool {

    Stack available;
    Stack allocated;

    Resource getResource() {
        Resource result;
        if (available.isEmpty()) {
            result = new Resource();
        } else {
            result = (Resource) available.pop();
        }
        allocated.push(result);
        return result;
    }
}
