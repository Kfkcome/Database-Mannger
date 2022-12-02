package com.example.swinedatebaseproject.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @TableName gene
 */
@TableName(value ="gene")
@Data
public class Gene implements Serializable {
    @TableId
    private String geneId;

    private String chrId;

    private String geneName;

    private String geneType;

    private Integer geneStart;

    private Integer geneEnd;

    private Integer genomeId;

    private String geneStrand;

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
        Gene other = (Gene) that;
        return (this.getGeneId() == null ? other.getGeneId() == null : this.getGeneId().equals(other.getGeneId()))
            && (this.getChrId() == null ? other.getChrId() == null : this.getChrId().equals(other.getChrId()))
            && (this.getGeneName() == null ? other.getGeneName() == null : this.getGeneName().equals(other.getGeneName()))
            && (this.getGeneType() == null ? other.getGeneType() == null : this.getGeneType().equals(other.getGeneType()))
            && (this.getGeneStart() == null ? other.getGeneStart() == null : this.getGeneStart().equals(other.getGeneStart()))
            && (this.getGeneEnd() == null ? other.getGeneEnd() == null : this.getGeneEnd().equals(other.getGeneEnd()))
            && (this.getGenomeId() == null ? other.getGenomeId() == null : this.getGenomeId().equals(other.getGenomeId()))
            && (this.getGeneStrand() == null ? other.getGeneStrand() == null : this.getGeneStrand().equals(other.getGeneStrand()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGeneId() == null) ? 0 : getGeneId().hashCode());
        result = prime * result + ((getChrId() == null) ? 0 : getChrId().hashCode());
        result = prime * result + ((getGeneName() == null) ? 0 : getGeneName().hashCode());
        result = prime * result + ((getGeneType() == null) ? 0 : getGeneType().hashCode());
        result = prime * result + ((getGeneStart() == null) ? 0 : getGeneStart().hashCode());
        result = prime * result + ((getGeneEnd() == null) ? 0 : getGeneEnd().hashCode());
        result = prime * result + ((getGenomeId() == null) ? 0 : getGenomeId().hashCode());
        result = prime * result + ((getGeneStrand() == null) ? 0 : getGeneStrand().hashCode());
        return result;
    }

    @Override
    public String toString() {
        String sb = getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", geneId=" + geneId +
                ", chrId=" + chrId +
                ", geneName=" + geneName +
                ", geneType=" + geneType +
                ", geneStart=" + geneStart +
                ", geneEnd=" + geneEnd +
                ", genomeId=" + genomeId +
                ", geneStrand=" + geneStrand +
                ", serialVersionUID=" + serialVersionUID +
                "]";
        return sb;
    }
}