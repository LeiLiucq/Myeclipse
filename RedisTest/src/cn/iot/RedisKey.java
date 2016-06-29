package cn.iot;

import java.util.Iterator;
import java.util.List;
import java.util.Set;


import redis.clients.jedis.Jedis;

public class RedisKey {

	public static void main(String[] args) {
		Jedis jedis=new Jedis("localhost");
		
		Set<String>  set= jedis.keys("*");
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()){
			String key=iterator.next();
			System.out.println(key);
		}
	}
}
