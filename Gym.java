package com.flipfit.bean;

public class Gym {
    private int GymId;
    private int GymOwnerId;
    private String GymName;

    public int getGymId() {
        return GymId;
    }

    public void setGymId(int gymId) {
        GymId = gymId;
    }

    public int getGymOwnerId() {
        return GymOwnerId;
    }

    public void setGymOwnerId(int gymOwnerId) {
        GymOwnerId = gymOwnerId;
    }

    public String getGymName() {
        return GymName;
    }

    public void setGymName(String gymName) {
        GymName = gymName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    private String location;

}
