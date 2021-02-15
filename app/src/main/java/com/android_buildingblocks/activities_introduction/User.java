package com.android_buildingblocks.activities_introduction;

//Serialize or Parcelize


import java.io.Serializable;

public class User implements Serializable {
    public String name = "Junaid";
    public String phoneNumber = "03331234445";
    public String address = "Bahria Town, RWP";
}

//Custom Object -> into stream of bytes. so this process is called serialization