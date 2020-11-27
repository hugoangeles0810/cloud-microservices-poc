package pe.edu.unp.poc.microservices.tracking.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pe.edu.unp.poc.microservices.tracking.models.Pedidos;

@Controller
public class TrackingController {
	
    @RequestMapping("GetTracking")
    @ResponseBody
    public List<Pedidos> getTracking()
   {
	   Pedidos p1= new Pedidos(1, "Ureña Vargas, Luis alberto", "Juarez Maria", "Av. Argentina - Callao");
	   Pedidos p2=new Pedidos(2, "Peña Papelucho, Rodrigo", "Maria castro", "Av. Colonial - Callao");
	   Pedidos p3=new Pedidos(3, "Ronyx terra, ", "Luz Valera", "Av. La Marina - San Miguel");
	   Pedidos p4=new Pedidos(4, "Coronado praga, Luis alberto", "Hugo Chavez", "Av. Ramiro Priale");
	   Pedidos p5=new Pedidos(5, "Ramirez Vargas, Luis alberto", "Luis Ramos", "Av. Brasil  - Cercado de Lima");
	   
	   return Arrays.asList(p1,p2,p3,p4,p5);
   }
	
}
