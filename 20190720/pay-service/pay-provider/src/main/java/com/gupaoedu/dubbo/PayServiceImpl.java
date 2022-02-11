package com.gupaoedu.dubbo;

public class PayServiceImpl implements IPayService{


    //执行支付的服务
    @Override
    public String pay(String info) {
        System.out.println("execute pay："+info);
        return "Hello Dubbo :"+info;
    }
}
