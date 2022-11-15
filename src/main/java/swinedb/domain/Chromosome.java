package swinedb.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * @TableName chromosome
 */
@TableName(value ="chromosome")
@Data
public class Chromosome implements Serializable {
    private Integer chrId;

    private String chrNum;

    @TableField("chr_sourse")
    private String chrSource;

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
        Chromosome other = (Chromosome) that;
        return (this.getChrId() == null ? other.getChrId() == null : this.getChrId().equals(other.getChrId()))
            && (this.getChrNum() == null ? other.getChrNum() == null : this.getChrNum().equals(other.getChrNum()))
            && (this.getChrSource() == null ? other.getChrSource() == null : this.getChrSource().equals(other.getChrSource()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getChrId() == null) ? 0 : getChrId().hashCode());
        result = prime * result + ((getChrNum() == null) ? 0 : getChrNum().hashCode());
        result = prime * result + ((getChrSource() == null) ? 0 : getChrSource().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", chrId=").append(chrId);
        sb.append(", chrNum=").append(chrNum);
        sb.append(", chrSourse=").append(chrSource);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}