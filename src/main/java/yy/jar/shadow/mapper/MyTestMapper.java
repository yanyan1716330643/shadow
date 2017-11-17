package yy.jar.shadow.mapper;

import org.apache.ibatis.annotations.Mapper;
import yy.jar.shadow.model.MyTest;

import java.util.List;

@Mapper
public interface MyTestMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MyTest record);

    int insertSelective(MyTest record);

    MyTest selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MyTest record);

    int updateByPrimaryKey(MyTest record);

    List<MyTest> selectAll();
}