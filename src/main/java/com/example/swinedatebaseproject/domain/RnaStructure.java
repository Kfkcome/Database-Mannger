package com.example.swinedatebaseproject.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName t_rna_structure
 */
@TableName(value ="t_rna_structure")
@Data
public class RnaStructure implements Serializable {
    /**
     * 
     */
    @TableId(value = "mRNA_ID")
    private Integer mrnaId;

    /**
     * 
     */
    @TableField(value = "EXON_ID")
    private Integer exonId;

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

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}