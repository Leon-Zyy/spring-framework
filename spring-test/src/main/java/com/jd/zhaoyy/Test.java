package com.jd.zhaoyy;

import com.jd.zhaoyy.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Y.Y.Zhao
 * @date 2021/11/16
 */
public class Test {

	public static void main(String[] args) {
		// 扫描 创建非懒加载的单例Bean
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		UserService userService = (UserService) context.getBean("userService");
		userService.test();
	}
}
