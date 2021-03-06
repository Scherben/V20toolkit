package V20toolkit.model;

import javafx.beans.property.SimpleStringProperty;

import java.util.ResourceBundle;

public class v20Virtue extends v20Object{

    public v20Virtue(ResourceBundle i18n) {
        this(
                i18n.getString("v20_name_default"),
                i18n.getString("v20_description_default"));
    }

    public v20Virtue(String name, String description){
        this.name = new SimpleStringProperty(name);
        this.description = new SimpleStringProperty(description);
    }
}
