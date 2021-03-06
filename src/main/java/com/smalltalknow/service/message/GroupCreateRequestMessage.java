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
public class GroupCreateRequestMessage {
    @JsonProperty(ClientConstant.CHAT_GROUP_CREATE_REQUEST_GROUP_NAME)
    private final String groupName;
    @JsonProperty(ClientConstant.CHAT_GROUP_CREATE_REQUEST_MEMBER_LIST)
    private final String memberList;
}
