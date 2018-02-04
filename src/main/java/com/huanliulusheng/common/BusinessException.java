package com.huanliulusheng.common;

/**自定义异常
 *
 */
public class BusinessException extends RuntimeException {
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    /**错误码
     */
    private String errorCode;
    
    /**错误描述
     */
    private String errorDesc;
    
    public BusinessException() {
        super();
    }
    
    /**
     * Constructs a new exception with the specified detail message.  The
     * cause is not initialized, and may subsequently be initialized by
     * a call to {@link #initCause}.
     *
     * @param   message   the detail message. The detail message is saved for 
     *          later retrieval by the {@link #getMessage()} method.
     */
    public BusinessException(String message) {
        super(message);
    }
    
    public BusinessException(String errorCode, String errorDesc) {
        super(errorDesc);
    	this.errorCode = errorCode;
    	this.errorDesc = errorDesc;
    }

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDesc() {
		return errorDesc;
	}

	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

}
