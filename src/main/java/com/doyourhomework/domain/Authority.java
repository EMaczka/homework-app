package com.doyourhomework.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Authority implements GrantedAuthority {
    private static final long serialVersionUID = -606871081267740771L;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String authority;
    @ManyToOne(optional = false)
    private User user;

    public Authority() {}

    public Authority(String authority) {
        this.authority = authority;
    }
}
