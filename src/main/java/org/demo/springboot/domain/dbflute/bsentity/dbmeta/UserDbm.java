package org.demo.springboot.domain.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.demo.springboot.domain.dbflute.allcommon.*;
import org.demo.springboot.domain.dbflute.exentity.*;

/**
 * The DB meta of user. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class UserDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final UserDbm _instance = new UserDbm();
    private UserDbm() {}
    public static UserDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((User)et).getUserId(), (et, vl) -> ((User)et).setUserId(cti(vl)), "userId");
        setupEpg(_epgMap, et -> ((User)et).getUserName(), (et, vl) -> ((User)et).setUserName((String)vl), "userName");
        setupEpg(_epgMap, et -> ((User)et).getCreateDatetime(), (et, vl) -> ((User)et).setCreateDatetime(ctldt(vl)), "createDatetime");
        setupEpg(_epgMap, et -> ((User)et).getUpdateDatetime(), (et, vl) -> ((User)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "user";
    protected final String _tableDispName = "user";
    protected final String _tablePropertyName = "user";
    protected final TableSqlName _tableSqlName = new TableSqlName("user", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnUserId = cci("user_id", "user_id", null, null, Integer.class, "userId", null, true, true, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserName = cci("user_name", "user_name", null, null, String.class, "userName", null, false, false, true, "VARCHAR", 32, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreateDatetime = cci("create_datetime", "create_datetime", null, null, java.time.LocalDateTime.class, "createDatetime", null, false, false, true, "TIMESTAMP", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "TIMESTAMP", 19, 0, null, null, true, null, null, null, null, null, false);

    /**
     * user_id: {PK, ID, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserId() { return _columnUserId; }
    /**
     * user_name: {NotNull, VARCHAR(32)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserName() { return _columnUserName; }
    /**
     * create_datetime: {NotNull, TIMESTAMP(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCreateDatetime() { return _columnCreateDatetime; }
    /**
     * update_datetime: {NotNull, TIMESTAMP(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnUserId());
        ls.add(columnUserName());
        ls.add(columnCreateDatetime());
        ls.add(columnUpdateDatetime());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnUserId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnCreateDatetime(), columnUpdateDatetime()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnCreateDatetime(), columnUpdateDatetime()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdateDatetime()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.demo.springboot.domain.dbflute.exentity.User"; }
    public String getConditionBeanTypeName() { return "org.demo.springboot.domain.dbflute.cbean.UserCB"; }
    public String getBehaviorTypeName() { return "org.demo.springboot.domain.dbflute.exbhv.UserBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<User> getEntityType() { return User.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public User newEntity() { return new User(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((User)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((User)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
