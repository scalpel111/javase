package com.lyic.inheima.String.ArrayList;

import java.util.ArrayList;

/**
    学生成绩：98、77、66、89、79、50、100
    删除学生成绩：小于80分
 */

public class DeletScores {
    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(98);
        scores.add(77);
        scores.add(66);
        scores.add(89);
        scores.add(79);
        scores.add(50);
        scores.add(100);
        scores.add(30);

        System.out.println(scores);

        //删除小于80分
        for(int i = 0; i < scores.size(); i++){
            if (scores.get(i) < 80){
                scores.remove(i);
                i--;    //删除一次以后数组会向前移动
            }
        }
        System.out.println(scores);

    }
}
