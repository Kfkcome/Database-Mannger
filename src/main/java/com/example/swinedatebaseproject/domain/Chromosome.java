package com.example.swinedatebaseproject.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName chromosome
 */
@TableName(value ="chromosome")
@Data
public class Chromosome implements Serializable {
    /**
     * 
     */
    @TableId(value = "chr_id", type = IdType.AUTO)
    private Integer chrId;

    /**
     * 
     */
    @TableField(value = "chr_name")
    private String chrName;

    /**
     * 
     */
    @TableField(value = "chr_num")
    private String chrNum;

    /**
     * 
     */
    @TableField(value = "chr_source")
    private String chrSource;

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
        Chromosome other = (Chromosome) that;
        return (this.getChrId() == null ? other.getChrId() == null : this.getChrId().equals(other.getChrId()))
            && (this.getChrName() == null ? other.getChrName() == null : this.getChrName().equals(other.getChrName()))
            && (this.getChrNum() == null ? other.getChrNum() == null : this.getChrNum().equals(other.getChrNum()))
            && (this.getChrSource() == null ? other.getChrSource() == null : this.getChrSource().equals(other.getChrSource()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getChrId() == null) ? 0 : getChrId().hashCode());
        result = prime * result + ((getChrName() == null) ? 0 : getChrName().hashCode());
        result = prime * result + ((getChrNum() == null) ? 0 : getChrNum().hashCode());
        result = prime * result + ((getChrSource() == null) ? 0 : getChrSource().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", chrId=").append(chrId);
        sb.append(", chrName=").append(chrName);
        sb.append(", chrNum=").append(chrNum);
        sb.append(", chrSource=").append(chrSource);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}