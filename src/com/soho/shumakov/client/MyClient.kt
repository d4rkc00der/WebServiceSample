package com.soho.shumakov.client

/**
 * Created by evgenyshumakov on 01.10.2017.
 */

import java.net.URL
import java.net.MalformedURLException

import javax.xml.namespace.QName
import javax.xml.ws.Service

import com.soho.shumakov.ws.MyService

class MyClient {
}
fun main(args: Array<String>) {
    var url : URL = URL("http://localhost:1986/wss/hello?wsdl")
    var qname : QName = QName("http://ws.shumakov.soho.com/", "MyServiceImplService")
    var service : Service = Service.create(url,qname)
    var myservice : MyService = service.getPort(MyService::class.java)
    System.out.println(myservice.getNameOfService())
}

