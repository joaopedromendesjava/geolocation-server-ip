package com.ip.geolocation.service.domain.valueobject;

import lombok.Builder;
import org.apache.commons.validator.routines.InetAddressValidator;

@Builder
public record IpAddress(String ip) {

    public IpAddress {
        if (!InetAddressValidator.getInstance().isValid(ip)) {
            throw new IllegalArgumentException("Ip not valid " + ip);
        }
    }
}

