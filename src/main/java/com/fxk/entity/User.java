package com.fxk.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author fuqiang01
 * @date 2020/4/30 22:07
 * @description
 */
@Entity
@Table(name = "user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "email")
    private String email;

    @Column(name = "cellphone")
    private String cellphone;

    @Column(name = "password")
    private String password;

    @Column(name = "salt")
    private String salt;

    @Column(name = "state")
    private Integer state;

    @Column(name = "create_time")
    private Date createTime;


}
