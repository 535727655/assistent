package com.doublek.assistent.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * 角色
 * User: Ousion
 * Date: 2019/8/27
 */
@Data
@Entity
@Table(name = "role")
public class Role {

    @Id
    private Long id;

    /**头像*/
    private String icon;
    /**原画*/
    private String imgUrl;
    /**头衔*/
    private String title;
    /**名称*/
    private String name;
    /**价格*/
    private Integer amount;
    /**价格-单位*/
    private String unitPrice;
    /**基本属性*/
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "base_attribute_id")
    private BaseAttribute baseAttribute;

}
