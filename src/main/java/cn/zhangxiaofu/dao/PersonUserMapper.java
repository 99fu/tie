package cn.zhangxiaofu.dao;

import cn.zhangxiaofu.model.PersonUser;

public interface PersonUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PersonUser record);

    int insertSelective(PersonUser record);

    PersonUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PersonUser record);

    int updateByPrimaryKey(PersonUser record);
}