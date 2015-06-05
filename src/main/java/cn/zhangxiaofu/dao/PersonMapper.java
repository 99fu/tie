package cn.zhangxiaofu.dao;

import java.util.List;

import cn.zhangxiaofu.model.Person;

public interface PersonMapper {
    int deleteByPrimaryKey(Integer personId);

    int insert(Person record);

    int insertSelective(Person record);

    Person selectByPrimaryKey(Integer personId);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);
    
    List<Person> getAll();
    
    List<Person> getAll1();
    
    List<Person> getAll2();
    
    List<Person> getAll3();

	List<Person> getAll4();
}