package Nov.ex_14112024_Static_Wrapper_Exceptions;

public enum APIConstantsEndpoints {

    GET_ALL_STUDENTS("https://www.google.com/"),
    GET_STUDENT("https://www.google.com/");

    private final String endpoint;

    APIConstantsEndpoints(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getEndpoint() {
        return endpoint;
    }
}

