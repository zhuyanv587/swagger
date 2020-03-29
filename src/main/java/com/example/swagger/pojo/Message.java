package com.example.swagger.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "消息对象")
public class Message {
    @ApiModelProperty(notes = "消息ID",name = "id",required = true,dataType = "Long")
    private Long id;
    @ApiModelProperty(notes = "正文",name = "text",required = true,dataType = "String")
    private String text;
    @ApiModelProperty(notes = "摘要",name = "summary",required = true)
    private String summary;
}
