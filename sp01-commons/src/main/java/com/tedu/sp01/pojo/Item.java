package com.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
	//编号
	private Integer id;
	//姓名
	private String name;
	//可能是年龄吧？
	private Integer number;
	
}
