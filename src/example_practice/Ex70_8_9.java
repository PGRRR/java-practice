package example_practice;

public class Ex70_8_9 {
    public static void main(String[] args) throws Exception {
        throw new UnsupportedFunctionException("지원하지 않는 기능",100);
    }
}

class UnsupportedFunctionException extends RuntimeException {
    private int ERR_CODE = 100;

    UnsupportedFunctionException(String msg, int errCode) {
        super(msg);
        ERR_CODE = errCode;
    }

    UnsupportedFunctionException(String msg) {
        this(msg, 100);
    }
    public int getErrorCode() {
        return ERR_CODE;
    }
    public String getMessage() {
        return getErrorCode() + super.getMessage();
    }

}