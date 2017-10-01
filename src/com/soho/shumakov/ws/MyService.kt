/**
 * Created by evgenyshumakov on 01.10.2017.
 */

package com.soho.shumakov.ws;

import javax.jws.WebMethod
import javax.jws.WebService
import javax.jws.soap.SOAPBinding

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
        public interface MyService {
    @WebMethod
    public fun getNameOfService() : String
}