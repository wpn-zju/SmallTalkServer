package com.smalltalknow.service.message;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.smalltalknow.service.controller.websocket.ClientConstant;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor(onConstructor = @__(@JsonCreator))
public class WebRTCCallMessage {
    @JsonProperty(ClientConstant.CHAT_WEBRTC_CALL_COMMAND)
    private final String command;
    @JsonProperty(ClientConstant.CHAT_WEBRTC_CALL_CHANNEL)
    private final String channel;
    @JsonProperty(ClientConstant.CHAT_WEBRTC_CALL_PAYLOAD)
    private final String payload;
}
