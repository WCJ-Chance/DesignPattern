package com.chance.strategy.example02.controller;

import com.chance.strategy.example02.service.ReceiptHandlerStrategy;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 策略工厂类
 */
public class ReceiptHandleStrategyFactory {

    // 使用Map集合存储策略信息，彻底地消除if-else
    private static Map<String, ReceiptHandlerStrategy> strategyMap;

    // 初始化具体策略，保存到Map集合
    public static void init() {
        strategyMap = new HashMap<>();
//        strategyMap.put("MT1101", new MT1101Strategy());
//        strategyMap.put("MT2101", new MT1101Strategy());
//        strategyMap.put("MT4101", new MT1101Strategy());
//        strategyMap.put("MT8101", new MT1101Strategy());
        SAXReader reader = new SAXReader();
        String file = "/Users/chancewang/Documents/Code/Java/DesignPattern/src/main/resources/strategy.xml";
        try {
            Document document = reader.read(file);
            Element config = document.getRootElement();
            List<Element> classNameList = config.elements();
            for (Element className : classNameList
                 ) {
                String name = className.attributeValue("name");
                String value = className.getText();
                Class strategyClass = Class.forName(value);
                ReceiptHandlerStrategy strategy = (ReceiptHandlerStrategy) strategyClass.newInstance();
                strategyMap.put(name, strategy);
            }
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static ReceiptHandlerStrategy getStrategy(String receiptType) {
        return strategyMap.get(receiptType);
    }

}
