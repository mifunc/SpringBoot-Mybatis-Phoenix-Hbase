package com.rumenz.phoenix.mapper;

import com.rumenz.phoenix.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    //表名和字段名必须加上双引号,否则表名和字段名会变成大写，找不到对应关系，会报错
    @Select("select * from \"test2\" where \"id\"=#{id}")
    User selectById(Integer id);
}
