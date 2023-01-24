package com.chance.strategy;

import com.chance.strategy.example01.ConcreteStrategyA;
import com.chance.strategy.example01.Context;
import com.chance.strategy.example01.Strategy;
import com.chance.strategy.example02.controller.ReceiptBuilder;
import com.chance.strategy.example02.controller.ReceiptHandleStrategyFactory;
import com.chance.strategy.example02.controller.ReceiptStrategyContext;
import com.chance.strategy.example02.entity.Receipt;
import com.chance.strategy.example02.service.ReceiptHandlerStrategy;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.util.List;

public class TestStrategy {
    @Test
    public void test01() {
        Strategy sA = new ConcreteStrategyA();
        Context c = new Context(sA);
        c.algorithm();
    }

    @Test
    public void test02() {
        // 模拟回执
        List<Receipt> receiptList = ReceiptBuilder.getReceiptList();

        // 策略上下文
        ReceiptStrategyContext context = new ReceiptStrategyContext();

        // 策略模式最主要的工作：将策略的定义、创建、使用这三部分进行了解耦
        for (Receipt r : receiptList
             ) {
            // 获取策略
            ReceiptHandleStrategyFactory.init();
            ReceiptHandlerStrategy strategy = ReceiptHandleStrategyFactory.getStrategy(r.getType());
            // 设置策略
            context.setReceiptHandlerStrategy(strategy);
            // 执行策略
            context.handleReceipt(r);
        }
    }

    @Test
    public void testDom4j() {
        SAXReader reader = new SAXReader();
        String file = "/Users/chancewang/Documents/Code/Java/DesignPattern/src/main/resources/strategy.xml";
        try {
            Document document = reader.read(file);
            Element config = document.getRootElement();
            List<Element> classNameList = config.elements();
            for (Element className : classNameList
                 ) {
                System.out.println(className.getText());
                System.out.println(className.attributeValue("name"));
            }

//            List<Node> nodes = document.selectNodes("/config/className");
//            for (Node node : nodes
//                    ) {
//                System.out.println(node.getText());
//            }

        } catch (DocumentException e) {
            throw new RuntimeException(e);
        }
    }
}
