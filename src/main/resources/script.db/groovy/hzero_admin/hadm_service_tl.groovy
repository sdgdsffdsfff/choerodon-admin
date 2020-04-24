package script.db

databaseChangeLog(logicalFilePath: 'script/db/hadm_service_tl.groovy') {
    changeSet(author: "hzero@hand-china.com", id: "2020-01-04-hadm_service_tl") {
        def weight = 1
        if(helper.isSqlServer()){
            weight = 2
        } else if(helper.isOracle()){
            weight = 3
        }
        if(helper.dbType().isSupportSequence()){
            createSequence(sequenceName: 'hadm_service_tl_s', startValue:"1")
        }
        createTable(tableName: "hadm_service_tl", remarks: "") {
            column(name: "service_id", type: "bigint(20)",  remarks: "")  {constraints(nullable:"false")}  
            column(name: "lang", type: "varchar(" + 16 * weight + ")",  remarks: "语言名称")  {constraints(nullable:"false")}  
            column(name: "service_name", type: "varchar(" + 90 * weight + ")",  remarks: "服务名称")  {constraints(nullable:"false")}  
        }

    }
}