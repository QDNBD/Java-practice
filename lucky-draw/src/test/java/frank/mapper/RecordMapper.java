package frank.mapper;

import frank.base.BaseMapper;
import frank.model.Record;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RecordMapper extends BaseMapper<Record> {
}