package com.mission.shop.user.dao.mapper;

import com.mission.shop.user.dao.model.UserRank;
import com.mission.shop.user.dao.model.UserRankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRankMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_rank
	 * @mbggenerated  Sat Aug 09 20:52:02 CST 2014
	 */
	int countByExample(UserRankExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_rank
	 * @mbggenerated  Sat Aug 09 20:52:02 CST 2014
	 */
	int deleteByExample(UserRankExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_rank
	 * @mbggenerated  Sat Aug 09 20:52:02 CST 2014
	 */
	int deleteByPrimaryKey(Integer rankId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_rank
	 * @mbggenerated  Sat Aug 09 20:52:02 CST 2014
	 */
	int insert(UserRank record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_rank
	 * @mbggenerated  Sat Aug 09 20:52:02 CST 2014
	 */
	int insertSelective(UserRank record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_rank
	 * @mbggenerated  Sat Aug 09 20:52:02 CST 2014
	 */
	List<UserRank> selectByExample(UserRankExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_rank
	 * @mbggenerated  Sat Aug 09 20:52:02 CST 2014
	 */
	UserRank selectByPrimaryKey(Integer rankId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_rank
	 * @mbggenerated  Sat Aug 09 20:52:02 CST 2014
	 */
	int updateByExampleSelective(@Param("record") UserRank record,
			@Param("example") UserRankExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_rank
	 * @mbggenerated  Sat Aug 09 20:52:02 CST 2014
	 */
	int updateByExample(@Param("record") UserRank record,
			@Param("example") UserRankExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_rank
	 * @mbggenerated  Sat Aug 09 20:52:02 CST 2014
	 */
	int updateByPrimaryKeySelective(UserRank record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_rank
	 * @mbggenerated  Sat Aug 09 20:52:02 CST 2014
	 */
	int updateByPrimaryKey(UserRank record);
}