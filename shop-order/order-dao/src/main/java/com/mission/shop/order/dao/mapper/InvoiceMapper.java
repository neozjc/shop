package com.mission.shop.order.dao.mapper;

import com.mission.shop.order.dao.model.Invoice;
import com.mission.shop.order.dao.model.InvoiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InvoiceMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table invoice
	 * @mbggenerated  Mon Jul 28 13:52:51 CST 2014
	 */
	int countByExample(InvoiceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table invoice
	 * @mbggenerated  Mon Jul 28 13:52:51 CST 2014
	 */
	int deleteByExample(InvoiceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table invoice
	 * @mbggenerated  Mon Jul 28 13:52:51 CST 2014
	 */
	int deleteByPrimaryKey(Long invoiceId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table invoice
	 * @mbggenerated  Mon Jul 28 13:52:51 CST 2014
	 */
	int insert(Invoice record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table invoice
	 * @mbggenerated  Mon Jul 28 13:52:51 CST 2014
	 */
	int insertSelective(Invoice record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table invoice
	 * @mbggenerated  Mon Jul 28 13:52:51 CST 2014
	 */
	List<Invoice> selectByExample(InvoiceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table invoice
	 * @mbggenerated  Mon Jul 28 13:52:51 CST 2014
	 */
	Invoice selectByPrimaryKey(Long invoiceId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table invoice
	 * @mbggenerated  Mon Jul 28 13:52:51 CST 2014
	 */
	int updateByExampleSelective(@Param("record") Invoice record,
			@Param("example") InvoiceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table invoice
	 * @mbggenerated  Mon Jul 28 13:52:51 CST 2014
	 */
	int updateByExample(@Param("record") Invoice record,
			@Param("example") InvoiceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table invoice
	 * @mbggenerated  Mon Jul 28 13:52:51 CST 2014
	 */
	int updateByPrimaryKeySelective(Invoice record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table invoice
	 * @mbggenerated  Mon Jul 28 13:52:51 CST 2014
	 */
	int updateByPrimaryKey(Invoice record);
}