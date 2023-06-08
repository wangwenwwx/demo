package com.example.demo.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("MY_TABLE")
@Data
public class MyTable {
    @TableId(type = IdType.AUTO)
    private int id;
    private String firstName;
    private String lastName;
}
