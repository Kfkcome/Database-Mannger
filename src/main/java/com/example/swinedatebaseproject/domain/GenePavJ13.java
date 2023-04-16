package com.example.swinedatebaseproject.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName GENE_pav_J1_3
 */
@TableName(value ="GENE_pav_J1_3")
@Data
public class GenePavJ13 implements Serializable {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    @TableField(value = "pos")
    private String pos;

    /**
     * 
     */
    @TableField(value = "gene")
    private String gene;

    /**
     * 
     */
    @TableField(value = "J169")
    private String j169;

    /**
     * 
     */
    @TableField(value = "J16")
    private String j16;

    /**
     * 
     */
    @TableField(value = "J170")
    private String j170;

    /**
     * 
     */
    @TableField(value = "J171")
    private String j171;

    /**
     * 
     */
    @TableField(value = "J172")
    private String j172;

    /**
     * 
     */
    @TableField(value = "J173")
    private String j173;

    /**
     * 
     */
    @TableField(value = "J174")
    private String j174;

    /**
     * 
     */
    @TableField(value = "J175")
    private String j175;

    /**
     * 
     */
    @TableField(value = "J176")
    private String j176;

    /**
     * 
     */
    @TableField(value = "J177")
    private String j177;

    /**
     * 
     */
    @TableField(value = "J178")
    private String j178;

    /**
     * 
     */
    @TableField(value = "J179")
    private String j179;

    /**
     * 
     */
    @TableField(value = "J17")
    private String j17;

    /**
     * 
     */
    @TableField(value = "J180")
    private String j180;

    /**
     * 
     */
    @TableField(value = "J181")
    private String j181;

    /**
     * 
     */
    @TableField(value = "J182")
    private String j182;

    /**
     * 
     */
    @TableField(value = "J183")
    private String j183;

    /**
     * 
     */
    @TableField(value = "J184")
    private String j184;

    /**
     * 
     */
    @TableField(value = "J185")
    private String j185;

    /**
     * 
     */
    @TableField(value = "J187")
    private String j187;

    /**
     * 
     */
    @TableField(value = "J188_1")
    private String j1881;

    /**
     * 
     */
    @TableField(value = "J188_2")
    private String j1882;

