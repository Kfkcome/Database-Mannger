package swine_search.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * @TableName genome
 */
@TableName(value ="genome")
@Data
public class Genome implements Serializable {
    private Integer genomeId;

    private String genomeName;

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
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", genomeId=").append(genomeId);
        sb.append(", genomeName=").append(genomeName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}