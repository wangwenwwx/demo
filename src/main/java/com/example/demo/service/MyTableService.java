package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.mapper.MyTableMapper;
import com.example.demo.model.MyTable;
import org.springframework.stereotype.Service;

@Service
public class MyTableService extends ServiceImpl<MyTableMapper, MyTable> implements IService<MyTable> {

}
