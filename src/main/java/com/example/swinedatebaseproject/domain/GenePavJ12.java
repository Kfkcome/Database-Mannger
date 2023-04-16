package com.example.swinedatebaseproject.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName GENE_pav_J_1_2
 */
@TableName(value ="GENE_pav_J_1_2")
@Data
public class GenePavJ12 implements Serializable {
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
    @TableField(value = "J120")
    private String j120;

    /**
     * 
     */
    @TableField(value = "J122")
    private String j122;

    /**
     * 
     */
    @TableField(value = "J123")
    private String j123;

    /**
     * 
     */
    @TableField(value = "J124")
    private String j124;

    /**
     * 
     */
    @TableField(value = "J125")
    private String j125;

    /**
     * 
     */
    @TableField(value = "J126")
    private String j126;

    /**
     * 
     */
    @TableField(value = "J127")
    private String j127;

    /**
     * 
     */
    @TableField(value = "J128")
    private String j128;

    /**
     * 
     */
    @TableField(value = "J129_1")
    private String j1291;

    /**
     * 
     */
    @TableField(value = "J129_2")
    private String j1292;

    /**
     * 
     */
    @TableField(value = "J12")
    private String j12;

    /**
     * 
     */
    @TableField(value = "J130")
    private String j130;

    /**
     * 
     */
    @TableField(value = "J131")
    private String j131;

    /**
     * 
     */
    @TableField(value = "J132")
    private String j132;

    /**
     * 
     */
    @TableField(value = "J133")
    private String j133;

    /**
     * 
     */
    @TableField(value = "J134")
    private String j134;

    /**
     * 
     */
    @TableField(value = "J135")
    private String j135;

    /**
     * 
     */
    @TableField(value = "J136")
    private String j136;

    /**
     * 
     */
    @TableField(value = "J137")
    private String j137;

    /**
     * 
     */
    @TableField(value = "J138")
    private String j138;

    /**
     * 
     */
    @TableField(value = "J139")
    private String j139;

    /**
     * 
     */
    @TableField(value = "J13")
    private String j13;

    /**
     * 
     */
    @TableField(value = "J140_1")
    private String j1401;

    /**
     * 
     */
    @TableField(value = "J140_2")
    private String j1402;

    /**
     * 
     */
    @TableField(value = "J141")
    private String j141;

    /**
     * 
     */
    @TableField(value = "J142")
    private String j142;

    /**
     * 
     */
    @TableField(value = "J143")
    private String j143;

    /**
     * 
     */
    @TableField(value = "J144")
    private String j144;

    /**
     * 
     */
    @TableField(value = "J145")
    private String j145;

    /**
     * 
     */
    @TableField(value = "J146")
    private String j146;

    /**
     * 
     */
    @TableField(value = "J147")
    private String j147;

    /**
     * 
     */
    @TableField(value = "J148")
    private String j148;

    /**
     * 
     */
    @TableField(value = "J14")
    private String j14;

    /**
     * 
     */
    @TableField(value = "J150")
    private String j150;

    /**
     * 
     */
    @TableField(value = "J151")
    private String j151;

    /**
     * 
     */
    @TableField(value = "J152_1")
    private String j1521;

    /**
     * 
     */
    @TableField(value = "J152")
    private String j152;

    /**
     * 
     */
    @TableField(value = "J153")
    private String j153;

    /**
     * 
     */
    @TableField(value = "J154")
    private String j154;

    /**
     * 
     */
    @TableField(value = "J155")
    private String j155;

    /**
     * 
     */
    @TableField(value = "J156")
    private String j156;

    /**
     * 
     */
    @TableField(value = "J158")
    private String j158;

    /**
     * 
     */
    @TableField(value = "J159")
    private String j159;

    /**
     * 
     */
    @TableField(value = "J15")
    private String j15;

    /**
     * 
     */
    @TableField(value = "J160")
    private String j160;

    /**
     * 
     */
    @TableField(value = "J161")
    private String j161;

    /**
     * 
     */
    @TableField(value = "J162")
    private String j162;

    /**
     * 
     */
    @TableField(value = "J163")
    private String j163;

    /**
     * 
     */
    @TableField(value = "J164")
    private String j164;

    /**
     * 
     */
    @TableField(value = "J165")
    private String j165;

    /**
     * 
     */
    @TableField(value = "J166")
    private String j166;

    /**
     * 
     */
    @TableField(value = "J167")
    private String j167;

