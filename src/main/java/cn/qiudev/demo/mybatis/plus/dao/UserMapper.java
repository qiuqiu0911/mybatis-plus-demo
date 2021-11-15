package cn.qiudev.demo.mybatis.plus.dao;

import cn.qiudev.demo.mybatis.plus.domain.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author qiuqiu
 */
@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
}
