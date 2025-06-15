package cn.iocoder.yudao.module.ai.service.model;


import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.module.ai.controller.admin.model.vo.apikey.AiApiKeyPageReqVO;
import cn.iocoder.yudao.module.ai.controller.admin.model.vo.apikey.AiApiKeySaveReqVO;
import cn.iocoder.yudao.module.ai.dal.dataobject.model.AiApiKeyDO;
import jakarta.validation.Valid;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * AI API 密钥 Service 接口
 */
public interface AiApiKeyService {

    /**
     * 创建 API 密钥
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createApiKey(@Valid AiApiKeySaveReqVO createReqVO);
    /**
     * 获得 API 密钥分页
     *
     * @param pageReqVO 分页查询
     * @return API 密钥分页
     */
    PageResult<AiApiKeyDO> getApiKeyPage( AiApiKeyPageReqVO pageReqVO);
    /**
     * 获得 API 密钥
     *
     * @param id 编号
     * @return API 密钥
     */
    AiApiKeyDO getApiKey(Long id);

    /**
     * 更新 API 密钥
     *
     * @param updateReqVO 更新信息
     */
    void updateApiKey(AiApiKeySaveReqVO updateReqVO);

    /**
     * 删除 API 密钥
     * @param id
     */
    void deleteApiKey(Long id);

    /**
     * 获得 API 密钥分页列表
     * @return
     */
    List<AiApiKeyDO> getApiKeyList();
}