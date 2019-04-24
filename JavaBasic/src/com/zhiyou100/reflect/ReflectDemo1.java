package com.zhiyou100.reflect;

import com.zhiyou100.model.User;

public class ReflectDemo1 {
	public static void main(String[] args) throws Exception {
		
		Class<?> clazz = Class.forName("com.zhiyou100.model.User");
		
		Class clazz2 = User.class;
		
		User user = new User();
		Class clazz3 = user.getClass();
		
		
		
	}
}
