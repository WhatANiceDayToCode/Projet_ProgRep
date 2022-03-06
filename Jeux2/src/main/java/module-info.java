module hello.jeux {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens hello.jeux to javafx.fxml;
    exports hello.jeux;
}