package ng.com.soh.ms.core.model;

import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by Blurryface on 10/25/17.
 */
public abstract class AbstractModel extends BaseModel {
    @NotBlank
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
