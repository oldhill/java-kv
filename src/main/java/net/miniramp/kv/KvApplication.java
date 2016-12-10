/*
 * Simple CLI to get and set strings in an in-memory kv store (map)
 */

package net.miniramp.kv;

import java.util.HashMap;

public class KvApplication {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<String, String>();

        for (int i = 0; i < 5; i++) {
            map.put("hi " + i, "there");
        }

        System.out.println(map);
    }

}
