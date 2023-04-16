package com.example.swinedatebaseproject.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName GENE_pav_A1
 */
@TableName(value ="GENE_pav_A1")
@Data
public class GenePavA1 implements Serializable {
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
    @TableField(value = "A1_012")
    private String a1012;

    /**
     * 
     */
    @TableField(value = "A1_019")
    private String a1019;

    /**
     * 
     */
    @TableField(value = "A1_028")
    private String a1028;

    /**
     * 
     */
    @TableField(value = "A1_029")
    private String a1029;

    /**
     * 
     */
    @TableField(value = "A1_030")
    private String a1030;

    /**
     * 
     */
    @TableField(value = "A1_037")
    private String a1037;

    /**
     * 
     */
    @TableField(value = "A1_051")
    private String a1051;

    /**
     * 
     */
    @TableField(value = "A1_054")
    private String a1054;

    /**
     * 
     */
    @TableField(value = "A1_073")
    private String a1073;

    /**
     * 
     */
    @TableField(value = "A1_074")
    private String a1074;

    /**
     * 
     */
    @TableField(value = "A1_077")
    private String a1077;

    /**
     * 
     */
    @TableField(value = "A1_079")
    private String a1079;

    /**
     * 
     */
    @TableField(value = "A1_084")
    private String a1084;

    /**
     * 
     */
    @TableField(value = "A1_088")
    private String a1088;

    /**
     * 
     */
    @TableField(value = "A1_097")
    private String a1097;

    /**
     * 
     */
    @TableField(value = "A1_108")
    private String a1108;

    /**
     * 
     */
    @TableField(value = "A1_113")
    private String a1113;

    /**
     * 
     */
    @TableField(value = "A1_123")
    private String a1123;

    /**
     * 
     */
    @TableField(value = "A1_125")
    private String a1125;

    /**
     * 
     */
    @TableField(value = "A1_132")
    private String a1132;

    /**
     * 
     */
    @TableField(value = "A1_133")
    private String a1133;

    /**
     * 
     */
    @TableField(value = "A1_148")
    private String a1148;

    /**
     * 
     */
    @TableField(value = "A1_155")
    private String a1155;

    /**
     * 
     */
    @TableField(value = "A1_158")
    private String a1158;

    /**
     * 
     */
    @TableField(value = "A1_Af")
    private String a1Af;

