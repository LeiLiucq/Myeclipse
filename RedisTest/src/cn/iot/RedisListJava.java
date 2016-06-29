package cn.iot;


import java.util.List;

import redis.clients.jedis.Jedis;

public class RedisListJava {

	public static void main(String[] args) {
		Jedis jedis=new Jedis("localhost");
		System.out.println("connect success");
		
	/*	jedis.lpush("name-l", "double1");
		jedis.lpush("name-l", "double2");
		jedis.lpush("name-l", "double3");
		List<String> list=jedis.lrange("name-l", 0, 7);*/
		
		
		jedis.lpush("names", "double1");
		jedis.lpush("names", "double2");
		jedis.lpush("names", "double3");
		List<String> list=jedis.lrange("names", 0, 100);
		
		 /*jedis.lpush("tutorial-list", "Redis");
	      jedis.lpush("tutorial-list", "Mongodb");
	      jedis.lpush("tutorial-list", "Mysql");
	     // 获取存储的数据并输出
	     List<String> list = jedis.lrange("tutorial-list", 0 ,5);*/
		
		for (int i=0;i<list.size();i++) {
			System.out.println("value:"+list.get(i));
		}
		//jedis.expire("names", 0);
		//jedis.expire("name-l", 0);
		jedis.flushDB();
	}
}
