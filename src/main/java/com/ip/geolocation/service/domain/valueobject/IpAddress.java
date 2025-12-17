package com.ip.geolocation.service.domain.valueobject;

import org.apache.commons.validator.routines.InetAddressValidator;

public record IpAddress(String ip) {

    public IpAddress {
        if (InetAddressValidator.getInstance().isValid(ip)) {
            throw new IllegalArgumentException("Ip not valid " + ip);
        }
    }
}

