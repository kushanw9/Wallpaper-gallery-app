package lk.gk.kushan.gallery.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletContext;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/images")
public class ImageController {
    @Autowired
    private ServletContext servletContext;

    @GetMapping
    public String getAllImages() {
        return "<h1>Get All Images</h1>";
    }
}
