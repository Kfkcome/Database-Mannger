package com.example.swinedatebaseproject.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName gene_exp
 */
@TableName(value ="gene_exp")
@Data
public class GeneExp implements Serializable {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    @TableField(value = "gene")
    private String gene;

    /**
     * 
     */
    @TableField(value = "anther")
    private String anther;

    /**
     * 
     */
    @TableField(value = "bract")
    private String bract;

    /**
     * 
     */
    @TableField(value = "cotyledon")
    private String cotyledon;

    /**
     * 
     */
    @TableField(value = "fiber10_d_p_a")
    private String fiber10DPA;

    /**
     * 
     */
    @TableField(value = "fiber20_d_p_a")
    private String fiber20DPA;

    /**
     * 
     */
    @TableField(value = "fiber5_d_p_a")
    private String fiber5DPA;

    /**
     * 
     */
    @TableField(value = "flower")
    private String flower;

    /**
     * 
     */
    @TableField(value = "leaf")
    private String leaf;

    /**
     * 
     */
    @TableField(value = "ovule0_d_p_a")
    private String ovule0DPA;

    /**
     * 
     */
    @TableField(value = "ovule10_d_p_a")
    private String ovule10DPA;

    /**
     * 
     */
    @TableField(value = "ovule20_d_p_a")
    private String ovule20DPA;

    /**
     * 
     */
    @TableField(value = "ovule5_d_p_a")
    private String ovule5DPA;

    /**
     * 
     */
    @TableField(value = "ovule_f10_d_p_a")
    private String ovuleF10DPA;

    /**
     * 
     */
    @TableField(value = "ovule_f20_d_p_a")
    private String ovuleF20DPA;

    /**
     * 
     */
    @TableField(value = "ovule_f5_d_p_a")
    private String ovuleF5DPA;

    /**
     * 
     */
    @TableField(value = "petal")
    private String petal;

    /**
     * 
     */
    @TableField(value = "phloem")
    private String phloem;

    /**
     * 
     */
    @TableField(value = "seed")
    private String seed;

    /**
     * 
     */
    @TableField(value = "seedlingroot")
    private String seedlingroot;

    /**
     * 
     */
    @TableField(value = "seedlingstem")
    private String seedlingstem;

    /**
     * 
     */
    @TableField(value = "sepal")
    private String sepal;

