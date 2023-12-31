package com.example.swinedatebaseproject.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName t_species
 */
@TableName(value ="t_species")
@Data
public class Species implements Serializable {
    /**
     * 
     */
    @TableId(value = "SPECIES_ID", type = IdType.AUTO)
    private Integer speciesId;

    /**
     * 
     */
    @TableField(value = "SPECIES_NAME")
    private String speciesName;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}