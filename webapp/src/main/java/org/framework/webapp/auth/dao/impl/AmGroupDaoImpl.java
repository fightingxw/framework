package org.framework.webapp.auth.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.framework.webapp.auth.dao.AmGroupDao;
import org.framework.webapp.auth.model.AmGroup;
import org.framework.webapp.base.dao.impl.BaseDaoImpl;
import org.springframework.stereotype.Repository;
@Repository("amGroupDao")
public class AmGroupDaoImpl extends BaseDaoImpl implements AmGroupDao {

	@Override
	public int save(AmGroup amGroup) {
		if(LOG.isDebugEnabled()){
			LOG.debug(">>>>parameter:"+amGroup);
		}
		int result=getSqlSession().insert("org.framework.webapp.auth.mapper.AmGroupMapper.save", amGroup);
		if(LOG.isDebugEnabled()){
			LOG.debug(">>>>result:"+result);
		}
		return result;
	}

	@Override
	public int update(AmGroup amGroup) {
		if(LOG.isDebugEnabled()){
			LOG.debug(">>>>parameter:"+amGroup);
		}
		int result=getSqlSession().update("org.framework.webapp.auth.mapper.AmGroupMapper.update", amGroup);
		if(LOG.isDebugEnabled()){
			LOG.debug(">>>>result:"+result);
		}
		return result;
	}

	@Override
	public int deleteById(String groupId) {
		if(LOG.isDebugEnabled()){
			LOG.debug(">>>>parameter:"+groupId);
		}
		int result=getSqlSession().delete("org.framework.webapp.auth.mapper.AmGroupMapper.deleteById", groupId);
		if(LOG.isDebugEnabled()){
			LOG.debug(">>>>result:"+result);
		}
		return result;
	}

	@Override
	public AmGroup getById(String groupId) {
		if(LOG.isDebugEnabled()){
			LOG.debug(">>>>parameter:"+groupId);
		}
		AmGroup result=getSqlSession().selectOne("org.framework.webapp.auth.mapper.AmGroupMapper.getById", groupId);
		if(LOG.isDebugEnabled()){
			LOG.debug(">>>>result:"+result);
		}
		return result;
	}

	@Override
	public List<AmGroup> getAll() {
		List<AmGroup> result=getSqlSession().selectList("org.framework.webapp.auth.mapper.AmGroupMapper.getAll");
		if(LOG.isDebugEnabled()){
			LOG.debug(">>>>result size:"+(result==null?"null":result.size()));
		}
		
		return result;
	}

	@Override
	public List<AmGroup> getByWhere(String whereSql, String paraKey,
			Map<String, Object> parameters) {
		if(paraKey==null||"".equals(paraKey.trim())) paraKey="parameters";
		Map<String, Object> paraWarp=new HashMap<String, Object>();
		paraWarp.put("whereSql", whereSql);
		paraWarp.put(paraKey, parameters);
		if(LOG.isDebugEnabled()){
			LOG.debug(">>>>parameters warp map:"+parameters);
		}
		List<AmGroup> result=getSqlSession().selectList("org.framework.webapp.auth.mapper.AmGroupMapper.getByWhere",paraWarp);
		if(LOG.isDebugEnabled()){
			LOG.debug(">>>>result size:"+(result==null?"null":result.size()));
		}
		
		return result;
	}
	
	
	
}