    /**
     * 
     */
    @TableField(value = "stigma")
    private String stigma;

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
        GeneExp other = (GeneExp) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGene() == null ? other.getGene() == null : this.getGene().equals(other.getGene()))
            && (this.getAnther() == null ? other.getAnther() == null : this.getAnther().equals(other.getAnther()))
            && (this.getBract() == null ? other.getBract() == null : this.getBract().equals(other.getBract()))
            && (this.getCotyledon() == null ? other.getCotyledon() == null : this.getCotyledon().equals(other.getCotyledon()))
            && (this.getFiber10DPA() == null ? other.getFiber10DPA() == null : this.getFiber10DPA().equals(other.getFiber10DPA()))
            && (this.getFiber20DPA() == null ? other.getFiber20DPA() == null : this.getFiber20DPA().equals(other.getFiber20DPA()))
            && (this.getFiber5DPA() == null ? other.getFiber5DPA() == null : this.getFiber5DPA().equals(other.getFiber5DPA()))
            && (this.getFlower() == null ? other.getFlower() == null : this.getFlower().equals(other.getFlower()))
            && (this.getLeaf() == null ? other.getLeaf() == null : this.getLeaf().equals(other.getLeaf()))
            && (this.getOvule0DPA() == null ? other.getOvule0DPA() == null : this.getOvule0DPA().equals(other.getOvule0DPA()))
            && (this.getOvule10DPA() == null ? other.getOvule10DPA() == null : this.getOvule10DPA().equals(other.getOvule10DPA()))
            && (this.getOvule20DPA() == null ? other.getOvule20DPA() == null : this.getOvule20DPA().equals(other.getOvule20DPA()))
            && (this.getOvule5DPA() == null ? other.getOvule5DPA() == null : this.getOvule5DPA().equals(other.getOvule5DPA()))
            && (this.getOvuleF10DPA() == null ? other.getOvuleF10DPA() == null : this.getOvuleF10DPA().equals(other.getOvuleF10DPA()))
            && (this.getOvuleF20DPA() == null ? other.getOvuleF20DPA() == null : this.getOvuleF20DPA().equals(other.getOvuleF20DPA()))
            && (this.getOvuleF5DPA() == null ? other.getOvuleF5DPA() == null : this.getOvuleF5DPA().equals(other.getOvuleF5DPA()))
            && (this.getPetal() == null ? other.getPetal() == null : this.getPetal().equals(other.getPetal()))
            && (this.getPhloem() == null ? other.getPhloem() == null : this.getPhloem().equals(other.getPhloem()))
            && (this.getSeed() == null ? other.getSeed() == null : this.getSeed().equals(other.getSeed()))
            && (this.getSeedlingroot() == null ? other.getSeedlingroot() == null : this.getSeedlingroot().equals(other.getSeedlingroot()))
            && (this.getSeedlingstem() == null ? other.getSeedlingstem() == null : this.getSeedlingstem().equals(other.getSeedlingstem()))
            && (this.getSepal() == null ? other.getSepal() == null : this.getSepal().equals(other.getSepal()))
            && (this.getStigma() == null ? other.getStigma() == null : this.getStigma().equals(other.getStigma()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGene() == null) ? 0 : getGene().hashCode());
        result = prime * result + ((getAnther() == null) ? 0 : getAnther().hashCode());
        result = prime * result + ((getBract() == null) ? 0 : getBract().hashCode());
        result = prime * result + ((getCotyledon() == null) ? 0 : getCotyledon().hashCode());
        result = prime * result + ((getFiber10DPA() == null) ? 0 : getFiber10DPA().hashCode());
        result = prime * result + ((getFiber20DPA() == null) ? 0 : getFiber20DPA().hashCode());
        result = prime * result + ((getFiber5DPA() == null) ? 0 : getFiber5DPA().hashCode());
        result = prime * result + ((getFlower() == null) ? 0 : getFlower().hashCode());
        result = prime * result + ((getLeaf() == null) ? 0 : getLeaf().hashCode());
        result = prime * result + ((getOvule0DPA() == null) ? 0 : getOvule0DPA().hashCode());
        result = prime * result + ((getOvule10DPA() == null) ? 0 : getOvule10DPA().hashCode());
        result = prime * result + ((getOvule20DPA() == null) ? 0 : getOvule20DPA().hashCode());
        result = prime * result + ((getOvule5DPA() == null) ? 0 : getOvule5DPA().hashCode());
        result = prime * result + ((getOvuleF10DPA() == null) ? 0 : getOvuleF10DPA().hashCode());
        result = prime * result + ((getOvuleF20DPA() == null) ? 0 : getOvuleF20DPA().hashCode());
        result = prime * result + ((getOvuleF5DPA() == null) ? 0 : getOvuleF5DPA().hashCode());
        result = prime * result + ((getPetal() == null) ? 0 : getPetal().hashCode());
        result = prime * result + ((getPhloem() == null) ? 0 : getPhloem().hashCode());
        result = prime * result + ((getSeed() == null) ? 0 : getSeed().hashCode());
        result = prime * result + ((getSeedlingroot() == null) ? 0 : getSeedlingroot().hashCode());
        result = prime * result + ((getSeedlingstem() == null) ? 0 : getSeedlingstem().hashCode());
        result = prime * result + ((getSepal() == null) ? 0 : getSepal().hashCode());
        result = prime * result + ((getStigma() == null) ? 0 : getStigma().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", gene=").append(gene);
        sb.append(", anther=").append(anther);
        sb.append(", bract=").append(bract);
        sb.append(", cotyledon=").append(cotyledon);
        sb.append(", fiber10DPA=").append(fiber10DPA);
        sb.append(", fiber20DPA=").append(fiber20DPA);
        sb.append(", fiber5DPA=").append(fiber5DPA);
        sb.append(", flower=").append(flower);
        sb.append(", leaf=").append(leaf);
        sb.append(", ovule0DPA=").append(ovule0DPA);
        sb.append(", ovule10DPA=").append(ovule10DPA);
        sb.append(", ovule20DPA=").append(ovule20DPA);
        sb.append(", ovule5DPA=").append(ovule5DPA);
        sb.append(", ovuleF10DPA=").append(ovuleF10DPA);
        sb.append(", ovuleF20DPA=").append(ovuleF20DPA);
        sb.append(", ovuleF5DPA=").append(ovuleF5DPA);
        sb.append(", petal=").append(petal);
        sb.append(", phloem=").append(phloem);
        sb.append(", seed=").append(seed);
        sb.append(", seedlingroot=").append(seedlingroot);
        sb.append(", seedlingstem=").append(seedlingstem);
        sb.append(", sepal=").append(sepal);
        sb.append(", stigma=").append(stigma);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}