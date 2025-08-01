package cn.iocoder.yudao.module.ai.service.model.tool.controller.admin.model.vo.apikey;

import cn.iocoder.yudao.framework.common.pojo.PageParam;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(description = "管理后台 - AI API 密钥分页 Request VO")
@Data
public class AiApiKeyPageReqVO extends PageParam {

    @Schema(description = "名称", example = "文心一言")
    private String name;

    @Schema(description = "平台", example = "OpenAI")
    private String platform;

    @Schema(description = "状态", example = "1")
    private Integer status;

}