package com.doublek.assistent.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * User: Ousion
 * Date: 2019/8/27
 */
@Data
@Entity
@Table(name = "base_attribute")
public class BaseAttribute {

    @Id
    private Long id;

    /**攻击力*/
    private Integer attack;
    /**攻击速度*/
    private Integer attackSpeed;
    /**魔抗*/
    private Integer spellResistance;
    /**物抗*/
    private Integer physicalResistance;
    /**生命值*/
    private Integer healthPoint;
    /**生命偷取*/
    private Integer lifeSteal;
    /**法术吸血*/
    private Integer skillsVampire;
    /**生命回复*/
    private Integer healthRegen;


}
