package com.t.s.model.biz;

import com.t.s.model.dto.GroupUserDto;

public interface GroupUserBiz {
	
	public GroupUserDto selGroupnoGroupuser(GroupUserDto dto);
	
	public int groupInUser(GroupUserDto groupuserdto);
	public int groupOutUser(GroupUserDto groupuserdto);
	
}
