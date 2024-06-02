package com.example.augustbikeapp;

public class CartModal {

    // variables for our bikeName,
    // description, tracks and duration, id.
    private String bikeName;
    private String bikeImage;
    private String bikeDescription;
    private int id;

    // creating getter and setter methods
    public String getbikeName() { return bikeName; }

    public void setbikeName(String bikeName)
    {
        this.bikeName = bikeName;
    }

    public String getCourseDuration()
    {
        return bikeImage;
    }

    public void setCourseDuration(String bikeImage)
    {
        this.bikeImage = bikeImage;
    }

    public String getCourseDescription()
    {
        return bikeDescription;
    }

    public void
    setCourseDescription(String bikeDescription)
    {
        this.bikeDescription = bikeDescription;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    // constructor
    public CartModal(String bikeName,
                       String bikeImage,
                       String bikeDescription)
    {
        this.bikeName = bikeName;
        this.bikeImage = bikeImage;
        this.bikeDescription = bikeDescription;
    }
}
