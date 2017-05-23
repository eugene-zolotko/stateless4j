package com.github.oxo42.stateless4j.helpers;

import com.github.oxo42.stateless4j.delegates.Func2;

/**
 * A test guard that accepts 3 arguments and evaluates to {@code true} if provided params have the following values:
 * an {@link Integer} of 123, "abc" {@link String} and {@link Boolean} true.
 */
public class TestGuardWithParams implements Func2<Object[], Boolean> {

    @Override
    public Boolean call(Object[] args) {
        int firstArg = (int) args[0];
        String secondArg = (String) args[1];
        boolean thirdArg = (boolean) args[2];
        return firstArg == 123 && "abc".equals(secondArg) && thirdArg;
    }
}
