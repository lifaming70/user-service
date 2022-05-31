package com.lcput.outlook.userservice.util;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DataResult {

    private String code;

    private Object data;

    private String mgs;

    /*
    *有数据成功
    * */
    public static DataResult success(Object data) {
        return DataResult.builder().code("200").data(data).mgs("SUCCESS").build();
    }

    /*
     *无数据成功
     * */
    public static DataResult success() {
        return DataResult.builder().code("200").mgs("SUCCESS").build();
    }

    //失败
    public static DataResult fail(){

        return DataResult.builder().code("400").mgs("error").build();
    }

    // 自定义code和msg
    public static DataResult success(String code,String msg,Object data){
        return DataResult.builder().code(code).mgs(msg).data(data).build();
    }

    public static DataResult success(String data){
        return DataResult.builder().code("200").data(data).mgs("SUCCESS").build();
    }
    // 自定义code和msg
    public static DataResult fail(String msg){

        return DataResult.builder().code("400").mgs(msg).build();
    }
}
