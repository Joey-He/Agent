package cn.iocoder.yudao.module.ai.service.model.tool.controller.admin.music.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Schema(description = "管理后台 - AI 修改我的音乐 Request VO")
@Data
public class AiMusicUpdateMyReqVO {

    @Schema(description = "编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "15583")
    @NotNull(message = "编号不能为空")
    private Long id;

    @Schema(description = "音乐名称", example = "夜空中最亮的星")
    private String title;

}