    /**
     * 
     */
    @TableField(value = "A1_Nisa")
    private String a1Nisa;

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
        GenePavA1 other = (GenePavA1) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPos() == null ? other.getPos() == null : this.getPos().equals(other.getPos()))
            && (this.getGene() == null ? other.getGene() == null : this.getGene().equals(other.getGene()))
            && (this.getA1012() == null ? other.getA1012() == null : this.getA1012().equals(other.getA1012()))
            && (this.getA1019() == null ? other.getA1019() == null : this.getA1019().equals(other.getA1019()))
            && (this.getA1028() == null ? other.getA1028() == null : this.getA1028().equals(other.getA1028()))
            && (this.getA1029() == null ? other.getA1029() == null : this.getA1029().equals(other.getA1029()))
            && (this.getA1030() == null ? other.getA1030() == null : this.getA1030().equals(other.getA1030()))
            && (this.getA1037() == null ? other.getA1037() == null : this.getA1037().equals(other.getA1037()))
            && (this.getA1051() == null ? other.getA1051() == null : this.getA1051().equals(other.getA1051()))
            && (this.getA1054() == null ? other.getA1054() == null : this.getA1054().equals(other.getA1054()))
            && (this.getA1073() == null ? other.getA1073() == null : this.getA1073().equals(other.getA1073()))
            && (this.getA1074() == null ? other.getA1074() == null : this.getA1074().equals(other.getA1074()))
            && (this.getA1077() == null ? other.getA1077() == null : this.getA1077().equals(other.getA1077()))
            && (this.getA1079() == null ? other.getA1079() == null : this.getA1079().equals(other.getA1079()))
            && (this.getA1084() == null ? other.getA1084() == null : this.getA1084().equals(other.getA1084()))
            && (this.getA1088() == null ? other.getA1088() == null : this.getA1088().equals(other.getA1088()))
            && (this.getA1097() == null ? other.getA1097() == null : this.getA1097().equals(other.getA1097()))
            && (this.getA1108() == null ? other.getA1108() == null : this.getA1108().equals(other.getA1108()))
            && (this.getA1113() == null ? other.getA1113() == null : this.getA1113().equals(other.getA1113()))
            && (this.getA1123() == null ? other.getA1123() == null : this.getA1123().equals(other.getA1123()))
            && (this.getA1125() == null ? other.getA1125() == null : this.getA1125().equals(other.getA1125()))
            && (this.getA1132() == null ? other.getA1132() == null : this.getA1132().equals(other.getA1132()))
            && (this.getA1133() == null ? other.getA1133() == null : this.getA1133().equals(other.getA1133()))
            && (this.getA1148() == null ? other.getA1148() == null : this.getA1148().equals(other.getA1148()))
            && (this.getA1155() == null ? other.getA1155() == null : this.getA1155().equals(other.getA1155()))
            && (this.getA1158() == null ? other.getA1158() == null : this.getA1158().equals(other.getA1158()))
            && (this.getA1Af() == null ? other.getA1Af() == null : this.getA1Af().equals(other.getA1Af()))
            && (this.getA1Nisa() == null ? other.getA1Nisa() == null : this.getA1Nisa().equals(other.getA1Nisa()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPos() == null) ? 0 : getPos().hashCode());
        result = prime * result + ((getGene() == null) ? 0 : getGene().hashCode());
        result = prime * result + ((getA1012() == null) ? 0 : getA1012().hashCode());
        result = prime * result + ((getA1019() == null) ? 0 : getA1019().hashCode());
        result = prime * result + ((getA1028() == null) ? 0 : getA1028().hashCode());
        result = prime * result + ((getA1029() == null) ? 0 : getA1029().hashCode());
        result = prime * result + ((getA1030() == null) ? 0 : getA1030().hashCode());
        result = prime * result + ((getA1037() == null) ? 0 : getA1037().hashCode());
        result = prime * result + ((getA1051() == null) ? 0 : getA1051().hashCode());
        result = prime * result + ((getA1054() == null) ? 0 : getA1054().hashCode());
        result = prime * result + ((getA1073() == null) ? 0 : getA1073().hashCode());
        result = prime * result + ((getA1074() == null) ? 0 : getA1074().hashCode());
        result = prime * result + ((getA1077() == null) ? 0 : getA1077().hashCode());
        result = prime * result + ((getA1079() == null) ? 0 : getA1079().hashCode());
        result = prime * result + ((getA1084() == null) ? 0 : getA1084().hashCode());
        result = prime * result + ((getA1088() == null) ? 0 : getA1088().hashCode());
        result = prime * result + ((getA1097() == null) ? 0 : getA1097().hashCode());
        result = prime * result + ((getA1108() == null) ? 0 : getA1108().hashCode());
        result = prime * result + ((getA1113() == null) ? 0 : getA1113().hashCode());
        result = prime * result + ((getA1123() == null) ? 0 : getA1123().hashCode());
        result = prime * result + ((getA1125() == null) ? 0 : getA1125().hashCode());
        result = prime * result + ((getA1132() == null) ? 0 : getA1132().hashCode());
        result = prime * result + ((getA1133() == null) ? 0 : getA1133().hashCode());
        result = prime * result + ((getA1148() == null) ? 0 : getA1148().hashCode());
        result = prime * result + ((getA1155() == null) ? 0 : getA1155().hashCode());
        result = prime * result + ((getA1158() == null) ? 0 : getA1158().hashCode());
        result = prime * result + ((getA1Af() == null) ? 0 : getA1Af().hashCode());
        result = prime * result + ((getA1Nisa() == null) ? 0 : getA1Nisa().hashCode());
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
        sb.append(", a1012=").append(a1012);
        sb.append(", a1019=").append(a1019);
        sb.append(", a1028=").append(a1028);
        sb.append(", a1029=").append(a1029);
        sb.append(", a1030=").append(a1030);
        sb.append(", a1037=").append(a1037);
        sb.append(", a1051=").append(a1051);
        sb.append(", a1054=").append(a1054);
        sb.append(", a1073=").append(a1073);
        sb.append(", a1074=").append(a1074);
        sb.append(", a1077=").append(a1077);
        sb.append(", a1079=").append(a1079);
        sb.append(", a1084=").append(a1084);
        sb.append(", a1088=").append(a1088);
        sb.append(", a1097=").append(a1097);
        sb.append(", a1108=").append(a1108);
        sb.append(", a1113=").append(a1113);
        sb.append(", a1123=").append(a1123);
        sb.append(", a1125=").append(a1125);
        sb.append(", a1132=").append(a1132);
        sb.append(", a1133=").append(a1133);
        sb.append(", a1148=").append(a1148);
        sb.append(", a1155=").append(a1155);
        sb.append(", a1158=").append(a1158);
        sb.append(", a1Af=").append(a1Af);
        sb.append(", a1Nisa=").append(a1Nisa);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}