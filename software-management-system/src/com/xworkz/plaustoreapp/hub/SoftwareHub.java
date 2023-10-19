package com.xworkz.plaustoreapp.hub;

import com.xworkz.plaustoreapp.Application.Application;

public class SoftwareHub {
    Application application[] = new Application[2];

    int index;

    public boolean addApplication(Application application) {
        boolean isAdded = false;
        if (application != null) {
            this.application[index++] = application;
            isAdded = true;
        }
        return isAdded;
    }

    public void getApllication(){

        for(int index=0;index<=application.length;index++){
            System.out.println(application[index].getAppId()+" "+application[index].getSizeInMb()+" "+application[index].getAppType()+"" +application[index].getAppName()+" "+application[index].getAppVersion()+" "+application[index].getReleaseDate()+" "+application[index].getCompanyName());
        }

    }

}
