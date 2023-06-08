package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.model.MyTable;
import org.springframework.stereotype.Repository;

@Repository
public interface MyTableMapper extends BaseMapper<MyTable> {
}
