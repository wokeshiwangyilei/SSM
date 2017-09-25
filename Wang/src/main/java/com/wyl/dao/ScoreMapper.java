package com.wyl.dao;

import com.wyl.beans.Score;
import com.wyl.beans.ScoreKey;

public interface ScoreMapper {
    int deleteByPrimaryKey(ScoreKey key);

    int insert(Score record);

    int insertSelective(Score record);

    Score selectByPrimaryKey(ScoreKey key);

    int updateByPrimaryKeySelective(Score record);

    int updateByPrimaryKey(Score record);
}