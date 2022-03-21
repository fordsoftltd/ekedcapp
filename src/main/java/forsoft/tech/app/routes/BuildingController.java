package forsoft.tech.app.routes;

import forsoft.tech.app.service.base.BuildingService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import forsoft.tech.app.dto.BuildingRequest;
public class BuildingController {
    @Autowired
    BuildingService service;

    @ApiOperation(value = "Add building", response = String.class)
    @PostMapping("/building/add")
    public ResponseEntity addBuilding (@RequestBody BuildingRequest payload) {
        return service.addBuilding(payload);
    }



}
