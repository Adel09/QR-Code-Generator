module com.crumlabs.qrfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.crumlabs.qrfx to javafx.fxml;
    exports com.crumlabs.qrfx;
}