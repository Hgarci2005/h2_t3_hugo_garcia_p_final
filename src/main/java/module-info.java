module com.empresa.h2_t3_hugo_garcia_p {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.empresa.h2_t3_hugo_garcia_p to javafx.fxml;
    exports com.empresa.h2_t3_hugo_garcia_p;
}