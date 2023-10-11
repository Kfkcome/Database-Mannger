package com.example.swinedatebaseproject.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName t_compartment
 */
@TableName(value ="t_compartment")
@Data
public class Compartment implements Serializable {
    /**
     * 
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    @TableField(value = "CS_ID")
    private String csId;

    /**
     * 
     */
    @TableField(value = "START_POINT")
    private Integer startPoint;

    /**
     * 
     */
    @TableField(value = "END_POINT")
    private Integer endPoint;

    /**
     * 
     */
    @TableField(value = "VALUE")
    private Double value;

    /**
     * 导出软件id
     */
    @TableField(value = "SOFTWARE_ID")
    private Integer softwareId;

    /**
     * 组织id
     */
    @TableField(value = "TISSUE_ID")
    private Integer tissueId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}