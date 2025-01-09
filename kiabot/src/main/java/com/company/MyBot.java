package com.company;



import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.ParseMode;
import org.telegram.telegrambots.meta.api.methods.send.*;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.User;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MyBot extends TelegramLongPollingBot {

    public MyBot(String botToken) {
        super(botToken);
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String text = update.getMessage().getText();
            Long chatId = update.getMessage().getChatId();

            if (text.equals("/start")) {

                SendMessage message = new SendMessage();
                message.setText("Tilni tanlang");
                message.setChatId(chatId);
                message.setReplyMarkup(menuLanguageButton());

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }


            } else if (text.equals("Asosiy sahifa")) {
                SendMessage message = new SendMessage();
                message.setText("Tilni tanlang");
                message.setChatId(chatId);
                message.setReplyMarkup(menuLanguageButton());

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("\uD83D\uDE97Avtomobillar ro'yxati")) {
                ReplyKeyboardMarkup markup = mainSearch();
                SendMessage message = new SendMessage();
                message.setText("Yoqtirgan modelingizni tanlang");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }


            } else if (text.equals("☎\uFE0FIzoh qoldirish")) {
                ReplyKeyboardMarkup markup = mainAbout();
                SendMessage message = new SendMessage();
                message.setText("Izoh qoldirishdan avval telefon raqamingizni jo’nating\uD83D\uDCDE:");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("Рус / UZB")) {
                ReplyKeyboardMarkup markup = mainLanguage();
                SendMessage message = new SendMessage();
                message.setText("Выберите язык:" +
                        "Tilni tanlash");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("⚙\uFE0FAvtomobillar haqida malumot")) {

                ReplyKeyboardMarkup markup = mainMedic();
                SendMessage message = new SendMessage();
                message.setText("Qanday avtomobil haqida malumot kerak?");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("\uD83D\uDC64Biz haqimizda")) {
                SendMessage message = new SendMessage();
                message.setText("Biz O'zbekistondagi KIA avtosalonining birinchi fillialaridan bo'lamiz.\n" +
                        "Bizning avtosalon 2021 yildan beri faoliyat olib bormoqda.Bizning fillialga kelib batafsil hamma imkoniyat va mashinalar haqida tanishib ketishingiz mumkin\uD83D\uDE0A");
                message.setChatId(chatId);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            } else if (text.equals("Telefon raqamini jo'natish")) {
                ReplyKeyboardMarkup markup = mainAbout();
                SendMessage message = new SendMessage();
                message.setText("Biz bilan bog'lanish uchun quyidagi raqamlarga telefon qiling" +
                        "+998770002777");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
//            } else if (text.equals("Cerato")) {
//                SendMessage message = new SendMessage();
//                message.setText("Модель: Cerato\n" +
//                        "Цена: от 317 900 000 сум");
//                message.setChatId(chatId);
//                message.setReplyMarkup(message.getReplyMarkup());
                //photo.setPhoto();

            } else if (text.equals("CERATO")) {
                File file = new File("C:\\8b\\photo_2022-08-03_15-39-18.jpg");
                SendPhoto photo = new SendPhoto();
                photo.setPhoto(new InputFile(file));
                photo.setCaption("Модель: Cerato\n" +
                        "Цена: от 317 900 000 сум");
                photo.setChatId(chatId);
                File file1 = new File("C:\\Users\\user\\Downloads\\Telegram Desktop\\cerato-11-30-2023_033020 (3).pdf");
                SendDocument document = new SendDocument();
                document.setDocument(new InputFile(file1));
                document.setChatId(chatId);
                try {
                    execute(photo);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
                try {
                    execute(document);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("K5")) {
                File file = new File("C:\\Users\\user\\Downloads\\photo_2024-02-14_13-27-15.jpg");
                SendPhoto photo = new SendPhoto();
                photo.setPhoto(new InputFile(file));
                photo.setCaption("Модель: K5\n" +
                        "Цена: от 359 900 000 сум");
                photo.setChatId(chatId);
                File file1 = new File("C:\\Users\\user\\Downloads\\Telegram Desktop\\k5-02-07-2024_031545 (4).pdf");
                SendDocument document = new SendDocument();
                document.setDocument(new InputFile(file1));
                document.setChatId(chatId);
                try {
                    execute(photo);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
                try {
                    execute(document);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            } else if (text.equals("K9")) {
                File file = new File("C:\\Users\\user\\Downloads\\photo_2024-02-16_09-41-09.jpg");
                SendPhoto photo = new SendPhoto();
                photo.setPhoto(new InputFile(file));
                photo.setCaption("Модель: K9\n" +
                        "Цена: от 869 900 000 сум");
                photo.setChatId(chatId);
                File file1 = new File("C:\\Users\\user\\Downloads\\k9-01-05-2024_010810.pdf");
                SendDocument document = new SendDocument();
                document.setDocument(new InputFile(file1));
                document.setChatId(chatId);
                try {
                    execute(photo);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
                try {
                    execute(document);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }


            } else if (text.equals("STINGER")) {
                File file = new File("C:\\Users\\user\\Downloads\\stinger.jpg");
                SendPhoto photo = new SendPhoto();
                photo.setPhoto(new InputFile(file));
                photo.setCaption("Модель: Stinger\n" +
                        "Цена: от 789 900 000 сум");
                photo.setChatId(chatId);
                File file1 = new File("C:\\Users\\user\\Downloads\\stinger-11-30-2023_032957.pdf");
                SendDocument document = new SendDocument();
                document.setDocument(new InputFile(file1));
                document.setChatId(chatId);
                try {
                    execute(photo);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
                try {
                    execute(document);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            } else if (text.equals("EV9")) {
                File file = new File("C:\\Users\\user\\Downloads\\photo_2024-02-16_09-59-01.jpg");
                SendPhoto photo = new SendPhoto();
                photo.setPhoto(new InputFile(file));
                photo.setCaption("Модель: EV9\n" +
                        "Цена: от 999 900 000 сум");
                photo.setChatId(chatId);
                File file1 = new File("C:\\Users\\user\\Downloads\\ev9-01-30-2024_010431.pdf");
                SendDocument document = new SendDocument();
                document.setDocument(new InputFile(file1));
                document.setChatId(chatId);
                try {
                    execute(photo);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
                try {
                    execute(document);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("K8")) {
                File file = new File("C:\\Users\\user\\Downloads\\photo_2024-02-16_10-05-47.jpg");
                SendPhoto photo = new SendPhoto();
                photo.setPhoto(new InputFile(file));
                photo.setCaption("Модель: K8\n" +
                        "Цена: от 729 900 000 сум");
                photo.setChatId(chatId);
                File file1 = new File("C:\\Users\\user\\Downloads\\k8-02-13-2024_052454.pdf");
                SendDocument document = new SendDocument();
                document.setDocument(new InputFile(file1));
                document.setChatId(chatId);
                try {
                    execute(photo);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
                try {
                    execute(document);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
                try {
                    execute(document);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("EV6")) {
                File file = new File("C:\\Users\\user\\Downloads\\photo_2023-05-01_09-09-09.jpg");
                SendPhoto photo = new SendPhoto();
                photo.setPhoto(new InputFile(file));
                photo.setCaption("Модель: EV6\n" +
                        "Цена: от 699 900 000 сум");
                photo.setChatId(chatId);


                File file1 = new File("C:\\Users\\user\\Downloads\\ev6-11-30-2023_033940.pdf");
                SendDocument document = new SendDocument();
                document.setDocument(new InputFile(file1));
                document.setChatId(chatId);
                try {
                    execute(photo);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
                try {
                    execute(document);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            } else if (text.equals("ev9")) {
                File file1 = new File("C:\\Users\\user\\Downloads\\ev9broshure.pdf");
                SendDocument document = new SendDocument();
                document.setDocument(new InputFile(file1));
                document.setChatId(chatId);
                try {
                    execute(document);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("k5")) {
                File file1 = new File("C:\\Users\\user\\Downloads\\K5_brochure.pdf");
                SendDocument document = new SendDocument();
                document.setDocument(new InputFile(file1));
                document.setChatId(chatId);
                try {
                    execute(document);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            } else if (text.equals("stinger")) {
                File file1 = new File("C:\\Users\\user\\Downloads\\stinger-07-27-2021.pdf");
                SendDocument document = new SendDocument();
                document.setDocument(new InputFile(file1));
                document.setChatId(chatId);
                try {
                    execute(document);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            } else if (text.equals("k9")) {
                File file1 = new File("C:\\Users\\user\\Downloads\\K9_brochure.pdf");
                SendDocument document = new SendDocument();
                document.setDocument(new InputFile(file1));
                document.setChatId(chatId);
                try {
                    execute(document);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("ev6")) {
                File file1 = new File("C:\\Users\\user\\Downloads\\EV6_Brochure_ru.pdf");
                SendDocument document = new SendDocument();
                document.setDocument(new InputFile(file1));
                document.setChatId(chatId);
                try {
                    execute(document);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("k8")) {
                File file1 = new File("C:\\Users\\user\\Downloads\\k8_brochure.pdf");
                SendDocument document = new SendDocument();
                document.setDocument(new InputFile(file1));
                document.setChatId(chatId);
                try {
                    execute(document);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            } else if (text.equals("cerato")) {
                File file1 = new File("C:\\Users\\user\\Downloads\\Cerato_brochure.pdf");
                SendDocument document = new SendDocument();
                document.setDocument(new InputFile(file1));
                document.setChatId(chatId);
                try {
                    execute(document);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            } else if (text.equals("fillial")) {
                SendLocation location = new SendLocation();
                double longitude = 41.2349931;
                double latitude = 69.2053093;

                location.setLatitude(longitude);
                location.setLongitude(latitude);
                location.setChatId(chatId);

                ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                KeyboardRow row = new KeyboardRow();
                KeyboardButton button = new KeyboardButton();
                button.setText("Lokatsiyani ulashish");
                row.add(button);
                button.setRequestLocation(true);
                List<KeyboardRow> rowList = new ArrayList<>();
                rowList.add(row);
                markup.setKeyboard(rowList);
                markup.setResizeKeyboard(true);
                location.setReplyMarkup(markup);
                try {
                    execute(location);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }


        } else if (update.hasCallbackQuery()) {
            String data = update.getCallbackQuery().getData();
            Long chatId = update.getCallbackQuery().getMessage().getChatId();


            if (data.equals("uz")) {
                SendMessage message = new SendMessage();
                message.setParseMode(ParseMode.HTML);
                message.setText("Kia avtasaloni sizga yordam berishga tayyor\uD83D\uDE0A");
                message.setChatId(chatId);
                message.setReplyMarkup(mainMenuUz());
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }




    public InlineKeyboardMarkup menuLanguageButton() {
        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();

        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("\uD83C\uDDFA\uD83C\uDDFFO'zbek tili");
        button1.setCallbackData("uz");
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("\uD83C\uDDF7\uD83C\uDDFARus Tili");
        button2.setCallbackData("rus");


        List<InlineKeyboardButton> row1 = new ArrayList<>();
        row1.add(button1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        row2.add(button2);

        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        rowList.add(row1);
        rowList.add(row2);

        markup.setKeyboard(rowList);
        return markup;
    }

    public ReplyKeyboardMarkup mainMenuUz() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83D\uDE97Avtomobillar ro'yxati");

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("⚙\uFE0FAvtomobillar haqida malumot");

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("☎\uFE0FIzoh qoldirish");

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("\uD83D\uDC64Biz haqimizda");

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("\uD83C\uDDF7\uD83C\uDDFAРус /\uD83C\uDDFA\uD83C\uDDFF UZB");

        KeyboardButton button6 = new KeyboardButton();
        button6.setText("⏫Asosiy sahifa");

        KeyboardRow row1 = new KeyboardRow();
        row1.add(button1);


        KeyboardRow row2 = new KeyboardRow();
        row2.add(button2);
        row2.add(button3);

        KeyboardRow row3 = new KeyboardRow();
        row3.add(button4);
        row3.add(button5);

        List<KeyboardRow> rowList = new ArrayList<>();
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        markup.setKeyboard(rowList);
        markup.setOneTimeKeyboard(true);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);
        return markup;


    }

    public ReplyKeyboardMarkup mainSearch() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("CERATO");

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("K5");

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("EV6");

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("K8");

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("STINGER");

        KeyboardButton button6 = new KeyboardButton();
        button6.setText("EV9");

        KeyboardButton button7 = new KeyboardButton();
        button7.setText("K9");

        KeyboardButton button8 = new KeyboardButton();
        button8.setText("Asosiy sahifa");


        KeyboardRow row1 = new KeyboardRow();
        row1.add(button1);
        row1.add(button2);


        KeyboardRow row2 = new KeyboardRow();
        row2.add(button3);
        row2.add(button4);

        KeyboardRow row3 = new KeyboardRow();
        row3.add(button5);
        row3.add(button6);

        KeyboardRow row4 = new KeyboardRow();
        row4.add(button7);
        row4.add(button8);


        List<KeyboardRow> rowList = new ArrayList<>();
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row4);
        markup.setKeyboard(rowList);
        markup.setOneTimeKeyboard(true);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);
        return markup;

    }

    public ReplyKeyboardMarkup mainAbout() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Telefon raqamini jo'natish");

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Asosiy sahifa");

        KeyboardRow row1 = new KeyboardRow();
        row1.add(button1);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(button3);
        List<KeyboardRow> rowList = new ArrayList<>();
        rowList.add(row1);
        rowList.add(row2);
        markup.setKeyboard(rowList);
        markup.setOneTimeKeyboard(true);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);
        return markup;
    }


    public ReplyKeyboardMarkup mainNews() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Biz haqimizda");

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Aloqa");

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Asosiy sahifa");
        KeyboardRow row1 = new KeyboardRow();
        row1.add(button1);


        KeyboardRow row2 = new KeyboardRow();
        row2.add(button2);
        row2.add(button3);
        List<KeyboardRow> rowList = new ArrayList<>();
        rowList.add(row1);
        rowList.add(row2);
        markup.setKeyboard(rowList);
        markup.setOneTimeKeyboard(true);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);
        return markup;
    }

    public ReplyKeyboardMarkup mainLanguage() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("O'zbekcha");

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Русский");

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Asosiy sahifa");


        KeyboardRow row1 = new KeyboardRow();
        row1.add(button3);



        KeyboardRow row2 = new KeyboardRow();
        row2.add(button2);
        row2.add(button1);
        List<KeyboardRow> rowList = new ArrayList<>();
        rowList.add(row1);
        rowList.add(row2);
        markup.setKeyboard(rowList);
        markup.setOneTimeKeyboard(true);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);
        return markup;
    }

    public ReplyKeyboardMarkup mainMedic() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("cerato");

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("k5");

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("ev6");

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("k8");

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("stinger");

        KeyboardButton button6 = new KeyboardButton();
        button6.setText("ev9");

        KeyboardButton button7 = new KeyboardButton();
        button7.setText("k9");

        KeyboardButton button8 = new KeyboardButton();
        button8.setText("Asosiy sahifa");


        KeyboardRow row1 = new KeyboardRow();
        row1.add(button8);
        row1.add(button1);


        KeyboardRow row2 = new KeyboardRow();
        row2.add(button2);
        row2.add(button3);

        KeyboardRow row3 = new KeyboardRow();
        row3.add(button4);
        row3.add(button5);

        KeyboardRow row4 = new KeyboardRow();
        row4.add(button6);
        row4.add(button7);


        List<KeyboardRow> rowList = new ArrayList<>();
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row4);
        markup.setKeyboard(rowList);
        markup.setOneTimeKeyboard(true);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);
        return markup;
    }
    public ReplyKeyboardMarkup mainAbouting() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Biz haqimizda");

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Asosiy sahifa");

        KeyboardRow row1 = new KeyboardRow();
        row1.add(button1);


        KeyboardRow row2 = new KeyboardRow();
        row2.add(button2);
        List<KeyboardRow> rowList = new ArrayList<>();
        rowList.add(row1);
        rowList.add(row2);
        markup.setKeyboard(rowList);
        markup.setOneTimeKeyboard(true);
        markup.setResizeKeyboard(true);
        markup.setSelective(true);
        return markup;
    }






    @Override
    public String getBotUsername() {
        return "kiapdpbot";
    }
}
