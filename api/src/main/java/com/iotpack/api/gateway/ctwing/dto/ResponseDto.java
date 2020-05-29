package com.iotpack.api.gateway.ctwing.dto;

import lombok.Data;

@Data
public class ResponseDto<T> {
    Integer code;
    String msg;
    T result;
}
