package com.jin.domain;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
public class Criteria
{
	private int page;
	private int perPageNum;
	private int rowStart;
	private int rowEnd;
	
	public Criteria()
	{
		this.page = 1;
		this.perPageNum = 10;
	}

	public void setPage(int page)
	{
		if (page <= 0)
		{ 
			this.page = 1;
			return;
		}
		this.page = page;
	}

	public void setPerPageNum(int perPageNum)
	{
		if (perPageNum <= 0 || perPageNum > 100)
		{
			this.perPageNum = 10;
			return;
		}
		this.perPageNum = perPageNum;
	}

	public int getPage()
	{
		return page;
	}

	public int getPageStart()
	{ 
		return (this.page - 1) * perPageNum;
	}

	public int getPerPageNum()
	{
		return this.perPageNum;
	}

	@Override
	public String toString() {
		return "Criteria [page=" + page + ", perPageNum=" + perPageNum + ""
				+ ", rowStart=" +  getRowStart() + ", rowEnd=" + getRowEnd()
				+ "]";
	} 

	public int getRowStart() {
		rowStart = ((page - 1) * perPageNum) + 1;
		return rowStart;
	}

	public int getRowEnd() {
		rowEnd = rowStart + perPageNum - 1;
		return rowEnd;
	}
}
