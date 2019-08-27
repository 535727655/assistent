package com.doublek.assistent.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 装备
 * User: Ousion
 * Date: 2019/8/27
 */
@Data
@Entity
@Table(name = "equipment")
public class Equipment {

    @Id
    private Long id;

    /**图标*/
    private String icon;
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

    /**特效1 名称*/
    private String extraKey1;
    /**特效1 内容*/
    private String extraValue1;
    /**特效2 名称*/
    private String extraKey2;
    /**特效2 内容*/
    private String extraValue2;
    /**特效3 名称*/
    private String extraKey3;
    /**特效3 内容*/
    private String extraValue3;
    /**特效4 名称*/
    private String extraKey4;
    /**特效4 内容*/
    private String extraValue4;

}
