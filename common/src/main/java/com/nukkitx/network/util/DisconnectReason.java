package com.nukkitx.network.util;

public enum DisconnectReason {
    CLOSED_BY_REMOTE_PEER,
    SHUTTING_DOWN,
    DISCONNECTED,
    TIMEOUT,
    CONNECTION_REQUEST_FAILED,
    ALREADY_CONNECTED,
    NO_FREE_INCOMING_CONNECTIONS,
    INCOMPATIBLE_PROTOCOL_VERSION,
    IP_RECENTLY_CONNECTED
}
