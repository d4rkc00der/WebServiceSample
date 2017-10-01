/**
 * Created by evgenyshumakov on 01.10.2017.
 */

package com.soho.shumakov.ws

import javax.jws.WebService

@WebService(endpointInterface = "com.soho.shumakov.ws.MyService")
public class MyServiceImpl : MyService {
    override fun getNameOfService(name: String): String {
        return "Name of service, " + this.toString()
    }
}

