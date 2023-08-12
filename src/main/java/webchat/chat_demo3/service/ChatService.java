package webchat.chat_demo3.service;

import webchat.chat_demo3.dto.ChatRoomDto;

import java.util.List;
import java.util.ArrayList;

public interface ChatService {

    public List<ChatRoomDto> findAllRoom();
    public ChatRoomDto findRoomById(String roomId);
    public ChatRoomDto createChatRoom(String roomName, String roomPwd, boolean secretChk, int maxUserCnt);
    public void plusUserCnt(String roomId);
    public void minusUserCnt(String roomId);
    public boolean chkRoomUserCnt(String roomId);
    public String addUser(String roomId, String userName);
    public String isDuplicateName(String roomId, String username);
    public void delUser(String roomId, String userUUID);
    public String getUserName(String roomId, String userUUID);
    public ArrayList<String> getUserList(String roomId);
    public boolean confirmPwd(String roomId, String roomPwd);
    public void delChatRoom(String roomId);
}
