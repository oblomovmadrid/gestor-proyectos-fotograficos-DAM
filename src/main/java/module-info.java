module com.foc.gestorproyectosfotograficos {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.foc.gestorproyectosfotograficos to javafx.fxml;
    exports com.foc.gestorproyectosfotograficos;
}