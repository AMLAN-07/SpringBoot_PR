package com.springtool.LabRecord;

public class Address {
        String State;
        String District;
        int Zip;

    public Address (String state, String district, int zip) {
        State = state;
        District = district;
        Zip = zip;
    }

    public String getState() {
        return State;
    }

    public String getDistrict() {
        return District;
    }

    public int getZip() {
        return Zip;
    }

    @Override
    public String toString() {
        return "Address{" +
                "State='" + State + '\'' +
                ", District='" + District + '\'' +
                ", Zip=" + Zip +
                '}';
    }
}
