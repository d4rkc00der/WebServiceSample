package com.soho.shumakov.endpoint

/**
 * Created by evgenyshumakov on 01.10.2017.
 */

import javax.xml.ws.Endpoint
import com.soho.shumakov.ws.MyServiceImpl

class MyServicePublisher {
    companion object{
        var SERVICE_URL: String = "http://localhost:1986/wss/hello"
    }
}

fun main(args: Array<String>) {
    Endpoint.publish(MyServicePublisher.SERVICE_URL, MyServiceImpl())
}

