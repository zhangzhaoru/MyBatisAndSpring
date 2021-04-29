package com.zhangzhaoru.dao;

import com.zhangzhaoru.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @BelongsProject: MyBatisAndSpring
 * @BelongsPackage: com.zhangzhaoru.dao
 * @Author: ZhangZhaoru
 * @Date: 2021/4/29 9:07 上午
 * @Description:
 */
public interface UserMapper {
    public List<User> getAllUser();

    public User getUserById(@Param("id") int id);
}
