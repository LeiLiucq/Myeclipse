package cn.iot;

import redis.clients.jedis.Jedis;

public class RedisJava {

	public static void main(String[] args) {
		Jedis jedis=new Jedis("localhost");
		System.out.println("Connection to server sucessfully");
		System.out.println("Server is running: "+jedis.ping());
	}
}
