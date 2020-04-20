package com.lishuo.pojo;

import lombok.*;

import java.io.Serializable;

@Data
public class User implements Serializable {

    private Integer id;

    private String username;

    private String sex;

    private String address;

}
