package webchat.chat_demo3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import webchat.chat_demo3.entity.Chat;

@Repository
public interface ChatRepository extends JpaRepository<Chat, Long> {
}