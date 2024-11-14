<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description>UpdateBooking</description>
   <name>Update_Booking</name>
   <tag></tag>
   <elementGuidId>3a122389-d4ee-4670-8010-834911c4c738</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>true</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;firstname\&quot;: \&quot;${firstname}\&quot;,\n  \&quot;lastname\&quot;: \&quot;${lastname}\&quot;,\n  \&quot;totalprice\&quot;: \&quot;${totalprice}\&quot;,\n  \&quot;depositpaid\&quot;: \&quot;${depositpaid}\&quot;,\n  \&quot;bookingdates\&quot;:{\n    \&quot;checkin\&quot;: \&quot;${checkin}\&quot;,\n    \&quot;checkout\&quot;: \&quot;${checkout}\&quot;\n  },\n  \&quot;additionalneeds\&quot;: \&quot;${additionalneeds}\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>a31479db-9329-46d9-8ac6-72f8edb6a772</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>c8df1e24-eec2-4f0a-82a2-80d0d1f99d9c</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Cookie</name>
      <type>Main</type>
      <value>token = ${token}</value>
      <webElementGuid>18417264-723a-4a27-aabd-90fc7d5c6550</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Basic YWRtaW46cGFzc3dvcmQxMjM=</value>
      <webElementGuid>89b200ca-90a7-4092-ae8f-952eca3522cb</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>9.7.2</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <path></path>
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>${GlobalVariable.BaseURL}/booking/${id}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.Token</defaultValue>
      <description></description>
      <id>5dbac271-47aa-4153-b0f9-91806d1f08db</id>
      <masked>false</masked>
      <name>token</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.Id</defaultValue>
      <description></description>
      <id>06a39a1c-23d2-4cba-90c9-eb046b470b37</id>
      <masked>false</masked>
      <name>id</name>
   </variables>
   <variables>
      <defaultValue>'Mohammad'</defaultValue>
      <description></description>
      <id>fa69604f-120d-4ce9-8692-261fe0721d4d</id>
      <masked>false</masked>
      <name>firstname</name>
   </variables>
   <variables>
      <defaultValue>'Nurdiansyah'</defaultValue>
      <description></description>
      <id>f1f24d44-d195-400f-ba62-f50893d95ec3</id>
      <masked>false</masked>
      <name>lastname</name>
   </variables>
   <variables>
      <defaultValue>200</defaultValue>
      <description></description>
      <id>cb7d4574-77de-449a-ad54-400ce5de59f6</id>
      <masked>false</masked>
      <name>totalprice</name>
   </variables>
   <variables>
      <defaultValue>true</defaultValue>
      <description></description>
      <id>a26b0c41-d7f9-4725-b3f8-9d96c7ffcf61</id>
      <masked>false</masked>
      <name>depositpaid</name>
   </variables>
   <variables>
      <defaultValue>'2024-12-19'</defaultValue>
      <description></description>
      <id>af3c0cf9-bfdd-40c1-8047-bdd7fc2eac42</id>
      <masked>false</masked>
      <name>checkin</name>
   </variables>
   <variables>
      <defaultValue>'2025-12-19'</defaultValue>
      <description></description>
      <id>8a8a5d71-28f6-4ebc-9e6f-c4c845a8cf4d</id>
      <masked>false</masked>
      <name>checkout</name>
   </variables>
   <variables>
      <defaultValue>'Coffee'</defaultValue>
      <description></description>
      <id>eee6e395-482b-40e7-86b4-730b5761ddab</id>
      <masked>false</masked>
      <name>additionalneeds</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

WS.verifyResponseStatusCode(response, 200)

assertThat(response.getStatusCode()).isEqualTo(200)

WS.verifyElementPropertyValue(response, 'firstname', &quot;Mohammad&quot;)
WS.verifyElementPropertyValue(response, 'lastname', &quot;Nurdiansyah&quot;)
WS.verifyElementPropertyValue(response, 'totalprice', 200)
WS.verifyElementPropertyValue(response, 'depositpaid', true)
WS.verifyElementPropertyValue(response, 'bookingdates.checkin', &quot;2024-12-19&quot;)
WS.verifyElementPropertyValue(response, 'bookingdates.checkout', &quot;2025-12-19&quot;)
WS.verifyElementPropertyValue(response, 'additionalneeds', &quot;Coffee&quot;)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
