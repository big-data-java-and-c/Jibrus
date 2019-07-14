package com.jibrus.jibrus.endpoints;

import com.jibrus.jibrus.services.GroupSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController @CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/groups")
public class GroupEndpoint {

    private GroupSerivce groupService;

    @Autowired public GroupEndpoint(GroupSerivce groupsService) {
        this.groupService = groupsService;
    }

    @GetMapping("/all") public ResponseEntity getAllGroups() {
        return ResponseEntity.ok(groupService.getAllGroups());
    }

    @GetMapping("/group/{id}") public ResponseEntity getAllGroups(@PathVariable Integer id) {
        return ResponseEntity.ok(groupService.getGroupById(id));
    }
}
