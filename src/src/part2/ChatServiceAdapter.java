package part2;

//class that wraps the legacy chat service.
public class ChatServiceAdapter implements IChatService{
    private LegacyChatService legacyChatService;

    // constructor to accept an instance of the legacy service
    ChatServiceAdapter(LegacyChatService legacyChatService) {
        this.legacyChatService = legacyChatService;
    }

    // adapting the method
    @Override
    public void sendMessage(String message) {
        legacyChatService.sendLetter(message);
    }
}
