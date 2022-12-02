package com.example.swinedatebaseproject.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @TableName cds
 */
@TableName(value ="cds")
@Data
public class Cds implements Serializable {
    @TableId
    private Integer cdsId;

    private String cdsName;

    private String cdsLen;

    private String cdsLocation;

    private String transId;

    private Integer cdsStart;

    private Integer cdsEnd;

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
        return (this.getCdsId() == null ? other.getCdsId() == null : this.getCdsId().equals(other.getCdsId()))
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
        result = prime * result + ((getCdsId() == null) ? 0 : getCdsId().hashCode());
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
        String sb = getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", cdsId=" + cdsId +
                ", cdsName=" + cdsName +
                ", cdsLen=" + cdsLen +
                ", cdsLocation=" + cdsLocation +
                ", transId=" + transId +
                ", cdsStart=" + cdsStart +
                ", cdsEnd=" + cdsEnd +
                ", serialVersionUID=" + serialVersionUID +
                "]";
        return sb;
    }
}