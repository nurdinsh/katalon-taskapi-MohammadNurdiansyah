<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description>CreateBooking</description>
   <name>Create_Booking</name>
   <tag></tag>
   <elementGuidId>a79f7172-ceaf-4d86-8638-21be1f06383d</elementGuidId>
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
      <webElementGuid>c1180b20-5bdc-40e9-b273-7699b404247c</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>4adb73d0-5a52-4a62-8e7a-e9262d4b902a</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>9.7.2</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <path></path>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${GlobalVariable.BaseURL}/booking</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>'Dian'</defaultValue>
      <description></description>
      <id>2758b4ea-fa02-45db-a594-e00f5c12fae0</id>
      <masked>false</masked>
      <name>firstname</name>
   </variables>
   <variables>
      <defaultValue>'Syah'</defaultValue>
      <description></description>
      <id>e70587a5-ed29-4461-afab-35d2765d838c</id>
      <masked>false</masked>
      <name>lastname</name>
   </variables>
   <variables>
      <defaultValue>201</defaultValue>
      <description></description>
      <id>f2b0ef3d-403b-4bfd-9a88-b30daadabcbe</id>
      <masked>false</masked>
      <name>totalprice</name>
   </variables>
   <variables>
      <defaultValue>true</defaultValue>
      <description></description>
      <id>7086878b-9ea8-4ec8-ae9f-fe3658e75ac7</id>
      <masked>false</masked>
      <name>depositpaid</name>
   </variables>
   <variables>
      <defaultValue>'2024-12-19'</defaultValue>
      <description></description>
      <id>7f1b1092-f646-441f-9b54-0d1b77b9b10b</id>
      <masked>false</masked>
      <name>checkin</name>
   </variables>
   <variables>
      <defaultValue>'2025-12-19'</defaultValue>
      <description></description>
      <id>653647c5-cfff-4fbf-8c5b-8559dbddcf73</id>
      <masked>false</masked>
      <name>checkout</name>
   </variables>
   <variables>
      <defaultValue>'Coffee'</defaultValue>
      <description></description>
      <id>002d97ae-aad7-4233-96f5-d5e2b1e620d3</id>
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

WS.verifyElementPropertyValue(response, 'booking.firstname', 'Dian')
WS.verifyElementPropertyValue(response, 'booking.lastname', &quot;Syah&quot;)
WS.verifyElementPropertyValue(response, 'booking.totalprice', 201)
WS.verifyElementPropertyValue(response, 'booking.depositpaid', true)
WS.verifyElementPropertyValue(response, 'booking.bookingdates.checkin', &quot;2024-12-19&quot;)
WS.verifyElementPropertyValue(response, 'booking.bookingdates.checkout', &quot;2025-12-19&quot;)
WS.verifyElementPropertyValue(response, 'booking.additionalneeds', &quot;Coffee&quot;)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
