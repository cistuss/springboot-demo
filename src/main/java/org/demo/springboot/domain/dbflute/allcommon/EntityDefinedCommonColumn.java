package org.demo.springboot.domain.dbflute.allcommon;

import org.dbflute.Entity;

/**
 * The interface of entity defined common columns.
 * @author DBFlute(AutoGenerator)
 */
public interface EntityDefinedCommonColumn extends Entity {

    /**
     * Get the value of createDatetime.
     * @return The instance of the property type. (NullAllowed)
     */
    java.time.LocalDateTime getCreateDatetime();

    /**
     * Set the value of createDatetime.
     * @param createDatetime The instance of the property type. (NullAllowed)
     */
    void setCreateDatetime(java.time.LocalDateTime createDatetime);

    /**
     * Get the value of updateDatetime.
     * @return The instance of the property type. (NullAllowed)
     */
    java.time.LocalDateTime getUpdateDatetime();

    /**
     * Set the value of updateDatetime.
     * @param updateDatetime The instance of the property type. (NullAllowed)
     */
    void setUpdateDatetime(java.time.LocalDateTime updateDatetime);
}
