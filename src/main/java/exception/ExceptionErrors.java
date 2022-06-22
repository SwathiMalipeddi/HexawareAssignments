package exception;

public enum ExceptionErrors {
    ERROR_CODE_401(401,"You are not authorized"),
    ERROR_CODE_404(404, "resource not found");

    int errorCode;
    String message;

    ExceptionErrors(int code, String errorMessage) {
        this.errorCode = code;
        this.message = errorMessage;
    }

    public static String getErrorMessageByCode(int code){
        String message= null;
        for(ExceptionErrors error :values()){
            if(error.getErrorCode() == code) {
                message = error.getMessage();
                break;
            }
        }
        return message;
    }

    public int getErrorCode() {
        return errorCode;
    }
    public String getMessage() {
        return message;
    }

}
