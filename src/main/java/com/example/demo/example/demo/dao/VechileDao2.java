package com.example.demo.example.demo.dao;

import com.example.demo.example.demo.entity.Vechile;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.dao.BasicDAO;
import org.mongodb.morphia.query.Query;

/**
 * Created by wuyiming on 2017/7/25.
 */
public class VechileDao2 extends BasicDAO<Vechile,ObjectId>{

    public VechileDao2(Datastore ds) {
        super(ds);
    }

    public Vechile findByBrand(String brand){
        Query<Vechile> query = super.getDs().createQuery(Vechile.class);
        query.filter("brand",brand);
        return findOne(query);
    }
}
