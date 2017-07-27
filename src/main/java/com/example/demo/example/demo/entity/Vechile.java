package com.example.demo.example.demo.entity;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.util.Date;

/**
 * Created by wuyiming on 2017/7/25.
 */
@Entity(noClassnameStored = true)
public class Vechile implements Cloneable{
    @Id
    private String id;
    private String status;
    private Date createTime;
    private Date updateTime;

    /**
     * 基本参数
     */
    private String brand;
    private String country;

    /**
     * 车体参数
     */
    private Integer GVW;
    private Integer CVW;
    private Integer bodyLenght;
    private Integer bodyWidth;
    private Integer bodyHeight;
    private Integer seatNum;

    /**
     * 外观数据
     */
    private String bodyColor;    //车身色彩   WHITE|SILVER|BLACK|GREY
    private String glassColor;   //玻璃色彩   GREEN|WHITE
    private String innerColor;   //内饰色彩   WARM|COLD

    /**
     * 性能参数
     */
    private String displacement; //排量
    private String engine;       //发动机
    private String emission;     //排放

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getGVW() {
        return GVW;
    }

    public void setGVW(Integer GVW) {
        this.GVW = GVW;
    }

    public Integer getCVW() {
        return CVW;
    }

    public void setCVW(Integer CVW) {
        this.CVW = CVW;
    }

    public Integer getBodyLenght() {
        return bodyLenght;
    }

    public void setBodyLenght(Integer bodyLenght) {
        this.bodyLenght = bodyLenght;
    }

    public Integer getBodyWidth() {
        return bodyWidth;
    }

    public void setBodyWidth(Integer bodyWidth) {
        this.bodyWidth = bodyWidth;
    }

    public Integer getBodyHeight() {
        return bodyHeight;
    }

    public void setBodyHeight(Integer bodyHeight) {
        this.bodyHeight = bodyHeight;
    }

    public Integer getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(Integer seatNum) {
        this.seatNum = seatNum;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public String getGlassColor() {
        return glassColor;
    }

    public void setGlassColor(String glassColor) {
        this.glassColor = glassColor;
    }

    public String getInnerColor() {
        return innerColor;
    }

    public void setInnerColor(String innerColor) {
        this.innerColor = innerColor;
    }

    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getEmission() {
        return emission;
    }

    public void setEmission(String emission) {
        this.emission = emission;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Vechile{" +
                "id='" + id + '\'' +
                ", status='" + status + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", brand='" + brand + '\'' +
                ", country='" + country + '\'' +
                ", GVW=" + GVW +
                ", CVW=" + CVW +
                ", bodyLenght=" + bodyLenght +
                ", bodyWidth=" + bodyWidth +
                ", bodyHeight=" + bodyHeight +
                ", seatNum=" + seatNum +
                ", bodyColor='" + bodyColor + '\'' +
                ", glassColor='" + glassColor + '\'' +
                ", innerColor='" + innerColor + '\'' +
                ", displacement='" + displacement + '\'' +
                ", engine='" + engine + '\'' +
                ", emission='" + emission + '\'' +
                '}';
    }
}
