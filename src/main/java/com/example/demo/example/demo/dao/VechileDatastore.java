package com.example.demo.example.demo.dao;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.springframework.beans.factory.config.AbstractFactoryBean;

import java.util.Arrays;

/**
 * Created by wuyiming on 2017/7/25.
 */
public class VechileDatastore extends AbstractFactoryBean<Datastore>{

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    protected Datastore createInstance() throws Exception {
        String dbName = "vehicle";
        Morphia morphia = initMorphia();
        Datastore datastore = morphia.createDatastore(initMongo(), dbName);
        return datastore;
    }

    private Morphia initMorphia(){
        Morphia morphia = new Morphia();
        morphia.mapPackage("com.example.demo.entity");
        return morphia;
    }

    private MongoClient initMongo(){
//        MongoCredential credential = MongoCredential.createCredential("root", "admin", "wym271847279".toCharArray());
        ServerAddress serverAddress = new ServerAddress("10.0.0.95",27017);
        MongoClient mongoClient = new MongoClient(serverAddress);

        return mongoClient;
    }

    public static Datastore getDatastore(){
        VechileDatastore vechileDatastore = new VechileDatastore();
        try{
            return vechileDatastore.createInstance();
        }catch (Exception e){

        }
        return null;
    }
}
