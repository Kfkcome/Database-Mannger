package com.example.swinedatebaseproject.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @TableName Oceania_count
 */
@TableName(value = "Oceania_count")
@Data
public class OceaniaCount implements Serializable {
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
    @TableField(value = "N_ALLELES")
    private Integer nAlleles;

    /**
     *
     */
    @TableField(value = "N_CHR")
    private Integer nChr;

    /**
     *
     */
    @TableField(value = "ALL_Type")
    private String allType;

    /**
     *
     */
    @TableField(value = "ALL_Count")
    private Integer allCount;

    /**
     *
     */
    @TableField(value = "Ref_Type")
    private String refType;

    /**
     *
     */
    @TableField(value = "Ref_Count")
    private Integer refCount;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", chrom=").append(chrom);
        sb.append(", pos=").append(pos);
        sb.append(", nAlleles=").append(nAlleles);
        sb.append(", nChr=").append(nChr);
        sb.append(", allType=").append(allType);
        sb.append(", allCount=").append(allCount);
        sb.append(", refType=").append(refType);
        sb.append(", refCount=").append(refCount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}