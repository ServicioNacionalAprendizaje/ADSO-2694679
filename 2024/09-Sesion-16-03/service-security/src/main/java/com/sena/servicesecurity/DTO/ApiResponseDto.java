package com.sena.servicesecurity.DTO;

/**
 * This class represents a generic API response.
 * @param <T> The type of data contained in the response.
 */
public class ApiResponseDto<T> {
    
    private Boolean status;
    private T data;
    private String message;
    
    /**
     * Default constructor.
     */
    public ApiResponseDto() {
    }

    /**
     * Constructs an ApiResponseDto with the given parameters.
     * @param message The message describing the response.
     * @param data The data contained in the response.
     * @param status The status of the response.
     */
    public ApiResponseDto(String message, T data, Boolean status) {
        this.message = message;
        this.data = data;
        this.status = status;
    }

    /**
     * Retrieves the status of the response.
     * @return The status of the response.
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * Sets the status of the response.
     * @param status The status of the response.
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * Retrieves the data contained in the response.
     * @return The data contained in the response.
     */
    public T getData() {
        return data;
    }

    /**
     * Sets the data contained in the response.
     * @param data The data contained in the response.
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * Retrieves the message describing the response.
     * @return The message describing the response.
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the message describing the response.
     * @param message The message describing the response.
     */
    public void setMessage(String message) {
        this.message = message;
    }
}