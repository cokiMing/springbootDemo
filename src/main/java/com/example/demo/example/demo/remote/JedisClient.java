package com.example.demo.example.demo.remote;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Created by wuyiming on 2017/7/27.
 */
public class JedisClient {

    private static JedisPool jedisPool;
    private static Jedis jedis;
    //可用连接实例的最大数目，默认为8；
    //如果赋值为-1，则表示不限制，如果pool已经分配了maxActive个jedis实例，则此时pool的状态为exhausted(耗尽)
    private final static Integer MAX_TOTAL = 256;
    //控制一个pool最多有多少个状态为idle(空闲)的jedis实例，默认值是8
    private final static Integer MAX_IDLE = 64;
    //等待可用连接的最大时间，单位是毫秒，默认值为-1，表示永不超时。
    //如果超过等待时间，则直接抛出JedisConnectionException
    private final static Integer MAX_WAIT_MILLIS = 10000;
    private final static Integer TIMEOUT = 10000;
    //在borrow(用)一个jedis实例时，是否提前进行validate(验证)操作；
    //如果为true，则得到的jedis实例均是可用的
    private final static Boolean TEST_ON_BORROW = true;
    //redis密码
    private final static String AUTH = "wym271847279";
    //端口
    private final static Integer PORT = 6379;
    //地址
    private final static String HOST = "10.0.0.95";

    private synchronized void init(){
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxIdle(MAX_IDLE);
        jedisPoolConfig.setMaxTotal(MAX_TOTAL);
        jedisPoolConfig.setMaxWaitMillis(MAX_WAIT_MILLIS);
        jedisPoolConfig.setTestOnBorrow(TEST_ON_BORROW);

        jedisPool = new JedisPool(jedisPoolConfig,HOST,PORT,TIMEOUT,AUTH);
        jedis = jedisPool.getResource();
    }

    public JedisClient(){
        if (jedisPool == null){
            init();
        }
    }

    public void set(String key,String value,Integer expire){
        jedis.set(key,value);
        if (expire != null){
            jedis.expire(key,expire);
        }
    }

    public Object get(String key){
        return jedis.get(key);
    }

    public void del(String key){
        jedis.del(key);
    }

    public void hset(){
    }

    public static void main(String[] args){
        JedisClient jedisClient = new JedisClient();
        System.out.println(jedisClient.get("name"));
    }

}
