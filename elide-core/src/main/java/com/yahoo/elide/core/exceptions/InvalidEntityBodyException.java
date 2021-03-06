/*
 * Copyright 2015, Yahoo Inc.
 * Licensed under the Apache License, Version 2.0
 * See LICENSE file in project root for terms.
 */
package com.yahoo.elide.core.exceptions;
import com.yahoo.elide.core.HttpStatus;

/**
 * Requested object ID is.
 *
 * {@link com.yahoo.elide.core.HttpStatus#SC_BAD_REQUEST invalid}
 */
public class InvalidEntityBodyException extends HttpStatusException {
    private static final long serialVersionUID = 1L;

    public InvalidEntityBodyException(String body) {
        super("Bad Request Body'" + body + "'");
    }

    @Override
    public int getStatus() {
        return HttpStatus.SC_BAD_REQUEST;
    }
}
