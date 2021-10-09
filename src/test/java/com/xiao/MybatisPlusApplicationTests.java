package com.xiao;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiao.mapper.UserMapper;
import com.xiao.pojo.User;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
@MapperScan("com.xiao.mapper")
@SpringBootTest
class MybatisPlusApplicationTests {
    @Autowired
    private UserMapper userMapper;


    void contextLoads() {
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    public void testInsert(){
        User user = new User();
        user.setName("xiao");
        user.setAge(12);
        user.setEmail("211212");
        int insert = userMapper.insert(user);
        System.out.println(insert);
    }
    //测试分页查询
    @Test
    public void testPage(){
        Page page = new Page(2, 5);
        userMapper.selectPage(page,null);
        page.getRecords().forEach(System.out::println);
    }

}
