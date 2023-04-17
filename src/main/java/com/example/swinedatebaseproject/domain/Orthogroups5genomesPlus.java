package com.example.swinedatebaseproject.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName Orthogroups_5genomes_plus
 */
@TableName(value ="Orthogroups_5genomes_plus")
@Data
public class Orthogroups5genomesPlus implements Serializable {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    @TableField(value = "Orthogroup")
    private String orthogroup;

    /**
     * 
     */
    @TableField(value = "A1_A_HAU")
    private String a1AHau;

    /**
     * 
     */
    @TableField(value = "A1_HAU")
    private String a1Hau;

    /**
     * 
     */
    @TableField(value = "A2_HAU")
    private String a2Hau;

    /**
     * 
     */
    @TableField(value = "B1_HAU")
    private String b1Hau;

    /**
     * 
     */
    @TableField(value = "C1_HAU")
    private String c1Hau;

    /**
     * 
     */
    @TableField(value = "D5_HAU")
    private String d5Hau;

    /**
     * 
     */
    @TableField(value = "E1_HAU")
    private String e1Hau;

    /**
     * 
     */
    @TableField(value = "F1_HAU")
    private String f1Hau;

    /**
     * 
     */
    @TableField(value = "G1_HAU")
    private String g1Hau;

    /**
     * 
     */
    @TableField(value = "K2_HAU")
    private String k2Hau;

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
        Orthogroups5genomesPlus other = (Orthogroups5genomesPlus) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrthogroup() == null ? other.getOrthogroup() == null : this.getOrthogroup().equals(other.getOrthogroup()))
            && (this.getA1AHau() == null ? other.getA1AHau() == null : this.getA1AHau().equals(other.getA1AHau()))
            && (this.getA1Hau() == null ? other.getA1Hau() == null : this.getA1Hau().equals(other.getA1Hau()))
            && (this.getA2Hau() == null ? other.getA2Hau() == null : this.getA2Hau().equals(other.getA2Hau()))
            && (this.getB1Hau() == null ? other.getB1Hau() == null : this.getB1Hau().equals(other.getB1Hau()))
            && (this.getC1Hau() == null ? other.getC1Hau() == null : this.getC1Hau().equals(other.getC1Hau()))
            && (this.getD5Hau() == null ? other.getD5Hau() == null : this.getD5Hau().equals(other.getD5Hau()))
            && (this.getE1Hau() == null ? other.getE1Hau() == null : this.getE1Hau().equals(other.getE1Hau()))
            && (this.getF1Hau() == null ? other.getF1Hau() == null : this.getF1Hau().equals(other.getF1Hau()))
            && (this.getG1Hau() == null ? other.getG1Hau() == null : this.getG1Hau().equals(other.getG1Hau()))
            && (this.getK2Hau() == null ? other.getK2Hau() == null : this.getK2Hau().equals(other.getK2Hau()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrthogroup() == null) ? 0 : getOrthogroup().hashCode());
        result = prime * result + ((getA1AHau() == null) ? 0 : getA1AHau().hashCode());
        result = prime * result + ((getA1Hau() == null) ? 0 : getA1Hau().hashCode());
        result = prime * result + ((getA2Hau() == null) ? 0 : getA2Hau().hashCode());
        result = prime * result + ((getB1Hau() == null) ? 0 : getB1Hau().hashCode());
        result = prime * result + ((getC1Hau() == null) ? 0 : getC1Hau().hashCode());
        result = prime * result + ((getD5Hau() == null) ? 0 : getD5Hau().hashCode());
        result = prime * result + ((getE1Hau() == null) ? 0 : getE1Hau().hashCode());
        result = prime * result + ((getF1Hau() == null) ? 0 : getF1Hau().hashCode());
        result = prime * result + ((getG1Hau() == null) ? 0 : getG1Hau().hashCode());
        result = prime * result + ((getK2Hau() == null) ? 0 : getK2Hau().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orthogroup=").append(orthogroup);
        sb.append(", a1AHau=").append(a1AHau);
        sb.append(", a1Hau=").append(a1Hau);
        sb.append(", a2Hau=").append(a2Hau);
        sb.append(", b1Hau=").append(b1Hau);
        sb.append(", c1Hau=").append(c1Hau);
        sb.append(", d5Hau=").append(d5Hau);
        sb.append(", e1Hau=").append(e1Hau);
        sb.append(", f1Hau=").append(f1Hau);
        sb.append(", g1Hau=").append(g1Hau);
        sb.append(", k2Hau=").append(k2Hau);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}