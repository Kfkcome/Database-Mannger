package com.example.swinedatebaseproject.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName GENE_pav_Gar
 */
@TableName(value ="GENE_pav_Gar")
@Data
public class GenePavGar implements Serializable {
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
    @TableField(value = "Gar01")
    private String gar01;

    /**
     * 
     */
    @TableField(value = "Gar02")
    private String gar02;

    /**
     * 
     */
    @TableField(value = "Gar03")
    private String gar03;

    /**
     * 
     */
    @TableField(value = "Gar04")
    private String gar04;

    /**
     * 
     */
    @TableField(value = "Gar30")
    private String gar30;

    /**
     * 
     */
    @TableField(value = "Gar31")
    private String gar31;

    /**
     * 
     */
    @TableField(value = "Gar32")
    private String gar32;

    /**
     * 
     */
    @TableField(value = "Gar33")
    private String gar33;

    /**
     * 
     */
    @TableField(value = "Gar34")
    private String gar34;

    /**
     * 
     */
    @TableField(value = "Gar35")
    private String gar35;

    /**
     * 
     */
    @TableField(value = "Gar36")
    private String gar36;

    /**
     * 
     */
    @TableField(value = "Gar37")
    private String gar37;

    /**
     * 
     */
    @TableField(value = "Gar38")
    private String gar38;

    /**
     * 
     */
    @TableField(value = "Gar39")
    private String gar39;

    /**
     * 
     */
    @TableField(value = "Gar40")
    private String gar40;

    /**
     * 
     */
    @TableField(value = "Gar41")
    private String gar41;

    /**
     * 
     */
    @TableField(value = "Gar42")
    private String gar42;

    /**
     * 
     */
    @TableField(value = "Gar43")
    private String gar43;

    /**
     * 
     */
    @TableField(value = "Gar44")
    private String gar44;

    /**
     * 
     */
    @TableField(value = "Gar45")
    private String gar45;

    /**
     * 
     */
    @TableField(value = "Gar46")
    private String gar46;

    /**
     * 
     */
    @TableField(value = "Gar47")
    private String gar47;

    /**
     * 
     */
    @TableField(value = "Gar48")
    private String gar48;

    /**
     * 
     */
    @TableField(value = "Gar49")
    private String gar49;

    /**
     * 
     */
    @TableField(value = "Gar50")
    private String gar50;

    /**
     * 
     */
    @TableField(value = "Gar51")
    private String gar51;

    /**
     * 
     */
    @TableField(value = "Gar52")
    private String gar52;

    /**
     * 
     */
    @TableField(value = "Gar53")
    private String gar53;

    /**
     * 
     */
    @TableField(value = "Gar54")
    private String gar54;

    /**
     * 
     */
    @TableField(value = "Gar55")
    private String gar55;

    /**
     * 
     */
    @TableField(value = "Gar56")
    private String gar56;

    /**
     * 
     */
    @TableField(value = "Gar57")
    private String gar57;

    /**
     * 
     */
    @TableField(value = "Gar58")
    private String gar58;

    /**
     * 
     */
    @TableField(value = "Gar59")
    private String gar59;

    /**
     * 
     */
    @TableField(value = "Gar60")
    private String gar60;

    /**
     * 
     */
    @TableField(value = "Gar61")
    private String gar61;

    /**
     * 
     */
    @TableField(value = "Gar62")
    private String gar62;

    /**
     * 
     */
    @TableField(value = "Gar63")
    private String gar63;

    /**
     * 
     */
    @TableField(value = "Gar64")
    private String gar64;

    /**
     * 
     */
    @TableField(value = "Gar65")
    private String gar65;

    /**
     * 
     */
    @TableField(value = "Gar66")
    private String gar66;

    /**
     * 
     */
    @TableField(value = "Ghe01")
    private String ghe01;

