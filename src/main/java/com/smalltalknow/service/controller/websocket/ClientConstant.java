package com.smalltalknow.service.controller.websocket;

public final class ClientConstant {
    public static final String API_USER_SIGN_UP = "/system/user_sign_up";
    public static final String API_USER_SIGN_UP_PASSCODE_REQUEST = "/system/user_sign_up_passcode_request";
    public static final String API_USER_RECOVER_PASSWORD = "/system/user_recover_password";
    public static final String API_USER_RECOVER_PASSWORD_PASSCODE_REQUEST = "/system/user_recover_password_passcode_request";
    public static final String API_USER_SIGN_IN = "/system/user_sign_in";
    public static final String API_USER_SESSION_SIGN_IN = "/system/user_session_sign_in";
    public static final String API_USER_SESSION_SIGN_OUT = "/system/user_session_sign_out";
    public static final String API_USER_REPLACE_SESSION = "/system/replace_session";
    public static final String API_USER_MODIFY_INFO = "/system/user_modify_info";
    public static final String API_GROUP_MODIFY_INFO = "/system/group_modify_info";
    public static final String API_LOAD_USER = "/system/load_user";
    public static final String API_LOAD_CONTACT = "/system/load_contact";
    public static final String API_LOAD_CONTACT_BY_EMAIL = "/system/load_contact_by_email";
    public static final String API_LOAD_GROUP = "/system/load_group";
    public static final String API_LOAD_REQUEST = "/system/load_request";
    public static final String API_LOAD_FILE_LIST = "/system/load_file_list";
    public static final String API_FILE_ARCHIVE = "/system/file_archive";
    public static final String API_CHAT_MESSAGE_FORWARD = "/chat/message_forward";
    public static final String API_CHAT_MESSAGE_FORWARD_GROUP = "/chat/message_forward_group";
    public static final String API_CHAT_CONTACT_ADD_REQUEST = "/chat/contact_add_request";
    public static final String API_CHAT_CONTACT_ADD_REVOKE = "/chat/contact_add_revoke";
    public static final String API_CHAT_CONTACT_ADD_CONFIRM = "/chat/contact_add_confirm";
    public static final String API_CHAT_CONTACT_ADD_REFUSE = "/chat/contact_add_refuse";
    public static final String API_CHAT_GROUP_CREATE_REQUEST = "/chat/group_create_request";
    public static final String API_CHAT_GROUP_INVITE_MEMBER = "/chat/group_invite_member";
    public static final String API_CHAT_GROUP_ADD_REQUEST = "/chat/group_add_request";
    public static final String API_CHAT_GROUP_ADD_REVOKE = "/chat/group_add_revoke";
    public static final String API_CHAT_GROUP_ADD_CONFIRM = "/chat/group_add_confirm";
    public static final String API_CHAT_GROUP_ADD_REFUSE = "/chat/group_add_refuse";
    public static final String API_CHAT_WEBRTC_CALL = "/chat/webrtc_call";

