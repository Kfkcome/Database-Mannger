package com.example.swinedatebaseproject.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName GENE_pav_J_1
 */
@TableName(value ="GENE_pav_J_1")
@Data
public class GenePavJ1 implements Serializable {
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
    @TableField(value = "J100")
    private String j100;

    /**
     * 
     */
    @TableField(value = "J101")
    private String j101;

    /**
     * 
     */
    @TableField(value = "J102_1")
    private String j1021;

    /**
     * 
     */
    @TableField(value = "J102")
    private String j102;

    /**
     * 
     */
    @TableField(value = "J103")
    private String j103;

    /**
     * 
     */
    @TableField(value = "J104")
    private String j104;

    /**
     * 
     */
    @TableField(value = "J105")
    private String j105;

    /**
     * 
     */
    @TableField(value = "J106")
    private String j106;

    /**
     * 
     */
    @TableField(value = "J107")
    private String j107;

    /**
     * 
     */
    @TableField(value = "J108")
    private String j108;

    /**
     * 
     */
    @TableField(value = "J109")
    private String j109;

    /**
     * 
     */
    @TableField(value = "J10")
    private String j10;

    /**
     * 
     */
    @TableField(value = "J110")
    private String j110;

    /**
     * 
     */
    @TableField(value = "J111")
    private String j111;

    /**
     * 
     */
    @TableField(value = "J112")
    private String j112;

    /**
     * 
     */
    @TableField(value = "J113")
    private String j113;

    /**
     * 
     */
    @TableField(value = "J114")
    private String j114;

    /**
     * 
     */
    @TableField(value = "J115")
    private String j115;

    /**
     * 
     */
    @TableField(value = "J116")
    private String j116;

    /**
     * 
     */
    @TableField(value = "J117")
    private String j117;

    /**
     * 
     */
    @TableField(value = "J118")
    private String j118;

    /**
     * 
     */
    @TableField(value = "J119")
    private String j119;

    /**
     * 
     */
    @TableField(value = "J11")
    private String j11;

    /**
     * 
     */
    @TableField(value = "J18")
    private String j18;

    /**
     * 
     */
    @TableField(value = "J191")
    private String j191;

    /**
     * 
     */
    @TableField(value = "J192")
    private String j192;

    /**
     * 
     */
    @TableField(value = "J193")
    private String j193;

    /**
     * 
     */
    @TableField(value = "J194")
    private String j194;

    /**
     * 
     */
    @TableField(value = "J195")
    private String j195;

    /**
     * 
     */
    @TableField(value = "J196_1")
    private String j1961;

    /**
     * 
     */
    @TableField(value = "J196_2")
    private String j1962;

    /**
     * 
     */
    @TableField(value = "J197")
    private String j197;

    /**
     * 
     */
    @TableField(value = "J198")
    private String j198;

    /**
     * 
     */
    @TableField(value = "J199")
    private String j199;

    /**
     * 
     */
    @TableField(value = "J19")
    private String j19;

