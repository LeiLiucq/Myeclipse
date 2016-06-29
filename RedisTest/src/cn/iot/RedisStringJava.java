package cn.iot;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.ShardedJedis;

public class RedisStringJava {

	public static void main(String[] args) {
		Jedis jedis=new  Jedis("localhost");
		System.out.println("Connection to server sucessfully");
		jedis.set("name", "double");
		//jedis.del("name");
		jedis.append("name", " hello");
		
		jedis.mset("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5");
		System.out.println(jedis.mget("key1","key2","key3","key4","key5"));
		
		
		
		System.out.println("jedis value: "+jedis.get("name"));
	}
}
