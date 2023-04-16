package com.example.swinedatebaseproject.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName diploid_2_freq
 */
@TableName(value ="diploid_2_freq")
@Data
public class Diploid2Freq implements Serializable {
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
    @TableField(value = "Start")
    private String start;

    /**
     * 
     */
    @TableField(value = "END")
    private String end;

    /**
     * 
     */
    @TableField(value = "diploid_2_freq_id")
    private String diploid2FreqId;

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
        Diploid2Freq other = (Diploid2Freq) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getChrom() == null ? other.getChrom() == null : this.getChrom().equals(other.getChrom()))
            && (this.getStart() == null ? other.getStart() == null : this.getStart().equals(other.getStart()))
            && (this.getEnd() == null ? other.getEnd() == null : this.getEnd().equals(other.getEnd()))
            && (this.getDiploid2FreqId() == null ? other.getDiploid2FreqId() == null : this.getDiploid2FreqId().equals(other.getDiploid2FreqId()))
            && (this.getLen() == null ? other.getLen() == null : this.getLen().equals(other.getLen()))
            && (this.getRef() == null ? other.getRef() == null : this.getRef().equals(other.getRef()))
            && (this.getAlt() == null ? other.getAlt() == null : this.getAlt().equals(other.getAlt()))
            && (this.getFreq() == null ? other.getFreq() == null : this.getFreq().equals(other.getFreq()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getChrom() == null) ? 0 : getChrom().hashCode());
        result = prime * result + ((getStart() == null) ? 0 : getStart().hashCode());
        result = prime * result + ((getEnd() == null) ? 0 : getEnd().hashCode());
        result = prime * result + ((getDiploid2FreqId() == null) ? 0 : getDiploid2FreqId().hashCode());
        result = prime * result + ((getLen() == null) ? 0 : getLen().hashCode());
        result = prime * result + ((getRef() == null) ? 0 : getRef().hashCode());
        result = prime * result + ((getAlt() == null) ? 0 : getAlt().hashCode());
        result = prime * result + ((getFreq() == null) ? 0 : getFreq().hashCode());
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
        sb.append(", start=").append(start);
        sb.append(", end=").append(end);
        sb.append(", diploid2FreqId=").append(diploid2FreqId);
        sb.append(", len=").append(len);
        sb.append(", ref=").append(ref);
        sb.append(", alt=").append(alt);
        sb.append(", freq=").append(freq);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}