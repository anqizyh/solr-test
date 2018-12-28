package com.sbsn.solrtest.dao;

import com.sbsn.solrtest.util.SolrClientUtil;

public class SolrMemberDao extends SolrDao{
	
	public SolrMemberDao() {
		// 回复的core连接
		this.setReadSolrServer(SolrClientUtil.getReadServer());
		this.setWriteSolrServer(SolrClientUtil.getWriteServer());
	}
}
