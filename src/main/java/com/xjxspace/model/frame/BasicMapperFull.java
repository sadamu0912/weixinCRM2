package com.xjxspace.model.frame;

import java.util.List;
import java.util.Map;

public interface BasicMapper<T> {
	List<T> getListByCondition(Map<String,Object> params);
}
