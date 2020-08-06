package com.lin;

/**
 * Company: 上海数慧系统技术有限公司
 * Department: 数据中心
 * Date: 2020/8/6 11:34
 * Author: linf
 * Desc：TODO
 */
public class T3 {

    public static void main(String[] args) {
        String ip = "172.18.3.136";
        String port = "8088";
        String api = "/api/user/list";
        String result = String.format("%s:%s%s",ip, port, api); // 172.18.3.136:8088/api/user/list
        System.out.println(result);

        String s1 = "hello";
        String s2 = "world";
        System.out.println(String.format("%s %s!!!", s1, s2));


        /**
         *   String.format("%s%s/%s/MapServer",
         this.ruleStepMeta.getPublishedServiceDirectoryURL(),
         this.ruleStepMeta.getPublishTargetDirectoryName(),
         this.ruleStepMeta.getServiceName()));
         */

    }
}
