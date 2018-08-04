package com.sample.cxf;

import org.apache.cxf.common.util.Base64Utility;

/**
 * @author kylin
 *
 */
public interface Constants {
    
    
    String URL_LOGISTICS_FREIGHT_MANAGEMENT_1_0_1 = "http://172.30.254.157:8080/kie-server/services/rest/server/containers/instances/logistics-freight-management_1.0.1";

    
    String USER = "kylin";
    String COLON = ":";
    String PASSWORD = "password1!";
    String authorizationHeader = "Basic " + Base64Utility.encode((USER + COLON + PASSWORD).getBytes());
    
    String WHL_43510457804020 = "{\"lookup\":\"default-stateless-ksession\",\"commands\":[{\"insert\":{\"object\":{\"com.sample.models.Booking\":{\"values\":{\"data\":[{\"Summary\":{\"wfobc_transport_term\":\"CY/CY\",\"wfobc_etd\":\"06/05/2018\",\"wfobc_payment_mode\":\"FREIGHT COLLECT\",\"wfobc_total_volumn\":\"60.740\",\"wfobc_bok_contract_no\":\"SINN00769A\",\"wfobc_consign_department\":\"\",\"wfobc_load_port\":\"SHANGHAI\",\"wfobc_notify\":\"KUEHNE & NAGEL N.V.\\rLLOYDSTRAAT 35\\rNL-3024 EA ROTTERDAM HAVEN NR 230\\rNETHERLANDS\",\"wfobc_booking_remark\":\"ONE FE4\\rCONTRACT NUMBER: SINN00769A\\rOB/L NUMBER:\",\"wfobc_voyage\":\"005W\",\"wfobc_booking_party\":\"JENNY.J.LI\",\"wfobc_discharge_port\":\"ROTTERDAM\",\"org_id\":\"\",\"wfobc_vessel_name\":\"LINAH\",\"wfobc_shipper\":\"KUEHNE & NAGEL LIMITED\\r11-16F, BLOCK 1, LIFE HUB AT DANING\\rOFFICE TOWER, 1868, GONG HE XIN RD,\\rZHABEI DISTRICT, SHANGHAI, CHINA\\rAGENT OF BLUE ANCHOR LINE\\rKN REF. 4351-0238-804.160\",\"wfobc_consignee\":\"KUEHNE & NAGEL N.V.\\rLLOYDSTRAAT 35\\rNL-3024 EA ROTTERDAM HAVEN NR 230\\rNETHERLANDS\\rAGENT OF BLUE ANCHOR LINE\",\"order_id\":\"a\",\"wfobc_custom_no\":\"4351-0238-804.160\",\"wfobc_total_gross_weight\":\"5280.00\",\"ext_company\":\"KUEHNE & NAGEL LIMITED\"},\"Container\":[{\"wfobcc_container_type\":\"40GE\",\"wfobcc_container_num\":\"1\"}],\"pages\":{\"endpage\":1,\"startpage\":1,\"fileName\":\"MAPEMLCN0005565401-4351-0238-804.160+.PDF\"},\"Detail\":[{\"wfobcc_description\":\"100% POLY WOMEN WOVEN\\rJACKET\\rKIDS JACKET\\rDUFFLE COAT\\rTTL:627 CTN\\rHS-CODE(S):620213\\rBKG NO:\\rREL NO:\",\"wfobcc_volumn_unit\":\"M3\",\"wfobcc_hscode\":\"620213\",\"wfobcc_quantity\":\"627\",\"wfobcc_marks\":\"N/M\",\"wfobcc_volumn\":\"60.740\",\"wfobcc_pcs\":\"CTN\",\"wfobcc_gross_weight\":\"5280.00\",\"wfobcc_gross_weight_unit\":\"KG\"}]}],\"params\":{\"docType\":\"CONSIGN\",\"appId\":\"FFQ6ht26\",\"appKey\":\"uQ3FE10G\",\"appSecret\":\"d0cef53a5ccef0d564d9c391432c484b\",\"echoStr\":null,\"reqUuid\":\"b821d22e861a4dacbb05ed1a73d313cb\",\"ifNeedOcr\":\"0\",\"ocrType\":\"\",\"billStyle\":\"\",\"ifNeedCallback\":\"0\",\"callbackUrl\":null,\"pathCode\":null,\"fieldStyle\":\"UNDERLINE\"}},\"resultCode\":\"success\",\"resultMessage\":\"识别成功\"}},\"out-identifier\":\"booking\"}},{\"fire-all-rules\":{}},{\"get-objects\":{\"out-identifier\":\"objects\"}},{\"dispose\":{}}]}";
    String SMLINE_43510370803261 = "{\"lookup\":\"default-stateless-ksession\",\"commands\":[{\"insert\":{\"object\":{\"com.sample.models.Booking\":{\"values\":{\"data\":[{\"Summary\":{\"wfobc_transport_term\":\"CY/CY\",\"wfobc_etd\":\"24/04/2018\",\"wfobc_payment_mode\":\"FREIGHT COLLECT\",\"wfobc_total_volumn\":\"91.572\",\"wfobc_bok_contract_no\":\"FAK-AEF171000-WC\",\"wfobc_consign_department\":\"\",\"wfobc_load_port\":\"SHANGHAI\",\"wfobc_notify\":\"KUEHNE + NAGEL, INC.\\r4100 NORTH COMMERCE DRIVE\\rEAST POINT, GA 30344\\rUNITED STATES\\rREF:1019-0707-440.000\",\"wfobc_booking_remark\":\"CONTRACT NUMBER: FAK-AEF171000-WC\\rOB/L NUMBER: SHSB8B485500\\rFAK\\r4/24 SML CPX\",\"wfobc_voyage\":\"1803E\",\"wfobc_booking_party\":\"RYNA WU\",\"wfobc_discharge_port\":\"LONG BEACH,CA\",\"org_id\":\"\",\"wfobc_vessel_name\":\"SM LONG BEACH\",\"wfobc_shipper\":\"KUEHNE & NAGEL LIMITED\\r11-16F, BLOCK 1, LIFE HUB AT DANING\\rOFFICE TOWER, 1868, GONG HE XIN RD,\\rZHABEI DISTRICT, SHANGHAI, CHINA\\rAGENT OF BLUE ANCHOR AMERICA LINE\\rKN REF. 4351-0370-803.261\",\"wfobc_consignee\":\"KUEHNE + NAGEL, INC.\\r4100 NORTH COMMERCE DRIVE\\rEAST POINT, GA 30344\\rUNITED STATES\\rAGENT OF BLUE ANCHOR AMERICA LINE\",\"order_id\":\"a\",\"wfobc_custom_no\":\"4351-0370-803.261\",\"wfobc_total_gross_weight\":\"23744.00\",\"ext_company\":\"KUEHNE & NAGEL LIMITED\"},\"Container\":[{\"wfobcc_container_type\":\"40GE\",\"wfobcc_container_num\":\"1\"},{\"wfobcc_container_type\":\"40GE\",\"wfobcc_container_num\":\"1\"},{\"wfobcc_container_type\":\"40GE\",\"wfobcc_container_num\":\"1\"}],\"pages\":{\"endpage\":2,\"startpage\":1,\"fileName\":\"MAPEMLCN0005554020-4351-0370-803.261+.PDF\"},\"Detail\":[{\"wfobcc_description\":\"18 PKGS\\rBKG NO:\\rREL NO:\",\"wfobcc_volumn_unit\":\"M3\",\"wfobcc_quantity\":\"18\",\"wfobcc_marks\":\"CCLU4685466\\rSEAL 310120\",\"wfobcc_volumn\":\"30.132\",\"wfobcc_pcs\":\"PKGS\",\"wfobcc_gross_weight\":\"7344.00\",\"wfobcc_gross_weight_unit\":\"KG\"},{\"wfobcc_description\":\"20 PKGS\\rBKG NO:\\rREL NO:\",\"wfobcc_volumn_unit\":\"M3\",\"wfobcc_quantity\":\"20\",\"wfobcc_marks\":\"SMCU4504715\\rSEAL 310119\",\"wfobcc_volumn\":\"30.720\",\"wfobcc_pcs\":\"PKGS\",\"wfobcc_gross_weight\":\"8200.00\",\"wfobcc_gross_weight_unit\":\"KG\"},{\"wfobcc_description\":\"20 PKGS\\rHOT TOWEL DELTA BOX,\\rGREY TONGS\\rLINER, TRAY 1/3 ATLAS\\rBE BAMBOO TEXTURE\\rTABLECLOTH, WHITE\\rOUTBOUND PO#:\\r506107; 506358; 506360\\rN.W.P.M\\rHS-CODE:6307900000/\\r4823909000/6302539090\\r58 PKGS=58 PLTS\\rTTL:58 PKGS\\rSAY TOTAL FIFTY EIGHT\\rPACKAGES ONLY\\rBKG NO:\\rREL NO:\",\"wfobcc_volumn_unit\":\"M3\",\"wfobcc_hscode\":\"6307900000/\",\"wfobcc_quantity\":\"58\",\"wfobcc_marks\":\"FSCU4701775\\rSEAL 310118\\rN/M\",\"wfobcc_volumn\":\"30.720\",\"wfobcc_pcs\":\"PKGS\",\"wfobcc_gross_weight\":\"8200.00\",\"wfobcc_gross_weight_unit\":\"KG\"}]}],\"params\":{\"docType\":\"CONSIGN\",\"appId\":\"FFQ6ht26\",\"appKey\":\"uQ3FE10G\",\"appSecret\":\"d0cef53a5ccef0d564d9c391432c484b\",\"echoStr\":null,\"reqUuid\":\"14580828a23f4ace84472efd4cf5842b\",\"ifNeedOcr\":\"0\",\"ocrType\":\"\",\"billStyle\":\"\",\"ifNeedCallback\":\"0\",\"callbackUrl\":null,\"pathCode\":null,\"fieldStyle\":\"UNDERLINE\"}},\"resultCode\":\"success\",\"resultMessage\":\"识别成功\"}},\"out-identifier\":\"booking\"}},{\"fire-all-rules\":{}},{\"get-objects\":{\"out-identifier\":\"objects\"}},{\"dispose\":{}}]}";
    String ONE_43510238804160 = "{\"lookup\":\"default-stateless-ksession\",\"commands\":[{\"insert\":{\"object\":{\"com.sample.models.Booking\":{\"values\":{\"data\":[{\"Summary\":{\"wfobc_transport_term\":\"CY/CY\",\"wfobc_etd\":\"06/05/2018\",\"wfobc_payment_mode\":\"FREIGHT COLLECT\",\"wfobc_total_volumn\":\"60.740\",\"wfobc_bok_contract_no\":\"SINN00769A\",\"wfobc_consign_department\":\"\",\"wfobc_load_port\":\"SHANGHAI\",\"wfobc_notify\":\"KUEHNE & NAGEL N.V.\\rLLOYDSTRAAT 35\\rNL-3024 EA ROTTERDAM HAVEN NR 230\\rNETHERLANDS\",\"wfobc_booking_remark\":\"ONE FE4\\rCONTRACT NUMBER: SINN00769A\\rOB/L NUMBER:\",\"wfobc_voyage\":\"005W\",\"wfobc_booking_party\":\"JENNY.J.LI\",\"wfobc_discharge_port\":\"ROTTERDAM\",\"org_id\":\"\",\"wfobc_vessel_name\":\"LINAH\",\"wfobc_shipper\":\"KUEHNE & NAGEL LIMITED\\r11-16F, BLOCK 1, LIFE HUB AT DANING\\rOFFICE TOWER, 1868, GONG HE XIN RD,\\rZHABEI DISTRICT, SHANGHAI, CHINA\\rAGENT OF BLUE ANCHOR LINE\\rKN REF. 4351-0238-804.160\",\"wfobc_consignee\":\"KUEHNE & NAGEL N.V.\\rLLOYDSTRAAT 35\\rNL-3024 EA ROTTERDAM HAVEN NR 230\\rNETHERLANDS\\rAGENT OF BLUE ANCHOR LINE\",\"order_id\":\"a\",\"wfobc_custom_no\":\"4351-0238-804.160\",\"wfobc_total_gross_weight\":\"5280.00\",\"ext_company\":\"KUEHNE & NAGEL LIMITED\"},\"Container\":[{\"wfobcc_container_type\":\"40GE\",\"wfobcc_container_num\":\"1\"}],\"pages\":{\"endpage\":1,\"startpage\":1,\"fileName\":\"MAPEMLCN0005565401-4351-0238-804.160+.PDF\"},\"Detail\":[{\"wfobcc_description\":\"100% POLY WOMEN WOVEN\\rJACKET\\rKIDS JACKET\\rDUFFLE COAT\\rTTL:627 CTN\\rHS-CODE(S):620213\\rBKG NO:\\rREL NO:\",\"wfobcc_volumn_unit\":\"M3\",\"wfobcc_hscode\":\"620213\",\"wfobcc_quantity\":\"627\",\"wfobcc_marks\":\"N/M\",\"wfobcc_volumn\":\"60.740\",\"wfobcc_pcs\":\"CTN\",\"wfobcc_gross_weight\":\"5280.00\",\"wfobcc_gross_weight_unit\":\"KG\"}]}],\"params\":{\"docType\":\"CONSIGN\",\"appId\":\"FFQ6ht26\",\"appKey\":\"uQ3FE10G\",\"appSecret\":\"d0cef53a5ccef0d564d9c391432c484b\",\"echoStr\":null,\"reqUuid\":\"b821d22e861a4dacbb05ed1a73d313cb\",\"ifNeedOcr\":\"0\",\"ocrType\":\"\",\"billStyle\":\"\",\"ifNeedCallback\":\"0\",\"callbackUrl\":null,\"pathCode\":null,\"fieldStyle\":\"UNDERLINE\"}},\"resultCode\":\"success\",\"resultMessage\":\"识别成功\"}},\"out-identifier\":\"booking\"}},{\"fire-all-rules\":{}},{\"get-objects\":{\"out-identifier\":\"objects\"}},{\"dispose\":{}}]}";
    String ONE_43519188804541 = "{\"lookup\":\"default-stateless-ksession\",\"commands\":[{\"insert\":{\"object\":{\"com.sample.models.Booking\":{\"values\":{\"data\":[{\"Summary\":{\"wfobc_transport_term\":\"CY/CY\",\"wfobc_etd\":\"27/04/2018\",\"wfobc_payment_mode\":\"FREIGHT COLLECT\",\"wfobc_total_volumn\":\"159.149\",\"wfobc_bok_contract_no\":\"SC0119919\",\"wfobc_consign_department\":\"\",\"wfobc_load_port\":\"SHANGHAI\",\"wfobc_booking_remark\":\"CONTRACT NUMBER: SC0119919\\rOB/L NUMBER:\\r4-27 ONE PS5\",\"wfobc_voyage\":\"092E\",\"wfobc_booking_party\":\"ACE ZHUANG\",\"wfobc_discharge_port\":\"LOS ANGELES,CA\",\"org_id\":\"\",\"wfobc_vessel_name\":\"NYK AQUARIUS\",\"wfobc_shipper\":\"HEALTH & LIFE (SUZHOU) CO., LTD\\rNO 1428 XIANGILANG ROAD\\rSUZHOU 215129 CHINA\\rKN REF. 4351-9188-804.541\",\"wfobc_consignee\":\"HOMEDICS USA,LLC\\r3000 PONTIAC TRAIL\\rCOMMERCE TOWNSHIP MI 48390\\rUNITED STATES\",\"order_id\":\"a\",\"wfobc_custom_no\":\"4351-9188-804.541\",\"wfobc_total_gross_weight\":\"25801.51\",\"ext_company\":\"KUEHNE & NAGEL LIMITED\"},\"Container\":[{\"wfobcc_container_type\":\"40GE\",\"wfobcc_container_num\":\"1\"},{\"wfobcc_container_type\":\"40GE\",\"wfobcc_container_num\":\"1\"},{\"wfobcc_container_type\":\"40GE\",\"wfobcc_container_num\":\"1\"}],\"pages\":{\"endpage\":2,\"startpage\":1,\"fileName\":\"MAPEMLCN0005546416-4351-9188-804.541+.pdf\"},\"Detail\":[{\"wfobcc_description\":\"WALG AUTO WRIST 2017\\rWALG AUTO ARM 2017\\r3417 PACKAGES\\rHS-CODE(S):9018.19\\rBKG NO:\\rREL NO:\",\"wfobcc_volumn_unit\":\"M3\",\"wfobcc_hscode\":\"9018.19\",\"wfobcc_quantity\":\"3417\",\"wfobcc_marks\":\"\",\"wfobcc_volumn\":\"54.538\",\"wfobcc_pcs\":\"PACKAGES\",\"wfobcc_gross_weight\":\"9204.60\",\"wfobcc_gross_weight_unit\":\"KG\"},{\"wfobcc_description\":\"WALG AUTO WRIST 2017\\rWALG AUTO ARM 2017\\r2501 PACKAGES\\rHS-CODE(S):9018.19\\rBKG NO:\\rREL NO:\",\"wfobcc_volumn_unit\":\"M3\",\"wfobcc_hscode\":\"9018.19\",\"wfobcc_quantity\":\"2501\",\"wfobcc_marks\":\"\",\"wfobcc_volumn\":\"54.773\",\"wfobcc_pcs\":\"PACKAGES\",\"wfobcc_gross_weight\":\"7927.54\",\"wfobcc_gross_weight_unit\":\"KG\"},{\"wfobcc_description\":\"WALGREENS DELUXE ARM 2016\\rWALG AUTO ARM 2017\\rSTANDARD SIZE CUFF\\rLARGE SIZE CUFF\\rNEW UNIVERSAL CUFF\\rSTANDARD SIZE CUFF FOR BPA\\r-040\\rLARGE SIZE CUFF FOR BPA-04\\r0\\r2969 PACKAGES\\rHS-CODE(S):9018.19\\rBKG NO:\\rREL NO:\",\"wfobcc_volumn_unit\":\"M3\",\"wfobcc_hscode\":\"9018.19\",\"wfobcc_quantity\":\"2969\",\"wfobcc_marks\":\"\",\"wfobcc_volumn\":\"49.838\",\"wfobcc_pcs\":\"PACKAGES\",\"wfobcc_gross_weight\":\"8669.37\",\"wfobcc_gross_weight_unit\":\"KG\"}]}],\"params\":{\"docType\":\"CONSIGN\",\"appId\":\"FFQ6ht26\",\"appKey\":\"uQ3FE10G\",\"appSecret\":\"d0cef53a5ccef0d564d9c391432c484b\",\"echoStr\":null,\"reqUuid\":\"dfd1a8308a9242b791fc50d6d659f2db\",\"ifNeedOcr\":\"0\",\"ocrType\":\"\",\"billStyle\":\"\",\"ifNeedCallback\":\"0\",\"callbackUrl\":null,\"pathCode\":null,\"fieldStyle\":\"UNDERLINE\"}},\"resultCode\":\"success\",\"resultMessage\":\"识别成功\"}},\"out-identifier\":\"booking\"}},{\"fire-all-rules\":{}},{\"get-objects\":{\"out-identifier\":\"objects\"}},{\"dispose\":{}}]}";
    String ONE_43510158804118 = "{\"lookup\":\"default-stateless-ksession\",\"commands\":[{\"insert\":{\"object\":{\"com.sample.models.Booking\":{\"values\":{\"data\":[{\"Summary\":{\"wfobc_transport_term\":\"CY/CY\",\"wfobc_etd\":\"30/04/2018\",\"wfobc_payment_mode\":\"FREIGHT PREPAID\",\"wfobc_total_volumn\":\"60.000\",\"wfobc_bok_contract_no\":\"SINN00769A\",\"wfobc_consign_department\":\"\",\"wfobc_load_port\":\"SHANGHAI\",\"wfobc_notify\":\"KUEHNE & NAGEL SPOL S R O\\rPEKARSKA 7\\r15500 PRAHA 5\\rCZECH REPUBLIC\",\"wfobc_booking_remark\":\"CONTRACT NUMBER: SINN00769A\\rOB/L NUMBER:\",\"wfobc_voyage\":\"004W\",\"wfobc_booking_party\":\"JANE XU\",\"wfobc_discharge_port\":\"HAMBURG\",\"org_id\":\"\",\"wfobc_vessel_name\":\"MOL TRIBUTE\",\"wfobc_shipper\":\"KUEHNE & NAGEL LIMITED\\r11-16F, BLOCK 1, LIFE HUB AT DANING\\rOFFICE TOWER, 1868, GONG HE XIN RD,\\rZHABEI DISTRICT, SHANGHAI, CHINA\\rAGENT OF BLUE ANCHOR LINE\\rKN REF. 4351-0158-804.118\",\"wfobc_consignee\":\"KUEHNE & NAGEL SPOL S R O\\rPEKARSKA 7\\r15500 PRAHA 5\\rCZECH REPUBLIC\\rAGENT OF BLUE ANCHOR LINE\",\"order_id\":\"a\",\"wfobc_custom_no\":\"4351-0158-804.118\",\"wfobc_total_gross_weight\":\"15835.00\",\"ext_company\":\"KUEHNE & NAGEL LIMITED\"},\"Container\":[{\"wfobcc_container_type\":\"40HC\",\"wfobcc_container_num\":\"1\"}],\"pages\":{\"endpage\":1,\"startpage\":1,\"fileName\":\"MAPEMLCN0005565383-4351-0158-804.118+.PDF\"},\"Detail\":[{\"wfobcc_description\":\"PLASTIC\\rNAC:\\rBESTWAY INFLATABLES CORP\\rBKG NO:\\rREL NO:\",\"wfobcc_volumn_unit\":\"M3\",\"wfobcc_quantity\":\"1\",\"wfobcc_marks\":\"N/M\",\"wfobcc_volumn\":\"60.000\",\"wfobcc_pcs\":\"40' HC\",\"wfobcc_gross_weight\":\"15835.00\",\"wfobcc_gross_weight_unit\":\"KG\"}]}],\"params\":{\"docType\":\"CONSIGN\",\"appId\":\"FFQ6ht26\",\"appKey\":\"uQ3FE10G\",\"appSecret\":\"d0cef53a5ccef0d564d9c391432c484b\",\"echoStr\":null,\"reqUuid\":\"bcf204b4e96245a7a19d8868582a7cf1\",\"ifNeedOcr\":\"0\",\"ocrType\":\"\",\"billStyle\":\"\",\"ifNeedCallback\":\"0\",\"callbackUrl\":null,\"pathCode\":null,\"fieldStyle\":\"UNDERLINE\"}},\"resultCode\":\"success\",\"resultMessage\":\"识别成功\"}},\"out-identifier\":\"booking\"}},{\"fire-all-rules\":{}},{\"get-objects\":{\"out-identifier\":\"objects\"}},{\"dispose\":{}}]}";
    String ONE_43510375803063 = "{\"lookup\":\"default-stateless-ksession\",\"commands\":[{\"insert\":{\"object\":{\"com.sample.models.Booking\":{\"values\":{\"data\":[{\"Summary\":{\"wfobc_transport_term\":\"CY/CY\",\"wfobc_etd\":\"03/05/2018\",\"wfobc_payment_mode\":\"FREIGHT COLLECT\",\"wfobc_total_volumn\":\"66.936\",\"wfobc_bok_contract_no\":\"FIX-RIC5076704_EC\",\"wfobc_consign_department\":\"\",\"wfobc_load_port\":\"SHANGHAI\",\"wfobc_notify\":\"KUEHNE + NAGEL, INC.\\r1001 BUSSE ROAD\\rELK GROVE VILLAGE, IL 60007\\rUSA\\rREF:1018-6692-540.000\",\"wfobc_booking_remark\":\"CONTRACT NUMBER: FIX-RIC5076704_EC\\rOB/L NUMBER:\",\"wfobc_voyage\":\"001E\",\"wfobc_booking_party\":\"PEILI JI\",\"wfobc_discharge_port\":\"WILMINGTON, NC\",\"org_id\":\"\",\"wfobc_vessel_name\":\"NORTHERN JUSTICE\",\"wfobc_shipper\":\"KUEHNE & NAGEL LIMITED\\r11-16F, BLOCK 1, LIFE HUB AT DANING\\rOFFICE TOWER, 1868, GONG HE XIN RD,\\rZHABEI DISTRICT, SHANGHAI, CHINA\\rAGENT OF BLUE ANCHOR AMERICA LINE\\rKN REF. 4351-0375-803.063\",\"wfobc_consignee\":\"KUEHNE + NAGEL, INC.\\r1001 BUSSE ROAD\\rELK GROVE VILLAGE, IL 60007\\rUSA\\rAGENT OF BLUE ANCHOR AMERICA LINE\",\"order_id\":\"a\",\"wfobc_custom_no\":\"4351-0375-803.063\",\"wfobc_total_gross_weight\":\"7777.60\",\"ext_company\":\"KUEHNE & NAGEL LIMITED\"},\"Container\":[{\"wfobcc_container_type\":\"40HC\",\"wfobcc_container_num\":\"1\"}],\"pages\":{\"endpage\":1,\"startpage\":1,\"fileName\":\"MAPEMLCN0005553909-4351-0375-803.063+.PDF\"},\"Detail\":[{\"wfobcc_description\":\"OFFICE CHAIR\\rNO S.W.P.M.\\rS/C:FIX-RIC5076704_EC\\rNAC:OFM\\rA1 \\rHS-CODE(S):940130\\rBKG NO:\\rREL NO:\",\"wfobcc_volumn_unit\":\"M3\",\"wfobcc_hscode\":\"940130\",\"wfobcc_quantity\":\"1\",\"wfobcc_marks\":\"OFM\\r1503810\",\"wfobcc_volumn\":\"66.936\",\"wfobcc_pcs\":\"40' HC\",\"wfobcc_gross_weight\":\"7777.60\",\"wfobcc_gross_weight_unit\":\"KG\"}]}],\"params\":{\"docType\":\"CONSIGN\",\"appId\":\"FFQ6ht26\",\"appKey\":\"uQ3FE10G\",\"appSecret\":\"d0cef53a5ccef0d564d9c391432c484b\",\"echoStr\":null,\"reqUuid\":\"8f862069ab2e4895b4e07cd80f84c06f\",\"ifNeedOcr\":\"0\",\"ocrType\":\"\",\"billStyle\":\"\",\"ifNeedCallback\":\"0\",\"callbackUrl\":null,\"pathCode\":null,\"fieldStyle\":\"UNDERLINE\"}},\"resultCode\":\"success\",\"resultMessage\":\"识别成功\"}},\"out-identifier\":\"booking\"}},{\"fire-all-rules\":{}},{\"get-objects\":{\"out-identifier\":\"objects\"}},{\"dispose\":{}}]}";
    String MSC_43510382804029 = "{\"lookup\":\"default-stateless-ksession\",\"commands\":[{\"insert\":{\"object\":{\"com.sample.models.Booking\":{\"values\":{\"data\":[{\"Summary\":{\"wfobc_transport_term\":\"CY/CY\",\"wfobc_etd\":\"27/04/2018\",\"wfobc_payment_mode\":\"FREIGHT PREPAID\",\"wfobc_total_volumn\":\"68.000\",\"wfobc_bok_contract_no\":\"17-108TPC-126\",\"wfobc_consign_department\":\"\",\"wfobc_load_port\":\"SHANGHAI\",\"wfobc_notify\":\"KUEHNE + NAGEL, INC.\\r11501 METRO AIRPORT CENTER DRIVE\\rSUITE 100\\rROMULUS, MI 48174,  U.S.A.\",\"wfobc_booking_remark\":\"CONTRACT NUMBER: 17-108TPC-126\\rOB/L NUMBER:\\r4/27 MSC JAGUAR FM SHA TO DET VIA LGB\\r1*40HQ\\rA/C YANFENG\\rMSC CODE: US003858\",\"wfobc_voyage\":\"FX816N\",\"wfobc_booking_party\":\"CHERRY LI\",\"wfobc_discharge_port\":\"LONG BEACH,CA\",\"org_id\":\"\",\"wfobc_vessel_name\":\"MSC LAUREN\",\"wfobc_shipper\":\"KUEHNE & NAGEL LIMITED\\r11-16F, BLOCK 1, LIFE HUB AT DANING\\rOFFICE TOWER, 1868, GONG HE XIN RD,\\rZHABEI DISTRICT, SHANGHAI, CHINA\\rAGENT OF BLUE ANCHOR AMERICA LINE\\rKN REF. 4351-0382-804.029\",\"wfobc_consignee\":\"KUEHNE + NAGEL, INC.\\r11501 METRO AIRPORT CENTER DRIVE\\rSUITE 100\\rROMULUS, MI 48174,  U.S.A.\\rAGENT OF BLUE ANCHOR AMERICA LINE\",\"order_id\":\"a\",\"wfobc_custom_no\":\"4351-0382-804.029\",\"wfobc_total_gross_weight\":\"3960.00\",\"ext_company\":\"KUEHNE & NAGEL LIMITED\"},\"Container\":[{\"wfobcc_container_type\":\"40HC\",\"wfobcc_container_num\":\"1\"}],\"pages\":{\"endpage\":2,\"startpage\":1,\"fileName\":\"MAPEMLCN0005521975-4351-0382-804.029+.PDF\"},\"Detail\":[{\"wfobcc_description\":\"AUTO PARTS\\r(DOOR'S TRIM)\\rNO S.W.P.M.\\rA/C YANFENG\\rNO MSC CHASSIS REQUIRED\\rDESTINATION\\rHS-CODE(S):870829\\rBKG NO:\\rREL NO:\",\"wfobcc_volumn_unit\":\"M3\",\"wfobcc_hscode\":\"870829\",\"wfobcc_quantity\":\"1\",\"wfobcc_marks\":\"N/M\",\"wfobcc_volumn\":\"68.000\",\"wfobcc_pcs\":\"40' HC\",\"wfobcc_gross_weight\":\"3960.00\"}]}],\"params\":{\"docType\":\"CONSIGN\",\"appId\":\"FFQ6ht26\",\"appKey\":\"uQ3FE10G\",\"appSecret\":\"d0cef53a5ccef0d564d9c391432c484b\",\"echoStr\":null,\"reqUuid\":\"c243f942ea714e24ba3a643afcfab207\",\"ifNeedOcr\":\"0\",\"ocrType\":\"\",\"billStyle\":\"\",\"ifNeedCallback\":\"0\",\"callbackUrl\":null,\"pathCode\":null,\"fieldStyle\":\"UNDERLINE\"}},\"resultCode\":\"success\",\"resultMessage\":\"识别成功\"}},\"out-identifier\":\"booking\"}},{\"fire-all-rules\":{}},{\"get-objects\":{\"out-identifier\":\"objects\"}},{\"dispose\":{}}]}";
    String IAL_43510139804040 = "{\"lookup\":\"default-stateless-ksession\",\"commands\":[{\"insert\":{\"object\":{\"com.sample.models.Booking\":{\"values\":{\"data\":[{\"Summary\":{\"wfobc_transport_term\":\"CY/CY\",\"wfobc_etd\":\"02/05/2018\",\"wfobc_payment_mode\":\"FREIGHT PREPAID\",\"wfobc_total_volumn\":\"45.000\",\"wfobc_bok_contract_no\":\"KONE\",\"wfobc_consign_department\":\"\",\"wfobc_load_port\":\"SHANGHAI\",\"wfobc_notify\":\"KUEHNE + NAGEL SDN. BHD.\\r1 JALAN BUMBUNG U8/90 SEKSYEN U8\\rPERINDUSTRIAN BUKIT JELUTONG\\r40150 SHAN ALAM, SELANGOR, MALAYSIA\",\"wfobc_booking_remark\":\"CONTRACT NUMBER: KONE\\rOB/L NUMBER:\",\"wfobc_voyage\":\"TBA\",\"wfobc_booking_party\":\"SCOTT CHE\",\"wfobc_discharge_port\":\"PORT KLANG\",\"org_id\":\"\",\"wfobc_vessel_name\":\"TBN\",\"wfobc_shipper\":\"KUEHNE & NAGEL LIMITED\\r11-16F, BLOCK 1, LIFE HUB AT DANING\\rOFFICE TOWER, 1868, GONG HE XIN RD,\\rZHABEI DISTRICT, SHANGHAI, CHINA\\rAGENT OF BLUE ANCHOR LINE\\rKN REF. 4351-0139-804.040\",\"wfobc_consignee\":\"KUEHNE + NAGEL SDN. BHD.\\r1 JALAN BUMBUNG U8/90 SEKSYEN U8\\rPERINDUSTRIAN BUKIT JELUTONG\\r40150 SHAN ALAM, SELANGOR, MALAYSIA\\rAGENT OF BLUE ANCHOR LINE\",\"order_id\":\"a\",\"wfobc_custom_no\":\"4351-0139-804.040\",\"wfobc_total_gross_weight\":\"45000.00\",\"ext_company\":\"KUEHNE & NAGEL LIMITED\"},\"Container\":[{\"wfobcc_container_type\":\"40HC\",\"wfobcc_container_num\":\"1\"},{\"wfobcc_container_type\":\"40HC\",\"wfobcc_container_num\":\"1\"},{\"wfobcc_container_type\":\"40HC\",\"wfobcc_container_num\":\"1\"}],\"pages\":{\"endpage\":2,\"startpage\":1,\"fileName\":\"MAPEMLCN0005560197-4351-0139-804.040+.PDF\"},\"Detail\":[{\"wfobcc_description\":\"TWO PIECES OF MAP\\rESCALATOR\\rBKG NO:\\rREL NO:\",\"wfobcc_volumn_unit\":\"M3\",\"wfobcc_quantity\":\"1\",\"wfobcc_marks\":\"KONE\\rES20180261\",\"wfobcc_volumn\":\"15.000\",\"wfobcc_pcs\":\"40' HC\",\"wfobcc_gross_weight\":\"15000.00\",\"wfobcc_gross_weight_unit\":\"KG\"},{\"wfobcc_description\":\"TWO PIECES OF MAP00\\rESCALATOR\\rBKG NO:\\rREL NO:\",\"wfobcc_volumn_unit\":\"M3\",\"wfobcc_quantity\":\"1\",\"wfobcc_marks\":\"KONE\\rES20180261\",\"wfobcc_volumn\":\"15.000\",\"wfobcc_pcs\":\"40' HC\",\"wfobcc_gross_weight\":\"15000.00\",\"wfobcc_gross_weight_unit\":\"KG\"},{\"wfobcc_description\":\"TWO PIECES OF MAP\\rESCALATOR\\rBKG NO:\",\"wfobcc_volumn_unit\":\"M3\",\"wfobcc_quantity\":\"1\",\"wfobcc_marks\":\"KONE\\rES20180261\",\"wfobcc_volumn\":\"15.000\",\"wfobcc_pcs\":\"40' HC\",\"wfobcc_gross_weight\":\"15000.00\",\"wfobcc_gross_weight_unit\":\"KG\"}]}],\"params\":{\"docType\":\"CONSIGN\",\"appId\":\"FFQ6ht26\",\"appKey\":\"uQ3FE10G\",\"appSecret\":\"d0cef53a5ccef0d564d9c391432c484b\",\"echoStr\":null,\"reqUuid\":\"77d395ed575648059131026175c1a4d9\",\"ifNeedOcr\":\"0\",\"ocrType\":\"\",\"billStyle\":\"\",\"ifNeedCallback\":\"0\",\"callbackUrl\":null,\"pathCode\":null,\"fieldStyle\":\"UNDERLINE\"}},\"resultCode\":\"success\",\"resultMessage\":\"识别成功\"}},\"out-identifier\":\"booking\"}},{\"fire-all-rules\":{}},{\"get-objects\":{\"out-identifier\":\"objects\"}},{\"dispose\":{}}]}";
    
    
    String[] commands = {WHL_43510457804020, SMLINE_43510370803261, ONE_43510238804160, ONE_43519188804541, ONE_43510158804118, ONE_43510375803063, MSC_43510382804029, IAL_43510139804040};

}