package cn.qiudev.demo.mybatis.plus.controller;

import cn.qiudev.demo.mybatis.plus.dao.UserMapper;
import cn.qiudev.demo.mybatis.plus.domain.UserEntity;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author qiuqiu
 */
@RestController
@RequestMapping("demo")
public class DemoController {

    @Resource
    private UserMapper userMapper;

    @GetMapping("insert")
    public String insert() {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(UUID.randomUUID().toString());
        userEntity.setAddress("测试地址" + new Date());
        userMapper.insert(userEntity);
        return "success";
    }

    @GetMapping("query")
    public String query() {
        QueryWrapper<UserEntity> queryWrapper = new QueryWrapper<>();
        List<UserEntity> address = userMapper.selectList(queryWrapper.isNotNull("address")
                .orderByDesc("id"));
        return JSON.toJSONString(address);

    }
}
