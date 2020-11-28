package com.smalltalknow.service.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.smalltalknow.service.controller.websocket.ClientConstant;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ContactAddRequestMessage {
    @JsonProperty(ClientConstant.CHAT_CONTACT_ADD_REQUEST_CONTACT_EMAIL)
    private final String contactEmail;
}
