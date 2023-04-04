package com.example.swinedatebaseproject.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @TableName 10genomes_Orthogroups
 */
@TableName(value ="10genomes_Orthogroups")
@Data
public class TenGenomesOrthoGroups implements Serializable {
    @TableId
    private String orthogroup;

    private String a1A;

    private String a1;

    private String a2;

    private String b1;

    private String c1;

    private String d5;

    private String e1;

    private String f1;

    private String g1;

    private String k2;

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
        TenGenomesOrthoGroups other = (TenGenomesOrthoGroups) that;
        return (this.getOrthogroup() == null ? other.getOrthogroup() == null : this.getOrthogroup().equals(other.getOrthogroup()))
            && (this.getA1A() == null ? other.getA1A() == null : this.getA1A().equals(other.getA1A()))
            && (this.getA1() == null ? other.getA1() == null : this.getA1().equals(other.getA1()))
            && (this.getA2() == null ? other.getA2() == null : this.getA2().equals(other.getA2()))
            && (this.getB1() == null ? other.getB1() == null : this.getB1().equals(other.getB1()))
            && (this.getC1() == null ? other.getC1() == null : this.getC1().equals(other.getC1()))
            && (this.getD5() == null ? other.getD5() == null : this.getD5().equals(other.getD5()))
            && (this.getE1() == null ? other.getE1() == null : this.getE1().equals(other.getE1()))
            && (this.getF1() == null ? other.getF1() == null : this.getF1().equals(other.getF1()))
            && (this.getG1() == null ? other.getG1() == null : this.getG1().equals(other.getG1()))
            && (this.getK2() == null ? other.getK2() == null : this.getK2().equals(other.getK2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrthogroup() == null) ? 0 : getOrthogroup().hashCode());
        result = prime * result + ((getA1A() == null) ? 0 : getA1A().hashCode());
        result = prime * result + ((getA1() == null) ? 0 : getA1().hashCode());
        result = prime * result + ((getA2() == null) ? 0 : getA2().hashCode());
        result = prime * result + ((getB1() == null) ? 0 : getB1().hashCode());
        result = prime * result + ((getC1() == null) ? 0 : getC1().hashCode());
        result = prime * result + ((getD5() == null) ? 0 : getD5().hashCode());
        result = prime * result + ((getE1() == null) ? 0 : getE1().hashCode());
        result = prime * result + ((getF1() == null) ? 0 : getF1().hashCode());
        result = prime * result + ((getG1() == null) ? 0 : getG1().hashCode());
        result = prime * result + ((getK2() == null) ? 0 : getK2().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orthogroup=").append(orthogroup);
        sb.append(", a1A=").append(a1A);
        sb.append(", a1=").append(a1);
        sb.append(", a2=").append(a2);
        sb.append(", b1=").append(b1);
        sb.append(", c1=").append(c1);
        sb.append(", d5=").append(d5);
        sb.append(", e1=").append(e1);
        sb.append(", f1=").append(f1);
        sb.append(", g1=").append(g1);
        sb.append(", k2=").append(k2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}