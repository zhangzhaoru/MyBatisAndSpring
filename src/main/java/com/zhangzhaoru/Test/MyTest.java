package com.zhangzhaoru.Test;

import com.zhangzhaoru.dao.UserMapper;
import com.zhangzhaoru.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @BelongsProject: MyBatisAndSpring
 * @BelongsPackage: com.zhangzhaoru.Test
 * @Author: ZhangZhaoru
 * @Date: 2021/4/29 9:55 上午
 * @Description:
 */
public class MyTest {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper mapper = context.getBean(UserMapper.class);
        User user = (User) mapper.getUserById(1);
        System.out.println(user);
    }
}
