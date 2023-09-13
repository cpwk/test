package com.cp.test.optional;

import com.cp.test.模型.Dog;

import java.util.Map;
import java.util.Optional;

/**
 * @author: jc.cp
 * @date: 2022/10/21 10:55
 * @desc: TODO
 **/
public class TestOptional {

    public static void main(String[] args) {
        Dog dog = new Dog();
        /*dog.setAttrMap(new HashMap<String, String>() {{
            put("1", "1");
        }});*/

        String s = Optional.ofNullable(dog.getAttrMap())
                .map(stringStringMap -> stringStringMap.get("1"))
                .orElse("2");
        System.out.println("s = " + s);

        Optional<Map<String, String>> attrMap = Optional.ofNullable(dog.getAttrMap());
        System.out.println("attrMap = " + attrMap);

        Optional<Integer> integer = attrMap.map(Map::size);
        System.out.println("integer = " + integer);
    }

}
