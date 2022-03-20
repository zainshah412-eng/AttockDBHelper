package com.example.dbhelperlibrary.DB;

/**
 * Created by nisar.ahmed on 7/23/2017.
 */

public class DBQueries {
    public static String updateDocType="UPDATE \n" +
            "  `ma_apl_ri`.`ma_doctype` \n" +
            "SET\n" +
            "  `id` = 'id',\n" +
            "  `DocID` = 'DocID',\n" +
            "  `DocName` = 'DocName',\n" +
            "  `AreaInchargeID` = 'AreaInchargeID',\n" +
            "  `AreaInchargeDesc` = 'AreaInchargeDesc',\n" +
            "  `PrevTcpCode` = 'PrevTcpCode',\n" +
            "  `PrevTcpDate` = 'PrevTcpDate',\n" +
            "  `s_dt` = 's_dt',\n" +
            "  `s_is_sync` = 's_is_sync',\n" +
            "  `s_long` = 's_long',\n" +
            "  `s_lat` = 's_lat' \n" +
            "WHERE `id` = 'id' ;";


    public static String inserRetailSits="INSERT INTO `ma_apl_ri`.`ma_retailsites` (\n" +
            "  `id`,\n" +
            "  `MA_DocType_id`,\n" +
            "  `DocID`,\n" +
            "  `CostCentreID`,\n" +
            "  `CostCentreDesc`,\n" +
            "  `Location`,\n" +
            "  `District`,\n" +
            "  `LastInspDate`,\n" +
            "  `s_date`,\n" +
            "  `s_is_sync`,\n" +
            "  `s_status`,\n" +
            "  `s_long`,\n" +
            "  `s_lat`\n" +
            ") \n" +
            "VALUES\n" +
            "  (\n" +
            "    'id',\n" +
            "    'MA_DocType_id',\n" +
            "    'DocID',\n" +
            "    'CostCentreID',\n" +
            "    'CostCentreDesc',\n" +
            "    'Location',\n" +
            "    'District',\n" +
            "    'LastInspDate',\n" +
            "    's_date',\n" +
            "    's_is_sync',\n" +
            "    's_status',\n" +
            "    's_long',\n" +
            "    's_lat'\n" +
            "  ) ;";
}
