package com.example.swinedatebaseproject.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName t_tissue
 */
@TableName(value ="t_tissue")
@Data
public class Tissue implements Serializable {
    /**
     * 组织id
     */
    @TableId(value = "TISSUE_ID", type = IdType.AUTO)
    private Integer tissueId;

    /**
     * 组织名称
     */
    @TableField(value = "TISSUE_NAME")
    private String tissueName;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}