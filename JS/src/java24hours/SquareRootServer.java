package java24hours;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)
public interface SquareRootServer {
    @WebMethod double getSquareRoot(double input);
    @WebMethod String getTime();
}
