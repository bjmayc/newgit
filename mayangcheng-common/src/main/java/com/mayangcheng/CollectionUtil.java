package com.mayangcheng;

import java.util.Collection;
import java.util.Map;


/**
 * @author bjmayc
 * 集合工具类
 */
public class CollectionUtil {
	//方法1：判断List或Set集合是否有元素，对象为空或对象中没有元素都算没值 (5分)
	public boolean notEmpty(Collection c){
		//实现代码
		if(c!=null && c.size()>0){
			return true;
		}
		return false;
	}
	
	
	
	//方法2：判断Map集合是否有元素，对象为空或对象中没有元素都算没值
	public boolean notEmpty(Map map){
		// map.isEmpty()//可以使用这个方法 判断
		//实现代码
		if(map!=null && map.size()>0){
			return true;
		}
		return false;
	}
}
