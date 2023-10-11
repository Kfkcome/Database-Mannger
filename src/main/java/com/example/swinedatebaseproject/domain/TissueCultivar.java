package com.example.swinedatebaseproject.domain;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName t_tissue_cultivar
 */
@TableName(value ="t_tissue_cultivar")
@Data
public class TissueCultivar implements Serializable {
    /**
     * 
     */
    @TableId(value = "TISSUE_ID")
    private Integer tissueId;

    /**
     * 
     */
    @TableField(value = "CULTIVAR_ID",insertStrategy = FieldStrategy.IGNORED)
    private Integer cultivarId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}