/*
 * Copyright (c) 2019 Chris Newland.
 * Licensed under https://github.com/chriswhocodes/JaCoLine/blob/master/LICENSE
 */
package com.chrisnewland.jacoline.web.service.form.report;

public class ReportRow
{
	private String[] columns;

	public ReportRow(int columnCount)
	{
		this.columns = new String[columnCount];
	}

	public void setColumn(int column, String value)
	{
		this.columns[column] = value;
	}

	public String[] getColumns()
	{
		return  columns;
	}

	@Override public String toString()
	{
		StringBuilder builder = new StringBuilder();

		for (String col : columns)
		{
			builder.append('[').append(col).append(']');
		}

		return builder.toString();
	}
}