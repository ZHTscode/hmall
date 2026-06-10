package com.hmall.api.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "订单明细条目")
public class OrderDetailDTO {
    @ApiModelProperty("商品id")
    private Long itemId;
    @ApiModelProperty("商品购买数量")
    private Integer num;
}
