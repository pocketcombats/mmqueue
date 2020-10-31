package com.pocketcombats.mmqueue;

import java.io.Serializable;

/**
 * Immutable game request.
 *
 * @param <ID> id type
 */
public interface Request<ID extends Serializable> extends Serializable {

    ID getPlayerId();
}
