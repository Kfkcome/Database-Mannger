package com.example.swinedatebaseproject.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName snp_info
 */
@TableName(value ="snp_info")
@Data
public class SnpInfo implements Serializable {
    /**
     * 
     */
    @TableField(value = "CHROM")
    private String chrom;

    /**
     * 
     */
    @TableField(value = "POS")
    private Integer pos;

    /**
     * 
     */
    @TableField(value = "ID")
    private String id;

    /**
     * 
     */
    @TableField(value = "Len")
    private String len;

    /**
     * 
     */
    @TableField(value = "Ref")
    private String ref;

    /**
     * 
     */
    @TableField(value = "Alt")
    private String alt;

    /**
     * 
     */
    @TableField(value = "Freq")
    private String freq;

    /**
     * 
     */
    @TableField(value = "Alt_num")
    private String altNum;

    /**
     * 
     */
    @TableField(value = "Total_num")
    private String totalNum;

    /**
     * 
     */
    @TableField(value = "z_score")
    private String zScore;

    /**
     * 
     */
    @TableField(value = "Hard_Clipped_Bases")
    private String hardClippedBases;

    /**
     * 
     */
    @TableField(value = "DP")
    private String dp;

    /**
     * 
     */
    @TableField(value = "ExcessHet")
    private String excesshet;

    /**
     * 
     */
    @TableField(value = "FS")
    private String fs;

    /**
     * 
     */
    @TableField(value = "InbreedingCoeff")
    private String inbreedingcoeff;

    /**
     * 
     */
    @TableField(value = "MLEAC")
    private String mleac;

    /**
     * 
     */
    @TableField(value = "MLEAF")
    private String mleaf;

    /**
     * 
     */
    @TableField(value = "MQ")
    private String mq;

    /**
     * 
     */
    @TableField(value = "MQRankSum")
    private String mqranksum;

    /**
     * 
     */
    @TableField(value = "QD")
    private String qd;

    /**
     * 
     */
    @TableField(value = "ReadPosRankSum")
    private String readposranksum;

    /**
     * 
     */
    @TableField(value = "SOR")
    private String sor;

    @TableId(value = "snp_id")
    private Integer snpId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

}