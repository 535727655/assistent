package com.doublek.assistent.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * 种族
 * User: Ousion
 * Date: 2019/8/27
 */
@Entity
@Data
@Table(name = "race")
public class Race {
    @Id
    private Long id;

    /**名称*/
    private String name;

    /**buff*/
    @OneToOne
    @JoinColumn(name = "buff", insertable = false, updatable = false)
    private Buff buff;


    @ManyToMany(mappedBy = "race")
    private List<Role> roles;
}
