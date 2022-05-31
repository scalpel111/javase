package com.scalpel.reflect.case1;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

/**
 * 保存任意类型的对象
 */
public class MybatisUtil {
    public static void save(Object obj){
        try {
            PrintStream ps=new PrintStream(new FileOutputStream("src\\data.txt",true));
            Class<?> c = obj.getClass();
            ps.println(c.getSimpleName());//c.getSimpleName()获取当前类名 c.getName()获取全限名

            Field[] fields=c.getDeclaredFields();
            for (Field field : fields) {
                String name = field.getName();
                field.setAccessible(true);
                String value=field.get(obj)+"";
                ps.println(name+"="+value);
            }
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
