package com.doublek.assistent.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * User: Ousion
 * Date: 2019/8/27
 */
@Data
@Entity
@Table(name = "buff")
public class Buff {

    @Id
    private Long id;

    /**名称*/
    private String name;
    /**触发数量*/
    private Integer count;
    /**触发种族*/
    @OneToOne(mappedBy = "buff")
    private Race race;

    /**效果描述*/
    private String deccription;


}
