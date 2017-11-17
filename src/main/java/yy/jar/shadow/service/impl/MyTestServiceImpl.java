package yy.jar.shadow.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yy.jar.shadow.mapper.MyTestMapper;
import yy.jar.shadow.model.MyTest;
import yy.jar.shadow.service.MyTestService;

import java.util.List;

@Service
public class MyTestServiceImpl implements MyTestService {
    @Autowired
    MyTestMapper myTestMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return myTestMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(MyTest record) {
        return myTestMapper.insert(record);
    }

    @Override
    public int insertSelective(MyTest record) {
        return myTestMapper.insertSelective(record);
    }

    @Override
    public MyTest selectByPrimaryKey(Integer id) {
        return myTestMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(MyTest record) {
        return myTestMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(MyTest record) {
        return myTestMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<MyTest> selectAll() {
        return myTestMapper.selectAll();
    }
}
