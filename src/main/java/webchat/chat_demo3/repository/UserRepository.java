package webchat.chat_demo3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import webchat.chat_demo3.entity.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByChatRoom_RoomId(String roomId);
    User findByUserUUIDAndChatRoom_RoomId(String userUUID, String roomId);
}