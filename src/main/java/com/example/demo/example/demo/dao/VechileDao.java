package com.example.demo.example.demo.dao;

import com.example.demo.example.demo.entity.Vechile;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * Created by wuyiming on 2017/7/25.
 */
public class VechileDao{

    private MongoTemplate mongoTemplate;

    public VechileDao(){
        mongoTemplate = BaseTemplate.getMongoTemplate();
    }

    public void insert(Vechile vechile){
        mongoTemplate.insert(vechile,"vechile");
    }
}
