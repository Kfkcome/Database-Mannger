package com.example.swinedatebaseproject.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName flLTR_8Genomes_5LTR_cluster_family
 */
@TableName(value ="flLTR_8Genomes_5LTR_cluster_family")
@Data
public class Flltr8genomes5ltrClusterFamily implements Serializable {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    @TableField(value = "cluster")
    private String cluster;

    /**
     * 
     */
    @TableField(value = "A2")
    private Integer a2;

    /**
     * 
     */
    @TableField(value = "G1")
    private Integer g1;

    /**
     * 
     */
    @TableField(value = "E1")
    private Integer e1;

    /**
     * 
     */
    @TableField(value = "D5")
    private Integer d5;

    /**
     * 
     */
    @TableField(value = "K2")
    private Integer k2;

    /**
     * 
     */
    @TableField(value = "C1")
    private Integer c1;

    /**
     * 
     */
    @TableField(value = "B1")
    private Integer b1;

    /**
     * 
     */
    @TableField(value = "F1")
    private Integer f1;

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
        Flltr8genomes5ltrClusterFamily other = (Flltr8genomes5ltrClusterFamily) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCluster() == null ? other.getCluster() == null : this.getCluster().equals(other.getCluster()))
            && (this.getA2() == null ? other.getA2() == null : this.getA2().equals(other.getA2()))
            && (this.getG1() == null ? other.getG1() == null : this.getG1().equals(other.getG1()))
            && (this.getE1() == null ? other.getE1() == null : this.getE1().equals(other.getE1()))
            && (this.getD5() == null ? other.getD5() == null : this.getD5().equals(other.getD5()))
            && (this.getK2() == null ? other.getK2() == null : this.getK2().equals(other.getK2()))
            && (this.getC1() == null ? other.getC1() == null : this.getC1().equals(other.getC1()))
            && (this.getB1() == null ? other.getB1() == null : this.getB1().equals(other.getB1()))
            && (this.getF1() == null ? other.getF1() == null : this.getF1().equals(other.getF1()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCluster() == null) ? 0 : getCluster().hashCode());
        result = prime * result + ((getA2() == null) ? 0 : getA2().hashCode());
        result = prime * result + ((getG1() == null) ? 0 : getG1().hashCode());
        result = prime * result + ((getE1() == null) ? 0 : getE1().hashCode());
        result = prime * result + ((getD5() == null) ? 0 : getD5().hashCode());
        result = prime * result + ((getK2() == null) ? 0 : getK2().hashCode());
        result = prime * result + ((getC1() == null) ? 0 : getC1().hashCode());
        result = prime * result + ((getB1() == null) ? 0 : getB1().hashCode());
        result = prime * result + ((getF1() == null) ? 0 : getF1().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", cluster=").append(cluster);
        sb.append(", a2=").append(a2);
        sb.append(", g1=").append(g1);
        sb.append(", e1=").append(e1);
        sb.append(", d5=").append(d5);
        sb.append(", k2=").append(k2);
        sb.append(", c1=").append(c1);
        sb.append(", b1=").append(b1);
        sb.append(", f1=").append(f1);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}