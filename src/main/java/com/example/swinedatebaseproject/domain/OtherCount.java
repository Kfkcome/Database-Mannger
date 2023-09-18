package com.example.swinedatebaseproject.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @TableName other_count
 */
@TableName(value = "other_count")
@Data
public class OtherCount implements Serializable {
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
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        OtherCount other = (OtherCount) that;
        return (this.getChrom() == null ? other.getChrom() == null : this.getChrom().equals(other.getChrom()))
                && (this.getPos() == null ? other.getPos() == null : this.getPos().equals(other.getPos()))
                && (this.getNAlleles() == null ? other.getNAlleles() == null : this.getNAlleles().equals(other.getNAlleles()))
                && (this.getNChr() == null ? other.getNChr() == null : this.getNChr().equals(other.getNChr()))
                && (this.getAllType() == null ? other.getAllType() == null : this.getAllType().equals(other.getAllType()))
                && (this.getAllCount() == null ? other.getAllCount() == null : this.getAllCount().equals(other.getAllCount()))
                && (this.getRefType() == null ? other.getRefType() == null : this.getRefType().equals(other.getRefType()))
                && (this.getRefCount() == null ? other.getRefCount() == null : this.getRefCount().equals(other.getRefCount()));
    }


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