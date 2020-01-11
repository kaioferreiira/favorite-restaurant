package br.com.favoriterestaurant.business.utils;

import java.util.Arrays;
import java.util.Objects;

public abstract class ValidationUtils {

    public static boolean isParametrosInvalidos(Object... params) {
        return Arrays.stream(params).anyMatch(Objects::isNull);
    }

}
