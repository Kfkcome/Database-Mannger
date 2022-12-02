package com.example.swinedatebaseproject.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @TableName gene_exp
 */
@TableName(value ="gene_exp")
@Data
public class GeneExp implements Serializable {
    @TableId
    private String gene;

    private String anther;

    private String bract;

    private String cotyledon;

    private String fiber10DPA;

    private String fiber20DPA;

    private String fiber5DPA;

    private String flower;

    private String leaf;

    private String ovule0DPA;

    private String ovule10DPA;

    private String ovule20DPA;

    private String ovule5DPA;

    private String ovuleF10DPA;

    private String ovuleF20DPA;

    private String ovuleF5DPA;

    private String petal;

    private String phloem;

    private String seed;

    private String seedlingroot;

    private String seedlingstem;

    private String sepal;

    private String stigma;

    @Serial
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
        return (this.getGene() == null ? other.getGene() == null : this.getGene().equals(other.getGene()))
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
        String sb = getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", gene=" + gene +
                ", anther=" + anther +
                ", bract=" + bract +
                ", cotyledon=" + cotyledon +
                ", fiber10DPA=" + fiber10DPA +
                ", fiber20DPA=" + fiber20DPA +
                ", fiber5DPA=" + fiber5DPA +
                ", flower=" + flower +
                ", leaf=" + leaf +
                ", ovule0DPA=" + ovule0DPA +
                ", ovule10DPA=" + ovule10DPA +
                ", ovule20DPA=" + ovule20DPA +
                ", ovule5DPA=" + ovule5DPA +
                ", ovuleF10DPA=" + ovuleF10DPA +
                ", ovuleF20DPA=" + ovuleF20DPA +
                ", ovuleF5DPA=" + ovuleF5DPA +
                ", petal=" + petal +
                ", phloem=" + phloem +
                ", seed=" + seed +
                ", seedlingroot=" + seedlingroot +
                ", seedlingstem=" + seedlingstem +
                ", sepal=" + sepal +
                ", stigma=" + stigma +
                ", serialVersionUID=" + serialVersionUID +
                "]";
        return sb;
    }
}