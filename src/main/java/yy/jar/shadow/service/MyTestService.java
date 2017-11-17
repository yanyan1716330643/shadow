package yy.jar.shadow.service;



import yy.jar.shadow.model.MyTest;

import java.util.List;

public interface MyTestService {
    int deleteByPrimaryKey(Integer id);

    int insert(MyTest record);

    int insertSelective(MyTest record);

    MyTest selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MyTest record);

    int updateByPrimaryKey(MyTest record);

    List<MyTest> selectAll();
}
