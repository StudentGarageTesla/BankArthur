package com.example.bankarthur;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Chets {

    @FXML
    protected void onSCHETAButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SCHETA.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Счета");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onCREDITButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Credits.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Кредит");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onIPOTEKAButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Ipoteka.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("ипотека");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onINVESTMENTSButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Investments.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("инвестиции");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onCASHBACKButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("cashback.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("кэшбек");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onPROFITButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("profit.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("выгода");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void INFOCREDITSTAVKIButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("INFOCREDITSTAVKI.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("информация кредит вставки");
        stage.setScene(scene);
        stage.show();
    }

    //
    @FXML
    protected void PerevodMejduSchetamiButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("PerevodMejduSchetami.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("перевод между счетами");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void PerevodIZDrugogoBankaButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("PerevodIZDrugogoBanka.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("перевод из другого банка");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void PerevodPoNOMERUcartiButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("PerevodPoNOMERUcarti.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("перевод по номеру карты");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void PerevodPoSPBButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("PerevodPoSPB.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("перевод по СПБ");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void PLATEZHIButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("PLATEZHI.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("платежи");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void MOBILESVYAZButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MOBILESVYAZ.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("мобильная связь");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void KOMMUNALNIEUSLUGIButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("KOMMUNALNIEUSLUGI.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("коммунальные услуги");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void VIGODAButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("VIGODA.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("выгода");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void CHATSButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("CHATS.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("чаты");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void TEHPODDERJKAButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("TEHPODDERJKA.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("тех.поддержка");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void CHATSBANKOMButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("CHATSBANKOM.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("чат с банком");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void UVEDOMLENIYAButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("UVEDOMLENIYA.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("уведомления");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void NEWSButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("NEWS.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("новости");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void INSTRUKCIIButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("INSTRUKCII.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("инструкции");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void PEREVODDENEGButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("PEREVODDENEG.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("перевод денег");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void ISTORYAOPERATIONButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ISTORYAOPERATION.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("история операций");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void ALLUSERSButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ALLUSERS.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("все пользователи");
        stage.setScene(scene);
        stage.show();
    }
}