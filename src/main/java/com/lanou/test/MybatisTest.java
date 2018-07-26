package com.lanou.test;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lanou.dao.UserMapper;

public class MybatisTest {
	@Test
	public void test01() {
		ApplicationContext ac=new ClassPathXmlApplicationContext("application.xml");
		UserMapper userMapper=(UserMapper)ac.getBean("userMapper");
		System.out.println(userMapper.selectAll());
		
	}
}
