package com.t.s.model.dao;

import java.util.List;

import com.t.s.domain.SearchCriteria;
import com.t.s.model.dto.GroupDto;

public interface GroupDao {
	
	String NAMESPACE = "onoff.";

	// 그룹 디테일
	public GroupDto selectGroupDetail(int groupno);
	
	// 그룹 생성
	public int insertGroup(GroupDto groupdto);
	// 그룹 생성 후 no 찾기
	public int findGroupNo(String fineImg);
	
	public List<GroupDto> groupSearch_search(SearchCriteria sc);
	public int groupSearch_searchCount(SearchCriteria sc);
	public int groupSearch_listCount();
	
}
