package bank.common;

import static bank.common.ExceptionMessages.CLIENT_NAME_CANNOT_BE_NULL_OR_EMPTY;

public class StringUtils {

    private StringUtils(){

    }
    public static boolean nullOrEmpty(String name) {
        return name == null || name.trim().isBlank();
    }
}