    public static final String TIMESTAMP = "timestamp";
    public static final String USER_SIGN_UP_USER_EMAIL = "user_email";
    public static final String USER_SIGN_UP_USER_PASSWORD = "user_password";
    public static final String USER_SIGN_UP_PASSCODE = "passcode";
    public static final String USER_SIGN_UP_PASSCODE_REQUEST_USER_EMAIL = "user_email";
    public static final String USER_RECOVER_PASSWORD_USER_EMAIL = "user_email";
    public static final String USER_RECOVER_PASSWORD_USER_PASSWORD = "user_password";
    public static final String USER_RECOVER_PASSWORD_PASSCODE = "passcode";
    public static final String USER_RECOVER_PASSWORD_PASSCODE_REQUEST_USER_EMAIL = "user_email";
    public static final String USER_SIGN_IN_USER_EMAIL = "user_email";
    public static final String USER_SIGN_IN_USER_PASSWORD = "user_password";
    public static final String USER_SESSION_SIGN_IN_SESSION_TOKEN = "session_token";
    public static final String USER_SESSION_REPLACE_OLD_SESSION = "old_session";
    public static final String USER_MODIFY_INFO_USER_ID = "user_id";
    public static final String USER_MODIFY_INFO_USER_NAME = "user_name";
    public static final String USER_MODIFY_INFO_USER_PASSWORD = "user_password";
    public static final String USER_MODIFY_INFO_USER_GENDER = "user_gender";
    public static final String USER_MODIFY_INFO_USER_AVATAR_LINK = "user_avatar_link";
    public static final String USER_MODIFY_INFO_USER_INFO = "user_info";
    public static final String USER_MODIFY_INFO_USER_LOCATION = "user_location";
    public static final String GROUP_MODIFY_INFO_GROUP_ID = "group_id";
    public static final String GROUP_MODIFY_INFO_GROUP_NAME = "group_name";
    public static final String GROUP_MODIFY_INFO_GROUP_INFO = "group_info";
    public static final String GROUP_MODIFY_INFO_GROUP_AVATAR_LINK = "group_avatar_link";
    public static final String LOAD_USER_USER_ID = "user_id";
    public static final String LOAD_CONTACT_CONTACT_ID = "contact_id";
    public static final String LOAD_CONTACT_BY_EMAIL_CONTACT_EMAIL = "contact_email";
    public static final String LOAD_GROUP_GROUP_ID = "group_id";
    public static final String LOAD_REQUEST_REQUEST_ID = "request_id";
    public static final String LOAD_FILE_LIST_FIRST_SELECTOR = "first_selector";
    public static final String LOAD_FILE_LIST_SECOND_SELECTOR = "second_selector";
    public static final String FILE_ARCHIVE_FIRST_SELECTOR = "first_selector";
    public static final String FILE_ARCHIVE_SECOND_SELECTOR = "second_selector";
    public static final String FILE_ARCHIVE_FILE_NAME = "file_name";
    public static final String FILE_ARCHIVE_FILE_LINK = "file_link";
    public static final String FILE_ARCHIVE_FILE_UPLOADER = "file_uploader";
    public static final String FILE_ARCHIVE_FILE_SIZE = "file_size";
    public static final String CHAT_MESSAGE_FORWARD_SENDER = "sender";
    public static final String CHAT_MESSAGE_FORWARD_RECEIVER = "receiver";
    public static final String CHAT_MESSAGE_FORWARD_CONTENT = "content";
    public static final String CHAT_MESSAGE_FORWARD_CONTENT_TYPE = "content_type";
    public static final String CHAT_MESSAGE_FORWARD_GROUP_SENDER = "sender";
    public static final String CHAT_MESSAGE_FORWARD_GROUP_RECEIVER = "receiver";
    public static final String CHAT_MESSAGE_FORWARD_GROUP_CONTENT = "content";
    public static final String CHAT_MESSAGE_FORWARD_GROUP_CONTENT_TYPE = "content_type";
    public static final String CHAT_CONTACT_ADD_REQUEST_CONTACT_EMAIL = "contact_email";
    public static final String CHAT_CONTACT_ADD_REVOKE_REQUEST_ID = "request_id";
    public static final String CHAT_CONTACT_ADD_CONFIRM_REQUEST_ID = "request_id";
    public static final String CHAT_CONTACT_ADD_REFUSE_REQUEST_ID = "request_id";
    public static final String CHAT_GROUP_CREATE_REQUEST_GROUP_NAME = "group_name";
    public static final String CHAT_GROUP_CREATE_REQUEST_MEMBER_LIST = "member_list";
    public static final String CHAT_GROUP_INVITE_MEMBER_GROUP_ID = "group_id";
    public static final String CHAT_GROUP_INVITE_MEMBER_MEMBER_ID = "member_id";
    public static final String CHAT_GROUP_ADD_REQUEST_GROUP_ID = "group_id";
    public static final String CHAT_GROUP_ADD_REVOKE_REQUEST_ID = "request_id";
    public static final String CHAT_GROUP_ADD_CONFIRM_REQUEST_ID = "request_id";
    public static final String CHAT_GROUP_ADD_REFUSE_REQUEST_ID = "request_id";
    public static final String CHAT_WEBRTC_CALL_CHANNEL = "channel";
    public static final String CHAT_WEBRTC_CALL_COMMAND = "command";
    public static final String CHAT_WEBRTC_CALL_PAYLOAD = "payload";
    public static final String CHAT_CONTENT_TYPE_TEXT = "text";
    public static final String CHAT_CONTENT_TYPE_IMAGE = "image";
    public static final String CHAT_CONTENT_TYPE_AUDIO = "audio";
    public static final String CHAT_CONTENT_TYPE_VIDEO = "video";
    public static final String CHAT_CONTENT_TYPE_FILE = "file";
}