    /**
     * 
     */
    @TableField(value = "J189_2")
    private String j1892;

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
        GenePavJ13 other = (GenePavJ13) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPos() == null ? other.getPos() == null : this.getPos().equals(other.getPos()))
            && (this.getGene() == null ? other.getGene() == null : this.getGene().equals(other.getGene()))
            && (this.getJ169() == null ? other.getJ169() == null : this.getJ169().equals(other.getJ169()))
            && (this.getJ16() == null ? other.getJ16() == null : this.getJ16().equals(other.getJ16()))
            && (this.getJ170() == null ? other.getJ170() == null : this.getJ170().equals(other.getJ170()))
            && (this.getJ171() == null ? other.getJ171() == null : this.getJ171().equals(other.getJ171()))
            && (this.getJ172() == null ? other.getJ172() == null : this.getJ172().equals(other.getJ172()))
            && (this.getJ173() == null ? other.getJ173() == null : this.getJ173().equals(other.getJ173()))
            && (this.getJ174() == null ? other.getJ174() == null : this.getJ174().equals(other.getJ174()))
            && (this.getJ175() == null ? other.getJ175() == null : this.getJ175().equals(other.getJ175()))
            && (this.getJ176() == null ? other.getJ176() == null : this.getJ176().equals(other.getJ176()))
            && (this.getJ177() == null ? other.getJ177() == null : this.getJ177().equals(other.getJ177()))
            && (this.getJ178() == null ? other.getJ178() == null : this.getJ178().equals(other.getJ178()))
            && (this.getJ179() == null ? other.getJ179() == null : this.getJ179().equals(other.getJ179()))
            && (this.getJ17() == null ? other.getJ17() == null : this.getJ17().equals(other.getJ17()))
            && (this.getJ180() == null ? other.getJ180() == null : this.getJ180().equals(other.getJ180()))
            && (this.getJ181() == null ? other.getJ181() == null : this.getJ181().equals(other.getJ181()))
            && (this.getJ182() == null ? other.getJ182() == null : this.getJ182().equals(other.getJ182()))
            && (this.getJ183() == null ? other.getJ183() == null : this.getJ183().equals(other.getJ183()))
            && (this.getJ184() == null ? other.getJ184() == null : this.getJ184().equals(other.getJ184()))
            && (this.getJ185() == null ? other.getJ185() == null : this.getJ185().equals(other.getJ185()))
            && (this.getJ187() == null ? other.getJ187() == null : this.getJ187().equals(other.getJ187()))
            && (this.getJ1881() == null ? other.getJ1881() == null : this.getJ1881().equals(other.getJ1881()))
            && (this.getJ1882() == null ? other.getJ1882() == null : this.getJ1882().equals(other.getJ1882()))
            && (this.getJ1892() == null ? other.getJ1892() == null : this.getJ1892().equals(other.getJ1892()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPos() == null) ? 0 : getPos().hashCode());
        result = prime * result + ((getGene() == null) ? 0 : getGene().hashCode());
        result = prime * result + ((getJ169() == null) ? 0 : getJ169().hashCode());
        result = prime * result + ((getJ16() == null) ? 0 : getJ16().hashCode());
        result = prime * result + ((getJ170() == null) ? 0 : getJ170().hashCode());
        result = prime * result + ((getJ171() == null) ? 0 : getJ171().hashCode());
        result = prime * result + ((getJ172() == null) ? 0 : getJ172().hashCode());
        result = prime * result + ((getJ173() == null) ? 0 : getJ173().hashCode());
        result = prime * result + ((getJ174() == null) ? 0 : getJ174().hashCode());
        result = prime * result + ((getJ175() == null) ? 0 : getJ175().hashCode());
        result = prime * result + ((getJ176() == null) ? 0 : getJ176().hashCode());
        result = prime * result + ((getJ177() == null) ? 0 : getJ177().hashCode());
        result = prime * result + ((getJ178() == null) ? 0 : getJ178().hashCode());
        result = prime * result + ((getJ179() == null) ? 0 : getJ179().hashCode());
        result = prime * result + ((getJ17() == null) ? 0 : getJ17().hashCode());
        result = prime * result + ((getJ180() == null) ? 0 : getJ180().hashCode());
        result = prime * result + ((getJ181() == null) ? 0 : getJ181().hashCode());
        result = prime * result + ((getJ182() == null) ? 0 : getJ182().hashCode());
        result = prime * result + ((getJ183() == null) ? 0 : getJ183().hashCode());
        result = prime * result + ((getJ184() == null) ? 0 : getJ184().hashCode());
        result = prime * result + ((getJ185() == null) ? 0 : getJ185().hashCode());
        result = prime * result + ((getJ187() == null) ? 0 : getJ187().hashCode());
        result = prime * result + ((getJ1881() == null) ? 0 : getJ1881().hashCode());
        result = prime * result + ((getJ1882() == null) ? 0 : getJ1882().hashCode());
        result = prime * result + ((getJ1892() == null) ? 0 : getJ1892().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pos=").append(pos);
        sb.append(", gene=").append(gene);
        sb.append(", j169=").append(j169);
        sb.append(", j16=").append(j16);
        sb.append(", j170=").append(j170);
        sb.append(", j171=").append(j171);
        sb.append(", j172=").append(j172);
        sb.append(", j173=").append(j173);
        sb.append(", j174=").append(j174);
        sb.append(", j175=").append(j175);
        sb.append(", j176=").append(j176);
        sb.append(", j177=").append(j177);
        sb.append(", j178=").append(j178);
        sb.append(", j179=").append(j179);
        sb.append(", j17=").append(j17);
        sb.append(", j180=").append(j180);
        sb.append(", j181=").append(j181);
        sb.append(", j182=").append(j182);
        sb.append(", j183=").append(j183);
        sb.append(", j184=").append(j184);
        sb.append(", j185=").append(j185);
        sb.append(", j187=").append(j187);
        sb.append(", j1881=").append(j1881);
        sb.append(", j1882=").append(j1882);
        sb.append(", j1892=").append(j1892);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}