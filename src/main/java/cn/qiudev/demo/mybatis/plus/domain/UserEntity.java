package cn.qiudev.demo.mybatis.plus.domain;

import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @author qiuqiu
 */
@TableName("user")
public class UserEntity {

    private String id;

    private String name;

    private Integer age;

    private String address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
