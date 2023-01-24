package com.chance.facade.example02;

public class SmartAppliancesFacade {
    private Light light = new Light();
    private TV tv = new TV();
    private AirCondition airCondition = new AirCondition();

    public void say(String msg) {
        if (msg.contains("open")) {
            on();
        } else if (msg.contains("close")) {
            off();
        } else {
            System.out.println("对不起没有听清~");
        }
    }

    private void off() {
        System.out.println("睡觉了");
        light.off();
        tv.off();
        airCondition.off();
    }

    private void on() {
        System.out.println("起床了");
        light.on();
        tv.on();
        airCondition.on();
    }
}
