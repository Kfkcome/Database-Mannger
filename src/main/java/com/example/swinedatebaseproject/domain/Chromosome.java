package com.example.swinedatebaseproject.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName t_chromosome
 */
@TableName(value ="t_chromosome")
@Data
public class Chromosome implements Serializable {
    /**
     * 
     */
    @TableId(value = "CS_ID", type = IdType.AUTO)
    private Integer csId;

    /**
     * 
     */
    @TableField(value = "CS_NAME")
    private String csName;

    /**
     * 
     */
    @TableField(value = "CS_LENGTH")
    private Long csLength;

    /**
     * 品种id
     */
    @TableField(value = "CULTIVAR_ID")
    private Integer cultivarId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}