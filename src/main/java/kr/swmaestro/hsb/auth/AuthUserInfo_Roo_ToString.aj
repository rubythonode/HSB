// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package kr.swmaestro.hsb.auth;

import java.lang.String;

privileged aspect AuthUserInfo_Roo_ToString {
    
    public String AuthUserInfo.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Password: ").append(getPassword()).append(", ");
        sb.append("Username: ").append(getUsername());
        return sb.toString();
    }
    
}
