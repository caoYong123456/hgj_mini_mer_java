/**
 * 
 * 上海慧管信息技术服务有限公司
 * Copyright (c) 2020 YunCF,Inc.All Rights Reserved.
 */
package com.ej.hgj.enums;


public enum JiasvBasicRespCode {

    SUCCESS("0000", "交易成功"),
    RESULT_FAILED("0101", "请求失败"),
    DATA_NULL("0001", "请求参数含有空数据"),
    DATA_LENGTH_ERROR("0002", "请求参数长度不正确"),
    FINAL_DATA_NOT_EXIST("0003", "固定数据没有匹配项"),
    DATA_FOMART_MATCH_ERROR("0004", "数据格式不正确"),
    DATA_IS_NULL("0005", "暂无数据"),
    RESULT_UNCERTAIN("0006", "交易结果不确定"),
    INFO_IS_NOT_EXIST("0007","数据信息不存在"),
    WORK_DATE_INFO_NOT_EXIST("0008","工作日信息未配置"),
    QUERY_DATA_IS_NULL("0009", "查询信息为空"),
    KEY_DATA_MISSING("0010", "关键数据缺失"),
    RESULT_PROCESS("0011", "交易处理中"),
    
    FLAWED_SUCCESS("0997", "有缺陷的成功"),
    NETWORK_EXCEPTION("0998", "网络异常，请稍后再试"),
    SYSTEM_EXCEPTION("0999", "系统异常"),
    
    USR_STAT_NOT_IN_NORMAL("1001", "企业状态非正常"),
    USR_CONF_NOT_EXIST("1002", "企业配置数据不存在"),
    USR_WECHAT_PUB_CONF_NOT_EXIST("1003", "企业公众号配置不存在，请联系物业"),
    
    UPD_TYPE_IS_NULL("2001","上传文件类型为空"), 
    UPD_IMAGES_IS_NULL("2002","上传文件未获取到"), 
    GET_HEO_SEQ_ID_FAIL("2003","获取序列号失败"),

    CLOSE_OBJ("2004","标的已经失效"),
    
    /**住户房屋绑定专用返回码范围 3001 ~ 3099 */
    THE_HOUSE_HAS_BEEN_CLAIMED_BY_OTHERS("3001", "房屋已经被其他人认领"),
    HOUSE_INFO_NOT_EXIST("3002", "住房信息不存在，请联系物业"),
    PACK_CODE_IS_BLANK("3003", "验证码未配置，请联系物业"),
    PACK_CODE_IS_ERROR("3004", "验证码错误"),
    OWNER_HOUSE_HAS_NOT_CERTIFIED("3005", "户主住房未绑定"),
    OFFLINE_AUTH_OPEN("3006", "请联系物业扫码开通"),
    BIND_QRCODE_IS_INVALID("3007", "绑定二维码已失效，请重新获取"),
    PROP_AREA_INFO_NOT_EXIST("3008", "区域信息未配置，请联系物业"),
    PROP_BUILDING_INFO_NOT_EXIST("3009", "楼号信息未配置，请联系物业"),
    HOUSE_CLOSE("3010", "房屋被关闭，请联系物业"),
    
    /** 支付 4001 ~ 4999 */
    ORD_AMT_IS_ILLEGAL("4001", "订单金额不合法"),
    NO_SUPPORTED_BUSI_ID("4002", "不支持的业务类型"),
    PAY_HAS_ALREADY_SUCCESS("4003", "订单已经支付成功"),
    
    
    /** 缴费 5001 ~ 5100 */
    PFEE_BASE_INFO_NOT_EXIST("5001", "缴费基础信息缺失"),
    PFEE_START_MON_NOT_EXIST("5002", "物业费账单开始月份信息缺失,请联系物业人员添加"),
    
    /** */
    HU_CHARGED("6001", "暂不支持同一用户多辆车同时充电")
    ;
    
    private String respCode;
    private String respDesc;
    
    private JiasvBasicRespCode(String respCode, String respDesc) {
        this.respCode = respCode;
        this.respDesc = respDesc;
    }

    public String getRespCode() {
        return JiaSubsystem.JIASV.getWholeSystemNo().concat(respCode);
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getRespDesc() {
        return respDesc;
    }

    public void setRespDesc(String respDesc) {
        this.respDesc = respDesc;
    }
}
