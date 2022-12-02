package com.example.swinedatebaseproject.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @TableName genome
 */
@TableName(value ="genome")
@Data
public class Genome implements Serializable {
    @TableId
    private Integer genomeId;

    private String genomeName;

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
        Genome other = (Genome) that;
        return (this.getGenomeId() == null ? other.getGenomeId() == null : this.getGenomeId().equals(other.getGenomeId()))
            && (this.getGenomeName() == null ? other.getGenomeName() == null : this.getGenomeName().equals(other.getGenomeName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGenomeId() == null) ? 0 : getGenomeId().hashCode());
        result = prime * result + ((getGenomeName() == null) ? 0 : getGenomeName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        String sb = getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", genomeId=" + genomeId +
                ", genomeName=" + genomeName +
                ", serialVersionUID=" + serialVersionUID +
                "]";
        return sb;
    }
}