    /**
     * 
     */
    @TableField(value = "J168")
    private String j168;

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
        GenePavJ12 other = (GenePavJ12) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPos() == null ? other.getPos() == null : this.getPos().equals(other.getPos()))
            && (this.getGene() == null ? other.getGene() == null : this.getGene().equals(other.getGene()))
            && (this.getJ120() == null ? other.getJ120() == null : this.getJ120().equals(other.getJ120()))
            && (this.getJ122() == null ? other.getJ122() == null : this.getJ122().equals(other.getJ122()))
            && (this.getJ123() == null ? other.getJ123() == null : this.getJ123().equals(other.getJ123()))
            && (this.getJ124() == null ? other.getJ124() == null : this.getJ124().equals(other.getJ124()))
            && (this.getJ125() == null ? other.getJ125() == null : this.getJ125().equals(other.getJ125()))
            && (this.getJ126() == null ? other.getJ126() == null : this.getJ126().equals(other.getJ126()))
            && (this.getJ127() == null ? other.getJ127() == null : this.getJ127().equals(other.getJ127()))
            && (this.getJ128() == null ? other.getJ128() == null : this.getJ128().equals(other.getJ128()))
            && (this.getJ1291() == null ? other.getJ1291() == null : this.getJ1291().equals(other.getJ1291()))
            && (this.getJ1292() == null ? other.getJ1292() == null : this.getJ1292().equals(other.getJ1292()))
            && (this.getJ12() == null ? other.getJ12() == null : this.getJ12().equals(other.getJ12()))
            && (this.getJ130() == null ? other.getJ130() == null : this.getJ130().equals(other.getJ130()))
            && (this.getJ131() == null ? other.getJ131() == null : this.getJ131().equals(other.getJ131()))
            && (this.getJ132() == null ? other.getJ132() == null : this.getJ132().equals(other.getJ132()))
            && (this.getJ133() == null ? other.getJ133() == null : this.getJ133().equals(other.getJ133()))
            && (this.getJ134() == null ? other.getJ134() == null : this.getJ134().equals(other.getJ134()))
            && (this.getJ135() == null ? other.getJ135() == null : this.getJ135().equals(other.getJ135()))
            && (this.getJ136() == null ? other.getJ136() == null : this.getJ136().equals(other.getJ136()))
            && (this.getJ137() == null ? other.getJ137() == null : this.getJ137().equals(other.getJ137()))
            && (this.getJ138() == null ? other.getJ138() == null : this.getJ138().equals(other.getJ138()))
            && (this.getJ139() == null ? other.getJ139() == null : this.getJ139().equals(other.getJ139()))
            && (this.getJ13() == null ? other.getJ13() == null : this.getJ13().equals(other.getJ13()))
            && (this.getJ1401() == null ? other.getJ1401() == null : this.getJ1401().equals(other.getJ1401()))
            && (this.getJ1402() == null ? other.getJ1402() == null : this.getJ1402().equals(other.getJ1402()))
            && (this.getJ141() == null ? other.getJ141() == null : this.getJ141().equals(other.getJ141()))
            && (this.getJ142() == null ? other.getJ142() == null : this.getJ142().equals(other.getJ142()))
            && (this.getJ143() == null ? other.getJ143() == null : this.getJ143().equals(other.getJ143()))
            && (this.getJ144() == null ? other.getJ144() == null : this.getJ144().equals(other.getJ144()))
            && (this.getJ145() == null ? other.getJ145() == null : this.getJ145().equals(other.getJ145()))
            && (this.getJ146() == null ? other.getJ146() == null : this.getJ146().equals(other.getJ146()))
            && (this.getJ147() == null ? other.getJ147() == null : this.getJ147().equals(other.getJ147()))
            && (this.getJ148() == null ? other.getJ148() == null : this.getJ148().equals(other.getJ148()))
            && (this.getJ14() == null ? other.getJ14() == null : this.getJ14().equals(other.getJ14()))
            && (this.getJ150() == null ? other.getJ150() == null : this.getJ150().equals(other.getJ150()))
            && (this.getJ151() == null ? other.getJ151() == null : this.getJ151().equals(other.getJ151()))
            && (this.getJ1521() == null ? other.getJ1521() == null : this.getJ1521().equals(other.getJ1521()))
            && (this.getJ152() == null ? other.getJ152() == null : this.getJ152().equals(other.getJ152()))
            && (this.getJ153() == null ? other.getJ153() == null : this.getJ153().equals(other.getJ153()))
            && (this.getJ154() == null ? other.getJ154() == null : this.getJ154().equals(other.getJ154()))
            && (this.getJ155() == null ? other.getJ155() == null : this.getJ155().equals(other.getJ155()))
            && (this.getJ156() == null ? other.getJ156() == null : this.getJ156().equals(other.getJ156()))
            && (this.getJ158() == null ? other.getJ158() == null : this.getJ158().equals(other.getJ158()))
            && (this.getJ159() == null ? other.getJ159() == null : this.getJ159().equals(other.getJ159()))
            && (this.getJ15() == null ? other.getJ15() == null : this.getJ15().equals(other.getJ15()))
            && (this.getJ160() == null ? other.getJ160() == null : this.getJ160().equals(other.getJ160()))
            && (this.getJ161() == null ? other.getJ161() == null : this.getJ161().equals(other.getJ161()))
            && (this.getJ162() == null ? other.getJ162() == null : this.getJ162().equals(other.getJ162()))
            && (this.getJ163() == null ? other.getJ163() == null : this.getJ163().equals(other.getJ163()))
            && (this.getJ164() == null ? other.getJ164() == null : this.getJ164().equals(other.getJ164()))
            && (this.getJ165() == null ? other.getJ165() == null : this.getJ165().equals(other.getJ165()))
            && (this.getJ166() == null ? other.getJ166() == null : this.getJ166().equals(other.getJ166()))
            && (this.getJ167() == null ? other.getJ167() == null : this.getJ167().equals(other.getJ167()))
            && (this.getJ168() == null ? other.getJ168() == null : this.getJ168().equals(other.getJ168()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPos() == null) ? 0 : getPos().hashCode());
        result = prime * result + ((getGene() == null) ? 0 : getGene().hashCode());
        result = prime * result + ((getJ120() == null) ? 0 : getJ120().hashCode());
        result = prime * result + ((getJ122() == null) ? 0 : getJ122().hashCode());
        result = prime * result + ((getJ123() == null) ? 0 : getJ123().hashCode());
        result = prime * result + ((getJ124() == null) ? 0 : getJ124().hashCode());
        result = prime * result + ((getJ125() == null) ? 0 : getJ125().hashCode());
        result = prime * result + ((getJ126() == null) ? 0 : getJ126().hashCode());
        result = prime * result + ((getJ127() == null) ? 0 : getJ127().hashCode());
        result = prime * result + ((getJ128() == null) ? 0 : getJ128().hashCode());
        result = prime * result + ((getJ1291() == null) ? 0 : getJ1291().hashCode());
        result = prime * result + ((getJ1292() == null) ? 0 : getJ1292().hashCode());
        result = prime * result + ((getJ12() == null) ? 0 : getJ12().hashCode());
        result = prime * result + ((getJ130() == null) ? 0 : getJ130().hashCode());
        result = prime * result + ((getJ131() == null) ? 0 : getJ131().hashCode());
        result = prime * result + ((getJ132() == null) ? 0 : getJ132().hashCode());
        result = prime * result + ((getJ133() == null) ? 0 : getJ133().hashCode());
        result = prime * result + ((getJ134() == null) ? 0 : getJ134().hashCode());
        result = prime * result + ((getJ135() == null) ? 0 : getJ135().hashCode());
        result = prime * result + ((getJ136() == null) ? 0 : getJ136().hashCode());
        result = prime * result + ((getJ137() == null) ? 0 : getJ137().hashCode());
        result = prime * result + ((getJ138() == null) ? 0 : getJ138().hashCode());
        result = prime * result + ((getJ139() == null) ? 0 : getJ139().hashCode());
        result = prime * result + ((getJ13() == null) ? 0 : getJ13().hashCode());
        result = prime * result + ((getJ1401() == null) ? 0 : getJ1401().hashCode());
        result = prime * result + ((getJ1402() == null) ? 0 : getJ1402().hashCode());
        result = prime * result + ((getJ141() == null) ? 0 : getJ141().hashCode());
        result = prime * result + ((getJ142() == null) ? 0 : getJ142().hashCode());
        result = prime * result + ((getJ143() == null) ? 0 : getJ143().hashCode());
        result = prime * result + ((getJ144() == null) ? 0 : getJ144().hashCode());
        result = prime * result + ((getJ145() == null) ? 0 : getJ145().hashCode());
        result = prime * result + ((getJ146() == null) ? 0 : getJ146().hashCode());
        result = prime * result + ((getJ147() == null) ? 0 : getJ147().hashCode());
        result = prime * result + ((getJ148() == null) ? 0 : getJ148().hashCode());
        result = prime * result + ((getJ14() == null) ? 0 : getJ14().hashCode());
        result = prime * result + ((getJ150() == null) ? 0 : getJ150().hashCode());
        result = prime * result + ((getJ151() == null) ? 0 : getJ151().hashCode());
        result = prime * result + ((getJ1521() == null) ? 0 : getJ1521().hashCode());
        result = prime * result + ((getJ152() == null) ? 0 : getJ152().hashCode());
        result = prime * result + ((getJ153() == null) ? 0 : getJ153().hashCode());
        result = prime * result + ((getJ154() == null) ? 0 : getJ154().hashCode());
        result = prime * result + ((getJ155() == null) ? 0 : getJ155().hashCode());
        result = prime * result + ((getJ156() == null) ? 0 : getJ156().hashCode());
        result = prime * result + ((getJ158() == null) ? 0 : getJ158().hashCode());
        result = prime * result + ((getJ159() == null) ? 0 : getJ159().hashCode());
        result = prime * result + ((getJ15() == null) ? 0 : getJ15().hashCode());
        result = prime * result + ((getJ160() == null) ? 0 : getJ160().hashCode());
        result = prime * result + ((getJ161() == null) ? 0 : getJ161().hashCode());
        result = prime * result + ((getJ162() == null) ? 0 : getJ162().hashCode());
        result = prime * result + ((getJ163() == null) ? 0 : getJ163().hashCode());
        result = prime * result + ((getJ164() == null) ? 0 : getJ164().hashCode());
        result = prime * result + ((getJ165() == null) ? 0 : getJ165().hashCode());
        result = prime * result + ((getJ166() == null) ? 0 : getJ166().hashCode());
        result = prime * result + ((getJ167() == null) ? 0 : getJ167().hashCode());
        result = prime * result + ((getJ168() == null) ? 0 : getJ168().hashCode());
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
        sb.append(", j120=").append(j120);
        sb.append(", j122=").append(j122);
        sb.append(", j123=").append(j123);
        sb.append(", j124=").append(j124);
        sb.append(", j125=").append(j125);
        sb.append(", j126=").append(j126);
        sb.append(", j127=").append(j127);
        sb.append(", j128=").append(j128);
        sb.append(", j1291=").append(j1291);
        sb.append(", j1292=").append(j1292);
        sb.append(", j12=").append(j12);
        sb.append(", j130=").append(j130);
        sb.append(", j131=").append(j131);
        sb.append(", j132=").append(j132);
        sb.append(", j133=").append(j133);
        sb.append(", j134=").append(j134);
        sb.append(", j135=").append(j135);
        sb.append(", j136=").append(j136);
        sb.append(", j137=").append(j137);
        sb.append(", j138=").append(j138);
        sb.append(", j139=").append(j139);
        sb.append(", j13=").append(j13);
        sb.append(", j1401=").append(j1401);
        sb.append(", j1402=").append(j1402);
        sb.append(", j141=").append(j141);
        sb.append(", j142=").append(j142);
        sb.append(", j143=").append(j143);
        sb.append(", j144=").append(j144);
        sb.append(", j145=").append(j145);
        sb.append(", j146=").append(j146);
        sb.append(", j147=").append(j147);
        sb.append(", j148=").append(j148);
        sb.append(", j14=").append(j14);
        sb.append(", j150=").append(j150);
        sb.append(", j151=").append(j151);
        sb.append(", j1521=").append(j1521);
        sb.append(", j152=").append(j152);
        sb.append(", j153=").append(j153);
        sb.append(", j154=").append(j154);
        sb.append(", j155=").append(j155);
        sb.append(", j156=").append(j156);
        sb.append(", j158=").append(j158);
        sb.append(", j159=").append(j159);
        sb.append(", j15=").append(j15);
        sb.append(", j160=").append(j160);
        sb.append(", j161=").append(j161);
        sb.append(", j162=").append(j162);
        sb.append(", j163=").append(j163);
        sb.append(", j164=").append(j164);
        sb.append(", j165=").append(j165);
        sb.append(", j166=").append(j166);
        sb.append(", j167=").append(j167);
        sb.append(", j168=").append(j168);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}