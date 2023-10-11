package com.example.swinedatebaseproject.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName t_loop
 */
@TableName(value ="t_loop")
@Data
public class Loop implements Serializable {
    /**
     * 
     */
    @TableId(value = "IC_ID", type = IdType.AUTO)
    private Long icId;

    /**
     * 染色体的id
     */
    @TableField(value = "CS_ID")
    private Integer csId;

    /**
     * 
     */
    @TableField(value = "START_POINT1")
    private Long startPoint1;

    /**
     * 
     */
    @TableField(value = "END_POINT1")
    private Long endPoint1;

    /**
     * 
     */
    @TableField(value = "START_POINT2")
    private Long startPoint2;

    /**
     * 
     */
    @TableField(value = "END_POINT2")
    private Long endPoint2;

    /**
     * 
     */
    @TableField(value = "IC_NUM")
    private Integer icNum;

    /**
     * 
     */
    @TableField(value = "FDR_VALUE")
    private Double fdrValue;

    /**
     * 组织id
     */
    @TableField(value = "TISSUE_ID")
    private Integer tissueId;

    /**
     * 软件id
     */
    @TableField(value = "SOFTWARE_ID")
    private Integer softwareId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}