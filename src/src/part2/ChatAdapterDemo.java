package part2;

//A demo class that demonstrates sending
// a message through the adapter, producing the expected output.
public class ChatAdapterDemo {
    public static void main(String[] args) {
        // create an instance of the legacy chat
        LegacyChatService legacyService = new LegacyChatService();

        // wrapping it with the adapter
        IChatService chatAdapter = new ChatServiceAdapter(legacyService);

        // send a message using new interface
        chatAdapter.sendMessage("Hello world!");

        // Our output:
        // Legacy Chat: Hello world!

        chatAdapter.sendMessage("Happy birthday!");

        // Our output:
        // Legacy Chat: Happy birthday!
    }
}
