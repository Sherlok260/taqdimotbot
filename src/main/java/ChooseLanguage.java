import org.telegram.telegrambots.meta.api.methods.ParseMode;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;

public class ChooseLanguage {
    public SendMessage languagebutton(Long chatID) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("Tilni tanlang/Выберите язык/Select a language");
        sendMessage.setParseMode(ParseMode.MARKDOWN);
        sendMessage.setChatId(String.valueOf(chatID));

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);
        ArrayList<KeyboardRow> keyboardRowList = new ArrayList<>();
        KeyboardRow keyboardRow1 = new KeyboardRow();
        KeyboardRow keyboardRow2 = new KeyboardRow();
        KeyboardRow keyboardRow3 = new KeyboardRow();

        KeyboardButton keyboardButton1 = new KeyboardButton("\uD83C\uDDFA\uD83C\uDDFF O'zbek tili");
        KeyboardButton keyboardButton2 = new KeyboardButton("\uD83C\uDDF7\uD83C\uDDFA Русски язык");
        KeyboardButton keyboardButton3 = new KeyboardButton("\uD83C\uDDFA\uD83C\uDDF8 English language");

        keyboardRow1.add(keyboardButton1);

        keyboardRow2.add(keyboardButton2);

        keyboardRow3.add(keyboardButton3);

        keyboardRowList.add(keyboardRow1);
        keyboardRowList.add(keyboardRow2);
        keyboardRowList.add(keyboardRow3);

        replyKeyboardMarkup.setKeyboard(keyboardRowList);

        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
}
