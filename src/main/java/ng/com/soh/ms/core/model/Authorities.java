package ng.com.soh.ms.core.model;

import java.util.List;

/**
 * Created by Blurryface on 10/31/17.
 */

public class Authorities {
    private String roleName;
    private List<String> permissionNames;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<String> getPermissionNames() {
        return permissionNames;
    }

    public void setPermissionNames(List<String> permissionNames) {
        this.permissionNames = permissionNames;
    }
}
