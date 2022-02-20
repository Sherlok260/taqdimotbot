import org.telegram.telegrambots.meta.api.methods.ParseMode;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;

public class UzbButtons {
    public SendMessage uzbbutton(Long chatID) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("Buyruqni tanlang");
        sendMessage.setParseMode(ParseMode.MARKDOWN);
        sendMessage.setChatId(String.valueOf(chatID));

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);
        ArrayList<KeyboardRow> keyboardRowList = new ArrayList<>();
        KeyboardRow keyboardRow1 = new KeyboardRow();
        KeyboardRow keyboardRow2 = new KeyboardRow();
        KeyboardRow keyboardRow3 = new KeyboardRow();
        KeyboardRow keyboardRow4 = new KeyboardRow();
        KeyboardRow keyboardRow5 = new KeyboardRow();
        KeyboardRow keyboardRow6 = new KeyboardRow();
        KeyboardRow keyboardRow7 = new KeyboardRow();
        KeyboardRow keyboardRow8 = new KeyboardRow();

        KeyboardButton keyboardButton1 = new KeyboardButton("\uD83E\uDDE0Xulosa");
        KeyboardButton keyboardButton2 = new KeyboardButton("\uD83D\uDCB2Biznes");
        KeyboardButton keyboardButton3 = new KeyboardButton("\uD83D\uDDA5Kompyuterlar");
        KeyboardButton keyboardButton4 = new KeyboardButton("\uD83C\uDFEBTa'lim");
        KeyboardButton keyboardButton5 = new KeyboardButton("\uD83D\uDCB8Moliya");
        KeyboardButton keyboardButton6 = new KeyboardButton("\uD83E\uDD59Oziq ovqat");
        KeyboardButton keyboardButton7 = new KeyboardButton("\uD83E\uDDF3Sanoat");
        KeyboardButton keyboardButton8 = new KeyboardButton("⛑Tibbiy");
        KeyboardButton keyboardButton9 = new KeyboardButton("\uD83D\uDC82\uD83C\uDFFB\u200D♀️Harbiy");
        KeyboardButton keyboardButton10 = new KeyboardButton("\uD83C\uDFD5Tabiat");
        KeyboardButton keyboardButton11 = new KeyboardButton("\uD83C\uDFE0Ko`chmas mulk");
        KeyboardButton keyboardButton12 = new KeyboardButton("\uD83C\uDFD6Dam olish");
        KeyboardButton keyboardButton13 = new KeyboardButton("\uD83D\uDD4BDin");
        KeyboardButton keyboardButton14 = new KeyboardButton("\uD83C\uDFC3\u200D♂️Sport");
        KeyboardButton keyboardButton15 = new KeyboardButton("\uD83C\uDFD5Sayohat");
        KeyboardButton keyboardButton16 = new KeyboardButton("\uD83D\uDD19Ortga qaytish");

        keyboardRow1.add(keyboardButton1);
        keyboardRow1.add(keyboardButton2);

        keyboardRow2.add(keyboardButton3);
        keyboardRow2.add(keyboardButton4);

        keyboardRow3.add(keyboardButton5);
        keyboardRow3.add(keyboardButton6);

        keyboardRow4.add(keyboardButton7);
        keyboardRow4.add(keyboardButton8);

        keyboardRow5.add(keyboardButton9);
        keyboardRow5.add(keyboardButton10);

        keyboardRow6.add(keyboardButton11);
        keyboardRow6.add(keyboardButton12);

        keyboardRow7.add(keyboardButton13);
        keyboardRow7.add(keyboardButton14);

        keyboardRow8.add(keyboardButton15);
        keyboardRow8.add(keyboardButton16);

        keyboardRowList.add(keyboardRow1);
        keyboardRowList.add(keyboardRow2);
        keyboardRowList.add(keyboardRow3);
        keyboardRowList.add(keyboardRow4);
        keyboardRowList.add(keyboardRow5);
        keyboardRowList.add(keyboardRow6);
        keyboardRowList.add(keyboardRow7);
        keyboardRowList.add(keyboardRow8);

        replyKeyboardMarkup.setKeyboard(keyboardRowList);

        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
}
