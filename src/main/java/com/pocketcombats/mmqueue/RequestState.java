package com.pocketcombats.mmqueue;

public enum RequestState {

    /**
     * Active Request.
     */
    MATCHING,

    /**
     * Game was found, confirmation required in order to start a Game.
     */
    CONFIRMATION_REQUIRED,

    /**
     * Participation confirmed.
     * Once all matched Requests will get into this state, Game will be started.
     */
    READY,

    /**
     * Game failed to started.
     * Some of the Players failed to confirm their participation.
     */
    FAIL
}
