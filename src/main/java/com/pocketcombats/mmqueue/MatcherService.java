package com.pocketcombats.mmqueue;

import java.io.Serializable;

public interface MatcherService<ID extends Serializable, T extends Request<ID>> {

    void match();
}
