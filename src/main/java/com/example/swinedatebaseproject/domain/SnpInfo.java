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
        SnpInfo other = (SnpInfo) that;
        return (this.getChrom() == null ? other.getChrom() == null : this.getChrom().equals(other.getChrom()))
            && (this.getPos() == null ? other.getPos() == null : this.getPos().equals(other.getPos()))
            && (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLen() == null ? other.getLen() == null : this.getLen().equals(other.getLen()))
            && (this.getRef() == null ? other.getRef() == null : this.getRef().equals(other.getRef()))
            && (this.getAlt() == null ? other.getAlt() == null : this.getAlt().equals(other.getAlt()))
            && (this.getFreq() == null ? other.getFreq() == null : this.getFreq().equals(other.getFreq()))
            && (this.getAltNum() == null ? other.getAltNum() == null : this.getAltNum().equals(other.getAltNum()))
            && (this.getTotalNum() == null ? other.getTotalNum() == null : this.getTotalNum().equals(other.getTotalNum()))
            && (this.getZScore() == null ? other.getZScore() == null : this.getZScore().equals(other.getZScore()))
            && (this.getHardClippedBases() == null ? other.getHardClippedBases() == null : this.getHardClippedBases().equals(other.getHardClippedBases()))
            && (this.getDp() == null ? other.getDp() == null : this.getDp().equals(other.getDp()))
            && (this.getExcesshet() == null ? other.getExcesshet() == null : this.getExcesshet().equals(other.getExcesshet()))
            && (this.getFs() == null ? other.getFs() == null : this.getFs().equals(other.getFs()))
            && (this.getInbreedingcoeff() == null ? other.getInbreedingcoeff() == null : this.getInbreedingcoeff().equals(other.getInbreedingcoeff()))
            && (this.getMleac() == null ? other.getMleac() == null : this.getMleac().equals(other.getMleac()))
            && (this.getMleaf() == null ? other.getMleaf() == null : this.getMleaf().equals(other.getMleaf()))
            && (this.getMq() == null ? other.getMq() == null : this.getMq().equals(other.getMq()))
            && (this.getMqranksum() == null ? other.getMqranksum() == null : this.getMqranksum().equals(other.getMqranksum()))
            && (this.getQd() == null ? other.getQd() == null : this.getQd().equals(other.getQd()))
            && (this.getReadposranksum() == null ? other.getReadposranksum() == null : this.getReadposranksum().equals(other.getReadposranksum()))
            && (this.getSor() == null ? other.getSor() == null : this.getSor().equals(other.getSor()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getChrom() == null) ? 0 : getChrom().hashCode());
        result = prime * result + ((getPos() == null) ? 0 : getPos().hashCode());
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLen() == null) ? 0 : getLen().hashCode());
        result = prime * result + ((getRef() == null) ? 0 : getRef().hashCode());
        result = prime * result + ((getAlt() == null) ? 0 : getAlt().hashCode());
        result = prime * result + ((getFreq() == null) ? 0 : getFreq().hashCode());
        result = prime * result + ((getAltNum() == null) ? 0 : getAltNum().hashCode());
        result = prime * result + ((getTotalNum() == null) ? 0 : getTotalNum().hashCode());
        result = prime * result + ((getZScore() == null) ? 0 : getZScore().hashCode());
        result = prime * result + ((getHardClippedBases() == null) ? 0 : getHardClippedBases().hashCode());
        result = prime * result + ((getDp() == null) ? 0 : getDp().hashCode());
        result = prime * result + ((getExcesshet() == null) ? 0 : getExcesshet().hashCode());
        result = prime * result + ((getFs() == null) ? 0 : getFs().hashCode());
        result = prime * result + ((getInbreedingcoeff() == null) ? 0 : getInbreedingcoeff().hashCode());
        result = prime * result + ((getMleac() == null) ? 0 : getMleac().hashCode());
        result = prime * result + ((getMleaf() == null) ? 0 : getMleaf().hashCode());
        result = prime * result + ((getMq() == null) ? 0 : getMq().hashCode());
        result = prime * result + ((getMqranksum() == null) ? 0 : getMqranksum().hashCode());
        result = prime * result + ((getQd() == null) ? 0 : getQd().hashCode());
        result = prime * result + ((getReadposranksum() == null) ? 0 : getReadposranksum().hashCode());
        result = prime * result + ((getSor() == null) ? 0 : getSor().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", chrom=").append(chrom);
        sb.append(", pos=").append(pos);
        sb.append(", id=").append(id);
        sb.append(", len=").append(len);
        sb.append(", ref=").append(ref);
        sb.append(", alt=").append(alt);
        sb.append(", freq=").append(freq);
        sb.append(", altNum=").append(altNum);
        sb.append(", totalNum=").append(totalNum);
        sb.append(", zScore=").append(zScore);
        sb.append(", hardClippedBases=").append(hardClippedBases);
        sb.append(", dp=").append(dp);
        sb.append(", excesshet=").append(excesshet);
        sb.append(", fs=").append(fs);
        sb.append(", inbreedingcoeff=").append(inbreedingcoeff);
        sb.append(", mleac=").append(mleac);
        sb.append(", mleaf=").append(mleaf);
        sb.append(", mq=").append(mq);
        sb.append(", mqranksum=").append(mqranksum);
        sb.append(", qd=").append(qd);
        sb.append(", readposranksum=").append(readposranksum);
        sb.append(", sor=").append(sor);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}