package com.dongguo.proxy01;

/**
 * @author dongguo
 * @date 2023/2/14
 * @description:
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        NikeClothFactory nikeClothFactory = new NikeClothFactory();
        ProxyClothFactory proxyClothFactory = new ProxyClothFactory(nikeClothFactory);
        proxyClothFactory.produceCloth();
    }
}

/**
 * 接口
 */
interface ClothFactory{
    public void produceCloth();
}

/**
 * 代理类
 */
class ProxyClothFactory implements ClothFactory{
    private ClothFactory clothFactory;

    public ProxyClothFactory(ClothFactory clothFactory) {
        this.clothFactory = clothFactory;
    }

    @Override
    public void produceCloth() {
        System.out.println("静态代理前执行的代码");
        clothFactory.produceCloth();
        System.out.println("静态代理后执行的代码");

    }
}
//被代理类
class NikeClothFactory implements ClothFactory{
    @Override
    public void produceCloth() {
        System.out.println("Nike工厂生产服装");
    }
}
