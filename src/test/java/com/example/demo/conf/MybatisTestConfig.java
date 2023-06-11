package com.example.demo.conf;

import com.baomidou.mybatisplus.core.metadata.TableInfoHelper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.test.context.event.PrepareTestInstanceEvent;

import java.lang.reflect.Field;

//@Component
public class MybatisTestConfig {

    @Autowired
    SqlSessionFactory factory;

    /**
     * 监听每个测试方法前的事件
     * @param event 事件
     */
    @EventListener()
    public void setConfiguration(PrepareTestInstanceEvent event)  {
        TableInfoHelper.getTableInfos().forEach(tableInfo -> {
            try {
                Field field = tableInfo.getClass().getDeclaredField("configuration");
                field.setAccessible(true);
                field.set(tableInfo,factory.getConfiguration());
            } catch (NoSuchFieldException | IllegalAccessException e) {
                e.printStackTrace();
            }
        });
    }
}
