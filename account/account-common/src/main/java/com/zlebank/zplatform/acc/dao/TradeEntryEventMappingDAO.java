package com.zlebank.zplatform.acc.dao;

import java.util.List;

import com.zlebank.zplatform.acc.pojo.PojoTradeEntryEventMapping;
import com.zlebank.zplatform.member.commons.dao.BaseDAO;
/**
 * 
 * TODO
 *
 * @author yangying
 * @version
 * @date 2016年5月9日 下午5:59:11
 * @since
 */
public interface TradeEntryEventMappingDAO extends BaseDAO<PojoTradeEntryEventMapping>{
    /**
     * TODO
     * @return
     */
    List<PojoTradeEntryEventMapping> queryAll();
    
    void save(PojoTradeEntryEventMapping tradeEntryEventMapping);
}
