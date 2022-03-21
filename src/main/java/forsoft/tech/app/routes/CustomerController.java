package forsoft.tech.app.routes;

import forsoft.tech.app.service.base.CustomerService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {
    @Autowired
    CustomerService service;

    @ApiOperation(value = "Add Customer", response = String.class)
    @PostMapping("/customer/add")
    public ResponseEntity addCustomer (@RequestBody CustomerRequest payload) {
        return service.addCustomer(payload);
    }

    @ApiOperation(value = "List Customer by Building given the contractor, feeder, and transformer", response = String.class)
    @GetMapping("/customer/list")
    public ResponseEntity fetchCustomerByBuilding (@RequestParam("controller") String controller, @RequestParam("feeder") String feeder, @RequestParam("transformer") String transformer) {
        return service.fetchByBuilding(controller, feeder, transformer);
    }
}
