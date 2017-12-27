package gzfzkj.dao;

import gzfzkj.model.T_help;

public interface T_helpMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(T_help record);

    int insertSelective(T_help record);

    T_help selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(T_help record);

    int updateByPrimaryKeyWithBLOBs(T_help record);

    int updateByPrimaryKey(T_help record);
}