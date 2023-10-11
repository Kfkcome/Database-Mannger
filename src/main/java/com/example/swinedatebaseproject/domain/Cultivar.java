package com.example.swinedatebaseproject.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName t_cultivar
 */
@TableName(value ="t_cultivar")
@Data
public class Cultivar implements Serializable {
    /**
     * 
     */
    @TableId(value = "CULTIVAR_ID", type = IdType.AUTO)
    private Integer cultivarId;

    /**
     * 
     */
    @TableField(value = "CULTIVAR_NAME")
    private String cultivarName;

    /**
     * 
     */
    @TableField(value = "SPECIES_ID")
    private Integer speciesId;

    /**
     * 
     */
    @TableField(value = "CS_NUM")
    private Integer csNum;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}