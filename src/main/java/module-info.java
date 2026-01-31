module com.example.bankarthur {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.bankarthur to javafx.fxml;
    exports com.example.bankarthur;
}