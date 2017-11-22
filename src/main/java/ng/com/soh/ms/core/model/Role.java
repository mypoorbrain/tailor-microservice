package ng.com.soh.ms.core.model;

import javax.validation.constraints.NotNull;

/**
 * Created by Blurryface on 10/25/17.
 */
public class Role extends AbstractModel {
    @NotNull
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
