package com.baizhi.test;

import com.baizhi.Application;
import com.baizhi.dao.AddressMapper;
import com.baizhi.dao.UserMapper;
import com.baizhi.entity.Address;
import com.baizhi.entity.User;
import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TestGeneralMapper {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private AddressMapper addressMapper;
    @Test
    public void test(){
        List<User> userMappers = userMapper.selectAll();
        System.out.println(userMappers);
    }
    @Test
    //测试example
    public void testexample(){
        //创建Example对象
        Example example = new Example(User.class);
        //设置查询条件
        example.createCriteria()
                .andBetween("id","1","3");
        List<User> users = userMapper.selectByExample(example);
        System.out.println(users);
    }
  //测试分页
    @Test
    public void testPage(){
       int pageNum=2;
       int pageSize=3;
        RowBounds rowBounds = new RowBounds((pageNum - 1) * pageSize, pageSize);
        List<User> users = userMapper.selectByRowBounds(new User(), rowBounds);
        System.out.println(users);


    }

}
