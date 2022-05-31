package com.scalpel.dom4j;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

/**
 * 使用dom4j解析XML文件
 */
public class Dom4JDemo1 {
    @Test
    public void parseXMLData() throws Exception {
        //创建一个Dom4j的解析器对象，代表整个Dom4j框架
        SAXReader saxReader=new SAXReader();
        //把XML文件加载到内存中成为一个Document文档对象
//        Document document=saxReader.read(new File("LyiC\\xml\\xmldata\\hello_world.xml"));
//        Document document=saxReader.read(new FileInputStream("LyiC\\xml\\xmldata\\hello_world.xml"));
        //getResourceAsStream直接去src下寻找文件
        InputStream is=Dom4JDemo1.class.getResourceAsStream("/hello_world.xml");
        Document document=saxReader.read(is);

        //获取根元素对象
        Element root=document.getRootElement();
        System.out.println(root.getName());

        //获取子元素对象
        List<Element> sonEles=root.elements();
        for (Element sonEle : sonEles) {
            System.out.println(sonEle.getName());
        }
        //获取某个子元素(子元素同名则默认提取第一个子元素)
        Element userEle=root.element("sex");
        System.out.println(userEle.getName());

        //获取子元素文本
        System.out.println(userEle.elementText("name"));
        //去掉前后空格
        System.out.println(userEle.elementTextTrim("name"));

        //根据元素获取属性值
        Attribute idAttr = userEle.attribute("id");
        System.out.println(idAttr.getName()+"===="+idAttr.getValue());

        //直接提取属性值
        System.out.println(userEle.attributeValue("id"));
        System.out.println(userEle.attributeValue("vip"));

        //获取当前元素下的子元素对象
        Element email = userEle.element("email");
        System.out.println(email.getText());
    }
}
