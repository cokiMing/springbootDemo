package com.example.demo.example.demo;

import com.example.demo.example.demo.dao.VechileDao;
import com.example.demo.example.demo.dao.VechileDao2;
import com.example.demo.example.demo.dao.VechileDatastore;
import com.example.demo.example.demo.entity.Vechile;
import org.bson.types.ObjectId;
import org.mongodb.morphia.query.QueryResults;

import java.util.Date;
import java.util.List;

/**
 * Created by wuyiming on 2017/7/25.
 */
public class Test {
    public static void main(String[] args){
        Vechile vechile = new Vechile();
        vechile.setBrand("bmw");
        Date date = new Date();
        vechile.setCreateTime(date);
        vechile.setUpdateTime(date);

//        VechileDao vechileDao = new VechileDao();
//        vechileDao.insert(vechile);
        VechileDao2 vechileDao2 = new VechileDao2(VechileDatastore.getDatastore());
//        vechileDao2.save(vechile);
        QueryResults<Vechile> vechiles = vechileDao2.find();
        System.out.println(vechiles.asList());
    }
}
