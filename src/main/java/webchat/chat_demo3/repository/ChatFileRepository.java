package webchat.chat_demo3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import webchat.chat_demo3.entity.ChatFile;
import webchat.chat_demo3.entity.ChatRoom;

import java.util.List;

@Repository
public interface ChatFileRepository extends JpaRepository<ChatFile, Long> {
    List<ChatFile> findByChatRoom(ChatRoom chatRoom);
}