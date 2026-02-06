module org.rouge.rouge {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens Rouge_Code to javafx.fxml;
    exports Rouge_Code;
    exports Rouge_Code.components;
    opens Rouge_Code.components to javafx.fxml;
}