package com.company.JBay.core.adapters;


import com.company.JBay.GoogleServices.GoogleServices;
import com.company.JBay.core.abstracts.OutSourceServices;

public class GoogleServicesAdapters implements OutSourceServices {
    @Override
    public void registerWith() {
        GoogleServices googleManager = new GoogleServices();
        googleManager.register();

    }

    @Override
    public void loginWith() {
        GoogleServices googleManager = new GoogleServices();
        googleManager.login();

    }
}
