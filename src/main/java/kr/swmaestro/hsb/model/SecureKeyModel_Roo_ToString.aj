// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package kr.swmaestro.hsb.model;

import java.lang.String;

privileged aspect SecureKeyModel_Roo_ToString {
    
    public String SecureKeyModel.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SecureKey: ").append(getSecureKey());
        return sb.toString();
    }
    
}
