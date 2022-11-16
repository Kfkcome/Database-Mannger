package swine_search.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @TableName transcript
 */
@TableName(value ="transcript")
@Data
public class Transcript implements Serializable {
    private String transId;

    private String geneId;

    private Integer transStart;

    private Integer transEnd;

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
        Transcript other = (Transcript) that;
        return (this.getTransId() == null ? other.getTransId() == null : this.getTransId().equals(other.getTransId()))
            && (this.getGeneId() == null ? other.getGeneId() == null : this.getGeneId().equals(other.getGeneId()))
            && (this.getTransStart() == null ? other.getTransStart() == null : this.getTransStart().equals(other.getTransStart()))
            && (this.getTransEnd() == null ? other.getTransEnd() == null : this.getTransEnd().equals(other.getTransEnd()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTransId() == null) ? 0 : getTransId().hashCode());
        result = prime * result + ((getGeneId() == null) ? 0 : getGeneId().hashCode());
        result = prime * result + ((getTransStart() == null) ? 0 : getTransStart().hashCode());
        result = prime * result + ((getTransEnd() == null) ? 0 : getTransEnd().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", transId=").append(transId);
        sb.append(", geneId=").append(geneId);
        sb.append(", transStart=").append(transStart);
        sb.append(", transEnd=").append(transEnd);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}