package swinedb.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author yue
 * @Date 2022/10/28 16:35
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseResult {
    private String code;

    private String message;
    private Object data;

    public static ResponseResult success() {
        return new ResponseResult(ResponseResultCode.SUCCESS.getCode(), ResponseResultCode.SUCCESS.getMessage(),null);
    }

    public static ResponseResult success(Object data) {
        return new ResponseResult(ResponseResultCode.SUCCESS.getCode(), ResponseResultCode.SUCCESS.getMessage(),data);
    }

    public static ResponseResult error(String code,String message) {
        return new ResponseResult(code,message,null);
    }
}
