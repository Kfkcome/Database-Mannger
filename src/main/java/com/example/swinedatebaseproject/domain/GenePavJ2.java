package com.example.swinedatebaseproject.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName GENE_pav_J2
 */
@TableName(value ="GENE_pav_J2")
@Data
public class GenePavJ2 implements Serializable {
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
    @TableField(value = "J200")
    private String j200;

    /**
     * 
     */
    @TableField(value = "J201")
    private String j201;

    /**
     * 
     */
    @TableField(value = "J202")
    private String j202;

    /**
     * 
     */
    @TableField(value = "J203")
    private String j203;

    /**
     * 
     */
    @TableField(value = "J204")
    private String j204;

    /**
     * 
     */
    @TableField(value = "J205")
    private String j205;

    /**
     * 
     */
    @TableField(value = "J206")
    private String j206;

    /**
     * 
     */
    @TableField(value = "J207")
    private String j207;

    /**
     * 
     */
    @TableField(value = "J208")
    private String j208;

    /**
     * 
     */
    @TableField(value = "J209")
    private String j209;

    /**
     * 
     */
    @TableField(value = "J20")
    private String j20;

    /**
     * 
     */
    @TableField(value = "J210")
    private String j210;

    /**
     * 
     */
    @TableField(value = "J211")
    private String j211;

    /**
     * 
     */
    @TableField(value = "J212")
    private String j212;

    /**
     * 
     */
    @TableField(value = "J213")
    private String j213;

    /**
     * 
     */
    @TableField(value = "J214")
    private String j214;

    /**
     * 
     */
    @TableField(value = "J215")
    private String j215;

    /**
     * 
     */
    @TableField(value = "J21")
    private String j21;

    /**
     * 
     */
    @TableField(value = "J220")
    private String j220;

    /**
     * 
     */
    @TableField(value = "J22")
    private String j22;

    /**
     * 
     */
    @TableField(value = "J23")
    private String j23;

    /**
     * 
     */
    @TableField(value = "J24")
    private String j24;

    /**
     * 
     */
    @TableField(value = "J25")
    private String j25;

    /**
     * 
     */
    @TableField(value = "J26")
    private String j26;

    /**
     * 
     */
    @TableField(value = "J27-2")
    private String j272;

    /**
     * 
     */
    @TableField(value = "J27")
    private String j27;

    /**
     * 
     */
    @TableField(value = "J28")
    private String j28;

    /**
     * 
     */
    @TableField(value = "J29")
    private String j29;

