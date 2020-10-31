package com.pocketcombats.mmqueue;

import java.io.Serializable;

public interface QueueService<ID extends Serializable, R extends Request<ID>> {

    boolean add(R request);

    void cancel(ID playerId);

    void confirm(ID playerId);

    void addRequestStateChangeListener(RequestStateChangeListener<ID, R> listener);
}
