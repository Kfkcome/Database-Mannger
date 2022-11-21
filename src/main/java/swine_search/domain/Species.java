package swine_search.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @TableName species
 */
@TableName(value ="species")
@Data
public class Species implements Serializable {
    @TableId
    private Integer speciesId;

    private String speciesName;

    private Integer genomeId;

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
        Species other = (Species) that;
        return (this.getSpeciesId() == null ? other.getSpeciesId() == null : this.getSpeciesId().equals(other.getSpeciesId()))
            && (this.getSpeciesName() == null ? other.getSpeciesName() == null : this.getSpeciesName().equals(other.getSpeciesName()))
            && (this.getGenomeId() == null ? other.getGenomeId() == null : this.getGenomeId().equals(other.getGenomeId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSpeciesId() == null) ? 0 : getSpeciesId().hashCode());
        result = prime * result + ((getSpeciesName() == null) ? 0 : getSpeciesName().hashCode());
        result = prime * result + ((getGenomeId() == null) ? 0 : getGenomeId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", speciesId=").append(speciesId);
        sb.append(", speciesName=").append(speciesName);
        sb.append(", genomeId=").append(genomeId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}