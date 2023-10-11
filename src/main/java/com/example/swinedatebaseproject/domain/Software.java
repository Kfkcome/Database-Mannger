package com.example.swinedatebaseproject.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName t_software
 */
@TableName(value ="t_software")
@Data
public class Software implements Serializable {
    /**
     * 软件id
     */
    @TableId(value = "SOFTWARE_ID", type = IdType.AUTO)
    private Integer softwareId;

    /**
     * 软件名称
     */
    @TableField(value = "SOFTWARE_NAME")
    private String softwareName;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}