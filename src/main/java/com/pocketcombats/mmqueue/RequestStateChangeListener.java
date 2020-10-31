package com.pocketcombats.mmqueue;

import java.io.Serializable;

@FunctionalInterface
public interface RequestStateChangeListener<ID extends Serializable, R extends Request<ID>> {

    void onRequestStateChanged(R request, RequestState state);
}
