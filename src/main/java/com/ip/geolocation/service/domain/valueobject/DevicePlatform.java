package com.ip.geolocation.service.domain.valueobject;

public enum DevicePlatform {
    iOS,
    WEB,
    ANDROID;

    public static DevicePlatform from(String devicePlatform) {
        try {
            return valueOf(devicePlatform);
        } catch (Exception e ){
            throw new IllegalArgumentException("Device is invalid " + devicePlatform);
        }
    }
}

