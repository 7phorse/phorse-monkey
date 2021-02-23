package com.luo.leetcode.leetcode1_100;

import java.util.LinkedList;
import java.util.List;

/**
 * @author luoxusheng 2020/11/4 11:44
 * @version 1.0.0
 * 给出一个无重叠的 ，按照区间起始端点排序的区间列表。
 *
 * 在列表中插入一个新的区间，你需要确保列表中的区间仍然有序且不重叠（如果有必要的话，可以合并区间）。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：intervals = [[1,3],[6,9]], newInterval = [2,5]
 * 输出：[[1,5],[6,9]]
 * 示例 2：
 *
 * 输入：intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
 * 输出：[[1,2],[3,10],[12,16]]
 * 解释：这是因为新的区间 [4,8] 与 [3,5],[6,7],[8,10] 重叠。
 */
public class Test57_Solution {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new LinkedList<int[]>();
        int i = 0;
        int size = intervals.length;
        int start;
        int end = newInterval[1];

        while (i < size && intervals[i][1] < newInterval[0]) {
            res.add(intervals[i]);
            i++;
        }

        if (i == size) {
            res.add(newInterval);
            return res.toArray(new int[0][]);
        }

        start = Math.min(intervals[i][0], newInterval[0]);

        while (i < size && intervals[i][0] <= newInterval[1]) {
            end = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        res.add(new int[] {start, end});

        //如果后面有没遍历到的 加入最后的结果
        while (i < size) {
            res.add(intervals[i++]);
        }
        return res.toArray(new int[0][]);
    }

}
