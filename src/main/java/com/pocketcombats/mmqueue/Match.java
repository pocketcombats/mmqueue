package com.pocketcombats.mmqueue;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public final class Match<ID extends Serializable, R extends Request<ID>> {

    private final Collection<Ticket<ID, R>> tickets;

    public Match(Collection<Ticket<ID, R>> tickets) {
        this.tickets = tickets;
    }

    public Collection<R> getRequests() {
        return tickets.stream()
                .map(Ticket::getRequest)
                .collect(Collectors.toList());
    }

    public Collection<Ticket<ID, R>> getTickets() {
        return Collections.unmodifiableCollection(tickets);
    }
}
