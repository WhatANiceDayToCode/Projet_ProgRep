module hello.jeux {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.rmi;
    opens client to javafx.fxml;
    exports client;
    exports serveur.InterfaceRMI;
    exports client.controller;
    opens client.controller to javafx.fxml;
}