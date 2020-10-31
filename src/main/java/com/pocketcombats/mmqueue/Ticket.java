package com.pocketcombats.mmqueue;

import java.io.Serializable;

public final class Ticket<ID extends Serializable, R extends Request<ID>> implements Serializable {

    private final R request;
    private RequestState state;

    public Ticket(R request) {
        this.request = request;
    }

    public R getRequest() {
        return request;
    }

    public RequestState getState() {
        return state;
    }

    /* package */ void setState(RequestState state) {
        this.state = state;
    }
}
