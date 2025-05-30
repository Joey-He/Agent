package cn.iocoder.yudao.module.ai.dal.mysql.model;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.module.ai.controller.admin.model.vo.apikey.AiApiKeyPageReqVO;
import cn.iocoder.yudao.module.ai.dal.dataobject.model.AiApiKeyDO;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AiApiKeyMapper extends BaseMapperX<AiApiKeyDO> {

    default PageResult<AiApiKeyDO> selectPage(AiApiKeyPageReqVO pageReqVO) {
            return selectPage(pageReqVO, new LambdaQueryWrapperX<AiApiKeyDO>()
                    .likeIfPresent(AiApiKeyDO::getName, pageReqVO.getName())
                    .eqIfPresent(AiApiKeyDO::getPlatform, pageReqVO.getPlatform())
                    .eqIfPresent(AiApiKeyDO::getStatus, pageReqVO.getStatus())
                    .orderByDesc(AiApiKeyDO::getId));
    }
}
