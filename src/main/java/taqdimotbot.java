import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendDocument;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.File;
import java.util.concurrent.CompletableFuture;

public class taqdimotbot extends TelegramLongPollingBot {

//    public String getBotUsername(){
//        return "slaytbot";
//    }
    public String getBotUsername(){
        return "experimenttbot";
    }

    /*public String getBotToken () {
        return "1654147081:AAG-yxHhR0bVIzrCInd-dob_49_3E7hjLP8";
    }*/
    public String getBotToken () {
        return "1928687908:AAGCpuO_zx6L3yPr76pN2wYPVPH4PwGWQ7U";
    }

    String LAST_COMMAND = "";

    ChooseLanguage language = new ChooseLanguage();
    UzbButtons uzbButtons = new UzbButtons();
    RusButtons rusButtons = new RusButtons();
    EngButtons engButtons = new EngButtons();
    LinkFile manzil = new LinkFile();

    final String uzbek = "\uD83C\uDDFA\uD83C\uDDFF O'zbek tili";
    final String rus = "\uD83C\uDDF7\uD83C\uDDFA Русски язык";
    final String ingliz = "\uD83C\uDDFA\uD83C\uDDF8 English language";

    int count=0;


    public void onUpdateReceived(Update update) {

        CompletableFuture.runAsync(()-> System.out.print(""));

        Message message = update.getMessage();

        String command = "";
        command = message.getText();
        Long chatID = message.getChatId();
        System.out.println(command);

        if(command.equals("/start")
                || command.equals(uzbek)
                || command.equals(rus)
                || command.equals(ingliz)
        )   LAST_COMMAND = command;

        switch (LAST_COMMAND)
        {
            case "/start":
                //print(chatID, "Botga xush kelibsiz!");
                try {
                    execute(language.languagebutton(chatID));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
                break;

            case uzbek:
                LAST_COMMAND = "";
                try {
                    execute(uzbButtons.uzbbutton(chatID));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
                break;

            case rus:
                LAST_COMMAND = "";
                try {
                    execute(rusButtons.rusbutton(chatID));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
                break;

            case ingliz:
                LAST_COMMAND = "";
                try {
                    execute(engButtons.engbutton(chatID));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
                break;

//            default:
//                print(chatID, "Bunday til mavjud emas!");
        }

            en(chatID,command);
    }

    public void print(Long chatID, String text){
        SendMessage message = new SendMessage();
        message.setChatId(String.valueOf(chatID));
        message.setText(text);
        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public void document(Long chatID, String command, String adres){
        try {
            SendDocument message = new SendDocument();
            message.setChatId(String.valueOf(chatID));
            message.setDocument(new InputFile(new File(adres)));
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public void en(Long chatID, String command){
            if(command.equals("\uD83E\uDDE0Xulosa") || command.equals("\uD83E\uDDE0Абстрактный") || command.equals("\uD83E\uDDE0Abstract")) {
                while (count != manzil.abs.length) {
                    document(chatID, command, manzil.abs[count]);
                    count += 1;
                }
                count = 0;
            }
            else
            if(command.equals("\uD83D\uDCB2Biznes") || command.equals("\uD83D\uDCB2Бизнес") || command.equals("\uD83D\uDCB2Business")) {
                while (count != manzil.bus.length) {
                    document(chatID, command, manzil.bus[count]);
                    count += 1;
                }
                count = 0;
            }
            else
            if(command.equals("\uD83D\uDDA5Kompyuterlar") || command.equals("\uD83D\uDDA5Компьютеры") || command.equals("\uD83D\uDDA5Computers")) {
                while (count != manzil.com.length) {
                    document(chatID, command, manzil.com[count]);
                    count += 1;
                }
                count = 0;
            }
            else
            if(command.equals("\uD83C\uDFEBTa'lim") || command.equals("\uD83C\uDFEBОбразование") || command.equals("\uD83C\uDFEBEducation")) {
                while (count != manzil.edu.length) {
                    document(chatID, command, manzil.edu[count]);
                    count += 1;
                }
                count = 0;
            }
            else
            if(command.equals("\uD83D\uDCB8Moliya") || command.equals("\uD83D\uDCB8Финансы") || command.equals("\uD83D\uDCB8Finance")) {
                while (count != manzil.fin.length) {
                    document(chatID, command, manzil.fin[count]);
                    count += 1;
                }
                count = 0;
            }
            else
            if(command.equals("\uD83E\uDD59Oziq ovqat") || command.equals("\uD83E\uDD59Еда") || command.equals("\uD83E\uDD59Food")) {
                while (count != manzil.food.length) {
                    document(chatID, command, manzil.food[count]);
                    count += 1;
                }
                count = 0;
            }
            else
            if(command.equals("\uD83E\uDDF3Sanoat") || command.equals("\uD83E\uDDF3Промышленность") || command.equals("\uD83E\uDDF3Industry")) {
                while (count != manzil.ind.length) {
                    document(chatID, command, manzil.ind[count]);
                    count += 1;
                }
                count = 0;
            }
            else
            if(command.equals("⛑Tibbiy") || command.equals("⛑Медицинское") || command.equals("⛑Medical")) {
                while (count != manzil.med.length) {
                    document(chatID, command, manzil.med[count]);
                    count += 1;
                }
                count = 0;
            }
            else
            if(command.equals("\uD83D\uDC82\uD83C\uDFFB\u200D♀️Harbiy") || command.equals("\uD83D\uDC82\uD83C\uDFFB\u200D♀️Военный") || command.equals("\uD83D\uDC82\uD83C\uDFFB\u200D♀️Military")) {
                while (count != manzil.mil.length) {
                    document(chatID, command, manzil.mil[count]);
                    count += 1;
                }
                count = 0;
            }
            else
            if(command.equals("\uD83C\uDFD5Tabiat") || command.equals("\uD83C\uDFD5Природа") || command.equals("\uD83C\uDFD5Nature")) {
                while (count != manzil.nat.length) {
                    document(chatID, command, manzil.nat[count]);
                    count += 1;
                }
                count = 0;
            }
            else
            if(command.equals("\uD83C\uDFE0Ko`chmas mulk") || command.equals("\uD83C\uDFE0Недвижимость") || command.equals("\uD83C\uDFE0Real Estate")) {
                while (count != manzil.real.length) {
                    document(chatID, command, manzil.real[count]);
                    count += 1;
                }
                count = 0;
            }
            else
            if(command.equals("\uD83C\uDFD6Dam olish") || command.equals("\uD83C\uDFD6Отдых") || command.equals("\uD83C\uDFD6Recreation")) {
                while (count != manzil.rec.length) {
                    document(chatID, command, manzil.rec[count]);
                    count += 1;
                }
                count = 0;
            }
            else
            if(command.equals("\uD83D\uDD4BDin") || command.equals("\uD83D\uDD4BРелигия") || command.equals("\uD83D\uDD4BReligion")) {
                while (count != manzil.rel.length) {
                    document(chatID, command, manzil.rel[count]);
                    count += 1;
                }
                count = 0;
            }
            else
            if(command.equals("\uD83C\uDFC3\u200D♂️Sport") || command.equals("\uD83C\uDFC3\u200D♂️Виды спорта") || command.equals("\uD83C\uDFC3\u200D♂️Sports")) {
                while (count != manzil.sport.length) {
                    document(chatID, command, manzil.sport[count]);
                    count += 1;
                }
                count = 0;

            }
            else
            if(command.equals("\uD83C\uDFD5Sayohat") || command.equals("\uD83C\uDFD5Путешествовать") || command.equals("\uD83C\uDFD5Travel")) {
                while (count != manzil.tra.length) {
                    document(chatID, command, manzil.tra[count]);
                    count += 1;
                }
                count = 0;

            }
            else
            if(command.equals("\uD83D\uDD19Ortga qaytish") || command.equals("\uD83D\uDD19Назад") || command.equals("\uD83D\uDD19Back")) {

                LAST_COMMAND = "";
                command = "";
                try {
                    execute(language.languagebutton(chatID));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
    }
}

