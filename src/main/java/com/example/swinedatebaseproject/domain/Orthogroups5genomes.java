package com.example.swinedatebaseproject.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName Orthogroups_5Genomes
 */
@TableName(value ="Orthogroups_5Genomes")
@Data
public class Orthogroups5genomes implements Serializable {
    /**
     * 
     */
    @TableField(value = "Orthogroup")
    private String orthogroup;

    /**
     * 
     */
    @TableField(value = "A2")
    private String a2;

    /**
     * 
     */
    @TableField(value = "Athaliana")
    private String athaliana;

    /**
     * 
     */
    @TableField(value = "D5")
    private String d5;

    /**
     * 
     */
    @TableField(value = "Osativa")
    private String osativa;

    /**
     * 
     */
    @TableField(value = "kirkii")
    private String kirkii;

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
        Orthogroups5genomes other = (Orthogroups5genomes) that;
        return (this.getOrthogroup() == null ? other.getOrthogroup() == null : this.getOrthogroup().equals(other.getOrthogroup()))
            && (this.getA2() == null ? other.getA2() == null : this.getA2().equals(other.getA2()))
            && (this.getAthaliana() == null ? other.getAthaliana() == null : this.getAthaliana().equals(other.getAthaliana()))
            && (this.getD5() == null ? other.getD5() == null : this.getD5().equals(other.getD5()))
            && (this.getOsativa() == null ? other.getOsativa() == null : this.getOsativa().equals(other.getOsativa()))
            && (this.getKirkii() == null ? other.getKirkii() == null : this.getKirkii().equals(other.getKirkii()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrthogroup() == null) ? 0 : getOrthogroup().hashCode());
        result = prime * result + ((getA2() == null) ? 0 : getA2().hashCode());
        result = prime * result + ((getAthaliana() == null) ? 0 : getAthaliana().hashCode());
        result = prime * result + ((getD5() == null) ? 0 : getD5().hashCode());
        result = prime * result + ((getOsativa() == null) ? 0 : getOsativa().hashCode());
        result = prime * result + ((getKirkii() == null) ? 0 : getKirkii().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orthogroup=").append(orthogroup);
        sb.append(", a2=").append(a2);
        sb.append(", athaliana=").append(athaliana);
        sb.append(", d5=").append(d5);
        sb.append(", osativa=").append(osativa);
        sb.append(", kirkii=").append(kirkii);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}