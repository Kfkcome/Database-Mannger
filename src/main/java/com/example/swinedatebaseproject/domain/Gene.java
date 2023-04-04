package com.example.swinedatebaseproject.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName gene
 */
@TableName(value ="gene")
@Data
public class Gene implements Serializable {
    /**
     * 基因id
     */
    @TableId(value = "gene_id")
    private String geneId;

    /**
     * 染色体id
     */
    @TableField(value = "chr_id")
    private String chrId;

    /**
     * 基因名
     */
    @TableField(value = "gene_name")
    private String geneName;

    /**
     * 
     */
    @TableField(value = "gene_start")
    private Integer geneStart;

    /**
     * 
     */
    @TableField(value = "gene_end")
    private Integer geneEnd;

    /**
     * 基因组id
     */
    @TableField(value = "genome_id")
    private Integer genomeId;

    /**
     * 
     */
    @TableField(value = "gene_strand")
    private String geneStrand;

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
        Gene other = (Gene) that;
        return (this.getGeneId() == null ? other.getGeneId() == null : this.getGeneId().equals(other.getGeneId()))
            && (this.getChrId() == null ? other.getChrId() == null : this.getChrId().equals(other.getChrId()))
            && (this.getGeneName() == null ? other.getGeneName() == null : this.getGeneName().equals(other.getGeneName()))
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
        result = prime * result + ((getGeneStart() == null) ? 0 : getGeneStart().hashCode());
        result = prime * result + ((getGeneEnd() == null) ? 0 : getGeneEnd().hashCode());
        result = prime * result + ((getGenomeId() == null) ? 0 : getGenomeId().hashCode());
        result = prime * result + ((getGeneStrand() == null) ? 0 : getGeneStrand().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", geneId=").append(geneId);
        sb.append(", chrId=").append(chrId);
        sb.append(", geneName=").append(geneName);
        sb.append(", geneStart=").append(geneStart);
        sb.append(", geneEnd=").append(geneEnd);
        sb.append(", genomeId=").append(genomeId);
        sb.append(", geneStrand=").append(geneStrand);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}