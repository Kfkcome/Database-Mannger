package com.example.swinedatebaseproject.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName cds
 */
@TableName(value ="cds")
@Data
public class Cds implements Serializable {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    @TableField(value = "cds_name")
    private String cdsName;

    /**
     * 
     */
    @TableField(value = "cds_len")
    private String cdsLen;

    /**
     * 
     */
    @TableField(value = "cds_location")
    private String cdsLocation;

    /**
     * 
     */
    @TableField(value = "trans_id")
    private String transId;

    /**
     * 
     */
    @TableField(value = "cds_start")
    private Integer cdsStart;

    /**
     * 
     */
    @TableField(value = "cds_end")
    private Integer cdsEnd;

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
        Cds other = (Cds) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCdsName() == null ? other.getCdsName() == null : this.getCdsName().equals(other.getCdsName()))
            && (this.getCdsLen() == null ? other.getCdsLen() == null : this.getCdsLen().equals(other.getCdsLen()))
            && (this.getCdsLocation() == null ? other.getCdsLocation() == null : this.getCdsLocation().equals(other.getCdsLocation()))
            && (this.getTransId() == null ? other.getTransId() == null : this.getTransId().equals(other.getTransId()))
            && (this.getCdsStart() == null ? other.getCdsStart() == null : this.getCdsStart().equals(other.getCdsStart()))
            && (this.getCdsEnd() == null ? other.getCdsEnd() == null : this.getCdsEnd().equals(other.getCdsEnd()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCdsName() == null) ? 0 : getCdsName().hashCode());
        result = prime * result + ((getCdsLen() == null) ? 0 : getCdsLen().hashCode());
        result = prime * result + ((getCdsLocation() == null) ? 0 : getCdsLocation().hashCode());
        result = prime * result + ((getTransId() == null) ? 0 : getTransId().hashCode());
        result = prime * result + ((getCdsStart() == null) ? 0 : getCdsStart().hashCode());
        result = prime * result + ((getCdsEnd() == null) ? 0 : getCdsEnd().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", cdsName=").append(cdsName);
        sb.append(", cdsLen=").append(cdsLen);
        sb.append(", cdsLocation=").append(cdsLocation);
        sb.append(", transId=").append(transId);
        sb.append(", cdsStart=").append(cdsStart);
        sb.append(", cdsEnd=").append(cdsEnd);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}