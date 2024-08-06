module org.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires jdk.jdi;
    requires java.desktop;

    opens org.example to javafx.fxml;
    exports org.example;
}
