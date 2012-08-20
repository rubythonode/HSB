// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package kr.swmaestro.hsb.model;

import java.lang.String;

privileged aspect Article_Roo_ToString {
    
    public String Article.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cache: ").append(getCache()).append(", ");
        sb.append("CommentCount: ").append(getCommentCount()).append(", ");
        sb.append("Content: ").append(getContent()).append(", ");
        sb.append("Errors: ").append(getErrors() == null ? "null" : getErrors().size()).append(", ");
        sb.append("Id: ").append(getId()).append(", ");
        sb.append("SecureKey: ").append(getSecureKey()).append(", ");
        sb.append("TargetUserId: ").append(getTargetUserId()).append(", ");
        sb.append("TargetUserNickname: ").append(getTargetUserNickname()).append(", ");
        sb.append("TargetUserUsername: ").append(getTargetUserUsername()).append(", ");
        sb.append("Version: ").append(getVersion()).append(", ");
        sb.append("WriteDate: ").append(getWriteDate()).append(", ");
        sb.append("WriterId: ").append(getWriterId()).append(", ");
        sb.append("WriterNickname: ").append(getWriterNickname()).append(", ");
        sb.append("WriterUsername: ").append(getWriterUsername()).append(", ");
        sb.append("Success: ").append(isSuccess());
        return sb.toString();
    }
    
}
