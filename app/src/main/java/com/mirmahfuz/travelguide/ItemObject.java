package com.mirmahfuz.travelguide;

public class ItemObject {

    private String description;
    private String name;
    private int photo;
    private String learn;

    public ItemObject(String name,String description , String learn, int photo) {


        this.learn = learn ;

        this.description = description;

        this.name = name;

        this.photo = photo;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String name) {
        this.description = name;
    }




    public String getLearn() {
        return learn;
    }

    public void setLearn(String learnmore) {
        this.learn = learnmore;
    }







    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }







    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
