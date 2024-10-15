package com.cp.test.力扣.数组;

import java.util.ArrayList;
import java.util.List;
/*
  给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。
  在「杨辉三角」中，每个数是它左上方和右上方的数的和。
 */

/**
 * 在这个函数中，我们首先创建一个空的二维列表 triangle 来存储杨辉三角的结果
 * 然后检查 numRows 是否为0，如果是，则直接返回一个空的三角形。
 * 接着创建第一行，并添加到 triangle 中，
 * 然后依次计算每一行的数值，根据上一行的数值得出当前行的数值，并将每一行的结果添加到 triangle 中。
 * 最后返回得到的杨辉三角。
 */
public class 杨辉三角 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows == 0) {
            return triangle;
        }

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            row.add(1);
            triangle.add(row);
        }

        return triangle;
    }

    // 返回第n行
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);

        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> tempRow = new ArrayList<>();
            tempRow.add(1);
            for (int j = 1; j < i; j++) {
                tempRow.add(row.get(j - 1) + row.get(j));
            }
            tempRow.add(1);
            row = tempRow;
        }

        return row;
    }

}