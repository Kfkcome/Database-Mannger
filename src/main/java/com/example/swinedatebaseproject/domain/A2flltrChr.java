package com.example.swinedatebaseproject.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName A2flLTR_Chr
 */
@TableName(value ="A2flLTR_Chr")
@Data
public class A2flltrChr implements Serializable {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    @TableField(value = "flLTR_Chr")
    private String flltrChr;

    /**
     * 
     */
    @TableField(value = "flLTR_start")
    private String flltrStart;

    /**
     * 
     */
    @TableField(value = "flFTR_end")
    private String flftrEnd;

    /**
     * 
     */
    @TableField(value = "flFTR_TE")
    private String flftrTe;

    /**
     * 
     */
    @TableField(value = "strand")
    private String strand;

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
        A2flltrChr other = (A2flltrChr) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFlltrChr() == null ? other.getFlltrChr() == null : this.getFlltrChr().equals(other.getFlltrChr()))
            && (this.getFlltrStart() == null ? other.getFlltrStart() == null : this.getFlltrStart().equals(other.getFlltrStart()))
            && (this.getFlftrEnd() == null ? other.getFlftrEnd() == null : this.getFlftrEnd().equals(other.getFlftrEnd()))
            && (this.getFlftrTe() == null ? other.getFlftrTe() == null : this.getFlftrTe().equals(other.getFlftrTe()))
            && (this.getStrand() == null ? other.getStrand() == null : this.getStrand().equals(other.getStrand()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFlltrChr() == null) ? 0 : getFlltrChr().hashCode());
        result = prime * result + ((getFlltrStart() == null) ? 0 : getFlltrStart().hashCode());
        result = prime * result + ((getFlftrEnd() == null) ? 0 : getFlftrEnd().hashCode());
        result = prime * result + ((getFlftrTe() == null) ? 0 : getFlftrTe().hashCode());
        result = prime * result + ((getStrand() == null) ? 0 : getStrand().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", flltrChr=").append(flltrChr);
        sb.append(", flltrStart=").append(flltrStart);
        sb.append(", flftrEnd=").append(flftrEnd);
        sb.append(", flftrTe=").append(flftrTe);
        sb.append(", strand=").append(strand);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}