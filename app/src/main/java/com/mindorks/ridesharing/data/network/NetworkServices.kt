package com.mindorks.ridesharing.data.network

import com.mindorks.ridesharing.simulator.WebSocket
import com.mindorks.ridesharing.simulator.WebSocketListener

class NetworkServices {

    fun createWebSocket(webSocketListener : WebSocketListener) : WebSocket{
        return WebSocket(webSocketListener)
    }
}