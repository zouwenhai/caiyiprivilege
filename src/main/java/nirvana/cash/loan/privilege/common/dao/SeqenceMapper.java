package nirvana.cash.loan.privilege.common.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface SeqenceMapper {
	@Select("select ${seqName}.nextval from dual")
	Long getSequence(@Param("seqName") String seqName);
}
