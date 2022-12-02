package com.example.swinedatebaseproject.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @TableName protein
 */
@TableName(value ="protein")
@Data
public class Protein implements Serializable {
    @TableId
    private String proteinId;

    private String proteinFunction;

    private String proteinName;

    private String proteinLen;

    private String proteinWeigth;

    private String cdsId;

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
        Protein other = (Protein) that;
        return (this.getProteinId() == null ? other.getProteinId() == null : this.getProteinId().equals(other.getProteinId()))
            && (this.getProteinFunction() == null ? other.getProteinFunction() == null : this.getProteinFunction().equals(other.getProteinFunction()))
            && (this.getProteinName() == null ? other.getProteinName() == null : this.getProteinName().equals(other.getProteinName()))
            && (this.getProteinLen() == null ? other.getProteinLen() == null : this.getProteinLen().equals(other.getProteinLen()))
            && (this.getProteinWeigth() == null ? other.getProteinWeigth() == null : this.getProteinWeigth().equals(other.getProteinWeigth()))
            && (this.getCdsId() == null ? other.getCdsId() == null : this.getCdsId().equals(other.getCdsId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProteinId() == null) ? 0 : getProteinId().hashCode());
        result = prime * result + ((getProteinFunction() == null) ? 0 : getProteinFunction().hashCode());
        result = prime * result + ((getProteinName() == null) ? 0 : getProteinName().hashCode());
        result = prime * result + ((getProteinLen() == null) ? 0 : getProteinLen().hashCode());
        result = prime * result + ((getProteinWeigth() == null) ? 0 : getProteinWeigth().hashCode());
        result = prime * result + ((getCdsId() == null) ? 0 : getCdsId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        String sb = getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", proteinId=" + proteinId +
                ", proteinFunction=" + proteinFunction +
                ", proteinName=" + proteinName +
                ", proteinLen=" + proteinLen +
                ", proteinWeigth=" + proteinWeigth +
                ", cdsId=" + cdsId +
                ", serialVersionUID=" + serialVersionUID +
                "]";
        return sb;
    }
}