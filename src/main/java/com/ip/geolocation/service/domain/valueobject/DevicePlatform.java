package com.ip.geolocation.service.domain.valueobject;

public enum DevicePlatform {
    iOS,
    WEB,
    ANDROID;

    public static DevicePlatform from(String device) {
        try {
            return valueOf(device.toUpperCase());
        } catch (Exception e ){
            throw new IllegalArgumentException("Device is invalid");
        }
    }
}

