package com.android_buildingblocks.activities_introduction;

//Serialize or Parcelize

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {
    public String name = "Junaid";
    public String phoneNumber = "03331234445";
    public String address = "Bahria Town, RWP";


    public User(){

    }

    protected User(Parcel in) {
        name = in.readString();
        phoneNumber = in.readString();
        address = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(phoneNumber);
        dest.writeString(address);
    }
}

//Custom Object -> into stream of bytes. so this process is called serialization