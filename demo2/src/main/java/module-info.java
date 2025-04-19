module cz.cvut.fel.pjv.arimaa.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens cz.cvut.fel.pjv.arimaa to javafx.fxml;
    exports cz.cvut.fel.pjv.arimaa;
}