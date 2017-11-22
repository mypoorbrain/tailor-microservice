package ng.com.soh.ms.core.model;


import javax.validation.constraints.NotNull;

/**
 * Created by Blurryface on 10/25/17.
 */
public abstract class BaseModel {
    @NotNull
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