    /**
     * 
     */
    @TableField(value = "J2")
    private String j2;

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
        GenePavJ2 other = (GenePavJ2) that;
        return (this.getPos() == null ? other.getPos() == null : this.getPos().equals(other.getPos()))
            && (this.getGene() == null ? other.getGene() == null : this.getGene().equals(other.getGene()))
            && (this.getJ200() == null ? other.getJ200() == null : this.getJ200().equals(other.getJ200()))
            && (this.getJ201() == null ? other.getJ201() == null : this.getJ201().equals(other.getJ201()))
            && (this.getJ202() == null ? other.getJ202() == null : this.getJ202().equals(other.getJ202()))
            && (this.getJ203() == null ? other.getJ203() == null : this.getJ203().equals(other.getJ203()))
            && (this.getJ204() == null ? other.getJ204() == null : this.getJ204().equals(other.getJ204()))
            && (this.getJ205() == null ? other.getJ205() == null : this.getJ205().equals(other.getJ205()))
            && (this.getJ206() == null ? other.getJ206() == null : this.getJ206().equals(other.getJ206()))
            && (this.getJ207() == null ? other.getJ207() == null : this.getJ207().equals(other.getJ207()))
            && (this.getJ208() == null ? other.getJ208() == null : this.getJ208().equals(other.getJ208()))
            && (this.getJ209() == null ? other.getJ209() == null : this.getJ209().equals(other.getJ209()))
            && (this.getJ20() == null ? other.getJ20() == null : this.getJ20().equals(other.getJ20()))
            && (this.getJ210() == null ? other.getJ210() == null : this.getJ210().equals(other.getJ210()))
            && (this.getJ211() == null ? other.getJ211() == null : this.getJ211().equals(other.getJ211()))
            && (this.getJ212() == null ? other.getJ212() == null : this.getJ212().equals(other.getJ212()))
            && (this.getJ213() == null ? other.getJ213() == null : this.getJ213().equals(other.getJ213()))
            && (this.getJ214() == null ? other.getJ214() == null : this.getJ214().equals(other.getJ214()))
            && (this.getJ215() == null ? other.getJ215() == null : this.getJ215().equals(other.getJ215()))
            && (this.getJ21() == null ? other.getJ21() == null : this.getJ21().equals(other.getJ21()))
            && (this.getJ220() == null ? other.getJ220() == null : this.getJ220().equals(other.getJ220()))
            && (this.getJ22() == null ? other.getJ22() == null : this.getJ22().equals(other.getJ22()))
            && (this.getJ23() == null ? other.getJ23() == null : this.getJ23().equals(other.getJ23()))
            && (this.getJ24() == null ? other.getJ24() == null : this.getJ24().equals(other.getJ24()))
            && (this.getJ25() == null ? other.getJ25() == null : this.getJ25().equals(other.getJ25()))
            && (this.getJ26() == null ? other.getJ26() == null : this.getJ26().equals(other.getJ26()))
            && (this.getJ272() == null ? other.getJ272() == null : this.getJ272().equals(other.getJ272()))
            && (this.getJ27() == null ? other.getJ27() == null : this.getJ27().equals(other.getJ27()))
            && (this.getJ28() == null ? other.getJ28() == null : this.getJ28().equals(other.getJ28()))
            && (this.getJ29() == null ? other.getJ29() == null : this.getJ29().equals(other.getJ29()))
            && (this.getJ2() == null ? other.getJ2() == null : this.getJ2().equals(other.getJ2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPos() == null) ? 0 : getPos().hashCode());
        result = prime * result + ((getGene() == null) ? 0 : getGene().hashCode());
        result = prime * result + ((getJ200() == null) ? 0 : getJ200().hashCode());
        result = prime * result + ((getJ201() == null) ? 0 : getJ201().hashCode());
        result = prime * result + ((getJ202() == null) ? 0 : getJ202().hashCode());
        result = prime * result + ((getJ203() == null) ? 0 : getJ203().hashCode());
        result = prime * result + ((getJ204() == null) ? 0 : getJ204().hashCode());
        result = prime * result + ((getJ205() == null) ? 0 : getJ205().hashCode());
        result = prime * result + ((getJ206() == null) ? 0 : getJ206().hashCode());
        result = prime * result + ((getJ207() == null) ? 0 : getJ207().hashCode());
        result = prime * result + ((getJ208() == null) ? 0 : getJ208().hashCode());
        result = prime * result + ((getJ209() == null) ? 0 : getJ209().hashCode());
        result = prime * result + ((getJ20() == null) ? 0 : getJ20().hashCode());
        result = prime * result + ((getJ210() == null) ? 0 : getJ210().hashCode());
        result = prime * result + ((getJ211() == null) ? 0 : getJ211().hashCode());
        result = prime * result + ((getJ212() == null) ? 0 : getJ212().hashCode());
        result = prime * result + ((getJ213() == null) ? 0 : getJ213().hashCode());
        result = prime * result + ((getJ214() == null) ? 0 : getJ214().hashCode());
        result = prime * result + ((getJ215() == null) ? 0 : getJ215().hashCode());
        result = prime * result + ((getJ21() == null) ? 0 : getJ21().hashCode());
        result = prime * result + ((getJ220() == null) ? 0 : getJ220().hashCode());
        result = prime * result + ((getJ22() == null) ? 0 : getJ22().hashCode());
        result = prime * result + ((getJ23() == null) ? 0 : getJ23().hashCode());
        result = prime * result + ((getJ24() == null) ? 0 : getJ24().hashCode());
        result = prime * result + ((getJ25() == null) ? 0 : getJ25().hashCode());
        result = prime * result + ((getJ26() == null) ? 0 : getJ26().hashCode());
        result = prime * result + ((getJ272() == null) ? 0 : getJ272().hashCode());
        result = prime * result + ((getJ27() == null) ? 0 : getJ27().hashCode());
        result = prime * result + ((getJ28() == null) ? 0 : getJ28().hashCode());
        result = prime * result + ((getJ29() == null) ? 0 : getJ29().hashCode());
        result = prime * result + ((getJ2() == null) ? 0 : getJ2().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pos=").append(pos);
        sb.append(", gene=").append(gene);
        sb.append(", j200=").append(j200);
        sb.append(", j201=").append(j201);
        sb.append(", j202=").append(j202);
        sb.append(", j203=").append(j203);
        sb.append(", j204=").append(j204);
        sb.append(", j205=").append(j205);
        sb.append(", j206=").append(j206);
        sb.append(", j207=").append(j207);
        sb.append(", j208=").append(j208);
        sb.append(", j209=").append(j209);
        sb.append(", j20=").append(j20);
        sb.append(", j210=").append(j210);
        sb.append(", j211=").append(j211);
        sb.append(", j212=").append(j212);
        sb.append(", j213=").append(j213);
        sb.append(", j214=").append(j214);
        sb.append(", j215=").append(j215);
        sb.append(", j21=").append(j21);
        sb.append(", j220=").append(j220);
        sb.append(", j22=").append(j22);
        sb.append(", j23=").append(j23);
        sb.append(", j24=").append(j24);
        sb.append(", j25=").append(j25);
        sb.append(", j26=").append(j26);
        sb.append(", j272=").append(j272);
        sb.append(", j27=").append(j27);
        sb.append(", j28=").append(j28);
        sb.append(", j29=").append(j29);
        sb.append(", j2=").append(j2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}