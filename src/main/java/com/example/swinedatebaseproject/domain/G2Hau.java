package com.example.swinedatebaseproject.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName G2_HAU
 */
@TableName(value ="G2_HAU")
@Data
public class G2Hau implements Serializable {
    /**
     * 
     */
    @TableField(value = "chromosome")
    private String chromosome;

    /**
     * 
     */
    @TableField(value = "source")
    private String source;

    /**
     * 
     */
    @TableField(value = "feature")
    private String feature;

    /**
     * 
     */
    @TableField(value = "start")
    private String start;

    /**
     * 
     */
    @TableField(value = "end")
    private String end;

    /**
     * 
     */
    @TableField(value = "score")
    private String score;

    /**
     * 
     */
    @TableField(value = "strand")
    private String strand;

    /**
     * 
     */
    @TableField(value = "frame")
    private String frame;

    /**
     * 
     */
    @TableField(value = "attributes")
    private String attributes;

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
        G2Hau other = (G2Hau) that;
        return (this.getChromosome() == null ? other.getChromosome() == null : this.getChromosome().equals(other.getChromosome()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getFeature() == null ? other.getFeature() == null : this.getFeature().equals(other.getFeature()))
            && (this.getStart() == null ? other.getStart() == null : this.getStart().equals(other.getStart()))
            && (this.getEnd() == null ? other.getEnd() == null : this.getEnd().equals(other.getEnd()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
            && (this.getStrand() == null ? other.getStrand() == null : this.getStrand().equals(other.getStrand()))
            && (this.getFrame() == null ? other.getFrame() == null : this.getFrame().equals(other.getFrame()))
            && (this.getAttributes() == null ? other.getAttributes() == null : this.getAttributes().equals(other.getAttributes()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getChromosome() == null) ? 0 : getChromosome().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getFeature() == null) ? 0 : getFeature().hashCode());
        result = prime * result + ((getStart() == null) ? 0 : getStart().hashCode());
        result = prime * result + ((getEnd() == null) ? 0 : getEnd().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getStrand() == null) ? 0 : getStrand().hashCode());
        result = prime * result + ((getFrame() == null) ? 0 : getFrame().hashCode());
        result = prime * result + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", chromosome=").append(chromosome);
        sb.append(", source=").append(source);
        sb.append(", feature=").append(feature);
        sb.append(", start=").append(start);
        sb.append(", end=").append(end);
        sb.append(", score=").append(score);
        sb.append(", strand=").append(strand);
        sb.append(", frame=").append(frame);
        sb.append(", attributes=").append(attributes);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}