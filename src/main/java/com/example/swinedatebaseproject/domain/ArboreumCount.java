package com.example.swinedatebaseproject.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName arboreum_count
 */
@TableName(value ="arboreum_count")
@Data
public class ArboreumCount implements Serializable {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    @TableField(value = "CHROM")
    private String chrom;

    /**
     * 
     */
    @TableField(value = "POS")
    private String pos;

    /**
     * 
     */
    @TableField(value = "N_ALLELES")
    private String nAlleles;

    /**
     * 
     */
    @TableField(value = "N_CHR")
    private String nChr;

    /**
     * 
     */
    @TableField(value = "ALLELE")
    private String allele;

    /**
     * 
     */
    @TableField(value = "Alt_num")
    private String altNum;

    /**
     * 
     */
    @TableField(value = "Ref_num")
    private String refNum;

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
        ArboreumCount other = (ArboreumCount) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getChrom() == null ? other.getChrom() == null : this.getChrom().equals(other.getChrom()))
            && (this.getPos() == null ? other.getPos() == null : this.getPos().equals(other.getPos()))
            && (this.getNAlleles() == null ? other.getNAlleles() == null : this.getNAlleles().equals(other.getNAlleles()))
            && (this.getNChr() == null ? other.getNChr() == null : this.getNChr().equals(other.getNChr()))
            && (this.getAllele() == null ? other.getAllele() == null : this.getAllele().equals(other.getAllele()))
            && (this.getAltNum() == null ? other.getAltNum() == null : this.getAltNum().equals(other.getAltNum()))
            && (this.getRefNum() == null ? other.getRefNum() == null : this.getRefNum().equals(other.getRefNum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getChrom() == null) ? 0 : getChrom().hashCode());
        result = prime * result + ((getPos() == null) ? 0 : getPos().hashCode());
        result = prime * result + ((getNAlleles() == null) ? 0 : getNAlleles().hashCode());
        result = prime * result + ((getNChr() == null) ? 0 : getNChr().hashCode());
        result = prime * result + ((getAllele() == null) ? 0 : getAllele().hashCode());
        result = prime * result + ((getAltNum() == null) ? 0 : getAltNum().hashCode());
        result = prime * result + ((getRefNum() == null) ? 0 : getRefNum().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", chrom=").append(chrom);
        sb.append(", pos=").append(pos);
        sb.append(", nAlleles=").append(nAlleles);
        sb.append(", nChr=").append(nChr);
        sb.append(", allele=").append(allele);
        sb.append(", altNum=").append(altNum);
        sb.append(", refNum=").append(refNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}