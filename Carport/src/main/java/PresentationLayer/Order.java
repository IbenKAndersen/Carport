package PresentationLayer;

import LogicLayer.Carport;
import LogicLayer.FogException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author mikkel
 */
public class Order extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws FogException {
        String origin = (String) request.getParameter("origin");
        String view = "";
        switch (origin) {
            case "createOrder": {
                view = createOrder(request);
                break;
            }
        }
        return view;
    }

    private String createOrder(HttpServletRequest request) {
//        //HttpSession session = request.getSession();
//        try {
//            Carport carport = new Carport((String)request.getParameter("id"), false, 
//                    (String)request.getParameter("details"), (Integer)request.getParameter("id"));
//        } catch(FogException e) {
//            System.out.println("failed to create order= " + e);
//        }
        return null;
    }

}
