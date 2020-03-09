package com.adam.bleDevices;


public class Device{
    private String name;
    private String id;



    Device(String name, String id){
        
        this.name = name;
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    
    }
    public void setId(String id){
        this.id =id;
    }

    @Override
    public String toString(){
        return "Device Name: " + name +", Device Id: " + id;
    }

}