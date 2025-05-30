package cn.iocoder.yudao.module.ai.dal.dataobject.chat;

import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@TableName("ai_chat_conversation")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AiChatConversationDO extends BaseDO {
    public static final String TITLE_DEFAULT = "新对话";

    /**
     * ID 编号，自增
     */
    @TableId
    private Long id;

    /**
     * 用户编号
     *
     * 关联 AdminUserDO 的 userId 字段
     */
    private Long userId;

    /**
     * 对话标题
     *
     * 默认由系统自动生成，可用户手动修改
     */
    private String title;
    /**
     * 是否置顶
     */
    private Boolean pinned;
    /**
     * 置顶时间
     */
    private LocalDateTime pinnedTime;

    /**
     * 角色编号
     *
     * 关联 {@link AiChatRoleDO#getId()}
     */
    private Long roleId;

    /**
     * 模型编号
     *
     * 关联 {@link AiModelDO#getId()} 字段
     */
    private Long modelId;
    /**
     * 模型标志
     *
     * 冗余 {@link AiModelDO#getModel()} 字段
     */
    private String model;

    // ========== 对话配置 ==========

    /**
     * 角色设定
     */
    private String systemMessage;
    /**
     * 温度参数
     *
     * 用于调整生成回复的随机性和多样性程度：较低的温度值会使输出更收敛于高频词汇，较高的则增加多样性
     */
    private Double temperature;
    /**
     * 单条回复的最大 Token 数量
     */
    private Integer maxTokens;
    /**
     * 上下文的最大 Message 数量
     */
    private Integer maxContexts;

}
