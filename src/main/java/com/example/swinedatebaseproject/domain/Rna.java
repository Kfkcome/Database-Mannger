package com.example.swinedatebaseproject.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName t_rna
 */
@TableName(value ="t_rna")
@Data
public class Rna implements Serializable {
    /**
     * 
     */
    @TableId(value = "mRNA_ID")
    private Integer mrnaId;

    /**
     * 
     */
    @TableField(value = "CS_ID")
    private Integer csId;

    /**
     * 
     */
    @TableField(value = "mRNA_NAME")
    private String mrnaName;

    /**
     * 
     */
    @TableField(value = "START_POINT")
    private Long startPoint;

    /**
     * 
     */
    @TableField(value = "END_POINT")
    private Long endPoint;

    /**
     * 
     */
    @TableField(value = "DIRECTION")
    private Integer direction;

    /**
     * 
     */
    @TableField(value = "TISSUE_ID")
    private Integer tissueId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}