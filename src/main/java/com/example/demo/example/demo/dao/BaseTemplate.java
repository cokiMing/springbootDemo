package com.example.demo.example.demo.dao;

import com.mongodb.Mongo;
import org.springframework.data.authentication.UserCredentials;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * Created by wuyiming on 2017/7/25.
 */
public class BaseTemplate {

    private static MongoTemplate baseTemplate;

    private static synchronized void init(){
        UserCredentials userCredentials = new UserCredentials("root","wym271847279");
        Mongo mongo = new Mongo("10.0.0.95",27017);
        baseTemplate = new MongoTemplate(
                mongo,
                "Vehicle",
                userCredentials
        );
    }

    public static MongoTemplate getMongoTemplate(){
        if (baseTemplate == null){
            init();
        }
        return baseTemplate;
    }
}
