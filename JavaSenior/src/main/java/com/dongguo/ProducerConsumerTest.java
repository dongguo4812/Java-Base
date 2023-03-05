package com.dongguo;

/**
 * @author dongguo
 * @date 2023/3/5
 * @description:
 */
public class ProducerConsumerTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producer producer = new Producer(clerk);
        producer.setName("生产者");
        Consumer consumer = new Consumer(clerk);
        consumer.setName("消费者");
        producer.start();
        consumer.start();
    }
}

/**
 * 店员
 */
class Clerk{
    //产品的数量
    private int productNum = 0;

    /**
     *生产商品
     */
    public synchronized void addProduct(){
        if (productNum >=20){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        productNum++;
        System.out.println("生产第"+ productNum+"个商品");
        notify();
    }

    /**
     *消费商品
     */
    public synchronized void minusProduct(){
        if (productNum == 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("消费第"+ productNum+"个商品");
        productNum--;
        notify();
    }
}

/**
 * 生产者
 */
class Producer extends Thread{
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true){
            try {
                sleep(50);
                System.out.println("生产者生产商品");
                clerk.addProduct();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/**
 * 消费者
 */
class Consumer extends Thread{
    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }
    @Override
    public void run() {
        while (true){
            try {
                sleep(50);
                System.out.println("消费者消费商品");
                clerk.minusProduct();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
