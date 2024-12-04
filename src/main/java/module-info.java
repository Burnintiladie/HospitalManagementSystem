module com.main.hospitalmanagementsys {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.mongodb.driver.sync.client;
    requires org.mongodb.bson;

    opens com.main.hospitalmanagementsys to javafx.fxml;
    exports com.main.hospitalmanagementsys;
    exports com.main.hospitalmanagementsys.controllers;
    opens com.main.hospitalmanagementsys.controllers to javafx.fxml;
}