    /**
     * 
     */
    @TableField(value = "Ghe02")
    private String ghe02;

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
        GenePavGar other = (GenePavGar) that;
        return (this.getPos() == null ? other.getPos() == null : this.getPos().equals(other.getPos()))
            && (this.getGene() == null ? other.getGene() == null : this.getGene().equals(other.getGene()))
            && (this.getGar01() == null ? other.getGar01() == null : this.getGar01().equals(other.getGar01()))
            && (this.getGar02() == null ? other.getGar02() == null : this.getGar02().equals(other.getGar02()))
            && (this.getGar03() == null ? other.getGar03() == null : this.getGar03().equals(other.getGar03()))
            && (this.getGar04() == null ? other.getGar04() == null : this.getGar04().equals(other.getGar04()))
            && (this.getGar30() == null ? other.getGar30() == null : this.getGar30().equals(other.getGar30()))
            && (this.getGar31() == null ? other.getGar31() == null : this.getGar31().equals(other.getGar31()))
            && (this.getGar32() == null ? other.getGar32() == null : this.getGar32().equals(other.getGar32()))
            && (this.getGar33() == null ? other.getGar33() == null : this.getGar33().equals(other.getGar33()))
            && (this.getGar34() == null ? other.getGar34() == null : this.getGar34().equals(other.getGar34()))
            && (this.getGar35() == null ? other.getGar35() == null : this.getGar35().equals(other.getGar35()))
            && (this.getGar36() == null ? other.getGar36() == null : this.getGar36().equals(other.getGar36()))
            && (this.getGar37() == null ? other.getGar37() == null : this.getGar37().equals(other.getGar37()))
            && (this.getGar38() == null ? other.getGar38() == null : this.getGar38().equals(other.getGar38()))
            && (this.getGar39() == null ? other.getGar39() == null : this.getGar39().equals(other.getGar39()))
            && (this.getGar40() == null ? other.getGar40() == null : this.getGar40().equals(other.getGar40()))
            && (this.getGar41() == null ? other.getGar41() == null : this.getGar41().equals(other.getGar41()))
            && (this.getGar42() == null ? other.getGar42() == null : this.getGar42().equals(other.getGar42()))
            && (this.getGar43() == null ? other.getGar43() == null : this.getGar43().equals(other.getGar43()))
            && (this.getGar44() == null ? other.getGar44() == null : this.getGar44().equals(other.getGar44()))
            && (this.getGar45() == null ? other.getGar45() == null : this.getGar45().equals(other.getGar45()))
            && (this.getGar46() == null ? other.getGar46() == null : this.getGar46().equals(other.getGar46()))
            && (this.getGar47() == null ? other.getGar47() == null : this.getGar47().equals(other.getGar47()))
            && (this.getGar48() == null ? other.getGar48() == null : this.getGar48().equals(other.getGar48()))
            && (this.getGar49() == null ? other.getGar49() == null : this.getGar49().equals(other.getGar49()))
            && (this.getGar50() == null ? other.getGar50() == null : this.getGar50().equals(other.getGar50()))
            && (this.getGar51() == null ? other.getGar51() == null : this.getGar51().equals(other.getGar51()))
            && (this.getGar52() == null ? other.getGar52() == null : this.getGar52().equals(other.getGar52()))
            && (this.getGar53() == null ? other.getGar53() == null : this.getGar53().equals(other.getGar53()))
            && (this.getGar54() == null ? other.getGar54() == null : this.getGar54().equals(other.getGar54()))
            && (this.getGar55() == null ? other.getGar55() == null : this.getGar55().equals(other.getGar55()))
            && (this.getGar56() == null ? other.getGar56() == null : this.getGar56().equals(other.getGar56()))
            && (this.getGar57() == null ? other.getGar57() == null : this.getGar57().equals(other.getGar57()))
            && (this.getGar58() == null ? other.getGar58() == null : this.getGar58().equals(other.getGar58()))
            && (this.getGar59() == null ? other.getGar59() == null : this.getGar59().equals(other.getGar59()))
            && (this.getGar60() == null ? other.getGar60() == null : this.getGar60().equals(other.getGar60()))
            && (this.getGar61() == null ? other.getGar61() == null : this.getGar61().equals(other.getGar61()))
            && (this.getGar62() == null ? other.getGar62() == null : this.getGar62().equals(other.getGar62()))
            && (this.getGar63() == null ? other.getGar63() == null : this.getGar63().equals(other.getGar63()))
            && (this.getGar64() == null ? other.getGar64() == null : this.getGar64().equals(other.getGar64()))
            && (this.getGar65() == null ? other.getGar65() == null : this.getGar65().equals(other.getGar65()))
            && (this.getGar66() == null ? other.getGar66() == null : this.getGar66().equals(other.getGar66()))
            && (this.getGhe01() == null ? other.getGhe01() == null : this.getGhe01().equals(other.getGhe01()))
            && (this.getGhe02() == null ? other.getGhe02() == null : this.getGhe02().equals(other.getGhe02()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPos() == null) ? 0 : getPos().hashCode());
        result = prime * result + ((getGene() == null) ? 0 : getGene().hashCode());
        result = prime * result + ((getGar01() == null) ? 0 : getGar01().hashCode());
        result = prime * result + ((getGar02() == null) ? 0 : getGar02().hashCode());
        result = prime * result + ((getGar03() == null) ? 0 : getGar03().hashCode());
        result = prime * result + ((getGar04() == null) ? 0 : getGar04().hashCode());
        result = prime * result + ((getGar30() == null) ? 0 : getGar30().hashCode());
        result = prime * result + ((getGar31() == null) ? 0 : getGar31().hashCode());
        result = prime * result + ((getGar32() == null) ? 0 : getGar32().hashCode());
        result = prime * result + ((getGar33() == null) ? 0 : getGar33().hashCode());
        result = prime * result + ((getGar34() == null) ? 0 : getGar34().hashCode());
        result = prime * result + ((getGar35() == null) ? 0 : getGar35().hashCode());
        result = prime * result + ((getGar36() == null) ? 0 : getGar36().hashCode());
        result = prime * result + ((getGar37() == null) ? 0 : getGar37().hashCode());
        result = prime * result + ((getGar38() == null) ? 0 : getGar38().hashCode());
        result = prime * result + ((getGar39() == null) ? 0 : getGar39().hashCode());
        result = prime * result + ((getGar40() == null) ? 0 : getGar40().hashCode());
        result = prime * result + ((getGar41() == null) ? 0 : getGar41().hashCode());
        result = prime * result + ((getGar42() == null) ? 0 : getGar42().hashCode());
        result = prime * result + ((getGar43() == null) ? 0 : getGar43().hashCode());
        result = prime * result + ((getGar44() == null) ? 0 : getGar44().hashCode());
        result = prime * result + ((getGar45() == null) ? 0 : getGar45().hashCode());
        result = prime * result + ((getGar46() == null) ? 0 : getGar46().hashCode());
        result = prime * result + ((getGar47() == null) ? 0 : getGar47().hashCode());
        result = prime * result + ((getGar48() == null) ? 0 : getGar48().hashCode());
        result = prime * result + ((getGar49() == null) ? 0 : getGar49().hashCode());
        result = prime * result + ((getGar50() == null) ? 0 : getGar50().hashCode());
        result = prime * result + ((getGar51() == null) ? 0 : getGar51().hashCode());
        result = prime * result + ((getGar52() == null) ? 0 : getGar52().hashCode());
        result = prime * result + ((getGar53() == null) ? 0 : getGar53().hashCode());
        result = prime * result + ((getGar54() == null) ? 0 : getGar54().hashCode());
        result = prime * result + ((getGar55() == null) ? 0 : getGar55().hashCode());
        result = prime * result + ((getGar56() == null) ? 0 : getGar56().hashCode());
        result = prime * result + ((getGar57() == null) ? 0 : getGar57().hashCode());
        result = prime * result + ((getGar58() == null) ? 0 : getGar58().hashCode());
        result = prime * result + ((getGar59() == null) ? 0 : getGar59().hashCode());
        result = prime * result + ((getGar60() == null) ? 0 : getGar60().hashCode());
        result = prime * result + ((getGar61() == null) ? 0 : getGar61().hashCode());
        result = prime * result + ((getGar62() == null) ? 0 : getGar62().hashCode());
        result = prime * result + ((getGar63() == null) ? 0 : getGar63().hashCode());
        result = prime * result + ((getGar64() == null) ? 0 : getGar64().hashCode());
        result = prime * result + ((getGar65() == null) ? 0 : getGar65().hashCode());
        result = prime * result + ((getGar66() == null) ? 0 : getGar66().hashCode());
        result = prime * result + ((getGhe01() == null) ? 0 : getGhe01().hashCode());
        result = prime * result + ((getGhe02() == null) ? 0 : getGhe02().hashCode());
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
        sb.append(", gar01=").append(gar01);
        sb.append(", gar02=").append(gar02);
        sb.append(", gar03=").append(gar03);
        sb.append(", gar04=").append(gar04);
        sb.append(", gar30=").append(gar30);
        sb.append(", gar31=").append(gar31);
        sb.append(", gar32=").append(gar32);
        sb.append(", gar33=").append(gar33);
        sb.append(", gar34=").append(gar34);
        sb.append(", gar35=").append(gar35);
        sb.append(", gar36=").append(gar36);
        sb.append(", gar37=").append(gar37);
        sb.append(", gar38=").append(gar38);
        sb.append(", gar39=").append(gar39);
        sb.append(", gar40=").append(gar40);
        sb.append(", gar41=").append(gar41);
        sb.append(", gar42=").append(gar42);
        sb.append(", gar43=").append(gar43);
        sb.append(", gar44=").append(gar44);
        sb.append(", gar45=").append(gar45);
        sb.append(", gar46=").append(gar46);
        sb.append(", gar47=").append(gar47);
        sb.append(", gar48=").append(gar48);
        sb.append(", gar49=").append(gar49);
        sb.append(", gar50=").append(gar50);
        sb.append(", gar51=").append(gar51);
        sb.append(", gar52=").append(gar52);
        sb.append(", gar53=").append(gar53);
        sb.append(", gar54=").append(gar54);
        sb.append(", gar55=").append(gar55);
        sb.append(", gar56=").append(gar56);
        sb.append(", gar57=").append(gar57);
        sb.append(", gar58=").append(gar58);
        sb.append(", gar59=").append(gar59);
        sb.append(", gar60=").append(gar60);
        sb.append(", gar61=").append(gar61);
        sb.append(", gar62=").append(gar62);
        sb.append(", gar63=").append(gar63);
        sb.append(", gar64=").append(gar64);
        sb.append(", gar65=").append(gar65);
        sb.append(", gar66=").append(gar66);
        sb.append(", ghe01=").append(ghe01);
        sb.append(", ghe02=").append(ghe02);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}