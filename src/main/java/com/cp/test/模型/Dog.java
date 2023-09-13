package com.cp.test.模型;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @author: jc.cp
 * @date: 2022/8/4 16:11
 * @description: TODO
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Dog {
    private Integer age;
    private Map<String,String> attrMap;
}