    /**
     * 
     */
    @TableField(value = "J1")
    private String j1;

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
        GenePavJ1 other = (GenePavJ1) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPos() == null ? other.getPos() == null : this.getPos().equals(other.getPos()))
            && (this.getGene() == null ? other.getGene() == null : this.getGene().equals(other.getGene()))
            && (this.getJ100() == null ? other.getJ100() == null : this.getJ100().equals(other.getJ100()))
            && (this.getJ101() == null ? other.getJ101() == null : this.getJ101().equals(other.getJ101()))
            && (this.getJ1021() == null ? other.getJ1021() == null : this.getJ1021().equals(other.getJ1021()))
            && (this.getJ102() == null ? other.getJ102() == null : this.getJ102().equals(other.getJ102()))
            && (this.getJ103() == null ? other.getJ103() == null : this.getJ103().equals(other.getJ103()))
            && (this.getJ104() == null ? other.getJ104() == null : this.getJ104().equals(other.getJ104()))
            && (this.getJ105() == null ? other.getJ105() == null : this.getJ105().equals(other.getJ105()))
            && (this.getJ106() == null ? other.getJ106() == null : this.getJ106().equals(other.getJ106()))
            && (this.getJ107() == null ? other.getJ107() == null : this.getJ107().equals(other.getJ107()))
            && (this.getJ108() == null ? other.getJ108() == null : this.getJ108().equals(other.getJ108()))
            && (this.getJ109() == null ? other.getJ109() == null : this.getJ109().equals(other.getJ109()))
            && (this.getJ10() == null ? other.getJ10() == null : this.getJ10().equals(other.getJ10()))
            && (this.getJ110() == null ? other.getJ110() == null : this.getJ110().equals(other.getJ110()))
            && (this.getJ111() == null ? other.getJ111() == null : this.getJ111().equals(other.getJ111()))
            && (this.getJ112() == null ? other.getJ112() == null : this.getJ112().equals(other.getJ112()))
            && (this.getJ113() == null ? other.getJ113() == null : this.getJ113().equals(other.getJ113()))
            && (this.getJ114() == null ? other.getJ114() == null : this.getJ114().equals(other.getJ114()))
            && (this.getJ115() == null ? other.getJ115() == null : this.getJ115().equals(other.getJ115()))
            && (this.getJ116() == null ? other.getJ116() == null : this.getJ116().equals(other.getJ116()))
            && (this.getJ117() == null ? other.getJ117() == null : this.getJ117().equals(other.getJ117()))
            && (this.getJ118() == null ? other.getJ118() == null : this.getJ118().equals(other.getJ118()))
            && (this.getJ119() == null ? other.getJ119() == null : this.getJ119().equals(other.getJ119()))
            && (this.getJ11() == null ? other.getJ11() == null : this.getJ11().equals(other.getJ11()))
            && (this.getJ18() == null ? other.getJ18() == null : this.getJ18().equals(other.getJ18()))
            && (this.getJ191() == null ? other.getJ191() == null : this.getJ191().equals(other.getJ191()))
            && (this.getJ192() == null ? other.getJ192() == null : this.getJ192().equals(other.getJ192()))
            && (this.getJ193() == null ? other.getJ193() == null : this.getJ193().equals(other.getJ193()))
            && (this.getJ194() == null ? other.getJ194() == null : this.getJ194().equals(other.getJ194()))
            && (this.getJ195() == null ? other.getJ195() == null : this.getJ195().equals(other.getJ195()))
            && (this.getJ1961() == null ? other.getJ1961() == null : this.getJ1961().equals(other.getJ1961()))
            && (this.getJ1962() == null ? other.getJ1962() == null : this.getJ1962().equals(other.getJ1962()))
            && (this.getJ197() == null ? other.getJ197() == null : this.getJ197().equals(other.getJ197()))
            && (this.getJ198() == null ? other.getJ198() == null : this.getJ198().equals(other.getJ198()))
            && (this.getJ199() == null ? other.getJ199() == null : this.getJ199().equals(other.getJ199()))
            && (this.getJ19() == null ? other.getJ19() == null : this.getJ19().equals(other.getJ19()))
            && (this.getJ1() == null ? other.getJ1() == null : this.getJ1().equals(other.getJ1()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPos() == null) ? 0 : getPos().hashCode());
        result = prime * result + ((getGene() == null) ? 0 : getGene().hashCode());
        result = prime * result + ((getJ100() == null) ? 0 : getJ100().hashCode());
        result = prime * result + ((getJ101() == null) ? 0 : getJ101().hashCode());
        result = prime * result + ((getJ1021() == null) ? 0 : getJ1021().hashCode());
        result = prime * result + ((getJ102() == null) ? 0 : getJ102().hashCode());
        result = prime * result + ((getJ103() == null) ? 0 : getJ103().hashCode());
        result = prime * result + ((getJ104() == null) ? 0 : getJ104().hashCode());
        result = prime * result + ((getJ105() == null) ? 0 : getJ105().hashCode());
        result = prime * result + ((getJ106() == null) ? 0 : getJ106().hashCode());
        result = prime * result + ((getJ107() == null) ? 0 : getJ107().hashCode());
        result = prime * result + ((getJ108() == null) ? 0 : getJ108().hashCode());
        result = prime * result + ((getJ109() == null) ? 0 : getJ109().hashCode());
        result = prime * result + ((getJ10() == null) ? 0 : getJ10().hashCode());
        result = prime * result + ((getJ110() == null) ? 0 : getJ110().hashCode());
        result = prime * result + ((getJ111() == null) ? 0 : getJ111().hashCode());
        result = prime * result + ((getJ112() == null) ? 0 : getJ112().hashCode());
        result = prime * result + ((getJ113() == null) ? 0 : getJ113().hashCode());
        result = prime * result + ((getJ114() == null) ? 0 : getJ114().hashCode());
        result = prime * result + ((getJ115() == null) ? 0 : getJ115().hashCode());
        result = prime * result + ((getJ116() == null) ? 0 : getJ116().hashCode());
        result = prime * result + ((getJ117() == null) ? 0 : getJ117().hashCode());
        result = prime * result + ((getJ118() == null) ? 0 : getJ118().hashCode());
        result = prime * result + ((getJ119() == null) ? 0 : getJ119().hashCode());
        result = prime * result + ((getJ11() == null) ? 0 : getJ11().hashCode());
        result = prime * result + ((getJ18() == null) ? 0 : getJ18().hashCode());
        result = prime * result + ((getJ191() == null) ? 0 : getJ191().hashCode());
        result = prime * result + ((getJ192() == null) ? 0 : getJ192().hashCode());
        result = prime * result + ((getJ193() == null) ? 0 : getJ193().hashCode());
        result = prime * result + ((getJ194() == null) ? 0 : getJ194().hashCode());
        result = prime * result + ((getJ195() == null) ? 0 : getJ195().hashCode());
        result = prime * result + ((getJ1961() == null) ? 0 : getJ1961().hashCode());
        result = prime * result + ((getJ1962() == null) ? 0 : getJ1962().hashCode());
        result = prime * result + ((getJ197() == null) ? 0 : getJ197().hashCode());
        result = prime * result + ((getJ198() == null) ? 0 : getJ198().hashCode());
        result = prime * result + ((getJ199() == null) ? 0 : getJ199().hashCode());
        result = prime * result + ((getJ19() == null) ? 0 : getJ19().hashCode());
        result = prime * result + ((getJ1() == null) ? 0 : getJ1().hashCode());
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
        sb.append(", j100=").append(j100);
        sb.append(", j101=").append(j101);
        sb.append(", j1021=").append(j1021);
        sb.append(", j102=").append(j102);
        sb.append(", j103=").append(j103);
        sb.append(", j104=").append(j104);
        sb.append(", j105=").append(j105);
        sb.append(", j106=").append(j106);
        sb.append(", j107=").append(j107);
        sb.append(", j108=").append(j108);
        sb.append(", j109=").append(j109);
        sb.append(", j10=").append(j10);
        sb.append(", j110=").append(j110);
        sb.append(", j111=").append(j111);
        sb.append(", j112=").append(j112);
        sb.append(", j113=").append(j113);
        sb.append(", j114=").append(j114);
        sb.append(", j115=").append(j115);
        sb.append(", j116=").append(j116);
        sb.append(", j117=").append(j117);
        sb.append(", j118=").append(j118);
        sb.append(", j119=").append(j119);
        sb.append(", j11=").append(j11);
        sb.append(", j18=").append(j18);
        sb.append(", j191=").append(j191);
        sb.append(", j192=").append(j192);
        sb.append(", j193=").append(j193);
        sb.append(", j194=").append(j194);
        sb.append(", j195=").append(j195);
        sb.append(", j1961=").append(j1961);
        sb.append(", j1962=").append(j1962);
        sb.append(", j197=").append(j197);
        sb.append(", j198=").append(j198);
        sb.append(", j199=").append(j199);
        sb.append(", j19=").append(j19);
        sb.append(", j1=").append(j1);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}